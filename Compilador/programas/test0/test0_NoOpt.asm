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
	t$8  DB  "found1",0
	t$10  DB  "found2",0
	t$11  DB  "notfound",0
.data?
	inputBuffer db 65536 dup(?)
	DISP  DW  1000 DUP (?)
	i$3  DD  ?
	t$4  DD  ?
	a$5  DD  ?
	t$6  DD  ?
	t$7  DD  ?
	t$9  DD  ?
	t$12  DD  ?
	t$13  DD  ?
	t$14  DD  ?
	t$15  DD  ?
	t$16  DD  ?
	t$17  DD  ?
	t$18  DD  ?
	t$19  DD  ?
.code
start PROC
e1:
e3:
	call indice$6
	add esp, 0
e23:
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
indice$6:
	mov  esi, OFFSET DISP  ; ESI = @DISP
	push [esi+0]
	push ebp
	mov ebp, esp  ; BP = SP
	mov [esi+0], ebp  ; DISP(prof) = BP
	sub esp, 0  ; reserva memoria para las variables locales
	mov eax, 6
	mov t$4, eax
	mov eax, t$4  ; eax = t$4
	mov i$3, eax
	mov eax, 2
	mov t$6, eax
	mov eax, t$6  ; eax = t$6
	mov a$5, eax
	mov eax, a$5  ; eax = a$5
	push eax
	call printi$3
	add esp, 0
e4:
	mov eax, 6
	mov t$7, eax
	mov eax, i$3  ; eax = i$3
	mov ebx, t$7  ; ebx = t$7
	cmp eax, ebx
	je e5
	jmp e7
e5:
	mov eax, OFFSET t$8  ; eax = @ t$8
	push eax
	call prints$4
	add esp, 0
e6:
e7:
	mov eax, 6
	mov t$9, eax
	mov eax, i$3  ; eax = i$3
	mov ebx, t$9  ; ebx = t$9
	cmp eax, ebx
	je e8
	jmp e10
e8:
	mov eax, OFFSET t$10  ; eax = @ t$10
	push eax
	call prints$4
	add esp, 0
e9:
	jmp e12
e10:
	mov eax, OFFSET t$11  ; eax = @ t$11
	push eax
	call prints$4
	add esp, 0
e11:
e12:
	call test$5
	add esp, 0
	mov t$12, eax
e13:
e14:
	mov eax, 5
	mov t$13, eax
	mov eax, i$3  ; eax = i$3
	mov ebx, t$13  ; ebx = t$13
	cmp eax, ebx
	je e15
	jmp e17
e15:
	mov eax, 1
	mov t$14, eax
	mov eax, i$3  ; eax = i$3
	mov ebx, t$14  ; ebx = t$14
	add eax, ebx
	mov t$15, eax
	mov eax, t$15  ; eax = t$15
	mov i$3, eax
e16:
	jmp e14
e17:
e18:
	mov eax, 5
	mov t$16, eax
	mov eax, t$16  ; eax = t$16
	push eax
	call printi$3
	add esp, 0
e19:
	mov eax, 1
	mov t$17, eax
	mov eax, i$3  ; eax = i$3
	mov ebx, t$17  ; ebx = t$17
	add eax, ebx
	mov t$18, eax
	mov eax, t$18  ; eax = t$18
	mov i$3, eax
e20:
e21:
	mov eax, 50
	mov t$19, eax
	mov eax, i$3  ; eax = i$3
	mov ebx, t$19  ; ebx = t$19
	cmp eax, ebx
	jl e18
	jmp e22
	jmp e18
e22:
END start
