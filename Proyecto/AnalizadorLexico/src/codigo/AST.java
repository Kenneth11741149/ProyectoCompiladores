/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.Stack;

/**
 *
 * @author Leonardo
 */

public class AST {

    private Node root = null;
    private Stack<Node> stack = null;

    public AST() {
        root = null;
        stack = new Stack<Node>();
    }

    public Node GetRoot() {
        return root;
    }

    public void SetRoot(Node root) {
        this.root = root;
    }

    public String GetExpression() {
        return root.toString();
    }

}
