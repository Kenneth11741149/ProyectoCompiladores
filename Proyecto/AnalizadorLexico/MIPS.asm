.data
_varchar:       .byte 0
_msg0:      .asciiz  "PENESOTE"
   .text
   .globl main
main:
       move $fp, $sp
       li $v0, 12
       syscall
       sw $v0,_varchar
       lw $t0, _varchar
       li $t1, 'c'
       beq $t0, $t1, _etiq2
       b _etiq1
_etiq2:
       li $v0, 4
       la $a0,_msg0
       syscall
_etiq1:
       li $v0,10
       syscall
