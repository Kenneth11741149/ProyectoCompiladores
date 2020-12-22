.data
_varchar:       .word 0
_varExeter:       .byte 0
_varEchelon:       .word 0
_x:       .word 0
_i:       .word 0
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
       li $t0, 3
       div $t1, $t0, $t2
       li $t0, 5
       add $t2, $t0, $t1
       sw $t2, _x
       li $t0, 0
       sw $t0, _i
_etiq2:
       lw $t0, _i
       li $t1, 6
       blt $t0, $t1, _etiq3
       b _etiq1
_etiq4:
       lw $t0,_i
       li $t1, 1
       add $t2, $t0, $t1
       sw $t2, _i
       b _etiq2
_etiq3:
       lw $t0, _x
       li $t1, 15
       bgt $t0, $t1, _etiq7
       b _etiq8
       b _etiq5
_etiq6:
       li $v0, 1
       lw $a0,_x
       syscall
       b _etiq9
_etiq5:
_etiq9:
       b _etiq4
_etiq1:
_etiq11:
_etiq12:
       li $v0, 1
       lw $a0,_x
       syscall
       b _etiq11
_etiq10:
       li $v0,10
       syscall
_f2:
       sw $fp, -4($sp)
       sw $ra, -8($sp)
       sw $s0, -12($sp)
       sw $s1, -16($sp)
       move $fp, $sp
       sub $sp, $sp, 16
       move $a0, $s0
       move $a1, $s1
       b _f2Ender
_f2Ender:
       move $sp, $fp
       lw $fp, -4($sp)
       lw $ra, -8($sp)
       lw $s0, -12($sp)
       lw $s1, -16($sp)
       jr $ra
