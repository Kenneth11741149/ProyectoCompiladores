/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;
import java.util.Scanner;


/**
 *
 * @author Charly Ponce
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /*private void analizarLexico() throws IOException {
        int cont = 1;

        String expr = (String) txtResultado.getText();
        Lexer lexer = new Lexer(new StringReader(expr));
        String resultado = "LINEA " + cont + "\t\tSIMBOLO\n";
        while (true) {
            Tokens token = lexer.yylex();
            if (token == null) {
                txtAnalizarLex.setText(resultado);
                return;
            }
            switch (token) {
                case Linea:
                    cont++;
                    resultado += "LINEA " + cont + "\n";
                    break;
                case Comillas:
                    resultado += "  <Comillas>\t\t" + lexer.lexeme + "\n";
                    break;
                case Eat:
                    resultado += "  <Reservada eat>\t" + lexer.lexeme + "\n";
                    break;
                case THrow:
                case Throwln:
                    resultado += "  <Reservada throw>\t" + lexer.lexeme + "\n";
                    break;
                case Int:
                case Boolean:
                case Character:
                    resultado += "  <Tipo de dato>\t" + lexer.lexeme + "\n";
                    break;
                case OpenTest:
                    resultado += "  <Reservada opentest>\t" + lexer.lexeme + "\n";
                    break;
                case CloseTest:
                    resultado += "  <Reservada closetest>\t" + lexer.lexeme + "\n";
                    break;
                case Then:
                    resultado += "  <Reservada then>\t" + lexer.lexeme + "\n";
                    break;
                case Or:
                    resultado += "  <Reservada or>\t" + lexer.lexeme + "\n";
                    break;
                case Do:
                    resultado += "  <Reservada do>\t" + lexer.lexeme + "\n";
                    break;

                case OpenFor:
                    resultado += "  <Reservada openfor>\t" + lexer.lexeme + "\n";
                    break;
                case CloseFor:
                    resultado += "  <Reserva closefor>\t" + lexer.lexeme + "\n";
                    break;
                case OpenUntil:
                    resultado += "  <Reservada openuntil>\t" + lexer.lexeme + "\n";
                    break;
                case CloseUntil:
                    resultado += "  <Reserva closeuntil>\t" + lexer.lexeme + "\n";
                    break;

                case Igual:
                    resultado += "  <Operador igual>\t" + lexer.lexeme + "\n";
                    break;
                case Suma:
                    resultado += "  <Operador suma>\t" + lexer.lexeme + "\n";
                    break;
                case Resta:
                    resultado += "  <Operador resta>\t" + lexer.lexeme + "\n";
                    break;
                case Multiplicacion:
                    resultado += "  <Operador multiplicacion>\t" + lexer.lexeme + "\n";
                    break;
                case Division:
                    resultado += "  <Operador division>\t" + lexer.lexeme + "\n";
                    break;
                case Op_incremento:
                    resultado += "  <Operador incremento>\t" + lexer.lexeme + "\n";
                    break;
                case Op_relacional:
                    resultado += "  <Operador relacional>\t" + lexer.lexeme + "\n";
                    break;
                case Op_atribucion:
                    resultado += "  <Operador atribucion>\t" + lexer.lexeme + "\n";
                    break;
                case Op_booleano:
                    resultado += "  <Operador booleano>\t" + lexer.lexeme + "\n";
                    break;
                case Parentesis_a:
                    resultado += "  <Parentesis de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Parentesis_c:
                    resultado += "  <Parentesis de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Llave_a:
                    resultado += "  <Llave de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Llave_c:
                    resultado += "  <Llave de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Corchete_a:
                    resultado += "  <Corchete de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Corchete_c:
                    resultado += "  <Corchete de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Main:
                    resultado += "  <Reservada open-main>\t" + lexer.lexeme + "\n";
                    break;

                case CloseMain:
                    resultado += "  <Reservada close-main>\t" + lexer.lexeme + "\n";
                    break;
                case P_coma:
                    resultado += "  <Punto y coma>\t" + lexer.lexeme + "\n";
                    break;
                case Coma:
                    resultado += "  <coma>\t" + lexer.lexeme + "\n";
                    break;
                case Identificador:
                    resultado += "  <Identificador>\t\t" + lexer.lexeme + "\n";
                    break;
                case Numero:
                    resultado += "  <Numero>\t\t" + lexer.lexeme + "\n";
                    break;
                case Define:
                    resultado += "  <Reservada define>\t" + lexer.lexeme + "\n";
                    break;
                case As:
                    resultado += "  <Reservada as>\t" + lexer.lexeme + "\n";
                    break;
                case ERROR:
                    resultado += "  <Simbolo no definido>\n";
                    break;
                
                default:
                    resultado += "  < " + lexer.lexeme + " >\n";
                    break;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        txtarbol = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAnalizarSin = new javax.swing.JTextArea();
        btnArchivo = new javax.swing.JButton();
        btnAnalizarSin = new javax.swing.JButton();
        btnLimpiarSin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtarbol.setEditable(false);
        txtarbol.setColumns(20);
        txtarbol.setRows(5);
        jScrollPane4.setViewportView(txtarbol);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("CODIGO");

        txtAnalizarSin.setEditable(false);
        txtAnalizarSin.setColumns(20);
        txtAnalizarSin.setRows(5);
        jScrollPane3.setViewportView(txtAnalizarSin);

        btnArchivo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnArchivo.setText("Abrir archivo");
        btnArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoActionPerformed(evt);
            }
        });

        btnAnalizarSin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAnalizarSin.setText("Analizar");
        btnAnalizarSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarSinActionPerformed(evt);
            }
        });

        btnLimpiarSin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLimpiarSin.setText("Limpiar");
        btnLimpiarSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarSinActionPerformed(evt);
            }
        });

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        txtResultado.setText("open-main()\n    define varchar as integer;\n    define x as integer := 5+3/(5-2);\n   open-for(integer i :=0;i<6;i++) do\n\topen-test(x <3 | (!(x>15) & x>10 ) ) then\n\t    throwln(x);\n\tor\n\t     throw(i);\n                             close-test\n   close-for\n    open-until(true) do\n           throw(x);\n     close-until\n\nclose-main\nopen-method integer f2(integer x1;integer x2)\n    define x as integer;\n    f2();\n   return := x;\n \nclose-method");
        jScrollPane1.setViewportView(txtResultado);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("ARBOL");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("ANALISIS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(296, 296, 296))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiarSin)
                        .addGap(42, 42, 42)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnAnalizarSin)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAnalizarSin)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnLimpiarSin)
                                .addComponent(btnArchivo)))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File archivo = new File(chooser.getSelectedFile().getAbsolutePath());

        try {
            String ST = new String(Files.readAllBytes(archivo.toPath()));
            txtResultado.setText(ST);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnArchivoActionPerformed

    private void btnLimpiarSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarSinActionPerformed
        // TODO add your handling code here:
        txtAnalizarSin.setText(null);
    }//GEN-LAST:event_btnLimpiarSinActionPerformed

    private void btnAnalizarSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarSinActionPerformed
        // TODO add your handling code here:
        String ST = txtResultado.getText();
        Sintax s = new Sintax(new codigo.LexerCup(new StringReader(ST)));
        txtAnalizarSin.setText("");
        
        
        try {
            FileWriter myWriter = new FileWriter("errors.txt");
            myWriter.write("");
            
            myWriter.close();
            
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        txtarbol.setText("");
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("");
            
            myWriter.close();
            
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            s.parse();
            System.out.println(s.getS());
            txtAnalizarSin.setText("Analisis realizado correctamente");
            txtAnalizarSin.setForeground(new Color(25, 111, 61));
            txtarbol.setText("");
            Node arbol = s.raiz;
            variables.clear();
            funciones.clear();
            recorrerArbol(arbol);
            for (int i = 0; i < this.variables.size(); i++) {
                System.out.println(variables.get(i).printData());
            }
            try {
                File myObj = new File("filename.txt");
                Scanner myReader = new Scanner(myObj);
                String data = "";
                while (myReader.hasNextLine()) {
                     data = myReader.nextLine();
                     txtarbol.append("\n");
                     txtarbol.append(data);
                    
                }
                
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            
            try {
                File myObj = new File("errors.txt");
                Scanner myReader = new Scanner(myObj);
                String data = "";
                boolean verificar = true;
                if(myReader.hasNextLine()){
                    verificar = false;
                    txtAnalizarSin.setText("");
                    txtAnalizarSin.setForeground(Color.red);
            
                }
                while (myReader.hasNextLine()) {
                    
                     data = myReader.nextLine();
                     
                     txtAnalizarSin.append("\n");
                     txtAnalizarSin.append(data);
                    
                }
                
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            
          

        } catch (Exception ex) {
            Symbol sym = s.getS();
            txtAnalizarSin.setText("");
            try {
                File myObj = new File("errors.txt");
                Scanner myReader = new Scanner(myObj);
                String data = "";
                while (myReader.hasNextLine()) {
                     data = myReader.nextLine();
                     txtAnalizarSin.append("\n");
                     txtAnalizarSin.append(data);
                    
                }
                
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            txtAnalizarSin.setForeground(Color.red);
        }
        //Graficar(recorrido(s.raiz));
    }//GEN-LAST:event_btnAnalizarSinActionPerformed

    
    //METODOS ANALISIS SEMANTICO
    
    //METODO PARA RECORRER EL ARBOL
    
    public void recorrerArbol(Node n){
        Node nodo = n;
        //System.out.println(nodo.GetValue());
        if (nodo!= null){
            System.out.println("Entering...");
            System.out.println(nodo.GetValue());
            if(nodo.GetValue().equals("DECLARATION")){
                //System.out.println("Encontro declaracion");
                String tipo = "";
                String id = "";
                
                for (Node nodoHijo: nodo.getHijos()) {
                    //System.out.println("Entro");
                    //System.out.println(nodoHijo.getValue());
                    if(nodoHijo.GetValue().equals("integer")){
                      //  System.out.println("true");
                        tipo = nodoHijo.getValue();
                        //System.out.println(tipo);
                    }else if( nodoHijo.GetValue().equals("character")){
                        tipo = nodoHijo.getValue();
                        //System.out.println(tipo);
                    }else if( nodoHijo.GetValue().equals("boolean")){
                        tipo = nodoHijo.getValue();
                        //System.out.println(tipo);
                    }else{
                        //System.out.println(nodoHijo.GetValue());
                        id = nodoHijo.getValue();
                        if(verificar_variable_existente(nodoHijo.GetValue())){
                            this.erroresSemanticos.add("Error Semantico: variable: " + nodoHijo.getValue() + " ya existe en el ambito");
                        }else{
                            if(tipo.equals("character")){
                                this.bOffSet += 1;
                            }else{
                                int modul = 4 -( this.bOffSet % 4);
                                if( modul == 4){
                                    this.bOffSet += 4;
                                }else{
                                    this.bOffSet += 4 +modul;
                                }
                                
                                this.variables.add(new Variable(tipo, id, this.ambito_actual, this.bOffSet));
                            }
                        }
                        
                        
                    } 
                    
                }
                
                
            }else if(nodo.GetValue().equals("TEST")){
                System.out.println("Encontro Test");
            }else{
                for(Node nodoHijo: nodo.getHijos()){
                    recorrerArbol(nodoHijo);
                }
            }
        }else{
            System.out.println("Nodo vacio");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    public boolean verificar_variable_existente(String n){
        boolean retVal = false;
        for (int i = 0; i < this.variables.size(); i++) {
            if(n.equals(this.variables.get(i).getId()) && this.ambito_actual.equals(this.variables.get(i).getAmbito())){
                retVal = true;
            }//La variable ya existe en el ambito actual
        }
        return retVal;
    }
    
    private void Graficar(String cadena) {
        FileWriter fw = null;
        PrintWriter pw = null;
        String archivo = "AbstractSyntaxTree.dot";
        try {
            fw = new FileWriter(archivo);
            pw = new PrintWriter(fw);
            pw.println("digraph G {");
            pw.println(cadena);
            pw.println("\n}");
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private String recorrido(Node raiz) {
        String cuerpo = "";
        for (Node child : raiz.getHijos()) {
            System.out.println(child.toString());
            if (!(child.getValue().equals("vacio"))) {
                cuerpo += "\"" + raiz.getValue() + ". " + raiz.getValue() + " = " + raiz.GetValue()
                        + "\"->\"" + child.getValue() + ". "  + " = " + child.getValue() + "\"" + "\n";
                cuerpo += recorrido(child);
            }
        }
        return cuerpo;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizarSin;
    private javax.swing.JButton btnArchivo;
    private javax.swing.JButton btnLimpiarSin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea txtAnalizarSin;
    private javax.swing.JTextArea txtResultado;
    private javax.swing.JTextArea txtarbol;
    // End of variables declaration//GEN-END:variables
    ArrayList<Variable> variables = new ArrayList();//Tabla de variables
    ArrayList<Function> funciones = new ArrayList();//Tabla de funciones
    int bOffSet = 0;
    ArrayList<String> erroresSemanticos = new ArrayList();
    String ambito_actual = "";

}
