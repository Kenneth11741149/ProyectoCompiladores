/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author Erick C
 */
public class Cuadruplos {
    public String operador;
    public String arg1;
    public String arg2;
    public String res;
    
    public Cuadruplos(String operador, String arg1, String arg2, String res){
        this.operador = operador;
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.res = res;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getArg1() {
        return arg1;
    }

    public void setArg1(String arg1) {
        this.arg1 = arg1;
    }

    public String getArg2() {
        return arg2;
    }

    public void setArg2(String arg2) {
        this.arg2 = arg2;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }
    
    @Override
    public String toString(){
        return "Cuadruplo-> " + "Op: " + operador + " | arg1: " + arg1 + " | arg2: " + arg2 + " | res: "+res; 
    }
    
}
