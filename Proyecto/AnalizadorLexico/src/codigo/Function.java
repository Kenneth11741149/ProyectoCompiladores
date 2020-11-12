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
    public ArrayList<String> params;
    //public Ambito ambito;
    
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

    public ArrayList<String> getParams() {
        return params;
    }
    
    

}
