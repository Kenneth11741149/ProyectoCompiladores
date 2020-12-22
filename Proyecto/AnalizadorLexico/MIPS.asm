.data
_c:       .byte 0
_msg0:      .asciiz  "Ingrese caracter \n"
_msg1:      .asciiz  "XD \n"
   .text
   .globl main
main:
       move $fp, $sp
       li $v0, 4
       la $a0,_msg0
       syscall
       li $v0, 12
       syscall
       sw $v0,_c
       li $v0, 4
       la $a0,_msg1
       syscall
       li $v0, 4
       la $a0,_c
       syscall
       li $v0,10
       syscall
