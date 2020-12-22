.data
_varchar:       .word 0
_msg0:      .asciiz  "INGRESE UN NUMERO"
_i:       .word 0
_msg1:      .asciiz  "Hola Mundo \n"
   .text
   .globl main
main:
       move $fp, $sp
       li $v0, 4
       la $a0,_msg0
       syscall
       li $v0, 5
       syscall
       sw $v0,_varchar
       li $t0, 0
       sw $t0, _i
_etiq2:
       lw $t0, _i
       lw $t1, _varchar
       blt $t0, $t1, _etiq3
       b _etiq1
_etiq4:
       lw $t0,_i
       li $t1, 1
       add $t2, $t0, $t1
       sw $t2, _i
       b _etiq2
_etiq3:
       jal _f2 
       b _etiq4
_etiq1:
       li $v0,10
       syscall
_f2:
       sw $fp, -4($sp)
       sw $ra, -8($sp)
       move $fp, $sp
       sub $sp, $sp, 8
       li $v0, 4
       la $a0,_msg1
       syscall
       b _f2Ender
_f2Ender:
       move $sp, $fp
       lw $fp, -4($sp)
       lw $ra, -8($sp)
       jr $ra
