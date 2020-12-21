.data
_varchar:       .word 0
_x:       .word 0
   .text
   .globl main
main:
       move $fp, $sp
       li $t0, 10
       sw $t0, _varchar
       li $t0, 5
       li $t1, 2
       sub $t2, $t0, $t1
       li $t0, 3
       div $t1, $t0, $t2
       li $t0, 5
       add $t2, $t0, $t1
       sw $t2, _x
_etiq2:
_etiq3:
       li $v0, 1
       lw $a0,_x
       syscall
       b _etiq2
_etiq1:
       li $v0,10
       syscall
