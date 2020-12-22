.data
_varchar:       .word 0
_varEchelon:       .word 0
_x:       .word 0
_i:       .word 0
_msg0:      .asciiz  "ASTRONOMIA"
_msg1:      .asciiz  "SERE UN PAYASO"
   .text
   .globl main
main:
       move $fp, $sp
       li $t0, 10
       sw $t0, _varchar
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
_etiq2:
       lw $t0, _x
       li $t1, 3
       bgt $t0, $t1, _etiq1
       b _etiq3
_etiq3:
       li $v0, 1
       lw $a0,_x
       syscall
       b _etiq2
_etiq1:
       lw $t0, _x
       li $t1, 3
       bgt $t0, $t1, _etiq5
       b _etiq7
_etiq7:
       lw $t0, _x
       li $t1, 4
       bgt $t0, $t1, _etiq5
       b _etiq8
_etiq8:
       lw $t0, _x
       li $t1, 10
       bgt $t0, $t1, _etiq5
       b _etiq4
_etiq5:
       li $v0, 1
       lw $a0,_x
       syscall
_etiq4:
       li $t0, 0
       sw $t0, _i
_etiq10:
       lw $t0, _i
       li $t1, 6
       blt $t0, $t1, _etiq11
       b _etiq9
_etiq12:
       lw $t0,_i
       li $t1, 1
       add $t2, $t0, $t1
       sw $t2, _i
       b _etiq10
_etiq11:
       li $v0, 4
       la $a0,_msg0
       syscall
       b _etiq12
_etiq9:
       jal _f2 
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
