.data
_varchar:       .word 0
_x:       .word 0
_msg0:      .asciiz  "buenas mis queridos chavalos"
_msg1:      .asciiz  "hola"
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
       li $v0, 4
       la $a0,_msg0
       syscall
       li $v0, 4
       la $a0,_msg1
       syscall
       li $v0, 1
       lw $a0,_x
       syscall
       li $v0,10
       syscall
