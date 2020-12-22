.data
_x:       .word 0
_y:       .word 0
_op:       .word 0
_result:       .word 0
_msg0:      .asciiz  "\n"
_msg1:      .asciiz  "Ingrese el primer numero  \n"
_msg2:      .asciiz  "Ingrese el segundo numero \n"
_msg3:      .asciiz  "Ingrese 1 para sumar \n"
_msg4:      .asciiz  "Ingrese 2 para restar \n"
_msg5:      .asciiz  "Ingrese 3 para  multiplicar \n"
_msg6:      .asciiz  "Ingrese 4 para dividir \n"
_msg7:      .asciiz  "Ingrese 5 para salir\n"
_msg8:      .asciiz  "El resultado es \n"
_msg9:      .asciiz  "Opcion no valida"
   .text
   .globl main
main:
       move $fp, $sp
       li $t0, 1
       sw $t0, _op
_etiq2:
       lw $t0, _x
       li $t1, 5
       beq $t0, $t1, _etiq1
       b _etiq3
_etiq3:
       li $v0, 4
       la $a0,_msg0
       syscall
       li $v0, 4
       la $a0,_msg1
       syscall
       li $v0, 5
       syscall
       sw $v0,_x
       li $v0, 4
       la $a0,_msg2
       syscall
       li $v0, 5
       syscall
       sw $v0,_y
       li $v0, 4
       la $a0,_msg3
       syscall
       li $v0, 4
       la $a0,_msg4
       syscall
       li $v0, 4
       la $a0,_msg5
       syscall
       li $v0, 4
       la $a0,_msg6
       syscall
       li $v0, 4
       la $a0,_msg7
       syscall
       li $v0, 5
       syscall
       sw $v0,_op
       lw $t0, _op
       li $t1, 1
       beq $t0, $t1, _etiq5
       b _etiq4
_etiq5:
       lw $t0,_x
       lw $t1,_y
       add $t2, $t0, $t1
       sw $t2, _result
       li $v0, 4
       la $a0,_msg8
       syscall
       li $v0, 1
       lw $a0,_result
       syscall
_etiq4:
       lw $t0, _op
       li $t1, 2
       beq $t0, $t1, _etiq7
       b _etiq6
_etiq7:
       lw $t0,_x
       lw $t1,_y
       sub $t2, $t0, $t1
       sw $t2, _result
       li $v0, 4
       la $a0,_msg8
       syscall
       li $v0, 1
       lw $a0,_result
       syscall
_etiq6:
       lw $t0, _op
       li $t1, 3
       beq $t0, $t1, _etiq9
       b _etiq8
_etiq9:
       lw $t0,_x
       lw $t1,_y
       mul $t2, $t0, $t1
       sw $t2, _result
       li $v0, 4
       la $a0,_msg8
       syscall
       li $v0, 1
       lw $a0,_result
       syscall
_etiq8:
       lw $t0, _op
       li $t1, 4
       beq $t0, $t1, _etiq11
       b _etiq10
_etiq11:
       lw $t0,_x
       lw $t1,_y
       div $t2, $t0, $t1
       sw $t2, _result
       li $v0, 4
       la $a0,_msg8
       syscall
       li $v0, 1
       lw $a0,_result
       syscall
_etiq10:
       lw $t0, _op
       li $t1, 5
       bgt $t0, $t1, _etiq13
       b _etiq12
_etiq13:
       li $v0, 4
       la $a0,_msg9
       syscall
_etiq12:
       b _etiq2
_etiq1:
       li $v0,10
       syscall
