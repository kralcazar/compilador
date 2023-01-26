grammar eGram;

@header {
    package gram;
    import compilador.*;
    import java.io.*;
    import java.util.Deque;
    import java.util.ArrayDeque;
}

// Parser, sobreescribe el constructor para guardar el directorio y la salida de errores para su personalización
@parser::members {
    private SymbolTable symbolTable;
    private int depthCondition;
    private String errors="";
    private String folder;
    private Deque<Symbol> proceduresStack = new ArrayDeque<Symbol>();

    public eGramParser(TokenStream input, String folder){
        this(input);
        this.folder=folder;
    }

    public SymbolTable getSymbolTable(){ return symbolTable; }

    // Se sobreescribe la salida del error otorgada por Antlr4 según el contenido de la misma
    @Override
    public void notifyErrorListeners(Token offendingToken, String msg, RecognitionException ex)
    {
        String notificacion = "Error sintáctico - Línea " + offendingToken.getLine()
        + ", Columna " + offendingToken.getCharPositionInLine() + ": \n\t ";
        String expected = msg;

        if(expected.contains("expecting")){
            //TODO: MODIFICAR PARA "HACERLO NUESTRO"
            expected = expected.substring(expected.indexOf("expecting") + 10);
            notificacion += "encontrado: '" + offendingToken.getText() + "' esperado: "+ expected;
        }else if(expected.contains("missing")){
            //TODO: MODIFICAR PARA "HACERLO NUESTRO"
            expected = expected.substring(expected.indexOf("missing") + 8);
            expected = expected.substring(0, expected.indexOf("at") - 1);
            notificacion += "encontrado: '" + offendingToken.getText() + "', falta "+ expected;
        }else if(expected.contains("alternative")){
                expected = expected.substring(expected.indexOf("input") + 6).replace("'","");
                notificacion += "Se ha detectado un error antes de la entrada '" + offendingToken.getText()+"'.";
                //Eliminar el siguiente token encontrado tras analizar el token que genera error
                //TODO: La siguiente instrucción solo quita el offendingToken que se encuentra despues del error, no los de antes. caso que funciona: int i = 6; caso que no funciona: ent i 6;
                expected = expected.substring(0, expected.length()-offendingToken.getText().length());
                String[] lines = offendingToken.getInputStream().toString().split(System.getProperty("line.separator"));
                if(expected.length()==0){ //Es posible que sea porque falta cerrar la sentencia con punto y coma
                    notificacion += " Se esperaba otra instrucción, quizás te has saltado un ';'.";
                }else{
                    notificacion += " No se reconoce '" + expected +"'";
                }
        }
        throw new RuntimeException(notificacion);
    }
}

@lexer::members {
    @Override
    public void recover(RecognitionException ex)
    {
        throw new RuntimeException("Error léxico:  "+ex.getMessage());
    }
}


/*******************************************************************************************/
/*                                    PROGRAMA                                             */
/*******************************************************************************************/
program:
        {
            symbolTable = new SymbolTable(folder);
            // Insertar operaciones de input/output
            try {
                symbolTable.insert("read", new Symbol("read", null, Symbol.Types.FUNC, Symbol.DataTypes.STRING));
                Symbol arg = new Symbol("argBool", null, Symbol.Types.ARG, Symbol.DataTypes.BOOLEAN);
                symbolTable.insert("printb", new Symbol("printb", arg,Symbol.Types.PROC, Symbol.DataTypes.NULL));
                arg = new Symbol("argInt", null,Symbol.Types.ARG,Symbol.DataTypes.INT);
                symbolTable.insert("printi", new Symbol("printi", arg, Symbol.Types.PROC, Symbol.DataTypes.NULL));
                arg = new Symbol("argString", null, Symbol.Types.ARG, Symbol.DataTypes.STRING);
                symbolTable.insert("prints", new Symbol("prints", arg, Symbol.Types.PROC, Symbol.DataTypes.NULL));
            } catch (SymbolTable.SymbolTableException e) {}
        }
    (funcs+ | main)+ EOF
        {
            symbolTable.blockOut();
            if(!errors.isEmpty()) {
                throw new RuntimeException(errors);
            }
        }
    ;


/*******************************************************************************************/
/*                                       MAIN                                              */
/*******************************************************************************************/
main returns[Symbol symbol]:
    MAIN BEGIN
        {
            $symbol = new Symbol($MAIN.getText(), null, Symbol.Types.MAIN, null);
            try {
                symbolTable.insert($MAIN.getText(), $symbol);
            } catch (SymbolTable.SymbolTableException e) {
                errors += "Error semántico en línea " + $MAIN.getLine() + ": El índice ya ha sido declarado\n";
            }

            proceduresStack.push($symbol);
        }
        decl* sents END
        {
            proceduresStack.pop();

            if(depthCondition != 0) {
                errors += "Error semántico - Línea " + $MAIN.getLine() +
                ": no se puede definir una función en una estructura condicional o repetitiva\n";
            }
        }
    ;


/*******************************************************************************************/
/*                                   DECLARACIONES                                         */
/*******************************************************************************************/
declAndFunc:
    decl | funcs;

decl:
    type ID
        {
            try{
                symbolTable.insert($ID.getText(),new Symbol($ID.getText(),null,Symbol.Types.VAR,$type.dataType));
            } catch (SymbolTable.SymbolTableException e) {
                errors+="Error semántico en línea " + $ID.getLine() + ": variable '" + $ID.getText() +
                "' previamente declarada\n";
            }
        }
        ( ASSIGN expr
        {
            try{
                symbolTable.get($ID.getText()).setInitialized(true);
            } catch (SymbolTable.SymbolTableException e) {
                errors += "Error semántico en línea " + $ID.getLine() + ": variable '" + $ID.getText() + "' no existe\n";
            }

            if($expr.dataType != $type.dataType) {
                errors += "Error semántico en línea " + $ID.getLine() + ": tipos incompatibles (esperado '" +
                $type.dataType + "', encontrado '" + $expr.dataType + "')\n";
            }
        }
        )? SEMI
    | CONSTANT type ID
        {
        	Symbol symbol = null;
        	try {
        		symbolTable.insert($ID.getText(), new Symbol($ID.getText(), null, Symbol.Types.CONST, $type.dataType));
        		symbol = symbolTable.get($ID.getText());
        		symbol.setInitialized(true);
        	} catch (SymbolTable.SymbolTableException e) {
        		errors+="Error semántico en línea " + $ID.getLine() + ": constante '" + $ID.getText() +
        		"' ya declarada\n";
        	}
        }
        ASSIGN literal SEMI
        {
            if($literal.dataType!=$type.dataType) {
                errors += "Error semántico en línea " + $ID.getLine() + ": tipos incompatibles (esperado '"+
                $type.dataType + "')\n";
            }
            if(symbol != null) {
                switch($literal.dataType) {
                    case INT:
                        symbol.setValue($literal.text);
                        break;
                    case BOOLEAN:
                        //TODO: COMPROBAR PORQUE ESCRIBE LAS BOLEANAS A -1 Y 0
                        if($literal.text.equals("true")) {
                            symbol.setValue("-1");
                        } else {
                            symbol.setValue("0");
                        }
                        break;
                    case STRING:
                        symbol.setValue($literal.text);
                        break;
                    default:
                        break;
                }
            }
        }
    | arrayDecl
    ;

funcs:
    FUNCTION type header[$type.dataType] BEGIN
            {
                try {
                    symbolTable.insert($header.procedure.getId(),$header.procedure);
                } catch (SymbolTable.SymbolTableException e) {
                    errors += "Error semántico en línea " + $FUNCTION.getLine() + ": " + e.getMessage() + "\n";
                }
                symbolTable = symbolTable.blockIn();
                proceduresStack.push($header.procedure);
                Symbol parameter = $header.procedure.getNext();
                while (parameter != null) {
                    Symbol aux = new Symbol(parameter);
                    aux.setInitialized(true);
                    aux.setNext(null);
                    try {
                        symbolTable.insert(aux.getId(),aux);
                    } catch (SymbolTable.SymbolTableException e) {
                        errors += "Error semántico en línea " + $FUNCTION.getLine() + ": " + e.getMessage() + "\n";
                    }
                    parameter = parameter.getNext();
                }
            }
            declAndFunc* sents END
            {
                symbolTable = symbolTable.blockOut();
                proceduresStack.pop();
                if(!$header.procedure.isReturnFound()) {
                    errors += "Error semántico en línea " + $FUNCTION.getLine() +
                    ": 'devolver' no encontrado para la función '" + $header.procedure.getId() + "'\n";
                }
                if(depthCondition != 0) {
                    errors += "Error semántico - Línea " + $FUNCTION.getLine() +
                    ": no se puede definir una función en una estructura condicional o repetitiva\n";
                }
            }
;

/*******************************************************************************************/
/*                                    SENTENCIAS                                           */
/*******************************************************************************************/
sents:
    sent sents_
    | //lambda
    ;

sents_:
    sent sents_
    | //lambda
    ;

sent:
	IF expr
	    {
	        if($expr.dataType!=Symbol.DataTypes.BOOLEAN) {
                errors+="Error semántico en línea " + $IF.getLine() +
                ": tipos incompatibles (esperado 'BOOLEAN', encontrado '" + $expr.dataType + "')\n";
            }
	    }
	    BEGIN
	    {
	        depthCondition ++;
	        symbolTable = symbolTable.blockIn();
	    }
	    decl* sents
	    {
	        depthCondition --;
            symbolTable = symbolTable.blockOut();
	    }
	    END
	| IF expr
	    {
	        if($expr.dataType != Symbol.DataTypes.BOOLEAN) {
                errors+="Error semántico en línea " + $IF.getLine() +
                ": tipos incompatibles (esperado 'BOOLEAN', encontrado '" + $expr.dataType + "')\n";
            }
	    }
	    BEGIN
	    {
	        depthCondition ++;
	        symbolTable = symbolTable.blockIn();
	    }
	    decl* sents
	    {
            symbolTable = symbolTable.blockOut();
	    }
	    END ELSE BEGIN
	    {
	        symbolTable = symbolTable.blockIn();
	    }
	    decl* sents
	    {
	        depthCondition --;
            symbolTable = symbolTable.blockOut();
	    }
	    END
	| WHILE expr
	    {
	        if($expr.dataType != Symbol.DataTypes.BOOLEAN){
	            errors += "Error semántico en línea " + $WHILE.getLine() +
                ": tipos incompatibles (esperado 'BOOLEAN', encontrado '" + $expr.dataType + "')\n";
	        }
	    }
	    BEGIN
	    {
	        depthCondition ++;
	        symbolTable = symbolTable.blockIn();
	    }
	    decl* sents
	    {
            depthCondition --;
            symbolTable = symbolTable.blockOut();
        }
	    END
	| DO BEGIN
	    {
	        depthCondition ++;
	        symbolTable = symbolTable.blockIn();
	    }
	    decl* sents
	    {
            depthCondition --;
            symbolTable = symbolTable.blockOut();
	    }
	    END WHILE expr
	    {
	        if($expr.dataType != Symbol.DataTypes.BOOLEAN){
                errors += "Error semántico en línea " + $WHILE.getLine() +
                ": tipos incompatibles (esperado 'BOOLEAN', encontrado '" + $expr.dataType + "')\n";
            }
	    }
	    SEMI
	| RETURN expr SEMI
	    {
	        Symbol procedure;
            if(proceduresStack.size()==0) {
                // Return fuera de una función
                errors += "Error semántico en línea " + $RETURN.getLine() + ": devolver fuera de función\n";
            } else {
                procedure = proceduresStack.peek();
                if (procedure.getType() == Symbol.Types.PROC) {
                    // Devolver no vacío en un procedimiento
                    errors += "Error semántico en línea " + $RETURN.getLine() +
                    ": devolver de expresión en un procedimiento\n";
                } else if(procedure.dataType() != $expr.dataType) {
                    // Devolver de tipo incorrecto
                    errors += "Error semántico en línea " + $RETURN.getLine() +
                    ": devolver de tipo incorrecto (esperado '" + proceduresStack.peek().dataType() +
                    "', encontrado '" + $expr.dataType + "')\n";
                } else if(depthCondition == 0) {
                    // Devolver correcto

                    //TODO: PORQUE VUELVE A HACER PEEK EN VEZ DE PILLAR LA REFERENCIA procedure
                    proceduresStack.peek().setReturnFound(true);
                }
            }
	    }
	| RETURN SEMI
	    {
	        Symbol procedure;
            if(proceduresStack.size()==0) {
                // Devolver fuera de una función
                errors += "Error semántico en línea " + $RETURN.getLine() + ": devolver fuera de función\n";
            } else {
                procedure = proceduresStack.peek();
                if (procedure.getType() == Symbol.Types.FUNC) {
                    // Devolver vacío en una función
                    errors += "Error semántico en línea " + $RETURN.getLine() +
                    ": devolver vacío en una función)\n";
                }
            }
	    }
	| reference[true] ASSIGN expr SEMI
	    {
	        if($reference.symbol != null) {
                if($reference.symbol.getType() == Symbol.Types.CONST) {
                    errors += "Error semántico en línea " + $ASSIGN.getLine() + ": " + $reference.symbol.getId() +
                    " es una constante\n";
                } else{
                    Symbol.DataTypes underlType;
                    if($reference.table != null && $reference.dimCheck) {
                        underlType = $reference.table.dataType();
                    } else {
                        underlType = $reference.symbol.dataType();
                    }
                    if($reference.symbol.getType() == Symbol.Types.FUNC || underlType == Symbol.DataTypes.NULL) {
                        errors += "Error semántico en línea " + $ASSIGN.getLine() +
                        ": no se pueden asignar valores a esta referencia\n";
                    } else if(underlType != $expr.dataType) {
                            errors+="Error semántico en línea " + $ASSIGN.getLine() +
                            ": asignación de tipo incorrecto (esperado '"+ underlType +
                            "', encontrado '"+$expr.dataType+"')\n";
                    }
                }
            }
	    }
	| reference[false] SEMI
        {
            if($reference.symbol != null) {
                if($reference.symbol.getType() != Symbol.Types.FUNC && $reference.symbol.getType() != Symbol.Types.PROC) {
                    // Tiene que ser función o procedimiento
                    errors += "Error semántico en línea " + $SEMI.getLine() +
                    ": se esperaba una función o un procedimiento\n";
                }
            }
        }
	;

header[Symbol.DataTypes dataType] returns[Symbol procedure]:
	ID
	    {
	        if($dataType != null) {
                // Función
                $procedure = new Symbol($ID.getText(), null, Symbol.Types.FUNC, $dataType);
            } else {
                // Procedimiento
                $procedure = new Symbol($ID.getText(), null, Symbol.Types.PROC, Symbol.DataTypes.NULL);
            }
	    }
	    LPAREN params[$procedure]? RPAREN ;

params[Symbol prev]:
	param COMMA
        {
            $prev.setNext($param.symbol);
        }
        params[$prev.getNext()]
	| param
        {
            $prev.setNext($param.symbol);
        }
    ;

param returns[Symbol symbol]:
	type ID
	    {
	        $symbol = new Symbol($ID.getText(), null, Symbol.Types.ARG, $type.dataType);
	    }
	;

arrayDecl:
	type ID LBRACK
	    {
	        Symbol symbol = new Symbol($ID.getText(), null, Symbol.Types.VAR, Symbol.DataTypes.NULL);
            Table table = new Table($type.dataType);
            symbol.setTable(table);
            try{
                symbolTable.insert($ID.getText(), symbol);
            } catch (SymbolTable.SymbolTableException e) {
                errors += "Error semántico en línea " + $ID.getLine() + ": variable '" + $ID.getText() +
                "' ya declarada\n";
            }
            int bottomLimit = 0;
            boolean limits = false;
	    }
	    (
        number DOUBLEDOT
        {
            // Permitimos la entrada pero advertimos sobre el uso de variables
            if($number.isConstant) {
                errors += "Error semántico en línea " + $ID.getLine() +
                ": los límites del índice deben ser valores constantes\n";
            }
            bottomLimit = $number.value;
            limits = true;
        }
	    )? number
	    {
	        if(!$number.isConstant) {
                errors += "Error semántico en línea " + $ID.getLine() +
                ": los límites del índice deben ser valores constantes\n";
            }
            int upperLimit = $number.value;
            if(!limits) {
                // Caso en el que se indica el tamaño
                if(upperLimit < 1) {
                    errors+="Error semántico en línea "+ $ID.getLine() +
                    ": una tabla no puede ser de tamaño 0\n";
                } else {
                    upperLimit--; // Si se indica el tamaño, hay que corregir el limite superior
                }
            } else {
                // Caso en el que se indican los limites
                if(bottomLimit > upperLimit) {
                    errors+="Error semántico en línea " + $number.start.getLine() +
                    ": el límite inferior no puede ser mayor al superior\n";
                }
            }
            table.setIndex(bottomLimit, upperLimit);
	    }
	    arrayDecl_[table]
	    {
	        table.init();
	    }
	    RBRACK SEMI
    ;

arrayDecl_[Table table]:
    RBRACK LBRACK
        {
            int bottomLimit = 0;
            boolean limits = false;
        }
        ( number DOUBLEDOT
        {
            if($number.isConstant) {
                errors += "Error semántico en línea " + $number.start.getLine() +
                ": los límites del índice deben ser valores constantes\n";
            }
            bottomLimit = $number.value;
            limits = true;
        }
        )? number
        {
            if(!$number.isConstant) {
                errors += "Error semántico en línea " + $number.start.getLine() +
                ": los límites del índice deben ser valores constantes\n";
            }
            int upperLimit = $number.value;
            if(!limits) { // Caso en el que se indica el tamaño
                if(upperLimit < 1) {
                    errors+="Error semántico en línea "+ $number.start.getLine() +
                    ": una tabla no puede ser de tamaño 0\n";
                } else {
                    upperLimit--; // Si se indica el tamaño, hay que corregir el limite superior
                }
            } else { // Caso en el que se indican los limites
                if(bottomLimit > upperLimit) {
                    errors+="Error semántico en línea " + $number.start.getLine() +
                    ": el límite inferior no puede ser mayor al superior\n";
                }
            }
            table.setIndex(bottomLimit, upperLimit);
        }
        arrayDecl_[$table]
    |; //lambda

number returns[int value, boolean isConstant]:
	ID
	    {
	        Symbol symbol = null;
            try {
                symbol = symbolTable.get($ID.getText());
            } catch (SymbolTable.SymbolTableException e) {
                errors += "Error semántico en línea " + $ID.getLine() + ": "+e.getMessage() + "\n";
            }
            if(symbol != null && symbol.getType() == Symbol.Types.CONST) {
                $value = Integer.parseInt(symbol.getValue());
                $isConstant = true;
            } else {
                errors += "Error semántico en línea " + $ID.getLine() +
                ": el limite debe ser un literal o una constante\n";
                $value = 0;
                $isConstant = false;
            }
	    }
	| LiteralInteger
	    {
	        $value = Integer.parseInt($LiteralInteger.getText());
            $isConstant = true;
	    };

reference[boolean assign] returns[Symbol symbol, Table table, boolean dimCheck]:
	ID
	    {
	        try {
                $symbol = symbolTable.get($ID.getText());
                if($assign) {
                    $symbol.setInitialized(true);
                } else {
                    if(!$symbol.isInitialized()) {
                        errors += "Error semántico en línea " + $ID.getLine() + ": '" + $ID.getText() +
                        "' no ha sido inicializada\n";
                    }
                }
            } catch (SymbolTable.SymbolTableException e) {
                errors += "Error semántico en línea " + $ID.getLine() + ": " + e.getMessage() + "\n";
                $symbol = null;
            }
	    }
	| idx RBRACK
	    {
	        $table = $idx.table;
	        $symbol = $idx.symbol;
	        if($table != null) {
                // Comprobar la cantidad de indirecciones usadas
                int dim = $table.getDimension();
                $dimCheck = false;
                if($idx.dimension < dim) {
                    errors+="Error semántico en línea " + $idx.start.getLine() +
                    ": la tabla tiene más dimensiones\n";
                } else if($idx.dimension > dim){
                    errors+="Error semántico en línea " + $idx.start.getLine() +
                    ": la tabla no tiene tantas dimensiones\n";
                } else {
                    $dimCheck = true;
                }
            }
	    }
	| ID LPAREN RPAREN
	    {
	        try {
                $symbol = symbolTable.get($ID.getText());
                if($symbol.getNext() != null) {
                    errors+="Error semántico en línea " + $ID.getLine() + ": falta(n) argumento(s) para " +
                    $ID.getText() + "\n";
                }
            } catch (SymbolTable.SymbolTableException e) {
                errors += "Error semántico en línea " + $ID.getLine() + ": " + e.getMessage() + "\n";
                $symbol = null;
            }
	    }
	| contIdx RPAREN
	    {
	        $symbol = $contIdx.procedure;
	    }
	;

idx returns[Symbol symbol, int dimension, Table table]:
	ID LBRACK expr
	    {
	        int dim = 1;
            try {
                $symbol = symbolTable.get($ID.getText());
            } catch (SymbolTable.SymbolTableException e) {
                errors += "Error semántico en línea " + $ID.getLine() + ": " + e.getMessage() + "\n";
            }
            if($expr.dataType != Symbol.DataTypes.INT) {
                errors += "Error semántico en línea " + $expr.start.getLine() + ": " + $expr.text +
                " no es un valor numérico\n";
            }
            if($symbol != null) {
                $table = $symbol.getTable();
                if($table == null) {
                    errors += "Error semántico en línea " + $ID.getLine() + ": " + $ID.getText() +
                    " no es una tabla\n";
                }
            }
	    }
	    idx_[dim]
	    {
	        $dimension = $idx_.dimension;
	    }
	;

idx_[int dimension_] returns[int dimension]:
	RBRACK LBRACK expr
	    {
	        if($expr.dataType != Symbol.DataTypes.INT) {
                errors += "Error semántico en línea " + $expr.start.getLine() + ": " + $expr.text +
                " no es un valor numérico\n";
            }
            int dim = $dimension_ + 1;
	    }
	    idx_[dim]
	    {
	        $dimension = $idx_.dimension;
	    }
	|
	    {
	        $dimension = $dimension_;
	    }
	;

contIdx returns[Symbol procedure]:
	ID LPAREN expr
	    {
	        Deque<Symbol.DataTypes> pparams=new ArrayDeque<Symbol.DataTypes>();
            try {
                $procedure = symbolTable.get($ID.getText());
                pparams.add($expr.dataType);
            } catch (SymbolTable.SymbolTableException e) {
                errors += "Error semántico en línea " + $ID.getLine() + ": " + e.getMessage() + "\n";
                $procedure = null;
            }

	    }
	    contIdx_[pparams]
	    {
	        if($procedure != null) {
                Symbol.DataTypes aux;
                Symbol param = $procedure;
                param = param.getNext();
                while(pparams.size() != 0) {
                    aux = pparams.remove();
                    if(param == null) {
                        errors += "Error semántico en línea " + $ID.getLine() +
                        ": demasiados argumentos para " + $ID.getText() + "\n";
                        break;
                    } else if(aux != param.dataType()) {
                        errors += "Error semántico en línea " + $ID.getLine() +
                        ": tipos incompatibles (esperado '" + param.dataType() +
                        "', encontrado '" + aux + "')\n";
                        break;
                    }
                    param = param.getNext();
                }
                if(param != null) {
                    errors += "Error semántico en línea " + $ID.getLine() + ": falta(n) argumento(s) para " +
                    $ID.getText() + "\n";
                }
            }
	    }
    ;

contIdx_[Deque<Symbol.DataTypes> pparams]:
	COMMA expr
	    {
	        $pparams.add($expr.dataType);
	    }
	    contIdx_[$pparams]
	|; // lambda


/*******************************************************************************************/
/*                                   EXPRESIONES                                           */
/*******************************************************************************************/
expr returns[Symbol.DataTypes dataType]:
	exprOr
        {
            $dataType = $exprOr.dataType;
        }
	;

exprOr returns[Symbol.DataTypes dataType]:
	exprAnd exprOr_
        {
            if($exprOr_.dataType != null) {
                if($exprAnd.dataType != $exprOr_.dataType) {
                    errors += "Error semántico en línea " + $exprOr_.start.getLine() +
                    ": tipos incompatibles (esperado " + $exprAnd.dataType + "," +
                    " encontrado " + $exprOr_.dataType + ")\n";
                }
                $dataType = $exprOr_.dataType;
            } else {
                $dataType = $exprAnd.dataType;
            }
        }
	;

exprOr_ returns[Symbol.DataTypes dataType]:
	OR exprAnd exprOr_
	    {
	        if($exprAnd.dataType != Symbol.DataTypes.BOOLEAN){
                errors += "Error semántico en línea " + $exprAnd.start.getLine() +
                    ": tipos incompatibles (esperado BOOLEAN, encontrado " + $exprAnd.dataType + ")\n";
            }
            $dataType = Symbol.DataTypes.BOOLEAN;
	    }
	|; //lambda

exprAnd returns[Symbol.DataTypes dataType]:
	exprNot exprAnd_
	    {
	        if($exprAnd_.dataType != null) {
                if($exprNot.dataType != $exprAnd_.dataType) {
                    errors += "Error semántico en línea " + $exprAnd_.start.getLine() +
                    ": tipos incompatibles (esperado "+$exprNot.dataType + "," +
                    " encontrado "+$exprAnd_.dataType + ")\n";
                }
                $dataType = $exprAnd_.dataType;
            } else {
                $dataType = $exprNot.dataType;
            }
	    }
	;

exprAnd_ returns[Symbol.DataTypes dataType]:
	AND exprNot exprAnd_
	    {
	        if($exprNot.dataType != Symbol.DataTypes.BOOLEAN){
                errors += "Error semántico en línea " + $exprNot.start.getLine() +
                    ": tipos incompatibles (esperado BOOLEAN, encontrado " + $exprNot.dataType + ")\n";
            }
            $dataType = Symbol.DataTypes.BOOLEAN;
	    }
	|; //lambda

exprNot returns[Symbol.DataTypes dataType]:
	NOT exprComp
	    {
            if($exprComp.dataType != Symbol.DataTypes.BOOLEAN) {
                errors += "Error semántico en línea " + $exprComp.start.getLine() +
                ": tipos incompatibles (esperado BOOLEAN, encontrado " + $exprComp.dataType + ")\n";
            }
            $dataType = Symbol.DataTypes.BOOLEAN;
	    }
	| exprComp
	    {
            $dataType = $exprComp.dataType;
	    }
	;

exprComp returns[Symbol.DataTypes dataType]:
	exprAdd exprComp_
	    {
            if($exprComp_.dataType != null) {
                if($exprAdd.dataType != Symbol.DataTypes.INT) {
                    errors+="Error semántico en línea " + $exprComp_.start.getLine() +
                    ": tipos incompatibles (esperado INT," +
                    " encontrado " + $exprComp_.dataType + ")\n";
                    $dataType = Symbol.DataTypes.BOOLEAN;
                }
                $dataType = $exprComp_.dataType;
            } else {
                $dataType = $exprAdd.dataType;
            }
	    }
	;

exprComp_ returns[Symbol.DataTypes dataType]:
	OPREL exprAdd
	    {
            if($exprAdd.dataType != Symbol.DataTypes.INT) {
                errors+="Error semántico en línea " + $exprAdd.start.getLine() +
                ": tipos incompatibles (esperado INT, encontrado " + $exprAdd.dataType + ")\n";
            }
            $dataType = Symbol.DataTypes.BOOLEAN;
        }
	|; //lambda

exprAdd returns[Symbol.DataTypes dataType]:
	exprMult exprAdd_
	    {
            if($exprAdd_.dataType != null) {
                if($exprMult.dataType != $exprAdd_.dataType) {
                    errors+="Error semántico en línea " + $exprAdd_.start.getLine() +
                    ": tipos incompatibles (esperado " + $exprMult.dataType + "," +
                    " encontrado " + $exprAdd_.dataType + ")\n";
                }
                $dataType = $exprAdd_.dataType;
            } else {
                $dataType = $exprMult.dataType;
            }
	    }
	;

exprAdd_ returns[Symbol.DataTypes dataType]:
	ADD exprMult exprAdd_
        {
            if($exprMult.dataType != Symbol.DataTypes.INT) {
                errors += "Error semántico en línea " + $exprMult.start.getLine() +
                ": tipos incompatibles (esperado INT, encontrado " + $exprMult.dataType + ")\n";
            }
            $dataType = Symbol.DataTypes.INT;
        }
	| SUB exprMult exprAdd_
	    {
            if($exprMult.dataType != Symbol.DataTypes.INT) {
                errors += "Error semántico en línea " + $exprMult.start.getLine() +
                ": tipos incompatibles (esperado INT, encontrado " + $exprMult.dataType + ")\n";
            }
            $dataType = Symbol.DataTypes.INT;
	    }
	|; //lambda

exprMult returns[Symbol.DataTypes dataType]:
	exprNeg exprMult_
	    {
	        if($exprMult_.dataType != null) {
                if($exprNeg.dataType != $exprMult_.dataType) {
                    errors+="Error semántico en línea " + $exprMult_.start.getLine() +
                    ": tipos incompatibles (esperado "+ $exprMult_.dataType + "," +
                    " encontrado " + $exprNeg.dataType + ")\n";
                }
                $dataType = $exprMult_.dataType;
            } else {
                $dataType = $exprNeg.dataType;
            }
	    }
	;

exprMult_
	returns[Symbol.DataTypes dataType]:
	MULT exprNeg exprMult_
	    {
            if($exprNeg.dataType != Symbol.DataTypes.INT) {
                errors += "Error semántico en línea " + $exprNeg.start.getLine() +
                ": tipos incompatibles (esperado INT, encontrado " + $exprNeg.dataType + ")\n";
            }
            $dataType = Symbol.DataTypes.INT;
	    }
	| DIV exprNeg exprMult_
	    {
            if($exprNeg.dataType != Symbol.DataTypes.INT) {
                errors += "Error semántico en línea " + $exprNeg.start.getLine() +
                ": tipos incompatibles (esperado INT, encontrado " + $exprNeg.dataType + ")\n";
            } else if($exprNeg.zero) {
                errors+="Error semántico en línea " + $exprNeg.start.getLine() +
                ": división por cero\n";
            }
            $dataType = Symbol.DataTypes.INT;
	    }
	| MOD exprNeg exprMult_
	    {
	        if($exprNeg.dataType != Symbol.DataTypes.INT) {
                errors += "Error semántico en línea " + $exprNeg.start.getLine() +
                ": tipos incompatibles (esperado INT, encontrado " + $exprNeg.dataType + ")\n";
            } else if($exprNeg.zero) {
                errors+="Error semántico en línea " + $exprNeg.start.getLine() +
                ": módulo por cero\n";
            }
		    $dataType = Symbol.DataTypes.INT;
	    }
	|; //lambda

exprNeg returns[Symbol.DataTypes dataType, boolean zero]:
	SUB primary
	    {
            if($primary.dataType != Symbol.DataTypes.INT) {
                errors+="Error semántico en línea " + $primary.start.getLine()+
                ": tipos incompatibles (esperado INT, encontrado " + $primary.dataType +")\n";
            }
	        $dataType = Symbol.DataTypes.INT;
            $zero = $primary.zero;
	    }
	| primary
	    {
	        $dataType = $primary.dataType;
            $zero = $primary.zero;
	    };


/*******************************************************************************************/
/*                                     TIPOS                                               */
/*******************************************************************************************/
primary returns[Symbol.DataTypes dataType, boolean zero]:
	LPAREN expr RPAREN
	    {
	        $dataType = $expr.dataType;
            $zero = false;
	    }
	| reference[false]
	    {
	        if($reference.symbol == null) {
                errors += "Error semántico en línea " + $reference.start.getLine()+
                ": tipos incompatibles (encontrado NULL)\n";
                $dataType = Symbol.DataTypes.NULL;
            } else {
                $dataType =$reference.symbol.dataType();
                if($reference.symbol.getType() == Symbol.Types.CONST && $reference.symbol.dataType() == Symbol.DataTypes.INT) {
                    $zero = $reference.symbol.getValue().equals("0");
                } else if($reference.table != null && $reference.dimCheck) {
                    $dataType = $reference.symbol.getTable().dataType();
                }
            }
	    }
	| literal
        {
            $dataType = $literal.dataType;
            $zero = $literal.zero;
        }
	;

type returns[Symbol.DataTypes dataType]:
	INTEGER
	    {
    		$dataType = Symbol.DataTypes.INT;
    	}
    | BOOLEAN
        {
    		$dataType = Symbol.DataTypes.BOOLEAN;
    	}
    | STRING
        {
    		$dataType = Symbol.DataTypes.STRING;
        }
    ;

literal returns[Symbol.DataTypes dataType, boolean zero]:
	LiteralInteger
        {
            $dataType = Symbol.DataTypes.INT;
            $zero = $LiteralInteger.getText().equals("0");
        }
    | LiteralBoolean
        {
            $dataType = Symbol.DataTypes.BOOLEAN;
            $zero = false;
        }
    | LiteralString
        {
            $dataType = Symbol.DataTypes.STRING;
            $zero = false;
        }
    ;


/*******************************************************************************************/
/*                                       LEXER                                             */
/*******************************************************************************************/
MAIN:           'indice';
VARIABLE:       'var';
CONSTANT:       'const';
FUNCTION:       'funcion';
RETURN:         'devolver';
INTEGER:        'ent';
BOOLEAN:        'logico';
STRING:         'palabra';
WHILE:          'mientras';
DO:             'hacer';
IF:             'si';
ELSE:           'sino';
SWITCH:         'switch';
CASE:           'case';
DEFAULT:        'default';
BREAK:          'break';

LiteralInteger:
                DecimalLiteral;
fragment DecimalLiteral:
                DecimalPositivo | '0';
fragment DecimalPositivo:
                [1-9][0-9]*;

LiteralBoolean:
                'verdadero' | 'falso';
LiteralString:
                '"' LetrasString? '"';
fragment LetrasString:
                LetraString+;
fragment LetraString:
                ~[$"\\\r\n];

LPAREN:         '(';
RPAREN:         ')';
LBRACK:         '[';
RBRACK:         ']';
BEGIN:          '{';
END:            '}';
COMMA:          ',';
SEMI:           ';';
COLON:          ':';
DOUBLEDOT:      '..';

OPREL:          EQUAL | GT | LT ;
ASSIGN:         '=';
EQUAL:          '==';
GT:             '>';
LT:             '<';
ADD:            '+';
SUB:            '-';
MULT:           '*';
DIV:            '/';
MOD:            '%';
AND:            '&&';
OR:             '||';
NOT:            '!';

ID:             LETRA LETRADIGITO*;
fragment LETRA:
                [a-zA-Z$_];
fragment LETRADIGITO:
                [a-zA-Z$_0-9];

WS:             [ \r\n\t]+ -> skip;
BLOCK_COMMENT:  '/*' .*? '*/' -> skip;
LINE_COMMENT:   '//' ~[\r\n]* -> skip;

