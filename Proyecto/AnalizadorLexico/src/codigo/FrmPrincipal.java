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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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

        frame_int_final = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        MIPS = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable_cuadruplos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
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
        jb_int_final = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cuadruplos: ");

        jtable_cuadruplos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Op", "Arg1", "Arg2", "Res/Guardado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtable_cuadruplos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        MIPS.addTab("Cuadruplo", jPanel2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 703, Short.MAX_VALUE)
        );

        MIPS.addTab("MIPS", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MIPS)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MIPS)
                .addContainerGap())
        );

        javax.swing.GroupLayout frame_int_finalLayout = new javax.swing.GroupLayout(frame_int_final.getContentPane());
        frame_int_final.getContentPane().setLayout(frame_int_finalLayout);
        frame_int_finalLayout.setHorizontalGroup(
            frame_int_finalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 682, Short.MAX_VALUE)
            .addGroup(frame_int_finalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(frame_int_finalLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        frame_int_finalLayout.setVerticalGroup(
            frame_int_finalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 753, Short.MAX_VALUE)
            .addGroup(frame_int_finalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(frame_int_finalLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

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
        txtResultado.setText("open-main()\n    define varchar as integer;\n    varchar := 10;\n    define x as integer := 5+3/(5-2);\n   open-for(integer i :=0;i<6;i++) do\n\topen-test(x <3 | (!(x>15) & x>10 ) ) then\n\t    throwln(x);\n\tor\n\t     throw(i);\n                             close-test\n   close-for\n    open-until(true) do\n           throw(x);\n     close-until\n\nclose-main\nopen-method integer f2(integer x1; integer x2)\n    define x as integer;\n    f2();\n   return := x;\n \nclose-method");
        jScrollPane1.setViewportView(txtResultado);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("ARBOL");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("ANALISIS");

        jb_int_final.setText("A Intermedio/FINAL");
        jb_int_final.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_int_finalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(296, 296, 296))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_int_final)
                .addGap(86, 86, 86))
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
                .addGap(18, 18, 18)
                .addComponent(jb_int_final)
                .addContainerGap(21, Short.MAX_VALUE))
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
            currentPrototype = 0;
            GlobalAmbitos.clear();
            VariableVerificada = null;
            ambito_actual = "";
            bOffSet = 0;

            /* NO BORRAR
            
            recorrerArbolA(arbol, nuevo, 0);
            
             */
            Ambito nuevo = new Ambito("MAIN", null);
            PROCEDURE_SemanticAnalisis(arbol, nuevo, 0);
            System.out.println("TestingPrint");
            PrintGlobalVariablesData();
            /*for (int i = 0; i < this.variables.size(); i++) {
                System.out.println(variables.get(i).printData());
            }*/

            System.out.println("NADUFNADFNADFN");
            for (int i = 0; i < this.funciones.size(); i++) {
                System.out.print("Func: ");
                System.out.print(this.funciones.get(i).getId());
                System.out.print(" Tipo: ");
                System.out.print(this.funciones.get(i).getType());
                //System.out.println("Some number sh: " +this.funciones.get(i).getParams().size());
                System.out.println(" ");
                /*for (int j = 0; j < this.funciones.get(i).getParams().size(); j++) {
                    System.out.print("      -->: ");
                    System.out.println(this.funciones.get(i).getParams().get(j).printData());
                 */
            }

            System.out.println("ACCESSING INTERMEDIATE");
            codigo_intermedio(arbol);
            
            
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
                if (myReader.hasNextLine()) {
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

    private void jb_int_finalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_int_finalMouseClicked
        // TODO add your handling code here:
        //TOMANDO LA DATA PRINCIPAL
        if(this.cuadruplos.isEmpty()){
            JOptionPane.showMessageDialog(this, "No hay data analizada");
        }else{
            DefaultTableModel model = (DefaultTableModel) jtable_cuadruplos.getModel();
            model.setRowCount(0);
            for (int i = 0; i < this.cuadruplos.size(); i++) {
                model.addRow(this.cuadruplos.get(i).valTable());
                
            }
            frame_int_final.pack();
            frame_int_final.setLocationRelativeTo(this);
            frame_int_final.setVisible(true);
        }
        
    }//GEN-LAST:event_jb_int_finalMouseClicked

    public void recorrerArbolA(Node n, Ambito ambito, int pos) {
        System.out.println("HIJOS " + ambito.getName());
        /* Node hijo = n.getHijos().get(0);
        for (Node hijos : hijo.getHijos()) {
            System.out.println(hijos.GetValue());
        }*/

 /*  Body of the function:prototype-identifier  
            - Identifies function prototypes.
        
            - RecorrerArbol functions normally.
                   = We eliminate the parameter extraction portion of the function declaration.
                   
         */
        while (pos < n.getHijos().size()) {
            Node hijo = n.getHijos().get(pos);

            System.out.println(hijo.GetValue());
            pos++;
            switch (hijo.getValue()) {
                case "MAIN": {
                    Ambito Main = new Ambito("MAIN", null);
                    GlobalAmbitos.add(Main);
                    recorrerArbolA(hijo, Main, 0);
                    break;
                }

                case "INT METHOD": {
                    //PROCEDURE_FunctionDeclaration("INT", hijo, pos);
                    PROCEDURE_FunctionDefinition("integer", hijo, 0);
                    break;
                }

                case "CHARACTER METHOD": {
                    //PROCEDURE_FunctionDeclaration("CHARACTER", hijo, pos);
                    PROCEDURE_FunctionDefinition("character", hijo, 0);
                    break;
                }

                case "BOOLEAN METHOD": {
                    PROCEDURE_FunctionDefinition("boolean", hijo, 0);
                    break;
                }

                case "METHOD-CALL": {
                    PROCEDURE_MethodCall(hijo, ambito);
                    break;
                }

                case "TEST": {
                    System.out.println("Hijos del If" + hijo.getHijos().size());
                    String nameAmbito1 = ambito.getName() + "-TEST-THEN-" + pos;
                    String nameAmbito2 = ambito.getName() + "-TEST-OR-" + pos;
                    Ambito TestThen = new Ambito(nameAmbito1, ambito);
                    Ambito TestOr = new Ambito(nameAmbito2, ambito);
                    ambito.getSubAmbitos().add(TestThen);
                    ambito.getSubAmbitos().add(TestOr);
                    recorrerArbolA(hijo.getHijos().get(1), TestThen, 0); // If then

                    if (hijo.getHijos().size() == 3) { //If Else
                        recorrerArbolA(hijo.getHijos().get(2), TestOr, 0);
                    }
                    break;

                }

                case "DECLARATION": {
                    PROCEDURE_Declaration(hijo, ambito, pos);
                    break;
                }
                case "FOR": {
                    String ForAmbito = ambito.getName() + "-ForThen-" + pos;
                    Ambito ForThen = new Ambito(ForAmbito, ambito);
                    ambito.getSubAmbitos().add(ForThen);
                    recorrerArbolA(hijo.getHijos().get(3), ForThen, 0);
                    // recorrerArbolA(hijo.getHijos().get(2), TestOr, 0);
                    break;
                }
                case "UNTIL": {
                    String UntilAmbito = ambito.getName() + "-UntilDo-" + pos;
                    Ambito UntilDo = new Ambito(UntilAmbito, ambito);
                    ambito.getSubAmbitos().add(UntilDo);
                    recorrerArbolA(hijo.getHijos().get(1), UntilDo, 0);
                    break;
                }
                case "ASSIGNMENT": {
                    PROCEDURE_Assignment(hijo, ambito, pos);
                    break;
                }
            }
        }

    }

    public boolean verificar_variable_existenteA(String n, Ambito ambito) {
        boolean retVal = false;
        for (int i = 0; i < ambito.getVariables().size(); i++) {
            if (n.equals(ambito.getVariables().get(i).getId())) {
                VariableVerificada = ambito.getVariables().get(i);
                retVal = true;
                break;
            }//La variable ya existe en el ambito actual
        } // Se chequea que la variable exista en el ambito actual.

        if (retVal == false) { // Si la variable no existe en el ambito actual
            if (ambito.getPadre() == null) { //Se procede a revisar en el ambito del padre. Si es null ya no tiene padre.
                return retVal;
            } else { //Si no tiene padre es que se salio lo mas que podia del ambito. Ahi encuentro lo que encontro.
                return verificar_variable_existenteA(n, ambito.getPadre());
            }
        } else { //Si encontro algo pues lo anuncia.
            return retVal; //Should be true.
        }

    } //No borrar

    public String verificarasignaciondA(String tipo, String var2, Ambito ambito) {
        String result = "true";
        Boolean keepsearching = true;
        Variable v2 = new Variable("xd", "xd", "xd");

        for (int i = 0; i < ambito.getVariables().size(); i++) {
            if (var2.equals(ambito.getVariables().get(i).getId())) {
                keepsearching = false;
                v2 = ambito.getVariables().get(i);
                if (!v2.getType().equals(tipo)) {
                    result = "Variable " + var2 + " Incompatible.";
                }
            }
        }

        if (keepsearching) {
            if (ambito.getPadre() == null) {
                return "Variable " + var2 + " no existe.";
            } else {
                return verificarasignaciondA(tipo, var2, ambito.getPadre());
            }
        } else {
            return result;
        }
    } //No borrar

    public void PrintGlobalVariablesData() {
        for (int i = 0; i < GlobalAmbitos.size(); i++) {
            PrintVariableData(GlobalAmbitos.get(i));
            //DebugSystem.out.println("P1");
        }
    } //No borrar

    public void PrintVariableData(Ambito ambito) {
        System.out.println(ambito.getName() + ambito.getVariables().size());
        for (int i = 0; i < ambito.getVariables().size(); i++) {
            System.out.println(ambito.getVariables().get(i).printData());
            //DebugSystem.out.println("P2");
        }
        for (int i = 0; i < ambito.getSubAmbitos().size(); i++) {
            //DebugSystem.out.println("P3");
            PrintVariableData(ambito.getSubAmbitos().get(i));

        }
    } //No borrar

    public Boolean FunctionExists(Function function) {
        for (int i = 0; i < funciones.size(); i++) {
            //Debug Purposes
            //System.out.println("SDNADFNA SEXOO");
            int ParameterSize = function.getParams().size();
            //int ParameterSize2 = funciones.get(i).getParams().size();
            //Boolean answ1 = function.getId().equals(funciones.get(i).getId());
            //Boolean answ2 = function.getParams().size() == funciones.get(i).getParams().size();
            //System.out.println(ParameterSize + " and " + ParameterSize2);
            if (function.getId().equals(funciones.get(i).getId()) && function.getParams().size() == funciones.get(i).getParams().size()) {
                System.out.println("Function name and size has been compared and matched");
                int sameTypeParameters = 0;
                for (int j = 0; j < function.getParams().size(); j++) {
                    if (function.getParams().get(j).equals(funciones.get(i).getParams().get(j))) {
                        sameTypeParameters++;
                        System.out.println("Parameter comparison was successfull.");
                    } else {
                        System.out.println(function.getParams().get(j) + " Does not equal " + funciones.get(i).getParams().get(j));
                        System.out.println("Parameter not compatible.");
                    }
                }
                if (ParameterSize == sameTypeParameters) {
                    return true;
                }
            }
        }
        return false;
    }//No borrar

    /* End Experimental Code for the Ambito Object*/
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

    public void PROCEDURE_FunctionPrototypeExtractor(String functionType, Node hijo, int pos) {
        //Declaration with 3 nodes is not coded.
        Ambito IntegerMethod = new Ambito(functionType + " METHOD-" + pos, null);
        String FunctionName = hijo.getHijos().get(0).getValue();
        //DebugFunctionName System.out.println("Function Name [" + FunctionName+"]");
        Function newFunction = new Function(FunctionName, functionType);
        Boolean error = false;
        for (int i = 1; i < hijo.getHijos().size(); i++) {
            Node SubHijoActual = hijo.getHijos().get(i);
            if (SubHijoActual.GetValue().equals("PARAMETROS")) {
                int SubHijoActualChildren = SubHijoActual.getHijos().size();
                for (int j = 0; j < SubHijoActualChildren; j = j + 2) {
                    String ParamsType = SubHijoActual.getHijos().get(j).getValue();
                    String ParamsName = SubHijoActual.getHijos().get(j + 1).getValue();
                    if (verificar_variable_existenteA(ParamsName, IntegerMethod)) {
                        String ElError = "Error Semantico: Variable [" + ParamsName + "] ya existe.";
                        ReportError(ElError);
                    } else {
                        //ByteOffset Assignation
                        if (ParamsType.equals("integer") || ParamsType.equals("boolean")) {
                            int modul = 4 - (this.bOffSet % 4);
                            if (modul == 4) {
                                this.bOffSet += 4;
                            } else {
                                this.bOffSet += 4 + modul;
                            }
                        } else if (ParamsType.equals("character")) {
                            this.bOffSet += 1;
                        }
                        newFunction.getParams().add(ParamsType);
                        IntegerMethod.getVariables().add(new Variable(ParamsType, ParamsName, IntegerMethod.getName() + "-" + FunctionName, this.bOffSet));
                        System.out.println("New " + functionType + " method variable aggregation complete");
                    }

                }
            }
            /*else if (SubHijoActual.GetValue().equals("BLOQUE")) {
                recorrerArbolA(hijo.getHijos().get(i), IntegerMethod, 0);
            }*/

        }
        if (!error) {
            System.out.println("Ambito y prototipo de funcion agregado exitosamente!");
            GlobalAmbitos.add(IntegerMethod);
            newFunction.setAmbito(IntegerMethod);
            funciones.add(newFunction);
        }

    } //DEFINITIVAMENTE no borrar

    public void PROCEDURE_Declaration(Node hijo, Ambito ambito, int pos) {
        if (verificar_variable_existenteA(hijo.getHijos().get(1).getValue(), ambito)) {
            System.out.println("ERROR");
            this.erroresSemanticos.add("Error Semantico: variable: " + hijo.getHijos().get(1).getValue() + " ya existe en el ambito actual o en ambitos exteriores.");
            String error = "Error Semantico: variable: " + hijo.getHijos().get(1).getValue() + " ya existe en el ambito.";
            ReportError(error);
        } else {
            boolean añadir = true;
            String type = hijo.getHijos().get(0).getValue();
            //System.out.println("LMAAAAAAOOO Type" + type);
            switch (type) {
                case "character": {
                    this.bOffSet += 1;
                    break;
                }
                case "integer": {
                    if (hijo.getHijos().size() == 3) {
                        if (hijo.getHijos().get(2).getValue().equals("+") || hijo.getHijos().get(2).GetValue().equals("-") || hijo.getHijos().get(2).getValue().equals("*") || hijo.getHijos().get(2).getValue().equals("/")) {

                        } else {
                            boolean verificar = isInteger(hijo.getHijos().get(2).getValue());
                            if (!verificar) {
                                String s = verificarasignaciondA("integer", hijo.getHijos().get(2).getValue(), ambito);
                                if (!"true".equals(s)) {
                                    añadir = false;
                                    ReportError(s);
                                }
                            }
                        }

                    }
                    if (añadir) {
                        int modul = 4 - (this.bOffSet % 4);
                        if (modul == 4) {
                            this.bOffSet += 4;
                        } else {
                            this.bOffSet += 4 + modul;
                        }
                    }
                    break;
                }
                case "boolean": {

                    if (hijo.getHijos().size() == 3) { //Significa que hay una asignacion    [boolean var true]
                        boolean isBoolean = isBoolean(hijo.getHijos().get(2).getValue());
                        if (!isBoolean) {
                            añadir = false;
                            String error = "Boolean type Expected, not found.";
                            ReportError(error);
                        }
                    }
                    if (añadir) {
                        int modul = 4 - (this.bOffSet % 4);
                        if (modul == 4) {
                            this.bOffSet += 4;
                        } else {
                            this.bOffSet += 4 + modul;
                        }
                    }

                    break;
                }
            }

            if (añadir) {
                ambito.getVariables().add(new Variable(hijo.getHijos().get(0).getValue(), hijo.getHijos().get(1).getValue(), ambito.getName(), this.bOffSet));
            }
        }
    } //DEFINITIVAMENTE no borrar

    public void PROCEDURE_Assignment(Node hijo, Ambito ambito, int pos) {
        String NombreVariable = hijo.getHijos().get(0).GetValue(); //NombreVariable y VariableName son 2 diferentes.
        VariableVerificada = null; //Por seguridad se limpia algun acceso sucio que puede existir.
        if (!verificar_variable_existenteA(NombreVariable, ambito)) { //Si la variable del lado izquierdo no existe. Tira error
            String error = "Variable [" + NombreVariable + "] no existe.";
            ReportError(error);
        } else { //Si la variable del lado izquierdo existe, confirma el tipo.
            Node SegundoHijoDehijo = hijo.getHijos().get(1);
            String LeftSideAssignmentType = VariableVerificada.getType(); //Variable Verificada es una variable global llamada por verificar_variable_existenteA. Devuelve lo que encontro.
            String RightSideAssignmentType = SegundoHijoDehijo.getType();
            //Falta validar los methods y las asignaciones complejas.
            
            System.out.println("ASSIGNMENT DEBUG: Assignment Child Size [" + hijo.getHijos().size() + "]");
            if (hijo.getHijos().size() == 2) {
                switch (RightSideAssignmentType) { //This checks for the right side type. We must then   
                    case "VARIABLE": {
                        String VariableName = SegundoHijoDehijo.GetValue();
                        VariableVerificada = null;
                        if (verificar_variable_existenteA(VariableName, ambito)) {
                            RightSideAssignmentType = VariableVerificada.getType();
                            System.out.println("Table assignment Type: " + RightSideAssignmentType);
                            if (LeftSideAssignmentType.equals(RightSideAssignmentType)) {
                                System.out.println("Successfull ASSIGNMENT of " + LeftSideAssignmentType + " to " + RightSideAssignmentType + " on variable " + NombreVariable);
                            } else {
                                ReportError("ERROR SEMANTICO: No se puede asignar <" + RightSideAssignmentType + "> a la variable [" + NombreVariable + "]");
                            }
                        } else {
                            ReportError("Variable [" + VariableName + "] no existe en el ambito de la asignacion a " + NombreVariable);
                        }
                        break;
                    }
                    case "METHOD-CALL": {
                        PROCEDURE_MethodCall(SegundoHijoDehijo, ambito);
                        break;
                    }
                    case "integer": {
                        if (LeftSideAssignmentType.equals(RightSideAssignmentType)) {
                            System.out.println("Successful assignment of integer to variable[" + NombreVariable + "] ");
                        } else {
                            ReportError("Variable [" + NombreVariable + "] does not support Integer Type.");
                        }
                        break;
                    }
                    case "character": {
                        if (LeftSideAssignmentType.equals(RightSideAssignmentType)) {
                            System.out.println("Successful assignment of character to variable[" + NombreVariable + "] ");
                        } else {
                            ReportError("Variable [" + NombreVariable + "] does not support Integer Type.");
                        }
                        break;
                    }
                    case "boolean": {
                        if (LeftSideAssignmentType.equals(RightSideAssignmentType)) {
                            System.out.println("Successful assignment of boolean to variable[" + NombreVariable + "] ");
                        } else {
                            ReportError("Variable [" + NombreVariable + "] does not support Integer Type.");
                        }
                        break;
                    }
                    default: {
                        ReportError("Unrecognized NodeType in ASSIGNMENT to: [" + NombreVariable + "] + [" + RightSideAssignmentType + "]");
                        break;
                    }
                }

            } else {
                System.out.println("ALERT: PATH NOT CODED YET.");
            }

        }
    } //DEFINITIVAMENTE no borrar

    public void PROCEDURE_MethodCall(Node hijo, Ambito ambito) {
        String MethodId = hijo.getHijos().get(0).getValue();
        Node PARAMETROS = hijo.getHijos().get(1);
        System.out.println("MethodCall");
        Function temporal;
        ArrayList<String> ParametersOfTemporalFunction = new ArrayList();
        for (int i = 0; i < PARAMETROS.getHijos().size(); i++) {
            Node ParameterNode = PARAMETROS.getHijos().get(i);
            if (ParameterNode.getType().equals("VARIABLE")) {
                VariableVerificada = null;
                Boolean VariableExiste = verificar_variable_existenteA(ParameterNode.getValue(), ambito);
                if (VariableExiste) {
                    System.out.println(VariableVerificada.getType());
                    ParametersOfTemporalFunction.add(VariableVerificada.getType());
                } else {
                    String error = "Error semantico: Variable [" + ParameterNode.getValue() + "] no existe en el llamado a [" + MethodId + "].";
                    ReportError(error);
                }
            } else if (ParameterNode.getType().equals("integer")) {
                System.out.println("Int MethodCall Parameter");
                ParametersOfTemporalFunction.add("integer");
            } else if (ParameterNode.getType().equals("boolean")) {
                System.out.println("Boolean MethodCall Parameter");
                ParametersOfTemporalFunction.add("boolean");
            } else if (ParameterNode.getType().equals("character")) {
                System.out.println("Character MethodCall Parameter");
                ParametersOfTemporalFunction.add("character");
            }
        }
        temporal = new Function(MethodId, ParametersOfTemporalFunction);
        System.out.println("ASUIANDFNADFNADF");
        if (FunctionExists(temporal)) {
            // Successfull MethodCall
        } else {
            System.out.println("Function does not exist.");
            String error = "Error semantico: llamado a funcion [" + MethodId + "] refiere a una funcion que no existe.";
            ReportError(error);
        }
    }

    public void PROCEDURE_FunctionsRecorrerArbolPrototypes(Node Padre, int pos) {
        //Saca los prototipos de las funciones. Se debe ejecutar como primera pasada del compilador antes de recorrerArbolA.
        while (pos < Padre.getHijos().size()) {
            Node hijo = Padre.getHijos().get(pos);
            System.out.println("Prototype Identifier:" + hijo.GetValue());
            pos++;
            switch (hijo.getValue()) {
                case "INT METHOD": {
                    PROCEDURE_FunctionPrototypeExtractor("integer", hijo, 0);
                    break;
                }

                case "CHARACTER METHOD": {
                    PROCEDURE_FunctionPrototypeExtractor("character", hijo, 0);
                    break;
                }

                case "BOOLEAN METHOD": {
                    PROCEDURE_FunctionPrototypeExtractor("boolean", hijo, 0);
                    break;
                }
            }

        }
    }

    public void PROCEDURE_FunctionDefinition(String functionType, Node hijo, int pos) {
        Function actual = funciones.get(currentPrototype);
        for (int i = 1; i < hijo.getHijos().size(); i++) {
            Node SubHijoActual = hijo.getHijos().get(i);
            if (SubHijoActual.GetValue().equals("BLOQUE")) {
                recorrerArbolA(hijo.getHijos().get(i), actual.getAmbito(), 0);
            }
        }
        currentPrototype++;
    }

    public void PROCEDURE_SemanticAnalisis(Node arbol, Ambito ambito, int pos) {
        PROCEDURE_FunctionsRecorrerArbolPrototypes(arbol, pos);
        recorrerArbolA(arbol, ambito, pos);
    }

    public String verificarasignaciond(String tipo, String var2, String ambitointerno, String ambitoglobal) {
        String result = "true";

        Variable v2 = new Variable("xd", "xd", "xd");

        for (int i = 0; i < this.variables.size(); i++) {

            if (var2.equals(this.variables.get(i).getId()) && (ambitointerno.equals(this.variables.get(i).getAmbito()) || ambitoglobal.equals(this.variables.get(i).getAmbito()))) {
                v2 = this.variables.get(i);

            }

        }
        if (v2.getType().equals("xd")) {
            result = "Variable " + var2 + " no existe";

        } else if (!tipo.equals(v2.getType())) {
            result = "Asignacion de " + var2 + "incompatible";
        }
        return result;
    }

    public boolean verificar_variable_existente(String n) {
        boolean retVal = false;
        for (int i = 0; i < this.variables.size(); i++) {
            if (n.equals(this.variables.get(i).getId()) && this.ambito_actual.equals(this.variables.get(i).getAmbito())) {
                retVal = true;
            }//La variable ya existe en el ambito actual
        }
        return retVal;
    }

    public boolean verificar_variable_existente(String n, String ambito) {
        boolean retVal = false;
        for (int i = 0; i < this.variables.size(); i++) {
            if (n.equals(this.variables.get(i).getId()) && ambito.equals(this.variables.get(i).getAmbito())) {
                retVal = true;
            }//La variable ya existe en el ambito actual
        }
        return retVal;
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (Exception e) {
            ReportError("Unable to convert [" + s + "] to String. ");
            return false;
        }

        return true;
    } //No borrar

    public boolean isBoolean(String s) {
        Boolean retVal = true;
        try {
            if (s.toString().equals("true") || s.toString().equals("false")) {
                retVal = true;
            } else {
                retVal = false;
            }
        } catch (Exception e) {
            return false;
        }
        return retVal;

    } //No borrar

    public boolean verificar_funcion_existente(String n) {
        boolean retVal = false;
        for (int i = 0; i < this.funciones.size(); i++) {
            if (this.funciones.get(i).getId().equals(n)) {
                retVal = true;
            }
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
                        + "\"->\"" + child.getValue() + ". " + " = " + child.getValue() + "\"" + "\n";
                cuerpo += recorrido(child);
            }
        }
        return cuerpo;
    }

    public static void ReportError(String error) {
        try {
            FileWriter myWriter = new FileWriter("errors.txt", true);
            myWriter.append(error + "\n");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    //Codigo Intermedio
    public void codigo_intermedio(Node Arbol) {
        /*
        System.out.println("INTERMEDIO");
        System.out.println("=>   ");
        System.out.print("Value: ");
        System.out.println(Arbol.getValue());
        System.out.print("Type: ");
        System.out.println(Arbol.getType());
*/
        Node n = Arbol;
        if (n != null) {
            switch (n.GetValue()) {
                case "DECLARATION":
                    int count =0;
                    for (int i = 0; i < n.getHijos().size(); i++) {
                        count++;
                    }
                    if(count==3){
                        System.out.println("ENTRO A PROC DECL INT");
                        PROCEDURE_DECLARATION_INTER(n);
                    }
                    break;
                case "INT METHOD":
                    String name = n.getHijos().get(1).getValue();
                    this.cuadruplos.add(new Cuadruplos("Func", name, "", ""));
                    n.getHijos().forEach((hijo)
                            -> {
                        codigo_intermedio(hijo);
                    });
                    this.cuadruplos.add(new Cuadruplos("END", "", "", ""));
                    break;
                case "BOOLEAN STATEMENT":
                    this.exp_bool.clear();
                    break;
                    
                case "THROWLN":
                    System.out.println("Em whatever");
                    break;
                case "EAT":
                    this.cuadruplos.add(new Cuadruplos("Eat", "", "", ""));
                    break;
                case "ASSIGNMENT":
                    PROCEDURE_ASSIGNMENT_INTER(n);
                    break;

                default:
                    n.getHijos().forEach((hijo)
                            -> {
                        codigo_intermedio(hijo);
                    });
            }
        }
    }

    public void PROCEDURE_ASSIGNMENT_INTER(Node n){
        //Analizar el nodo
        String varAsign = n.getHijos().get(0).GetValue();
        String val = "";
        Node temp = n.getHijos().get(1);
        switch(temp.GetValue()){
            case "+":
            case "-":
            case "/":
            case "*":
                int varA = Arithmetics_Inter(n, n.GetValue());
                val = Integer.toString(varA);
                break;
            default:
                val = temp.GetValue();
        }
        
        String temp2 = generarTemp();
        this.cuadruplos.add(new Cuadruplos("=", val, "", temp2));
        this.cuadruplos.add(new Cuadruplos("=", temp2, "", varAsign));
        
        
        
    }
    
    public int Arithmetics_Inter(Node n, String signo){
        System.out.println("ARITHMS");
        //System.out.println(n.getHijos().get(1).GetValue());
        int data1=Integer.parseInt(n.getHijos().get(0).GetValue());
        int data2 = 0;
        int retVal = 0;
        if(n.getHijos().get(1).GetValue()=="/" || n.getHijos().get(1).GetValue()=="*" || n.getHijos().get(1).GetValue()=="+"
                || n.getHijos().get(1).GetValue()=="-"){
            
                    data2 = Arithmetics_Inter(n.getHijos().get(1), n.getHijos().get(1).getValue());
        }else{
            data2 = Integer.parseInt(n.getHijos().get(1).GetValue());
        }
        switch(signo){
            case "+":
                retVal = data1 + data2;
                break;
            case "-":
                retVal = data1 - data2;
                break;
            case "*":
                retVal = data1*data2;
                break;
            case "/":
                retVal = data1/data2;
                break;
        }
        String temp = generarTemp();
        System.out.println(signo);
        System.out.println(data1);
        System.out.println(data2);
        //Agrega el cuadruplo a Cuadruplos
        this.cuadruplos.add(new Cuadruplos(signo, Integer.toString(data1), Integer.toString(data2), temp));
        return retVal;
    }
    
    
    public void PROCEDURE_DECLARATION_INTER(Node n){
        System.out.println("ESE XD");
        String varDecl = n.getHijos().get(1).GetValue();
        String val = "";
        Node temp = n.getHijos().get(2);
        System.out.println(varDecl);
        System.out.println(temp.GetValue());
        switch(temp.GetValue()){
            case "+":
            case "-":
            case "/":
            case "*":
                System.out.println("WENAS CHAVALOS");
                int varA = Arithmetics_Inter(temp, temp.GetValue());
                val = Integer.toString(varA);
                break;
            default:
                val = temp.GetValue();
        }
        String temp2 = generarTemp();
        this.cuadruplos.add(new Cuadruplos("=", val, "", temp2));
        this.cuadruplos.add(new Cuadruplos("=", temp2, "", varDecl));
        //System.out.println("ESE XD 2");
    }
    
    //EXP BOOLEAN ARRAY
    public void PROCEDURE_BOOLEAN_STATE_INTER(Node n) {
        Node temp = n;
        if (temp != null) {
            switch(temp.getType()){
                case "ID":
                    this.exp_bool.add(temp.getValue());
                    break;
                case "Char":
                    this.exp_bool.add(temp.getValue());
                    break;
                case "integer":
                    this.exp_bool.add(temp.getValue());
                    break;
                case "BOOL STATEMENT":
                    this.exp_bool.add("(");
                    for (Node hijo: temp.getHijos()){
                        PROCEDURE_BOOLEAN_STATE_INTER(hijo);
                    }
                    this.exp_bool.add(")");
                    break;
                default:
                    this.exp_bool.add(temp.GetValue());
            }
        }
    }

    //Para generar etiqueta
    public String nuevaEtiqueta() {
        this.cont_etiq++;
        return "etiq" + this.cont_etiq;
    }

    //Generar Temps
    public String generarTemp() {
        this.cont_temp++;
        return "t" + this.cont_temp;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane MIPS;
    private javax.swing.JButton btnAnalizarSin;
    private javax.swing.JButton btnArchivo;
    private javax.swing.JButton btnLimpiarSin;
    private javax.swing.JFrame frame_int_final;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jb_int_final;
    private javax.swing.JTable jtable_cuadruplos;
    private javax.swing.JTextArea txtAnalizarSin;
    private javax.swing.JTextArea txtResultado;
    private javax.swing.JTextArea txtarbol;
    // End of variables declaration//GEN-END:variables

    ArrayList<Variable> variables = new ArrayList();//Tabla de variables
    ArrayList<Function> funciones = new ArrayList();//Tabla de funciones

    Variable VariableVerificada = null; //Si la variable existe con el metodo verificar_variable_existenteA(), se deposita en este temporal.
    int bOffSet = 0;
    ArrayList<String> erroresSemanticos = new ArrayList();
    String ambito_actual = "";

    //Official
    ArrayList<Ambito> GlobalAmbitos = new ArrayList();

    //Experimental
    int currentPrototype = 0;

    //Codigo Intermedio 
    ArrayList<Cuadruplos> cuadruplos = new ArrayList();
    int cont_temp = 0;
    int cont_etiq = 0;
    ArrayList<String> exp_bool = new ArrayList();

}
