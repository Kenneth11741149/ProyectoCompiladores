.data
_letra:       .word 0
_x:       .word 0
   .text
   .globl main
main:
       move $fp, $sp
       li $v0,10
       syscall
