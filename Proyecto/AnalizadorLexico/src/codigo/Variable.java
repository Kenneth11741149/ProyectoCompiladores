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
public class Variable {
    public String type;
    public String id;
    public String ambito;
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
    
    
}
