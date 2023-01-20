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
	i$1  DD  ?
	t$2  DD  ?
	i$5  DD  ?
	t$6  DD  ?
	t$7  DD  ?
	t$8  DD  ?
	t$9  DD  ?
	t$10  DD  ?
	t$11  DD  ?
	t$12  DD  ?
	t$13  DD  ?
	t$14  DD  ?
	indice$15  DD  ?
.code
start PROC
	mov eax, 6
	mov t$2, eax
	mov eax, t$2  ; eax = t$2
	mov i$1, eax
e1:
	mov eax, 6
	mov t$6, eax
	mov eax, t$6  ; eax = t$6
	mov i$5, eax
	call test$5
	add esp, 0
	mov t$7, eax
e3:
e4:
	mov eax, 5
	mov t$8, eax
	mov eax, i$5  ; eax = i$5
	mov ebx, t$8  ; ebx = t$8
	cmp eax, ebx
	je e5
	jmp e7
e5:
	mov eax, 1
	mov t$9, eax
	mov eax, i$5  ; eax = i$5
	mov ebx, t$9  ; ebx = t$9
	add eax, ebx
	mov t$10, eax
	mov eax, t$10  ; eax = t$10
	mov i$5, eax
e6:
	jmp e4
e7:
e8:
	mov eax, 1
	mov t$11, eax
	mov eax, i$5  ; eax = i$5
	mov ebx, t$11  ; ebx = t$11
	add eax, ebx
	mov t$12, eax
	mov eax, t$12  ; eax = t$12
	mov i$5, eax
e9:
	mov eax, 50
	mov t$13, eax
	mov eax, i$5  ; eax = i$5
	mov ebx, t$13  ; ebx = t$13
	cmp eax, ebx
	jl e8
	jmp e10
	jmp e8
e10:
	mov eax, 5
	mov t$14, eax
	mov eax, t$14  ; eax = t$14
	push eax
	call printi$3
	add esp, 0
e11:
e12:
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
	mov [ebp-8], eax
	mov eax, [ebp-8]
	mov [ebp-4], eax
	mov eax, [ebp-4]
	mov esp, ebp  ; SP = BP
	pop ebp  ; BP = antiguo BP
	lea edi, DISP  ; EDI = @DISP
	pop [edi+0]  ; DISP[prof] = antiguo valor
	ret
e2:
END start
