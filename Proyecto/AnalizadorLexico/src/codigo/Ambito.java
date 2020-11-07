package codigo;

import java.util.ArrayList;

public class Ambito {
    String name;
    ArrayList<Variable> variables = new ArrayList();//Tabla de variables
    ArrayList<Ambito> SubAmbitos = new ArrayList();
    Ambito padre;

    
    public Ambito() {
    }
    
    public Ambito(String name, Ambito padre) {
        this.name = name;
        this.padre = padre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Variable> getVariables() {
        return variables;
    }

    public void setVariables(ArrayList<Variable> variables) {
        this.variables = variables;
    }

    public ArrayList<Ambito> getSubAmbitos() {
        return SubAmbitos;
    }

    public void setSubAmbitos(ArrayList<Ambito> SubAmbitos) {
        this.SubAmbitos = SubAmbitos;
    }

    public Ambito getPadre() {
        return padre;
    }

    public void setPadre(Ambito padre) {
        this.padre = padre;
    }

    

    
    
    
    
    
    
}
