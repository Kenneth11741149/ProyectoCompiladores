/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.ArrayList;

/**
 *
 * @author Erick C
 */
public class Function {

    public String id;
    public String type;
    public ArrayList<Variable> params;
    
    public Function(String id, String type){
        this.id = id;
        this.type = type;
        this.params = new ArrayList();
    }
    
    public String getId(){
        return this.id;
    }
    
    public String getType(){
        return this.type;
    }
    
    public ArrayList<Variable> getParams(){
        return this.params;
    }
    
    public void addParams(ArrayList<Variable> v){
        this.params = v;
    }

}
