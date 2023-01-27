.386
.model flat, stdcall
option casemap:none
include \masm32\include\windows.inc
include \masm32\include\kernel32.inc
include \masm32\include\masm32.inc
includelib \masm32\lib\kernel32.lib
includelib \masm32\lib\masm32.lib
.const
.data
	inputPtr DD offset inputBuffer
	t$7  DB  "Se cumple primer if. ",0
	t$8  DB  "No se cumple primer if. ",0
	t$12  DB  "Se cumple segundo if. ",0
	t$13  DB  "No se cumple primer if. ",0
	t$16  DB  "Se cumple tercer if. ",0
	t$17  DB  "No se tercer primer if. ",0
	t$18  DB  "Se acabaron las comprobaciones.",0
.data?
	inputBuffer db 65536 dup(?)
	DISP  DW  1000 DUP (?)
.code
start PROC
e1:
	call indice$5
	add esp, 0
	invoke ExitProcess, 0
start ENDP
read$1:
	mov esi, OFFSET DISP    ; ESI = @ DISP
	push [esi]
	push ebp
	mov ebp, esp            ; BP = SP
	mov [esi], ebp          ; DISP(prof4x) = BP
	sub esp, 4
	push 254
	push inputPtr
	call StdIn
	push inputPtr
	call strlen
	mov [ebp-4], eax        ; guardar resultado de strlen
	mov eax, inputPtr       ; guardar el inputPtr
	mov ebx, [ebp-4]
	add inputPtr, ebx
	mov ebx, eax            ; preparar comprobacion
	add ebx, [ebp-4]        ; sumar longitud del string
	sub ebx, OFFSET inputBuffer
	cmp ebx, SIZEOF inputBuffer
	jl @F                   ; comprobar direccion
	mov ebx, OFFSET inputBuffer
	mov inputPtr, ebx       ; reiniciar puntero
@@:
	mov esp, ebp
	pop ebp
	mov edi, OFFSET DISP
	pop [edi]
	ret
printb$2:
	mov esi, OFFSET DISP    ; ESI = @ DISP
	push [esi]
	push ebp
	mov ebp, esp            ; BP = SP
	mov [esi], ebp          ; DISP(prof4x) = BP
	sub esp, 16             ; espacio para 'true' y 'false'
	mov eax, [ebp+12]
	mov byte ptr [ebp-8], 't'
	mov byte ptr [ebp-7], 'r'
	mov byte ptr [ebp-6], 'u'
	mov byte ptr [ebp-5], 'e'
	mov byte ptr [ebp-4], 0
	mov byte ptr [ebp-16], 'f'
	mov byte ptr [ebp-15], 'a'
	mov byte ptr [ebp-14], 'l'
	mov byte ptr [ebp-13], 's'
	mov byte ptr [ebp-12], 'e'
	mov byte ptr [ebp-11], 0
	test eax, eax           ; comprobar si es 0 (falso) o -1 (verdadero)
	jnl falso
	lea edi, [ebp-8]
	jmp fin
	falso:
	lea edi, [ebp-16]
	fin:
	invoke StdOut, edi
	mov esp, ebp
	pop ebp
	mov edi, OFFSET DISP
	pop [edi]
	ret
printi$3:
	mov esi, OFFSET DISP    ; ESI = @ DISP
	push [esi]
	push ebp
	mov ebp, esp            ; BP = SP
	mov [esi], ebp          ; DISP(prof4x) = BP
	sub esp, 12             ; reservar espacio para el string buffer
	mov eax, [ebp+12]          ; mover a eax el int a imprimir
	lea edi, [ebp-12]       ; mover a edi la dirección del string buffer
	call EAX_to_DEC
	lea edi, [ebp-12]
	invoke StdOut, edi
	mov esp, ebp
	pop ebp
	mov edi, OFFSET DISP
	pop [edi]
	ret
prints$4:
	mov esi, OFFSET DISP    ; ESI = @ DISP
	push [esi]
	push ebp
	mov ebp, esp            ; BP = SP
	mov [esi], ebp          ; DISP(prof4x) = BP
	mov edi, [ebp+12]          ; mover a edi la dirección del string
	invoke StdOut, edi
	mov esp, ebp
	pop ebp
	mov edi, OFFSET DISP
	pop [edi]
	ret
EAX_to_DEC PROC         ; ARG: EDI pointer to string buffer
	test eax, eax           ; Test if number is less than zero
	jnl non_negative
	neg eax
	mov byte ptr [edi], '-'
	inc edi
	non_negative:
	mov ebx, 10             ; Divisor = 10
	xor ecx, ecx            ; ECX=0 (digit counter)
	@@:                     ; First Loop: store the remainders
	xor edx, edx
	div ebx                 ; EDX:EAX / EBX = EAX remainder EDX
	push dx                 ; push the digit in DL (LIFO)
	add cl,1                ; = inc cl (digit counter)
	or  eax, eax            ; AX == 0?
	jnz @B                  ; no: once more (jump to the first @@ above)
	@@:                       ; Second loop: load the remainders in reversed order
	pop ax                  ; get back pushed digits
	or al, 00110000b        ; to ASCII
	stosb                   ; Store AL to [EDI] (EDI is a pointer to a buffer)
	loop @B                 ; until there are no digits left
	mov byte ptr [edi], 0   ; ASCIIZ terminator (0)
	ret                     ; RET: EDI pointer to ASCIIZ-string
EAX_to_DEC ENDP
strlen:
	mov esi, OFFSET DISP    ; ESI = @ DISP
	push [esi]
	push ebp
	mov ebp, esp            ; BP = SP
	mov [esi], ebp          ; DISP(prof4x) = BP
	mov esi, [ebp+12]
	xor eax, eax
	loop_len:
	mov ebx, [esi]
	cmp ebx, 0
	je done
	inc esi
	inc eax
	jmp loop_len
	done:
	mov esp, ebp
	pop ebp
	mov edi, OFFSET DISP
	pop [edi]
	ret
indice$5:
	mov  esi, OFFSET DISP  ; ESI = @DISP
	push [esi+0]
	push ebp
	mov ebp, esp  ; BP = SP
	mov [esi+0], ebp  ; DISP(prof) = BP
	sub esp, 44  ; reserva memoria para las variables locales
	mov eax, 2
	mov [ebp-8], eax
	mov eax, [ebp-8]
	mov [ebp-4], eax
	mov eax, 4
	mov [ebp-16], eax
	mov eax, [ebp-16]
	mov [ebp-12], eax
	mov eax, 2
	mov [ebp-20], eax
	mov eax, [ebp-4]
	mov ebx, [ebp-20]
	cmp eax, ebx
	je e2
	jmp e5
e2:
	mov eax, 3
	mov [ebp-24], eax
	mov eax, [ebp-12]
	mov ebx, [ebp-24]
	cmp eax, ebx
	jg e3
	jmp e5
e3:
	mov eax, OFFSET t$7  ; eax = @ t$7
	push eax
	call prints$4
	add esp, 0
e4:
	jmp e7
e5:
	mov eax, OFFSET t$8  ; eax = @ t$8
	push eax
	call prints$4
	add esp, 0
e6:
e7:
	mov eax, 10
	mov [ebp-28], eax
	xor eax, eax  ; EAX = 0
	mov ebx, [ebp-28]
	sub eax, ebx
	mov [ebp-32], eax
	mov eax, [ebp-4]
	mov ebx, [ebp-32]
	cmp eax, ebx
	jg e9
	jmp e8
e8:
	mov eax, 0
	mov [ebp-36], eax
	jmp e11
e9:
	mov eax, OFFSET t$12  ; eax = @ t$12
	push eax
	call prints$4
	add esp, 0
e10:
	jmp e13
e11:
	mov eax, OFFSET t$13  ; eax = @ t$13
	push eax
	call prints$4
	add esp, 0
e12:
e13:
	mov eax, 3
	mov [ebp-40], eax
	jmp e14
e14:
	mov eax, 6
	mov [ebp-44], eax
	mov eax, [ebp-12]
	mov ebx, [ebp-44]
	cmp eax, ebx
	je e15
	jmp e17
e15:
	mov eax, OFFSET t$16  ; eax = @ t$16
	push eax
	call prints$4
	add esp, 0
e16:
	jmp e19
e17:
	mov eax, OFFSET t$17  ; eax = @ t$17
	push eax
	call prints$4
	add esp, 0
e18:
e19:
	mov eax, OFFSET t$18  ; eax = @ t$18
	push eax
	call prints$4
	add esp, 0
e20:
e21:
	mov esp, ebp  ; SP = BP
	pop ebp  ; BP = antiguo BP
	lea edi, DISP  ; EDI = @DISP
	pop [edi+0]  ; DISP[prof] = antiguo valor
	ret
END start
