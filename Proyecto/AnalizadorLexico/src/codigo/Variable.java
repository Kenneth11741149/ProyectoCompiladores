/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;


public class Variable {
    public String type;
    public String coreType;
    public String id;
    public String ambito;
    public int i; //Si la variable es un array esta variable tendra informacion de las filas.
    public int j; //Si la variable es una matriz esta variable tendra informacion de las columnas.
    public int offset;//For MIPS in assembler
    
    public Variable(String type, String id, String ambito) {
        this.type = type;
        this.id = id;
        this.ambito = ambito;
    }
    
    public Variable(String type, String id, String ambito, int offset) {
        this.type = type;
        this.id = id;
        this.ambito = ambito;
        this.offset = offset;
    }

    public String getType() {
        return type;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
    
    public String printData(){
        String retVal;
        retVal = "ID: " + this.id + "  Type: " +this.type + " Scope: " + this.ambito + " byte offset: "+ this.offset; 
        return retVal;
    }
    
    
}
