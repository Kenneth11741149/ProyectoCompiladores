.data
_varchar:       .word 0
_x:       .word 0
_y:       .word 0
_msg0:      .asciiz  "Kenneth se la arta XD "
_msg1:      .asciiz  "FIN"
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
       li $t0, 3
       sw $t0, _y
       li $v0, 4
       la $a0,_msg0
       syscall
_etiq2:
       lw $t0, _x
       li $t1, 10
       bgt $t0, $t1, _etiq1
       b _etiq3
_etiq3:
       lw $t0, _x
       li $t1, 3
       bgt $t0, $t1, _etiq5
       b _etiq6
_etiq6:
       lw $t0, _x
       li $t1, 9
       blt $t0, $t1, _etiq5
       b _etiq4
_etiq5:
       li $t0, 6
       sw $t0, _x
       b _etiq7
_etiq4:
       li $t0, 1
       sw $t0, _x
_etiq7:
       li $v0, 1
       lw $a0,_x
       syscall
       li $t0, 12
       sw $t0, _x
       lw $t0, _x
       li $t1, 8
       bgt $t0, $t1, _etiq9
       b _etiq8
_etiq9:
       li $t0, 1000
       sw $t0, _x
_etiq8:
       li $v0, 1
       lw $a0,_x
       syscall
       b _etiq2
_etiq1:
       li $v0, 4
       la $a0,_msg1
       syscall
       li $v0,10
       syscall
