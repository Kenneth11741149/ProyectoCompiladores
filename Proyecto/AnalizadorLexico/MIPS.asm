.data
_varchar:       .word 0
_varExeter:       .byte 0
_varEchelon:       .word 0
_x:       .word 0
_letra:       .byte 0
_z:       .word 0
_msg0:      .asciiz  "SooS"
_msg1:      .asciiz  "ses"
   .text
   .globl main
main:
       move $fp, $sp
       li $t0, 10
       sw $t0, _varchar
       li $t0, 'a'
       sw $t0, _varExeter
       li $t0, 1
       sw $t0, _varEchelon
       li $t0, 5
       li $t1, 2
       sub $t2, $t0, $t1
       lw $t0, -4($fp)
       div $t1, $t0, $t2
       li $t0, 5
       add $t2, $t0, $t1
       sw $t2, _x
       li $t0, 'c'
       sw $t0, _letra
       li $t0, 1
       sw $t0, _z
       b _etiq2
_etiq2:
       lw $t0, _varchar
       li $t1, 10
       beq $t0, $t1, _etiq3
       b _etiq4
_etiq3:
       li $v0, 4
       la $a0,_msg0
       syscall
       b _etiq1
_etiq4:
       lw $t0, _varchar
       li $t1, 11
       beq $t0, $t1, _etiq5
       b _etiq1
_etiq5:
       li $v0, 4
       la $a0,_msg1
       syscall
       b _etiq1
_etiq1:
       li $v0,10
       syscall
