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
.data?
	inputBuffer db 65536 dup(?)
	DISP  DW  1000 DUP (?)
.code
start PROC
e1:
e3:
	call indice$6
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
test$5:
	mov  esi, OFFSET DISP  ; ESI = @DISP
	push [esi+0]
	push ebp
	mov ebp, esp  ; BP = SP
	mov [esi+0], ebp  ; DISP(prof) = BP
	sub esp, 8  ; reserva memoria para las variables locales
	mov eax, 2
	mov [ebp-4], eax
	mov eax, [ebp-4]
	mov esp, ebp  ; SP = BP
	pop ebp  ; BP = antiguo BP
	lea edi, DISP  ; EDI = @DISP
	pop [edi+0]  ; DISP[prof] = antiguo valor
	ret
indice$6:
	mov  esi, OFFSET DISP  ; ESI = @DISP
	push [esi+0]
	push ebp
	mov ebp, esp  ; BP = SP
	mov [esi+0], ebp  ; DISP(prof) = BP
	sub esp, 48  ; reserva memoria para las variables locales
	mov eax, 6
	mov [ebp-4], eax
	mov eax, 2
	mov [ebp-12], eax
	call test$5
	add esp, 0
	mov [ebp-20], eax
e5:
	mov eax, [ebp-4]
	mov ebx, 5
	cmp eax, ebx
	jne e8
	mov eax, [ebp-4]
	mov ebx, 1
	add eax, ebx
	mov [ebp-4], eax
	jmp e5
e8:
e9:
	mov eax, 5
	mov [ebp-36], eax
	mov eax, [ebp-36]
	push eax
	call printi$3
	add esp, 0
	mov eax, [ebp-4]
	mov ebx, 1
	add eax, ebx
	mov [ebp-4], eax
	mov eax, [ebp-4]
	mov ebx, 50
	cmp eax, ebx
	jge e13
	jmp e9
e13:
	mov esp, ebp  ; SP = BP
	pop ebp  ; BP = antiguo BP
	lea edi, DISP  ; EDI = @DISP
	pop [edi+0]  ; DISP[prof] = antiguo valor
	ret
END start
