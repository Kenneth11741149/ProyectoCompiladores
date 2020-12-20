.data
msg0:      .asciiz  "INGRESE UN NUMERO"
_varchar:      .word 0
msg1:      .asciiz  "xddd"
   .text
   .globl main
main:
       move $fp, $sp
       li $v0, 4
       la $a0,msg0
       syscall
       li $v0, 5
       syscall
       sw $v0,_varchar
       li $v0, 4
       la $a0,msg1
       syscall
       li $v0, 1
       la $a0,_varchar
       syscall
       li $v0,10
       syscall
