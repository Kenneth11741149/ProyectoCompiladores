/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Leonardo
 */
public class Node {

    private String value;
    private String type;
    private Boolean visited;
    private ArrayList<Node> hijos;

    public Node() {
        value = "";
        type = "";
        visited = false;
        hijos = new ArrayList<>();
    }

    public Node(String value,Boolean visited) {
        this.value = value;
        this.visited = visited;
        type = "";
        hijos = new ArrayList<>();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void SetValue(String value) {
        this.value = value;
    }

    public String GetValue() {
        return value;
    }

  

    public void SetVisited(Boolean visited) {
        this.visited = visited;
    }

    public Boolean GetVisited() {
        return visited;
    }

    public String getValue() {
        return value;
    }

    public Boolean getVisited() {
        return visited;
    }

    public ArrayList<Node> getHijos() {
        return hijos;
    }

    public void setValue(String value) {
        this.value = value;
    }

   

    public void setVisited(Boolean visited) {
        this.visited = visited;
    }

    public void setHijos(ArrayList<Node> hijos) {
        this.hijos = hijos;
    }

    public void addHijo(Node hijo) {
        this.hijos.add(hijo);
    }

    public String Imprimir(int profundidad) {

        String temp = "";
        
        for (int i = 0; i < profundidad-1; i++) {

            temp += "       ";

        }
        if(profundidad == 0){
        }else{
            temp += this.GetValue()+"\n";
        }
        for (int i = 0; i < hijos.size(); i++) {
            temp += this.getHijos().get(i).Imprimir(profundidad + 1);

        }
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write(temp);
            myWriter.close();
            
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return temp;
    }

}
