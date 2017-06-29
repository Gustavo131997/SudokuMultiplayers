/* 
* Autor: Andrés Felipe Martínez Muñoz
* Ing. de Sistemas - 3er Semestre - Universidad Autónoma del Caribe, Barranquilla, Colombia    
*/

package GUI;
import Componentes.ValidarIngresoCelda;
import java.awt.HeadlessException;
import java.util.Random;
import javax.swing.JOptionPane;
import socket.SocketCliente;
import sudoku.Matriz;

public class SudokuOriginal extends javax.swing.JFrame {

    Matriz sudo = new Matriz();
    int m2[][] = new int [9][9];
    public SudokuOriginal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt1_2 = new javax.swing.JTextField();
        txt1_1 = new javax.swing.JTextField();
        txt1_3 = new javax.swing.JTextField();
        txt2_1 = new javax.swing.JTextField();
        txt2_2 = new javax.swing.JTextField();
        txt2_3 = new javax.swing.JTextField();
        txt3_1 = new javax.swing.JTextField();
        txt3_2 = new javax.swing.JTextField();
        txt3_3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txt4_5 = new javax.swing.JTextField();
        txt4_4 = new javax.swing.JTextField();
        txt4_6 = new javax.swing.JTextField();
        txt5_4 = new javax.swing.JTextField();
        txt5_5 = new javax.swing.JTextField();
        txt5_6 = new javax.swing.JTextField();
        txt6_4 = new javax.swing.JTextField();
        txt6_5 = new javax.swing.JTextField();
        txt6_6 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txt7_2 = new javax.swing.JTextField();
        txt7_1 = new javax.swing.JTextField();
        txt7_3 = new javax.swing.JTextField();
        txt8_1 = new javax.swing.JTextField();
        txt8_2 = new javax.swing.JTextField();
        txt8_3 = new javax.swing.JTextField();
        txt9_1 = new javax.swing.JTextField();
        txt9_2 = new javax.swing.JTextField();
        txt9_3 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        txt1_5 = new javax.swing.JTextField();
        txt1_4 = new javax.swing.JTextField();
        txt1_6 = new javax.swing.JTextField();
        txt2_4 = new javax.swing.JTextField();
        txt2_5 = new javax.swing.JTextField();
        txt2_6 = new javax.swing.JTextField();
        txt3_4 = new javax.swing.JTextField();
        txt3_5 = new javax.swing.JTextField();
        txt3_6 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        txt4_8 = new javax.swing.JTextField();
        txt4_7 = new javax.swing.JTextField();
        txt4_9 = new javax.swing.JTextField();
        txt5_7 = new javax.swing.JTextField();
        txt5_8 = new javax.swing.JTextField();
        txt5_9 = new javax.swing.JTextField();
        txt6_7 = new javax.swing.JTextField();
        txt6_8 = new javax.swing.JTextField();
        txt6_9 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        txt1_8 = new javax.swing.JTextField();
        txt1_7 = new javax.swing.JTextField();
        txt1_9 = new javax.swing.JTextField();
        txt2_7 = new javax.swing.JTextField();
        txt2_8 = new javax.swing.JTextField();
        txt2_9 = new javax.swing.JTextField();
        txt3_7 = new javax.swing.JTextField();
        txt3_8 = new javax.swing.JTextField();
        txt3_9 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        txt7_8 = new javax.swing.JTextField();
        txt7_7 = new javax.swing.JTextField();
        txt7_9 = new javax.swing.JTextField();
        txt8_7 = new javax.swing.JTextField();
        txt8_8 = new javax.swing.JTextField();
        txt8_9 = new javax.swing.JTextField();
        txt9_7 = new javax.swing.JTextField();
        txt9_8 = new javax.swing.JTextField();
        txt9_9 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        txt4_2 = new javax.swing.JTextField();
        txt4_1 = new javax.swing.JTextField();
        txt4_3 = new javax.swing.JTextField();
        txt5_1 = new javax.swing.JTextField();
        txt5_2 = new javax.swing.JTextField();
        txt5_3 = new javax.swing.JTextField();
        txt6_1 = new javax.swing.JTextField();
        txt6_2 = new javax.swing.JTextField();
        txt6_3 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        txt7_5 = new javax.swing.JTextField();
        txt7_4 = new javax.swing.JTextField();
        txt7_6 = new javax.swing.JTextField();
        txt8_4 = new javax.swing.JTextField();
        txt8_5 = new javax.swing.JTextField();
        txt8_6 = new javax.swing.JTextField();
        txt9_4 = new javax.swing.JTextField();
        txt9_5 = new javax.swing.JTextField();
        txt9_6 = new javax.swing.JTextField();
        btnReiniciar = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        txt7_10 = new javax.swing.JTextField();
        txt7_11 = new javax.swing.JTextField();
        txt7_12 = new javax.swing.JTextField();
        txt8_10 = new javax.swing.JTextField();
        txt8_11 = new javax.swing.JTextField();
        txt8_12 = new javax.swing.JTextField();
        txt9_10 = new javax.swing.JTextField();
        txt9_11 = new javax.swing.JTextField();
        txt9_12 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        txt4_10 = new javax.swing.JTextField();
        txt4_11 = new javax.swing.JTextField();
        txt4_12 = new javax.swing.JTextField();
        txt5_10 = new javax.swing.JTextField();
        txt5_11 = new javax.swing.JTextField();
        txt5_12 = new javax.swing.JTextField();
        txt6_10 = new javax.swing.JTextField();
        txt6_11 = new javax.swing.JTextField();
        txt6_12 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        txt1_10 = new javax.swing.JTextField();
        txt1_11 = new javax.swing.JTextField();
        txt1_12 = new javax.swing.JTextField();
        txt2_10 = new javax.swing.JTextField();
        txt2_11 = new javax.swing.JTextField();
        txt2_12 = new javax.swing.JTextField();
        txt3_10 = new javax.swing.JTextField();
        txt3_11 = new javax.swing.JTextField();
        txt3_12 = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        txt7_13 = new javax.swing.JTextField();
        txt7_14 = new javax.swing.JTextField();
        txt7_15 = new javax.swing.JTextField();
        txt8_13 = new javax.swing.JTextField();
        txt8_14 = new javax.swing.JTextField();
        txt8_15 = new javax.swing.JTextField();
        txt9_13 = new javax.swing.JTextField();
        txt9_14 = new javax.swing.JTextField();
        txt9_15 = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        txt4_13 = new javax.swing.JTextField();
        txt4_14 = new javax.swing.JTextField();
        txt4_15 = new javax.swing.JTextField();
        txt5_13 = new javax.swing.JTextField();
        txt5_14 = new javax.swing.JTextField();
        txt5_15 = new javax.swing.JTextField();
        txt6_13 = new javax.swing.JTextField();
        txt6_14 = new javax.swing.JTextField();
        txt6_15 = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        txt7_16 = new javax.swing.JTextField();
        txt7_17 = new javax.swing.JTextField();
        txt7_18 = new javax.swing.JTextField();
        txt8_16 = new javax.swing.JTextField();
        txt8_17 = new javax.swing.JTextField();
        txt8_18 = new javax.swing.JTextField();
        txt9_16 = new javax.swing.JTextField();
        txt9_17 = new javax.swing.JTextField();
        txt9_18 = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        txt1_13 = new javax.swing.JTextField();
        txt1_14 = new javax.swing.JTextField();
        txt1_15 = new javax.swing.JTextField();
        txt2_13 = new javax.swing.JTextField();
        txt2_14 = new javax.swing.JTextField();
        txt2_15 = new javax.swing.JTextField();
        txt3_13 = new javax.swing.JTextField();
        txt3_14 = new javax.swing.JTextField();
        txt3_15 = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        txt4_16 = new javax.swing.JTextField();
        txt4_17 = new javax.swing.JTextField();
        txt4_18 = new javax.swing.JTextField();
        txt5_16 = new javax.swing.JTextField();
        txt5_17 = new javax.swing.JTextField();
        txt5_18 = new javax.swing.JTextField();
        txt6_16 = new javax.swing.JTextField();
        txt6_17 = new javax.swing.JTextField();
        txt6_18 = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        txt1_16 = new javax.swing.JTextField();
        txt1_17 = new javax.swing.JTextField();
        txt1_18 = new javax.swing.JTextField();
        txt2_16 = new javax.swing.JTextField();
        txt2_17 = new javax.swing.JTextField();
        txt2_18 = new javax.swing.JTextField();
        txt3_16 = new javax.swing.JTextField();
        txt3_17 = new javax.swing.JTextField();
        txt3_18 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jltiempo1 = new javax.swing.JLabel();
        jltiempo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sudoku");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(120, 255, 121)));

        txt1_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1_2.setBorder(null);
        txt1_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt1_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1_2KeyTyped(evt);
            }
        });

        txt1_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1_1.setBorder(null);
        txt1_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt1_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1_1KeyTyped(evt);
            }
        });

        txt1_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1_3.setBorder(null);
        txt1_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt1_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1_3KeyTyped(evt);
            }
        });

        txt2_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2_1.setBorder(null);
        txt2_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt2_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2_1KeyTyped(evt);
            }
        });

        txt2_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2_2.setBorder(null);
        txt2_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt2_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2_2KeyTyped(evt);
            }
        });

        txt2_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2_3.setBorder(null);
        txt2_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt2_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2_3KeyTyped(evt);
            }
        });

        txt3_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3_1.setBorder(null);
        txt3_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt3_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3_1KeyTyped(evt);
            }
        });

        txt3_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3_2.setBorder(null);
        txt3_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt3_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3_2KeyTyped(evt);
            }
        });

        txt3_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3_3.setBorder(null);
        txt3_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt3_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3_3KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txt1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txt2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txt3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(120, 255, 121)));

        txt4_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4_5.setBorder(null);
        txt4_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt4_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4_5KeyTyped(evt);
            }
        });

        txt4_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4_4.setBorder(null);
        txt4_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt4_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4_4KeyTyped(evt);
            }
        });

        txt4_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4_6.setBorder(null);
        txt4_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt4_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4_6KeyTyped(evt);
            }
        });

        txt5_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5_4.setBorder(null);
        txt5_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt5_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5_4KeyTyped(evt);
            }
        });

        txt5_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5_5.setBorder(null);
        txt5_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt5_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5_5KeyTyped(evt);
            }
        });

        txt5_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5_6.setBorder(null);
        txt5_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt5_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5_6KeyTyped(evt);
            }
        });

        txt6_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6_4.setBorder(null);
        txt6_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt6_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6_4KeyTyped(evt);
            }
        });

        txt6_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6_5.setBorder(null);
        txt6_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt6_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6_5KeyTyped(evt);
            }
        });

        txt6_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6_6.setBorder(null);
        txt6_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt6_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6_6KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txt4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txt5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txt6_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt6_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt6_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt6_4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(120, 255, 121)));

        txt7_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7_2.setBorder(null);
        txt7_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt7_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt7_2KeyTyped(evt);
            }
        });

        txt7_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7_1.setBorder(null);
        txt7_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt7_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt7_1KeyTyped(evt);
            }
        });

        txt7_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7_3.setBorder(null);
        txt7_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt7_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt7_3KeyTyped(evt);
            }
        });

        txt8_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8_1.setBorder(null);
        txt8_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt8_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt8_1KeyTyped(evt);
            }
        });

        txt8_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8_2.setBorder(null);
        txt8_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt8_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt8_2KeyTyped(evt);
            }
        });

        txt8_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8_3.setBorder(null);
        txt8_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt8_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt8_3KeyTyped(evt);
            }
        });

        txt9_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9_1.setBorder(null);
        txt9_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt9_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt9_1KeyTyped(evt);
            }
        });

        txt9_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9_2.setBorder(null);
        txt9_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt9_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt9_2KeyTyped(evt);
            }
        });

        txt9_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9_3.setBorder(null);
        txt9_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt9_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt9_3KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(txt7_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt7_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt7_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(txt8_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt8_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt8_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(txt9_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt9_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt9_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt7_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt8_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8_3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt9_1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9_3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt1_5.setBackground(new java.awt.Color(120, 255, 121));
        txt1_5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt1_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1_5.setBorder(null);
        txt1_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt1_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1_5KeyTyped(evt);
            }
        });

        txt1_4.setBackground(new java.awt.Color(120, 255, 121));
        txt1_4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt1_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1_4.setBorder(null);
        txt1_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt1_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1_4KeyTyped(evt);
            }
        });

        txt1_6.setBackground(new java.awt.Color(120, 255, 121));
        txt1_6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt1_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1_6.setBorder(null);
        txt1_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt1_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1_6KeyTyped(evt);
            }
        });

        txt2_4.setBackground(new java.awt.Color(120, 255, 121));
        txt2_4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt2_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2_4.setBorder(null);
        txt2_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt2_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2_4KeyTyped(evt);
            }
        });

        txt2_5.setBackground(new java.awt.Color(120, 255, 121));
        txt2_5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt2_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2_5.setBorder(null);
        txt2_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt2_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2_5KeyTyped(evt);
            }
        });

        txt2_6.setBackground(new java.awt.Color(120, 255, 121));
        txt2_6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt2_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2_6.setBorder(null);
        txt2_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt2_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2_6KeyTyped(evt);
            }
        });

        txt3_4.setBackground(new java.awt.Color(120, 255, 121));
        txt3_4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt3_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3_4.setBorder(null);
        txt3_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt3_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3_4KeyTyped(evt);
            }
        });

        txt3_5.setBackground(new java.awt.Color(120, 255, 121));
        txt3_5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt3_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3_5.setBorder(null);
        txt3_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt3_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3_5KeyTyped(evt);
            }
        });

        txt3_6.setBackground(new java.awt.Color(120, 255, 121));
        txt3_6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt3_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3_6.setBorder(null);
        txt3_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt3_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3_6KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(txt1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(txt2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(txt3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txt4_8.setBackground(new java.awt.Color(120, 255, 121));
        txt4_8.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt4_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4_8.setBorder(null);
        txt4_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt4_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4_8KeyTyped(evt);
            }
        });

        txt4_7.setBackground(new java.awt.Color(120, 255, 121));
        txt4_7.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt4_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4_7.setBorder(null);
        txt4_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt4_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4_7KeyTyped(evt);
            }
        });

        txt4_9.setBackground(new java.awt.Color(120, 255, 121));
        txt4_9.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt4_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4_9.setBorder(null);
        txt4_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt4_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4_9KeyTyped(evt);
            }
        });

        txt5_7.setBackground(new java.awt.Color(120, 255, 121));
        txt5_7.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt5_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5_7.setBorder(null);
        txt5_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt5_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5_7KeyTyped(evt);
            }
        });

        txt5_8.setBackground(new java.awt.Color(120, 255, 121));
        txt5_8.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt5_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5_8.setBorder(null);
        txt5_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt5_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5_8KeyTyped(evt);
            }
        });

        txt5_9.setBackground(new java.awt.Color(120, 255, 121));
        txt5_9.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt5_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5_9.setBorder(null);
        txt5_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt5_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5_9KeyTyped(evt);
            }
        });

        txt6_7.setBackground(new java.awt.Color(120, 255, 121));
        txt6_7.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt6_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6_7.setBorder(null);
        txt6_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt6_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6_7KeyTyped(evt);
            }
        });

        txt6_8.setBackground(new java.awt.Color(120, 255, 121));
        txt6_8.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt6_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6_8.setBorder(null);
        txt6_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt6_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6_8KeyTyped(evt);
            }
        });

        txt6_9.setBackground(new java.awt.Color(120, 255, 121));
        txt6_9.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt6_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6_9.setBorder(null);
        txt6_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6_9KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(txt4_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt4_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt4_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(txt5_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt5_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt5_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(txt6_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt6_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt6_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt4_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt5_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt6_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(120, 255, 121)));

        txt1_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1_8.setBorder(null);
        txt1_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt1_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1_8KeyTyped(evt);
            }
        });

        txt1_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1_7.setBorder(null);
        txt1_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt1_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1_7KeyTyped(evt);
            }
        });

        txt1_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1_9.setBorder(null);
        txt1_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt1_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1_9KeyTyped(evt);
            }
        });

        txt2_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2_7.setBorder(null);
        txt2_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt2_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2_7KeyTyped(evt);
            }
        });

        txt2_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2_8.setBorder(null);
        txt2_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt2_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2_8KeyTyped(evt);
            }
        });

        txt2_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2_9.setBorder(null);
        txt2_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt2_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2_9KeyTyped(evt);
            }
        });

        txt3_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3_7.setBorder(null);
        txt3_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt3_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3_7KeyTyped(evt);
            }
        });

        txt3_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3_8.setBorder(null);
        txt3_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt3_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3_8KeyTyped(evt);
            }
        });

        txt3_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3_9.setBorder(null);
        txt3_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt3_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3_9KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(txt1_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt1_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt1_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(txt2_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt2_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt2_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(txt3_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt3_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt3_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt3_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(120, 255, 121)));

        txt7_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7_8.setBorder(null);
        txt7_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt7_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt7_8KeyTyped(evt);
            }
        });

        txt7_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7_7.setBorder(null);
        txt7_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt7_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt7_7KeyTyped(evt);
            }
        });

        txt7_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7_9.setBorder(null);
        txt7_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt7_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt7_9KeyTyped(evt);
            }
        });

        txt8_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8_7.setBorder(null);
        txt8_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt8_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt8_7KeyTyped(evt);
            }
        });

        txt8_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8_8.setBorder(null);
        txt8_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt8_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt8_8KeyTyped(evt);
            }
        });

        txt8_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8_9.setBorder(null);
        txt8_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt8_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt8_9KeyTyped(evt);
            }
        });

        txt9_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9_7.setBorder(null);
        txt9_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt9_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt9_7KeyTyped(evt);
            }
        });

        txt9_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9_8.setBorder(null);
        txt9_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt9_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt9_8KeyTyped(evt);
            }
        });

        txt9_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9_9.setBorder(null);
        txt9_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt9_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt9_9KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(txt7_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt7_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt7_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(txt8_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt8_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt8_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(txt9_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt9_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt9_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt7_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt8_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt9_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt4_2.setBackground(new java.awt.Color(120, 255, 121));
        txt4_2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt4_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4_2.setBorder(null);
        txt4_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt4_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4_2KeyTyped(evt);
            }
        });

        txt4_1.setBackground(new java.awt.Color(120, 255, 121));
        txt4_1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt4_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4_1.setBorder(null);
        txt4_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt4_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4_1KeyTyped(evt);
            }
        });

        txt4_3.setBackground(new java.awt.Color(120, 255, 121));
        txt4_3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt4_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4_3.setBorder(null);
        txt4_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt4_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4_3KeyTyped(evt);
            }
        });

        txt5_1.setBackground(new java.awt.Color(120, 255, 121));
        txt5_1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt5_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5_1.setBorder(null);
        txt5_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt5_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5_1KeyTyped(evt);
            }
        });

        txt5_2.setBackground(new java.awt.Color(120, 255, 121));
        txt5_2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt5_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5_2.setBorder(null);
        txt5_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt5_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5_2KeyTyped(evt);
            }
        });

        txt5_3.setBackground(new java.awt.Color(120, 255, 121));
        txt5_3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt5_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5_3.setBorder(null);
        txt5_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt5_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5_3KeyTyped(evt);
            }
        });

        txt6_1.setBackground(new java.awt.Color(120, 255, 121));
        txt6_1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt6_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6_1.setBorder(null);
        txt6_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt6_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6_1KeyTyped(evt);
            }
        });

        txt6_2.setBackground(new java.awt.Color(120, 255, 121));
        txt6_2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt6_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6_2.setBorder(null);
        txt6_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt6_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6_2KeyTyped(evt);
            }
        });

        txt6_3.setBackground(new java.awt.Color(120, 255, 121));
        txt6_3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt6_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6_3.setBorder(null);
        txt6_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt6_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6_3KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(txt4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(txt5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(txt6_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt6_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt6_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt6_1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6_3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt7_5.setBackground(new java.awt.Color(120, 255, 121));
        txt7_5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt7_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7_5.setBorder(null);
        txt7_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt7_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt7_5KeyTyped(evt);
            }
        });

        txt7_4.setBackground(new java.awt.Color(120, 255, 121));
        txt7_4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt7_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7_4.setBorder(null);
        txt7_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt7_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt7_4KeyTyped(evt);
            }
        });

        txt7_6.setBackground(new java.awt.Color(120, 255, 121));
        txt7_6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt7_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7_6.setBorder(null);
        txt7_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt7_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt7_6KeyTyped(evt);
            }
        });

        txt8_4.setBackground(new java.awt.Color(120, 255, 121));
        txt8_4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt8_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8_4.setBorder(null);
        txt8_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt8_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt8_4KeyTyped(evt);
            }
        });

        txt8_5.setBackground(new java.awt.Color(120, 255, 121));
        txt8_5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt8_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8_5.setBorder(null);
        txt8_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt8_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt8_5KeyTyped(evt);
            }
        });

        txt8_6.setBackground(new java.awt.Color(120, 255, 121));
        txt8_6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt8_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8_6.setBorder(null);
        txt8_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt8_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt8_6KeyTyped(evt);
            }
        });

        txt9_4.setBackground(new java.awt.Color(120, 255, 121));
        txt9_4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt9_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9_4.setBorder(null);
        txt9_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt9_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt9_4KeyTyped(evt);
            }
        });

        txt9_5.setBackground(new java.awt.Color(120, 255, 121));
        txt9_5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt9_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9_5.setBorder(null);
        txt9_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt9_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt9_5KeyTyped(evt);
            }
        });

        txt9_6.setBackground(new java.awt.Color(120, 255, 121));
        txt9_6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt9_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9_6.setBorder(null);
        txt9_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt9_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt9_6KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(txt7_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt7_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt7_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(txt8_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt8_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt8_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(txt9_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt9_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt9_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt7_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt8_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt9_4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnReiniciar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        btnStart.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnStart.setText("Iniciar Juego");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(120, 255, 121)));

        txt7_10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7_10.setBorder(null);
        txt7_10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt7_10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt7_10KeyTyped(evt);
            }
        });

        txt7_11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7_11.setBorder(null);
        txt7_11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt7_11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt7_11KeyTyped(evt);
            }
        });

        txt7_12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7_12.setBorder(null);
        txt7_12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt7_12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt7_12KeyTyped(evt);
            }
        });

        txt8_10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8_10.setBorder(null);
        txt8_10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt8_10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt8_10KeyTyped(evt);
            }
        });

        txt8_11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8_11.setBorder(null);
        txt8_11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt8_11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt8_11KeyTyped(evt);
            }
        });

        txt8_12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8_12.setBorder(null);
        txt8_12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt8_12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt8_12KeyTyped(evt);
            }
        });

        txt9_10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9_10.setBorder(null);
        txt9_10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt9_10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt9_10KeyTyped(evt);
            }
        });

        txt9_11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9_11.setBorder(null);
        txt9_11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt9_11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt9_11KeyTyped(evt);
            }
        });

        txt9_12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9_12.setBorder(null);
        txt9_12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt9_12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt9_12KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(txt7_11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt7_10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt7_12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(txt8_10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt8_11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt8_12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(txt9_10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt9_11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt9_12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt7_11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7_10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7_12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt8_10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8_11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8_12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt9_10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9_11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9_12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(120, 255, 121)));

        txt4_10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4_10.setBorder(null);
        txt4_10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt4_10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4_10KeyTyped(evt);
            }
        });

        txt4_11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4_11.setBorder(null);
        txt4_11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt4_11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4_11KeyTyped(evt);
            }
        });

        txt4_12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4_12.setBorder(null);
        txt4_12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt4_12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4_12KeyTyped(evt);
            }
        });

        txt5_10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5_10.setBorder(null);
        txt5_10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt5_10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5_10KeyTyped(evt);
            }
        });

        txt5_11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5_11.setBorder(null);
        txt5_11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt5_11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5_11KeyTyped(evt);
            }
        });

        txt5_12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5_12.setBorder(null);
        txt5_12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt5_12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5_12KeyTyped(evt);
            }
        });

        txt6_10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6_10.setBorder(null);
        txt6_10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt6_10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6_10KeyTyped(evt);
            }
        });

        txt6_11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6_11.setBorder(null);
        txt6_11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt6_11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6_11KeyTyped(evt);
            }
        });

        txt6_12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6_12.setBorder(null);
        txt6_12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt6_12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6_12KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(txt4_11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt4_10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt4_12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(txt5_10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt5_11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt5_12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(txt6_10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt6_11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt6_12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt4_11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4_10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4_12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt5_10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5_11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5_12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt6_10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6_11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6_12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(120, 255, 121)));

        txt1_10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1_10.setBorder(null);
        txt1_10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt1_10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1_10KeyTyped(evt);
            }
        });

        txt1_11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1_11.setBorder(null);
        txt1_11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt1_11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1_11KeyTyped(evt);
            }
        });

        txt1_12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1_12.setBorder(null);
        txt1_12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt1_12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1_12KeyTyped(evt);
            }
        });

        txt2_10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2_10.setBorder(null);
        txt2_10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt2_10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2_10KeyTyped(evt);
            }
        });

        txt2_11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2_11.setBorder(null);
        txt2_11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt2_11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2_11KeyTyped(evt);
            }
        });

        txt2_12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2_12.setBorder(null);
        txt2_12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt2_12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2_12KeyTyped(evt);
            }
        });

        txt3_10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3_10.setBorder(null);
        txt3_10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt3_10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3_10KeyTyped(evt);
            }
        });

        txt3_11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3_11.setBorder(null);
        txt3_11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt3_11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3_11KeyTyped(evt);
            }
        });

        txt3_12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3_12.setBorder(null);
        txt3_12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt3_12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3_12KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(txt1_11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt1_10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt1_12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(txt2_10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt2_11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt2_12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(txt3_10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt3_11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt3_12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1_11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1_10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1_12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2_10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2_11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2_12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt3_10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3_11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3_12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt7_13.setBackground(new java.awt.Color(120, 255, 121));
        txt7_13.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt7_13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7_13.setBorder(null);
        txt7_13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt7_13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt7_13KeyTyped(evt);
            }
        });

        txt7_14.setBackground(new java.awt.Color(120, 255, 121));
        txt7_14.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt7_14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7_14.setBorder(null);
        txt7_14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt7_14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt7_14KeyTyped(evt);
            }
        });

        txt7_15.setBackground(new java.awt.Color(120, 255, 121));
        txt7_15.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt7_15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7_15.setBorder(null);
        txt7_15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt7_15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt7_15KeyTyped(evt);
            }
        });

        txt8_13.setBackground(new java.awt.Color(120, 255, 121));
        txt8_13.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt8_13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8_13.setBorder(null);
        txt8_13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt8_13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt8_13KeyTyped(evt);
            }
        });

        txt8_14.setBackground(new java.awt.Color(120, 255, 121));
        txt8_14.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt8_14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8_14.setBorder(null);
        txt8_14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt8_14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt8_14KeyTyped(evt);
            }
        });

        txt8_15.setBackground(new java.awt.Color(120, 255, 121));
        txt8_15.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt8_15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8_15.setBorder(null);
        txt8_15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt8_15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt8_15KeyTyped(evt);
            }
        });

        txt9_13.setBackground(new java.awt.Color(120, 255, 121));
        txt9_13.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt9_13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9_13.setBorder(null);
        txt9_13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt9_13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt9_13KeyTyped(evt);
            }
        });

        txt9_14.setBackground(new java.awt.Color(120, 255, 121));
        txt9_14.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt9_14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9_14.setBorder(null);
        txt9_14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt9_14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt9_14KeyTyped(evt);
            }
        });

        txt9_15.setBackground(new java.awt.Color(120, 255, 121));
        txt9_15.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt9_15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9_15.setBorder(null);
        txt9_15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt9_15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt9_15KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(txt7_14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt7_13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt7_15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(txt8_13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt8_14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt8_15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(txt9_13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt9_14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt9_15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt7_14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7_13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7_15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt8_13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8_14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8_15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt9_13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9_14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9_15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt4_13.setBackground(new java.awt.Color(120, 255, 121));
        txt4_13.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt4_13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4_13.setBorder(null);
        txt4_13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt4_13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4_13KeyTyped(evt);
            }
        });

        txt4_14.setBackground(new java.awt.Color(120, 255, 121));
        txt4_14.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt4_14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4_14.setBorder(null);
        txt4_14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt4_14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4_14KeyTyped(evt);
            }
        });

        txt4_15.setBackground(new java.awt.Color(120, 255, 121));
        txt4_15.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt4_15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4_15.setBorder(null);
        txt4_15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt4_15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4_15KeyTyped(evt);
            }
        });

        txt5_13.setBackground(new java.awt.Color(120, 255, 121));
        txt5_13.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt5_13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5_13.setBorder(null);
        txt5_13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt5_13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5_13KeyTyped(evt);
            }
        });

        txt5_14.setBackground(new java.awt.Color(120, 255, 121));
        txt5_14.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt5_14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5_14.setBorder(null);
        txt5_14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt5_14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5_14KeyTyped(evt);
            }
        });

        txt5_15.setBackground(new java.awt.Color(120, 255, 121));
        txt5_15.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt5_15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5_15.setBorder(null);
        txt5_15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt5_15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5_15KeyTyped(evt);
            }
        });

        txt6_13.setBackground(new java.awt.Color(120, 255, 121));
        txt6_13.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt6_13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6_13.setBorder(null);
        txt6_13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt6_13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6_13KeyTyped(evt);
            }
        });

        txt6_14.setBackground(new java.awt.Color(120, 255, 121));
        txt6_14.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt6_14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6_14.setBorder(null);
        txt6_14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt6_14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6_14KeyTyped(evt);
            }
        });

        txt6_15.setBackground(new java.awt.Color(120, 255, 121));
        txt6_15.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt6_15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6_15.setBorder(null);
        txt6_15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt6_15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6_15KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(txt4_14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt4_13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt4_15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(txt5_13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt5_14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt5_15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(txt6_13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt6_14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt6_15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt4_14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4_13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4_15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt5_13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5_14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5_15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt6_13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6_14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6_15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(120, 255, 121)));

        txt7_16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7_16.setBorder(null);
        txt7_16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt7_16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt7_16KeyTyped(evt);
            }
        });

        txt7_17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7_17.setBorder(null);
        txt7_17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt7_17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt7_17KeyTyped(evt);
            }
        });

        txt7_18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt7_18.setBorder(null);
        txt7_18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt7_18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt7_18KeyTyped(evt);
            }
        });

        txt8_16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8_16.setBorder(null);
        txt8_16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt8_16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt8_16KeyTyped(evt);
            }
        });

        txt8_17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8_17.setBorder(null);
        txt8_17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt8_17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt8_17KeyTyped(evt);
            }
        });

        txt8_18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt8_18.setBorder(null);
        txt8_18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt8_18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt8_18KeyTyped(evt);
            }
        });

        txt9_16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9_16.setBorder(null);
        txt9_16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt9_16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt9_16KeyTyped(evt);
            }
        });

        txt9_17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9_17.setBorder(null);
        txt9_17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt9_17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt9_17KeyTyped(evt);
            }
        });

        txt9_18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt9_18.setBorder(null);
        txt9_18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt9_18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt9_18KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(txt7_17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt7_16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt7_18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(txt8_16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt8_17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt8_18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(txt9_16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt9_17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt9_18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt7_17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7_16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7_18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt8_16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8_17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8_18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt9_16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9_17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9_18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(120, 255, 121)));

        txt1_13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1_13.setBorder(null);
        txt1_13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt1_13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1_13KeyTyped(evt);
            }
        });

        txt1_14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1_14.setBorder(null);
        txt1_14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt1_14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1_14KeyTyped(evt);
            }
        });

        txt1_15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1_15.setBorder(null);
        txt1_15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt1_15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1_15KeyTyped(evt);
            }
        });

        txt2_13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2_13.setBorder(null);
        txt2_13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt2_13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2_13KeyTyped(evt);
            }
        });

        txt2_14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2_14.setBorder(null);
        txt2_14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt2_14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2_14KeyTyped(evt);
            }
        });

        txt2_15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2_15.setBorder(null);
        txt2_15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt2_15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2_15KeyTyped(evt);
            }
        });

        txt3_13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3_13.setBorder(null);
        txt3_13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt3_13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3_13KeyTyped(evt);
            }
        });

        txt3_14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3_14.setBorder(null);
        txt3_14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt3_14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3_14KeyTyped(evt);
            }
        });

        txt3_15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3_15.setBorder(null);
        txt3_15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt3_15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3_15KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(txt1_14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt1_13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt1_15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(txt2_13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt2_14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt2_15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(txt3_13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt3_14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt3_15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1_14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1_13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1_15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2_13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2_14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2_15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt3_13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3_14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3_15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txt4_16.setBackground(new java.awt.Color(120, 255, 121));
        txt4_16.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt4_16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4_16.setBorder(null);
        txt4_16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt4_16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4_16KeyTyped(evt);
            }
        });

        txt4_17.setBackground(new java.awt.Color(120, 255, 121));
        txt4_17.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt4_17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4_17.setBorder(null);
        txt4_17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt4_17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4_17KeyTyped(evt);
            }
        });

        txt4_18.setBackground(new java.awt.Color(120, 255, 121));
        txt4_18.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt4_18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4_18.setBorder(null);
        txt4_18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt4_18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4_18KeyTyped(evt);
            }
        });

        txt5_16.setBackground(new java.awt.Color(120, 255, 121));
        txt5_16.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt5_16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5_16.setBorder(null);
        txt5_16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt5_16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5_16KeyTyped(evt);
            }
        });

        txt5_17.setBackground(new java.awt.Color(120, 255, 121));
        txt5_17.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt5_17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5_17.setBorder(null);
        txt5_17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt5_17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5_17KeyTyped(evt);
            }
        });

        txt5_18.setBackground(new java.awt.Color(120, 255, 121));
        txt5_18.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt5_18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt5_18.setBorder(null);
        txt5_18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt5_18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5_18KeyTyped(evt);
            }
        });

        txt6_16.setBackground(new java.awt.Color(120, 255, 121));
        txt6_16.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt6_16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6_16.setBorder(null);
        txt6_16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt6_16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6_16KeyTyped(evt);
            }
        });

        txt6_17.setBackground(new java.awt.Color(120, 255, 121));
        txt6_17.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt6_17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6_17.setBorder(null);
        txt6_17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt6_17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6_17KeyTyped(evt);
            }
        });

        txt6_18.setBackground(new java.awt.Color(120, 255, 121));
        txt6_18.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt6_18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt6_18.setBorder(null);
        txt6_18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6_18KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(txt4_17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt4_16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt4_18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(txt5_16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt5_17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt5_18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(txt6_16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt6_17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt6_18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt4_17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4_16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4_18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt5_16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5_17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5_18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt6_16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6_17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6_18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt1_16.setBackground(new java.awt.Color(120, 255, 121));
        txt1_16.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt1_16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1_16.setBorder(null);
        txt1_16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt1_16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1_16KeyTyped(evt);
            }
        });

        txt1_17.setBackground(new java.awt.Color(120, 255, 121));
        txt1_17.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt1_17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1_17.setBorder(null);
        txt1_17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt1_17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1_17KeyTyped(evt);
            }
        });

        txt1_18.setBackground(new java.awt.Color(120, 255, 121));
        txt1_18.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt1_18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1_18.setBorder(null);
        txt1_18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt1_18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1_18KeyTyped(evt);
            }
        });

        txt2_16.setBackground(new java.awt.Color(120, 255, 121));
        txt2_16.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt2_16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2_16.setBorder(null);
        txt2_16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt2_16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2_16KeyTyped(evt);
            }
        });

        txt2_17.setBackground(new java.awt.Color(120, 255, 121));
        txt2_17.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt2_17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2_17.setBorder(null);
        txt2_17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt2_17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2_17KeyTyped(evt);
            }
        });

        txt2_18.setBackground(new java.awt.Color(120, 255, 121));
        txt2_18.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt2_18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2_18.setBorder(null);
        txt2_18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt2_18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2_18KeyTyped(evt);
            }
        });

        txt3_16.setBackground(new java.awt.Color(120, 255, 121));
        txt3_16.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt3_16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3_16.setBorder(null);
        txt3_16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt3_16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3_16KeyTyped(evt);
            }
        });

        txt3_17.setBackground(new java.awt.Color(120, 255, 121));
        txt3_17.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt3_17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3_17.setBorder(null);
        txt3_17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt3_17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3_17KeyTyped(evt);
            }
        });

        txt3_18.setBackground(new java.awt.Color(120, 255, 121));
        txt3_18.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt3_18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3_18.setBorder(null);
        txt3_18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt3_18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3_18KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(txt1_17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt1_16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt1_18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(txt2_16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt2_17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt2_18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(txt3_16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt3_17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt3_18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1_17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1_16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1_18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2_16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2_17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2_18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt3_16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3_17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3_18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnReiniciar)
                        .addGap(105, 105, 105)
                        .addComponent(btnStart)
                        .addGap(187, 187, 187)
                        .addComponent(jButton1)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jltiempo1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(146, 146, 146)
                    .addComponent(jltiempo2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(507, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jltiempo1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReiniciar)
                            .addComponent(btnStart))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(32, 32, 32))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(499, Short.MAX_VALUE)
                    .addComponent(jltiempo2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(66, 66, 66)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt1_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1_2KeyTyped
        ValidarIngresoCelda.validar(txt1_2, evt);
    }//GEN-LAST:event_txt1_2KeyTyped

    private void txt1_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1_1KeyTyped
        ValidarIngresoCelda.validar(txt1_1, evt);
    }//GEN-LAST:event_txt1_1KeyTyped

    private void txt1_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1_3KeyTyped
        ValidarIngresoCelda.validar(txt1_3, evt);
    }//GEN-LAST:event_txt1_3KeyTyped

    private void txt2_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2_1KeyTyped
        ValidarIngresoCelda.validar(txt2_1, evt);
    }//GEN-LAST:event_txt2_1KeyTyped

    private void txt2_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2_2KeyTyped
        ValidarIngresoCelda.validar(txt2_2, evt);
    }//GEN-LAST:event_txt2_2KeyTyped

    private void txt2_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2_3KeyTyped
        ValidarIngresoCelda.validar(txt2_3, evt);
    }//GEN-LAST:event_txt2_3KeyTyped

    private void txt3_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3_1KeyTyped
        ValidarIngresoCelda.validar(txt3_1, evt);
    }//GEN-LAST:event_txt3_1KeyTyped

    private void txt3_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3_2KeyTyped
        ValidarIngresoCelda.validar(txt3_2, evt);
    }//GEN-LAST:event_txt3_2KeyTyped

    private void txt3_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3_3KeyTyped
        ValidarIngresoCelda.validar(txt3_3, evt);
    }//GEN-LAST:event_txt3_3KeyTyped

    private void txt4_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4_5KeyTyped
        ValidarIngresoCelda.validar(txt4_5, evt);
    }//GEN-LAST:event_txt4_5KeyTyped

    private void txt4_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4_4KeyTyped
        ValidarIngresoCelda.validar(txt4_4, evt);
    }//GEN-LAST:event_txt4_4KeyTyped

    private void txt4_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4_6KeyTyped
        ValidarIngresoCelda.validar(txt4_6, evt);
    }//GEN-LAST:event_txt4_6KeyTyped

    private void txt5_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5_4KeyTyped
        ValidarIngresoCelda.validar(txt5_4, evt);
    }//GEN-LAST:event_txt5_4KeyTyped

    private void txt5_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5_5KeyTyped
        ValidarIngresoCelda.validar(txt5_5, evt);
    }//GEN-LAST:event_txt5_5KeyTyped

    private void txt5_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5_6KeyTyped
        ValidarIngresoCelda.validar(txt5_6, evt);
    }//GEN-LAST:event_txt5_6KeyTyped

    private void txt6_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6_4KeyTyped
        ValidarIngresoCelda.validar(txt6_4, evt);
    }//GEN-LAST:event_txt6_4KeyTyped

    private void txt6_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6_5KeyTyped
        ValidarIngresoCelda.validar(txt6_5, evt);
    }//GEN-LAST:event_txt6_5KeyTyped

    private void txt6_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6_6KeyTyped
        ValidarIngresoCelda.validar(txt6_6, evt);
    }//GEN-LAST:event_txt6_6KeyTyped

    private void txt7_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7_2KeyTyped
        ValidarIngresoCelda.validar(txt7_2, evt);
    }//GEN-LAST:event_txt7_2KeyTyped

    private void txt7_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7_1KeyTyped
        ValidarIngresoCelda.validar(txt7_1, evt);
    }//GEN-LAST:event_txt7_1KeyTyped

    private void txt7_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7_3KeyTyped
        ValidarIngresoCelda.validar(txt7_3, evt);
    }//GEN-LAST:event_txt7_3KeyTyped

    private void txt8_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8_1KeyTyped
        ValidarIngresoCelda.validar(txt8_1, evt);
    }//GEN-LAST:event_txt8_1KeyTyped

    private void txt8_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8_2KeyTyped
        ValidarIngresoCelda.validar(txt8_2, evt);
    }//GEN-LAST:event_txt8_2KeyTyped

    private void txt8_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8_3KeyTyped
        ValidarIngresoCelda.validar(txt8_3, evt);
    }//GEN-LAST:event_txt8_3KeyTyped

    private void txt9_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9_1KeyTyped
        ValidarIngresoCelda.validar(txt9_1, evt);
    }//GEN-LAST:event_txt9_1KeyTyped

    private void txt9_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9_2KeyTyped
        ValidarIngresoCelda.validar(txt9_2, evt);
    }//GEN-LAST:event_txt9_2KeyTyped

    private void txt9_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9_3KeyTyped
        ValidarIngresoCelda.validar(txt9_3, evt);
    }//GEN-LAST:event_txt9_3KeyTyped

    private void txt1_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1_5KeyTyped
        ValidarIngresoCelda.validar(txt1_5, evt);
    }//GEN-LAST:event_txt1_5KeyTyped

    private void txt1_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1_4KeyTyped
        ValidarIngresoCelda.validar(txt1_4, evt);
    }//GEN-LAST:event_txt1_4KeyTyped

    private void txt1_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1_6KeyTyped
        ValidarIngresoCelda.validar(txt1_6, evt);
    }//GEN-LAST:event_txt1_6KeyTyped

    private void txt2_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2_4KeyTyped
        ValidarIngresoCelda.validar(txt2_4, evt);
    }//GEN-LAST:event_txt2_4KeyTyped

    private void txt2_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2_5KeyTyped
        ValidarIngresoCelda.validar(txt2_5, evt);
    }//GEN-LAST:event_txt2_5KeyTyped

    private void txt2_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2_6KeyTyped
        ValidarIngresoCelda.validar(txt2_6, evt);
    }//GEN-LAST:event_txt2_6KeyTyped

    private void txt3_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3_4KeyTyped
        ValidarIngresoCelda.validar(txt3_4, evt);
    }//GEN-LAST:event_txt3_4KeyTyped

    private void txt3_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3_5KeyTyped
        ValidarIngresoCelda.validar(txt3_5, evt);
    }//GEN-LAST:event_txt3_5KeyTyped

    private void txt3_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3_6KeyTyped
        ValidarIngresoCelda.validar(txt3_6, evt);
    }//GEN-LAST:event_txt3_6KeyTyped

    private void txt4_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4_8KeyTyped
        ValidarIngresoCelda.validar(txt4_8, evt);
    }//GEN-LAST:event_txt4_8KeyTyped

    private void txt4_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4_7KeyTyped
        ValidarIngresoCelda.validar(txt4_7, evt);
    }//GEN-LAST:event_txt4_7KeyTyped

    private void txt4_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4_9KeyTyped
        ValidarIngresoCelda.validar(txt4_9, evt);
    }//GEN-LAST:event_txt4_9KeyTyped

    private void txt5_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5_7KeyTyped
        ValidarIngresoCelda.validar(txt5_7, evt);
    }//GEN-LAST:event_txt5_7KeyTyped

    private void txt5_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5_8KeyTyped
        ValidarIngresoCelda.validar(txt5_8, evt);
    }//GEN-LAST:event_txt5_8KeyTyped

    private void txt5_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5_9KeyTyped
        ValidarIngresoCelda.validar(txt5_9, evt);
    }//GEN-LAST:event_txt5_9KeyTyped

    private void txt6_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6_7KeyTyped
        ValidarIngresoCelda.validar(txt6_7, evt);
    }//GEN-LAST:event_txt6_7KeyTyped

    private void txt6_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6_8KeyTyped
        ValidarIngresoCelda.validar(txt6_8, evt);
    }//GEN-LAST:event_txt6_8KeyTyped

    private void txt6_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6_9KeyTyped
        ValidarIngresoCelda.validar(txt6_9, evt);
    }//GEN-LAST:event_txt6_9KeyTyped

    private void txt1_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1_8KeyTyped
        ValidarIngresoCelda.validar(txt1_8, evt);
    }//GEN-LAST:event_txt1_8KeyTyped

    private void txt1_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1_7KeyTyped
        ValidarIngresoCelda.validar(txt1_7, evt);
    }//GEN-LAST:event_txt1_7KeyTyped

    private void txt1_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1_9KeyTyped
        ValidarIngresoCelda.validar(txt1_9, evt);
    }//GEN-LAST:event_txt1_9KeyTyped

    private void txt2_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2_7KeyTyped
        ValidarIngresoCelda.validar(txt2_7, evt);
    }//GEN-LAST:event_txt2_7KeyTyped

    private void txt2_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2_8KeyTyped
        ValidarIngresoCelda.validar(txt2_8, evt);
    }//GEN-LAST:event_txt2_8KeyTyped

    private void txt2_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2_9KeyTyped
        ValidarIngresoCelda.validar(txt2_9, evt);
    }//GEN-LAST:event_txt2_9KeyTyped

    private void txt3_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3_7KeyTyped
        ValidarIngresoCelda.validar(txt3_7, evt);
    }//GEN-LAST:event_txt3_7KeyTyped

    private void txt3_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3_8KeyTyped
        ValidarIngresoCelda.validar(txt3_8, evt);
    }//GEN-LAST:event_txt3_8KeyTyped

    private void txt3_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3_9KeyTyped
        ValidarIngresoCelda.validar(txt3_9, evt);
    }//GEN-LAST:event_txt3_9KeyTyped

    private void txt7_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7_8KeyTyped
        ValidarIngresoCelda.validar(txt7_8, evt);
    }//GEN-LAST:event_txt7_8KeyTyped

    private void txt7_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7_7KeyTyped
        ValidarIngresoCelda.validar(txt7_7, evt);
    }//GEN-LAST:event_txt7_7KeyTyped

    private void txt7_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7_9KeyTyped
        ValidarIngresoCelda.validar(txt7_9, evt);
    }//GEN-LAST:event_txt7_9KeyTyped

    private void txt8_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8_7KeyTyped
        ValidarIngresoCelda.validar(txt8_7, evt);
    }//GEN-LAST:event_txt8_7KeyTyped

    private void txt8_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8_8KeyTyped
        ValidarIngresoCelda.validar(txt8_8, evt);
    }//GEN-LAST:event_txt8_8KeyTyped

    private void txt8_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8_9KeyTyped
        ValidarIngresoCelda.validar(txt8_9, evt);
    }//GEN-LAST:event_txt8_9KeyTyped

    private void txt9_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9_7KeyTyped
        ValidarIngresoCelda.validar(txt9_7, evt);
    }//GEN-LAST:event_txt9_7KeyTyped

    private void txt9_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9_8KeyTyped
        ValidarIngresoCelda.validar(txt9_8, evt);
    }//GEN-LAST:event_txt9_8KeyTyped

    private void txt9_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9_9KeyTyped
        ValidarIngresoCelda.validar(txt9_9, evt);
    }//GEN-LAST:event_txt9_9KeyTyped

    private void txt4_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4_2KeyTyped
        ValidarIngresoCelda.validar(txt4_2, evt);
    }//GEN-LAST:event_txt4_2KeyTyped

    private void txt4_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4_1KeyTyped
        ValidarIngresoCelda.validar(txt4_1, evt);
    }//GEN-LAST:event_txt4_1KeyTyped

    private void txt4_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4_3KeyTyped
        ValidarIngresoCelda.validar(txt4_3, evt);
    }//GEN-LAST:event_txt4_3KeyTyped

    private void txt5_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5_1KeyTyped
        ValidarIngresoCelda.validar(txt5_1, evt);
    }//GEN-LAST:event_txt5_1KeyTyped

    private void txt5_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5_2KeyTyped
        ValidarIngresoCelda.validar(txt5_2, evt);
    }//GEN-LAST:event_txt5_2KeyTyped

    private void txt5_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5_3KeyTyped
        ValidarIngresoCelda.validar(txt5_3, evt);
    }//GEN-LAST:event_txt5_3KeyTyped

    private void txt6_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6_1KeyTyped
        ValidarIngresoCelda.validar(txt6_1, evt);
    }//GEN-LAST:event_txt6_1KeyTyped

    private void txt6_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6_2KeyTyped
        ValidarIngresoCelda.validar(txt6_2, evt);
    }//GEN-LAST:event_txt6_2KeyTyped

    private void txt6_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6_3KeyTyped
        ValidarIngresoCelda.validar(txt6_3, evt);
    }//GEN-LAST:event_txt6_3KeyTyped

    private void txt7_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7_5KeyTyped
        ValidarIngresoCelda.validar(txt7_5, evt);
    }//GEN-LAST:event_txt7_5KeyTyped

    private void txt7_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7_4KeyTyped
        ValidarIngresoCelda.validar(txt7_4, evt);
    }//GEN-LAST:event_txt7_4KeyTyped

    private void txt7_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7_6KeyTyped
        ValidarIngresoCelda.validar(txt7_6, evt);
    }//GEN-LAST:event_txt7_6KeyTyped

    private void txt8_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8_4KeyTyped
        ValidarIngresoCelda.validar(txt8_4, evt);
    }//GEN-LAST:event_txt8_4KeyTyped

    private void txt8_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8_5KeyTyped
        ValidarIngresoCelda.validar(txt8_5, evt);
    }//GEN-LAST:event_txt8_5KeyTyped

    private void txt8_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8_6KeyTyped
        ValidarIngresoCelda.validar(txt8_6, evt);
    }//GEN-LAST:event_txt8_6KeyTyped

    private void txt9_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9_4KeyTyped
        ValidarIngresoCelda.validar(txt9_4, evt);
    }//GEN-LAST:event_txt9_4KeyTyped

    private void txt9_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9_5KeyTyped
        ValidarIngresoCelda.validar(txt9_5, evt);
    }//GEN-LAST:event_txt9_5KeyTyped

    private void txt9_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9_6KeyTyped
        ValidarIngresoCelda.validar(txt9_6, evt);
    }//GEN-LAST:event_txt9_6KeyTyped
   
    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
            SocketCliente sc = new SocketCliente("localhost",9999);
            sc.conectar();
            sc.salida("1");
            System.out.println(""+sc.leer());
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        matrizCero();
        limpiarCampo();
        verificarCampoVacio();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void txt7_10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7_10KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt7_10KeyTyped

    private void txt7_11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7_11KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt7_11KeyTyped

    private void txt7_12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7_12KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt7_12KeyTyped

    private void txt8_10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8_10KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt8_10KeyTyped

    private void txt8_11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8_11KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt8_11KeyTyped

    private void txt8_12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8_12KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt8_12KeyTyped

    private void txt9_10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9_10KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt9_10KeyTyped

    private void txt9_11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9_11KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt9_11KeyTyped

    private void txt9_12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9_12KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt9_12KeyTyped

    private void txt4_10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4_10KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt4_10KeyTyped

    private void txt4_11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4_11KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt4_11KeyTyped

    private void txt4_12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4_12KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt4_12KeyTyped

    private void txt5_10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5_10KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt5_10KeyTyped

    private void txt5_11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5_11KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt5_11KeyTyped

    private void txt5_12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5_12KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt5_12KeyTyped

    private void txt6_10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6_10KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt6_10KeyTyped

    private void txt6_11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6_11KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt6_11KeyTyped

    private void txt6_12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6_12KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt6_12KeyTyped

    private void txt1_10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1_10KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1_10KeyTyped

    private void txt1_11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1_11KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1_11KeyTyped

    private void txt1_12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1_12KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1_12KeyTyped

    private void txt2_10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2_10KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2_10KeyTyped

    private void txt2_11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2_11KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2_11KeyTyped

    private void txt2_12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2_12KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2_12KeyTyped

    private void txt3_10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3_10KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3_10KeyTyped

    private void txt3_11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3_11KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3_11KeyTyped

    private void txt3_12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3_12KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3_12KeyTyped

    private void txt7_13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7_13KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt7_13KeyTyped

    private void txt7_14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7_14KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt7_14KeyTyped

    private void txt7_15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7_15KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt7_15KeyTyped

    private void txt8_13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8_13KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt8_13KeyTyped

    private void txt8_14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8_14KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt8_14KeyTyped

    private void txt8_15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8_15KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt8_15KeyTyped

    private void txt9_13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9_13KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt9_13KeyTyped

    private void txt9_14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9_14KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt9_14KeyTyped

    private void txt9_15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9_15KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt9_15KeyTyped

    private void txt4_13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4_13KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt4_13KeyTyped

    private void txt4_14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4_14KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt4_14KeyTyped

    private void txt4_15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4_15KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt4_15KeyTyped

    private void txt5_13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5_13KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt5_13KeyTyped

    private void txt5_14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5_14KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt5_14KeyTyped

    private void txt5_15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5_15KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt5_15KeyTyped

    private void txt6_13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6_13KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt6_13KeyTyped

    private void txt6_14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6_14KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt6_14KeyTyped

    private void txt6_15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6_15KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt6_15KeyTyped

    private void txt7_16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7_16KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt7_16KeyTyped

    private void txt7_17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7_17KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt7_17KeyTyped

    private void txt7_18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7_18KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt7_18KeyTyped

    private void txt8_16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8_16KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt8_16KeyTyped

    private void txt8_17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8_17KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt8_17KeyTyped

    private void txt8_18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8_18KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt8_18KeyTyped

    private void txt9_16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9_16KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt9_16KeyTyped

    private void txt9_17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9_17KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt9_17KeyTyped

    private void txt9_18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9_18KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt9_18KeyTyped

    private void txt1_13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1_13KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1_13KeyTyped

    private void txt1_14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1_14KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1_14KeyTyped

    private void txt1_15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1_15KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1_15KeyTyped

    private void txt2_13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2_13KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2_13KeyTyped

    private void txt2_14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2_14KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2_14KeyTyped

    private void txt2_15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2_15KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2_15KeyTyped

    private void txt3_13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3_13KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3_13KeyTyped

    private void txt3_14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3_14KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3_14KeyTyped

    private void txt3_15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3_15KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3_15KeyTyped

    private void txt4_16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4_16KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt4_16KeyTyped

    private void txt4_17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4_17KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt4_17KeyTyped

    private void txt4_18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4_18KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt4_18KeyTyped

    private void txt5_16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5_16KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt5_16KeyTyped

    private void txt5_17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5_17KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt5_17KeyTyped

    private void txt5_18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5_18KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt5_18KeyTyped

    private void txt6_16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6_16KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt6_16KeyTyped

    private void txt6_17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6_17KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt6_17KeyTyped

    private void txt6_18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6_18KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt6_18KeyTyped

    private void txt1_16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1_16KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1_16KeyTyped

    private void txt1_17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1_17KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1_17KeyTyped

    private void txt1_18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1_18KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1_18KeyTyped

    private void txt2_16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2_16KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2_16KeyTyped

    private void txt2_17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2_17KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2_17KeyTyped

    private void txt2_18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2_18KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2_18KeyTyped

    private void txt3_16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3_16KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3_16KeyTyped

    private void txt3_17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3_17KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3_17KeyTyped

    private void txt3_18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3_18KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3_18KeyTyped

    public void cargarMatrizOriginal(){
        sudo.m1[0][0] = Integer.parseInt(txt1_1.getText()); sudo.m1[0][1] = Integer.parseInt(txt1_2.getText());       
        sudo.m1[0][2] = Integer.parseInt(txt1_3.getText()); sudo.m1[0][3] = Integer.parseInt(txt1_4.getText());
        sudo.m1[0][4] = Integer.parseInt(txt1_5.getText()); sudo.m1[0][5] = Integer.parseInt(txt1_6.getText());
        sudo.m1[0][6] = Integer.parseInt(txt1_7.getText()); sudo.m1[0][7] = Integer.parseInt(txt1_8.getText());
        sudo.m1[0][8] = Integer.parseInt(txt1_9.getText()); sudo.m1[1][0] = Integer.parseInt(txt2_1.getText());
        sudo.m1[1][1] = Integer.parseInt(txt2_2.getText()); sudo.m1[1][2] = Integer.parseInt(txt2_3.getText());
        sudo.m1[1][3] = Integer.parseInt(txt2_4.getText()); sudo.m1[1][4] = Integer.parseInt(txt2_5.getText());
        sudo.m1[1][5] = Integer.parseInt(txt2_6.getText()); sudo.m1[1][6] = Integer.parseInt(txt2_7.getText());
        sudo.m1[1][7] = Integer.parseInt(txt2_8.getText()); sudo.m1[1][8] = Integer.parseInt(txt2_9.getText());
        sudo.m1[2][0] = Integer.parseInt(txt3_1.getText()); sudo.m1[2][1] = Integer.parseInt(txt3_2.getText());
        sudo.m1[2][2] = Integer.parseInt(txt3_3.getText()); sudo.m1[2][3] = Integer.parseInt(txt3_4.getText());
        sudo.m1[2][4] = Integer.parseInt(txt3_5.getText()); sudo.m1[2][5] = Integer.parseInt(txt3_6.getText());
        sudo.m1[2][6] = Integer.parseInt(txt3_7.getText()); sudo.m1[2][7] = Integer.parseInt(txt3_8.getText());
        sudo.m1[2][8] = Integer.parseInt(txt3_9.getText()); sudo.m1[3][0] = Integer.parseInt(txt4_1.getText());
        sudo.m1[3][1] = Integer.parseInt(txt4_2.getText()); sudo.m1[3][2] = Integer.parseInt(txt4_3.getText());
        sudo.m1[3][3] = Integer.parseInt(txt4_4.getText()); sudo.m1[3][4] = Integer.parseInt(txt4_5.getText());
        sudo.m1[3][5] = Integer.parseInt(txt4_6.getText()); sudo.m1[3][6] = Integer.parseInt(txt4_7.getText());
        sudo.m1[3][7] = Integer.parseInt(txt4_8.getText()); sudo.m1[3][8] = Integer.parseInt(txt4_9.getText());
        sudo.m1[4][0] = Integer.parseInt(txt5_1.getText()); sudo.m1[4][1] = Integer.parseInt(txt5_2.getText());
        sudo.m1[4][2] = Integer.parseInt(txt5_3.getText()); sudo.m1[4][3] = Integer.parseInt(txt5_4.getText());
        sudo.m1[4][4] = Integer.parseInt(txt5_5.getText()); sudo.m1[4][5] = Integer.parseInt(txt5_6.getText());
        sudo.m1[4][6] = Integer.parseInt(txt5_7.getText()); sudo.m1[4][7] = Integer.parseInt(txt5_8.getText());
        sudo.m1[4][8] = Integer.parseInt(txt5_9.getText()); sudo.m1[5][0] = Integer.parseInt(txt6_1.getText());
        sudo.m1[5][1] = Integer.parseInt(txt6_2.getText()); sudo.m1[5][2] = Integer.parseInt(txt6_3.getText());
        sudo.m1[5][3] = Integer.parseInt(txt6_4.getText()); sudo.m1[5][4] = Integer.parseInt(txt6_5.getText());
        sudo.m1[5][5] = Integer.parseInt(txt6_6.getText()); sudo.m1[5][6] = Integer.parseInt(txt6_7.getText());
        sudo.m1[5][7] = Integer.parseInt(txt6_8.getText()); sudo.m1[5][8] = Integer.parseInt(txt6_9.getText());
        sudo.m1[6][0] = Integer.parseInt(txt7_1.getText()); sudo.m1[6][1] = Integer.parseInt(txt7_2.getText());
        sudo.m1[6][2] = Integer.parseInt(txt7_3.getText()); sudo.m1[6][3] = Integer.parseInt(txt7_4.getText());
        sudo.m1[6][4] = Integer.parseInt(txt7_5.getText()); sudo.m1[6][5] = Integer.parseInt(txt7_6.getText());
        sudo.m1[6][6] = Integer.parseInt(txt7_7.getText()); sudo.m1[6][7] = Integer.parseInt(txt7_8.getText());
        sudo.m1[6][8] = Integer.parseInt(txt7_9.getText()); sudo.m1[7][0] = Integer.parseInt(txt8_1.getText());
        sudo.m1[7][1] = Integer.parseInt(txt8_2.getText()); sudo.m1[7][2] = Integer.parseInt(txt8_3.getText());
        sudo.m1[7][3] = Integer.parseInt(txt8_4.getText()); sudo.m1[7][4] = Integer.parseInt(txt8_5.getText());
        sudo.m1[7][5] = Integer.parseInt(txt8_6.getText()); sudo.m1[7][6] = Integer.parseInt(txt8_7.getText());
        sudo.m1[7][7] = Integer.parseInt(txt8_8.getText()); sudo.m1[7][8] = Integer.parseInt(txt8_9.getText());
        sudo.m1[8][0] = Integer.parseInt(txt9_1.getText()); sudo.m1[8][1] = Integer.parseInt(txt9_2.getText());
        sudo.m1[8][2] = Integer.parseInt(txt9_3.getText()); sudo.m1[8][3] = Integer.parseInt(txt9_4.getText());
        sudo.m1[8][4] = Integer.parseInt(txt9_5.getText()); sudo.m1[8][5] = Integer.parseInt(txt9_6.getText());
        sudo.m1[8][6] = Integer.parseInt(txt9_7.getText()); sudo.m1[8][7] = Integer.parseInt(txt9_8.getText());
        sudo.m1[8][8] = Integer.parseInt(txt9_9.getText());       
    }
    
    public void cargarMatrizPrueba(){
        m2[0][0] = Integer.parseInt(txt1_1.getText()); m2[0][1] = Integer.parseInt(txt1_2.getText());       
        m2[0][2] = Integer.parseInt(txt1_3.getText()); m2[0][3] = Integer.parseInt(txt1_4.getText());
        m2[0][4] = Integer.parseInt(txt1_5.getText()); m2[0][5] = Integer.parseInt(txt1_6.getText());
        m2[0][6] = Integer.parseInt(txt1_7.getText()); m2[0][7] = Integer.parseInt(txt1_8.getText());
        m2[0][8] = Integer.parseInt(txt1_9.getText()); m2[1][0] = Integer.parseInt(txt2_1.getText());
        m2[1][1] = Integer.parseInt(txt2_2.getText()); m2[1][2] = Integer.parseInt(txt2_3.getText());
        m2[1][3] = Integer.parseInt(txt2_4.getText()); m2[1][4] = Integer.parseInt(txt2_5.getText());
        m2[1][5] = Integer.parseInt(txt2_6.getText()); m2[1][6] = Integer.parseInt(txt2_7.getText());
        m2[1][7] = Integer.parseInt(txt2_8.getText()); m2[1][8] = Integer.parseInt(txt2_9.getText());
        m2[2][0] = Integer.parseInt(txt3_1.getText()); m2[2][1] = Integer.parseInt(txt3_2.getText());
        m2[2][2] = Integer.parseInt(txt3_3.getText()); m2[2][3] = Integer.parseInt(txt3_4.getText());
        m2[2][4] = Integer.parseInt(txt3_5.getText()); m2[2][5] = Integer.parseInt(txt3_6.getText());
        m2[2][6] = Integer.parseInt(txt3_7.getText()); m2[2][7] = Integer.parseInt(txt3_8.getText());
        m2[2][8] = Integer.parseInt(txt3_9.getText()); m2[3][0] = Integer.parseInt(txt4_1.getText());
        m2[3][1] = Integer.parseInt(txt4_2.getText()); m2[3][2] = Integer.parseInt(txt4_3.getText());
        m2[3][3] = Integer.parseInt(txt4_4.getText()); m2[3][4] = Integer.parseInt(txt4_5.getText());
        m2[3][5] = Integer.parseInt(txt4_6.getText()); m2[3][6] = Integer.parseInt(txt4_7.getText());
        m2[3][7] = Integer.parseInt(txt4_8.getText()); m2[3][8] = Integer.parseInt(txt4_9.getText());
        m2[4][0] = Integer.parseInt(txt5_1.getText()); m2[4][1] = Integer.parseInt(txt5_2.getText());
        m2[4][2] = Integer.parseInt(txt5_3.getText()); m2[4][3] = Integer.parseInt(txt5_4.getText());
        m2[4][4] = Integer.parseInt(txt5_5.getText()); m2[4][5] = Integer.parseInt(txt5_6.getText());
        m2[4][6] = Integer.parseInt(txt5_7.getText()); m2[4][7] = Integer.parseInt(txt5_8.getText());
        m2[4][8] = Integer.parseInt(txt5_9.getText()); m2[5][0] = Integer.parseInt(txt6_1.getText());
        m2[5][1] = Integer.parseInt(txt6_2.getText()); m2[5][2] = Integer.parseInt(txt6_3.getText());
        m2[5][3] = Integer.parseInt(txt6_4.getText()); m2[5][4] = Integer.parseInt(txt6_5.getText());
        m2[5][5] = Integer.parseInt(txt6_6.getText()); m2[5][6] = Integer.parseInt(txt6_7.getText());
        m2[5][7] = Integer.parseInt(txt6_8.getText()); m2[5][8] = Integer.parseInt(txt6_9.getText());
        m2[6][0] = Integer.parseInt(txt7_1.getText()); m2[6][1] = Integer.parseInt(txt7_2.getText());
        m2[6][2] = Integer.parseInt(txt7_3.getText()); m2[6][3] = Integer.parseInt(txt7_4.getText());
        m2[6][4] = Integer.parseInt(txt7_5.getText()); m2[6][5] = Integer.parseInt(txt7_6.getText());
        m2[6][6] = Integer.parseInt(txt7_7.getText()); m2[6][7] = Integer.parseInt(txt7_8.getText());
        m2[6][8] = Integer.parseInt(txt7_9.getText()); m2[7][0] = Integer.parseInt(txt8_1.getText());
        m2[7][1] = Integer.parseInt(txt8_2.getText()); m2[7][2] = Integer.parseInt(txt8_3.getText());
        m2[7][3] = Integer.parseInt(txt8_4.getText()); m2[7][4] = Integer.parseInt(txt8_5.getText());
        m2[7][5] = Integer.parseInt(txt8_6.getText()); m2[7][6] = Integer.parseInt(txt8_7.getText());
        m2[7][7] = Integer.parseInt(txt8_8.getText()); m2[7][8] = Integer.parseInt(txt8_9.getText());
        m2[8][0] = Integer.parseInt(txt9_1.getText()); m2[8][1] = Integer.parseInt(txt9_2.getText());
        m2[8][2] = Integer.parseInt(txt9_3.getText()); m2[8][3] = Integer.parseInt(txt9_4.getText());
        m2[8][4] = Integer.parseInt(txt9_5.getText()); m2[8][5] = Integer.parseInt(txt9_6.getText());
        m2[8][6] = Integer.parseInt(txt9_7.getText()); m2[8][7] = Integer.parseInt(txt9_8.getText());
        m2[8][8] = Integer.parseInt(txt9_9.getText()); 
    }    
    
    public boolean checarFilas(){
        boolean check = false;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = j+1; k < 9; k++) {
                    if (sudo.m1[i][j] == sudo.m1[i][k]) {
                        check = true;                        
                        break;
                    }
                }
            }
        }
        return check;
    }
    
    public boolean checarColumnas(){
        boolean check = false;
        for (int i = 0; i < 9; i++) {            
            for (int j = 0; j < 9; j++) {
                for (int k = j+1; k < 9; k++) {
                    if (sudo.m1[j][i] == sudo.m1[k][i]) {
                        check = true;                        
                        break;
                    }
                }
            }
        }
        return check;
    }
    
    public void limpiarCampo(){
        txt1_1.setText(null); txt1_2.setText(null); txt1_3.setText(null);  txt1_4.setText(null); txt1_5.setText(null);
        txt1_6.setText(null); txt1_7.setText(null); txt1_8.setText(null);  txt1_9.setText(null); txt2_1.setText(null);
        txt2_2.setText(null); txt2_3.setText(null); txt2_4.setText(null);  txt2_5.setText(null); txt2_6.setText(null);
        txt2_7.setText(null); txt2_8.setText(null); txt2_9.setText(null);  txt3_1.setText(null); txt3_2.setText(null);
        txt3_2.setText(null); txt3_3.setText(null); txt3_4.setText(null);  txt3_5.setText(null); txt3_6.setText(null);
        txt3_7.setText(null); txt3_8.setText(null); txt3_9.setText(null);  txt4_1.setText(null); txt4_2.setText(null);
        txt4_3.setText(null); txt4_4.setText(null); txt4_5.setText(null);  txt4_6.setText(null); txt4_7.setText(null);
        txt4_8.setText(null); txt4_9.setText(null); txt5_1.setText(null);  txt5_2.setText(null); txt5_3.setText(null);
        txt5_4.setText(null); txt5_6.setText(null); txt5_5.setText(null);  txt5_7.setText(null); txt5_8.setText(null);
        txt5_9.setText(null); txt6_1.setText(null); txt6_2.setText(null);  txt6_3.setText(null); txt6_4.setText(null);
        txt6_5.setText(null); txt6_6.setText(null); txt6_7.setText(null);  txt6_8.setText(null); txt6_9.setText(null);
        txt7_1.setText(null); txt7_2.setText(null); txt7_3.setText(null);  txt7_4.setText(null); txt7_5.setText(null);
        txt7_6.setText(null); txt7_7.setText(null); txt7_8.setText(null);  txt7_9.setText(null); txt8_1.setText(null);
        txt8_2.setText(null); txt8_3.setText(null); txt8_4.setText(null);  txt8_5.setText(null); txt8_6.setText(null);
        txt8_7.setText(null); txt8_8.setText(null); txt8_9.setText(null);  txt9_1.setText(null); txt9_2.setText(null);
        txt9_3.setText(null); txt9_4.setText(null); txt9_5.setText(null);  txt9_6.setText(null); txt9_7.setText(null);
        txt9_8.setText(null); txt9_9.setText(null);
    }
      
    public void colocarPista(int i, int j){
        if (i+1 == 1 && j+1 == 1) { 
            txt1_1.setText((Integer.toString(sudo.m1[i][j])));
            txt1_1.setEditable(false);
        }       
        if (i+1 == 1 && j+1 == 2) { 
            txt1_2.setText(Integer.toString(sudo.m1[i][j]));
            txt1_2.setEditable(false);
        }
        if (i+1 == 1 && j+1 == 3) { 
            txt1_3.setText(Integer.toString(sudo.m1[i][j]));
            txt1_3.setEditable(false);
        }
        if (i+1 == 1 && j+1 == 4) { 
            txt1_4.setText(Integer.toString(sudo.m1[i][j]));
            txt1_4.setEditable(false);
        }
        if (i+1 == 1 && j+1 == 5) { 
            txt1_5.setText(Integer.toString(sudo.m1[i][j]));
            txt1_5.setEditable(false);
        }
        if (i+1 == 1 && j+1 == 6) { 
            txt1_6.setText(Integer.toString(sudo.m1[i][j]));
            txt1_6.setEditable(false);
        }
        if (i+1 == 1 && j+1 == 7) { 
            txt1_7.setText(Integer.toString(sudo.m1[i][j]));
            txt1_7.setEditable(false);
        }
        if (i+1 == 1 && j+1 == 8) { 
            txt1_8.setText(Integer.toString(sudo.m1[i][j]));
            txt1_8.setEditable(false);
        }
        if (i+1 == 1 && j+1 == 9) { 
            txt1_9.setText(Integer.toString(sudo.m1[i][j]));
            txt1_9.setEditable(false);
        }
        
        if (i+1 == 2 && j+1 == 1) { 
            txt2_1.setText(Integer.toString(sudo.m1[i][j]));
            txt2_1.setEditable(false);
        }
        if (i+1 == 2 && j+1 == 2) { 
            txt2_2.setText(Integer.toString(sudo.m1[i][j]));
            txt2_2.setEditable(false);
        }
        if (i+1 == 2 && j+1 == 3) { 
            txt2_3.setText(Integer.toString(sudo.m1[i][j]));
            txt2_3.setEditable(false);
        }
        if (i+1 == 2 && j+1 == 4) { 
            txt2_4.setText(Integer.toString(sudo.m1[i][j]));
            txt2_4.setEditable(false);
        }
        if (i+1 == 2 && j+1 == 5) { 
            txt2_5.setText(Integer.toString(sudo.m1[i][j]));
            txt2_5.setEditable(false);
        }
        if (i+1 == 2 && j+1 == 6) { 
            txt2_6.setText(Integer.toString(sudo.m1[i][j]));
            txt2_6.setEditable(false);
        }
        if (i+1 == 2 && j+1 == 7) { 
            txt2_7.setText(Integer.toString(sudo.m1[i][j]));
            txt2_7.setEditable(false);
        }
        if (i+1 == 2 && j+1 == 8) { 
            txt2_8.setText(Integer.toString(sudo.m1[i][j]));
            txt2_8.setEditable(false);
        }
        if (i+1 == 2 && j+1 == 9) { 
            txt2_9.setText(Integer.toString(sudo.m1[i][j]));
            txt2_9.setEditable(false);
        }
        
        if (i+1 == 3 && j+1 == 1) { 
            txt3_1.setText(Integer.toString(sudo.m1[i][j]));
            txt3_1.setEditable(false);
        }
        if (i+1 == 3 && j+1 == 2) { 
            txt3_2.setText(Integer.toString(sudo.m1[i][j]));
            txt3_2.setEditable(false);
        }
        if (i+1 == 3 && j+1 == 3) { 
            txt3_3.setText(Integer.toString(sudo.m1[i][j]));
            txt3_3.setEditable(false);
        }
        if (i+1 == 3 && j+1 == 4) { 
            txt3_4.setText(Integer.toString(sudo.m1[i][j]));
            txt3_4.setEditable(false);
        }
        if (i+1 == 3 && j+1 == 5) { 
            txt3_5.setText(Integer.toString(sudo.m1[i][j]));
            txt3_5.setEditable(false);
        }
        if (i+1 == 3 && j+1 == 6) { 
            txt3_6.setText(Integer.toString(sudo.m1[i][j]));
            txt3_6.setEditable(false);
        }
        if (i+1 == 3 && j+1 == 7) { 
            txt3_7.setText(Integer.toString(sudo.m1[i][j]));
            txt3_7.setEditable(false);
        }
        if (i+1 == 3 && j+1 == 8) { 
            txt3_8.setText(Integer.toString(sudo.m1[i][j]));
            txt3_8.setEditable(false);
        }
        if (i+1 == 3 && j+1 == 9) { 
            txt3_9.setText(Integer.toString(sudo.m1[i][j]));
            txt3_9.setEditable(false);
        }
        
        if (i+1 == 4 && j+1 == 1) { 
            txt4_1.setText(Integer.toString(sudo.m1[i][j]));
            txt4_1.setEditable(false);
        }
        if (i+1 == 4 && j+1 == 2) { 
            txt4_2.setText(Integer.toString(sudo.m1[i][j]));
            txt4_2.setEditable(false);
        }
        if (i+1 ==  4 && j+1 == 3) { 
            txt4_3.setText(Integer.toString(sudo.m1[i][j]));
            txt4_3.setEditable(false);
        }
        if (i+1 == 4 && j+1 == 4) { 
            txt4_4.setText(Integer.toString(sudo.m1[i][j]));
            txt4_4.setEditable(false);
        }
        if (i+1 == 4 && j+1 == 5) { 
            txt4_5.setText(Integer.toString(sudo.m1[i][j]));
            txt4_5.setEditable(false);
        }
        if (i+1 == 4 && j+1 == 6) { 
            txt4_6.setText(Integer.toString(sudo.m1[i][j]));
            txt4_6.setEditable(false);
        }
        if (i+1 == 4 && j+1 == 7) { 
            txt4_7.setText(Integer.toString(sudo.m1[i][j]));
            txt4_7.setEditable(false);
        }
        if (i+1 == 4 && j+1 == 8) { 
            txt4_8.setText(Integer.toString(sudo.m1[i][j]));
            txt4_8.setEditable(false);
        }
        if (i+1 == 4 && j+1 == 9) { 
            txt4_9.setText(Integer.toString(sudo.m1[i][j]));
            txt4_9.setEditable(false);
        }
        
        if (i+1 == 5 && j+1 == 1) { 
            txt5_1.setText(Integer.toString(sudo.m1[i][j]));
            txt5_1.setEditable(false);
        }
        if (i+1 == 5 && j+1 == 2) { 
            txt5_2.setText(Integer.toString(sudo.m1[i][j]));
            txt5_2.setEditable(false);
        }
        if (i+1 == 5 && j+1 == 3) { 
            txt5_3.setText(Integer.toString(sudo.m1[i][j]));
            txt5_3.setEditable(false);
        }    
        if (i+1 == 5 && j+1 == 4) { 
            txt5_4.setText(Integer.toString(sudo.m1[i][j]));
            txt5_4.setEditable(false);
        }
        if (i+1 == 5 && j+1 == 5) { 
            txt5_5.setText(Integer.toString(sudo.m1[i][j]));
            txt5_5.setEditable(false);
        }
        if (i+1 == 5 && j+1 == 6) { 
            txt5_6.setText(Integer.toString(sudo.m1[i][j]));
            txt5_6.setEditable(false);
        }
        if (i+1 == 5 && j+1 == 7) { 
            txt5_7.setText(Integer.toString(sudo.m1[i][j]));
            txt5_7.setEditable(false);
        }
        if (i+1 == 5 && j+1 == 8) { 
            txt5_8.setText(Integer.toString(sudo.m1[i][j]));
            txt5_8.setEditable(false);
        }
        if (i+1 == 5 && j+1 == 9) { 
            txt5_9.setText(Integer.toString(sudo.m1[i][j]));
            txt5_9.setEditable(false);
        }
        
        if (i+1 == 6 && j+1 == 1) { 
            txt6_1.setText(Integer.toString(sudo.m1[i][j]));
            txt6_1.setEditable(false);
        }
        if (i+1 == 6 && j+1 == 2) { 
            txt6_2.setText(Integer.toString(sudo.m1[i][j]));
            txt6_2.setEditable(false);
        }
        if (i+1 == 6 && j+1 == 3) { 
            txt6_3.setText(Integer.toString(sudo.m1[i][j]));
            txt6_3.setEditable(false);
        }
        if (i+1 == 6 && j+1 == 4) { 
            txt6_4.setText(Integer.toString(sudo.m1[i][j]));
            txt6_4.setEditable(false);
        }
        if (i+1 == 6 && j+1 == 5) { 
            txt6_5.setText(Integer.toString(sudo.m1[i][j]));
            txt6_5.setEditable(false);
        }
        if (i+1 == 6 && j+1 == 6) { 
            txt6_6.setText(Integer.toString(sudo.m1[i][j]));
            txt6_6.setEditable(false);
        }
        if (i+1 == 6 && j+1 == 7) { 
            txt6_7.setText(Integer.toString(sudo.m1[i][j]));
            txt6_7.setEditable(false);
        }
        if (i+1 == 6 && j+1 == 8) { 
            txt6_8.setText(Integer.toString(sudo.m1[i][j]));
            txt6_8.setEditable(false);
        }
        if (i+1 == 6 && j+1 == 9) { 
            txt6_9.setText(Integer.toString(sudo.m1[i][j]));
            txt6_9.setEditable(false);
        }
        
        if (i+1 == 7 && j+1 == 1) { 
            txt7_1.setText(Integer.toString(sudo.m1[i][j]));
            txt7_1.setEditable(false);
        }
        if (i+1 == 7 && j+1 == 2) { 
            txt7_2.setText(Integer.toString(sudo.m1[i][j]));
            txt7_2.setEditable(false);
        }
        if (i+1 == 7 && j+1 == 3) { 
            txt7_3.setText(Integer.toString(sudo.m1[i][j]));
            txt7_3.setEditable(false);
        }
        if (i+1 == 7 && j+1 == 4) { 
            txt7_4.setText(Integer.toString(sudo.m1[i][j]));
            txt7_4.setEditable(false);
        }
        if (i+1 == 7 && j+1 == 5) { 
            txt7_5.setText(Integer.toString(sudo.m1[i][j]));
            txt7_5.setEditable(false);
        }
        if (i+1 == 7 && j+1 == 6) { 
            txt7_6.setText(Integer.toString(sudo.m1[i][j]));
            txt7_6.setEditable(false);
        }
        if (i+1 == 7 && j+1 == 7) { 
            txt7_7.setText(Integer.toString(sudo.m1[i][j]));
            txt7_7.setEditable(false);
        }
        if (i+1 == 7 && j+1 == 8) { 
            txt7_8.setText(Integer.toString(sudo.m1[i][j]));
            txt7_8.setEditable(false);
        }
        if (i+1 == 7 && j+1 == 9) { 
            txt7_9.setText(Integer.toString(sudo.m1[i][j]));
            txt7_9.setEditable(false);
        }
        
        if (i+1 == 8 && j+1 == 1) { 
            txt8_1.setText(Integer.toString(sudo.m1[i][j]));
            txt8_1.setEditable(false);
        }
        if (i+1 == 8 && j+1 == 2) { 
            txt8_2.setText(Integer.toString(sudo.m1[i][j]));
            txt8_2.setEditable(false);
        }
        if (i+1 == 8 && j+1 == 3) { 
            txt8_3.setText(Integer.toString(sudo.m1[i][j]));
            txt8_3.setEditable(false);
        }
        if (i+1 == 8 && j+1 == 4) { 
            txt8_4.setText(Integer.toString(sudo.m1[i][j]));
            txt8_4.setEditable(false);
        }
        if (i+1 == 8 && j+1 == 5) { 
            txt8_5.setText(Integer.toString(sudo.m1[i][j]));
            txt8_5.setEditable(false);
        }
        if (i+1 == 8 && j+1 == 6) { 
            txt8_6.setText(Integer.toString(sudo.m1[i][j]));
            txt8_6.setEditable(false);
        }
        if (i+1 == 8 && j+1 == 7) { 
            txt8_7.setText(Integer.toString(sudo.m1[i][j]));
            txt8_7.setEditable(false);
        }
        if (i+1 == 8 && j+1 == 8) { 
            txt8_8.setText(Integer.toString(sudo.m1[i][j]));
            txt8_8.setEditable(false);
        }
        if (i+1 == 8 && j+1 == 9) { 
            txt8_9.setText(Integer.toString(sudo.m1[i][j]));
            txt8_9.setEditable(false);
        }    
        
        if (i+1 == 9 && j+1 == 1) { 
            txt9_1.setText(Integer.toString(sudo.m1[i][j]));
            txt9_1.setEditable(false);
        }
        if (i+1 == 9 && j+1 == 2) { 
            txt9_2.setText(Integer.toString(sudo.m1[i][j]));
            txt9_2.setEditable(false);
        }
        if (i+1 == 9 && j+1 == 3) { 
            txt9_3.setText(Integer.toString(sudo.m1[i][j]));
            txt9_3.setEditable(false);
        }
        if (i+1 == 9 && j+1 == 4) { 
            txt9_4.setText(Integer.toString(sudo.m1[i][j]));
            txt9_4.setEditable(false);
        }
        if (i+4 == 9 && j+1 == 5) { 
            txt9_5.setText(Integer.toString(sudo.m1[i][j]));
            txt9_5.setEditable(false);
        }
        if (i+1 == 9 && j+1 == 6) { 
            txt9_6.setText(Integer.toString(sudo.m1[i][j]));
            txt9_6.setEditable(false);
        }
        if (i+1 == 9 && j+1 == 7) { 
            txt9_7.setText(Integer.toString(sudo.m1[i][j]));
            txt9_7.setEditable(false);
        }
        if (i+1 == 9 && j+1 == 8) { 
            txt9_8.setText(Integer.toString(sudo.m1[i][j]));
            txt9_8.setEditable(false);
        }
        if (i+1 == 9 && j+1 == 9) { 
            txt9_9.setText(Integer.toString(sudo.m1[i][j]));
            txt9_9.setEditable(false);
        }
    }
    
    public void verificarCampoVacio(){
        if (txt1_1.getText().equalsIgnoreCase("")) {             
            txt1_1.setEditable(true);
        }       
        if (txt1_2.getText().equalsIgnoreCase("")) {            
            txt1_2.setEditable(true);
        }
        if (txt1_3.getText().equalsIgnoreCase("")) { 
            txt1_3.setEditable(true);
        }
        if (txt1_4.getText().equalsIgnoreCase("")) { 
            txt1_4.setEditable(true);
        }
        if (txt1_5.getText().equalsIgnoreCase("")) { 
            txt1_5.setEditable(true);
        }
        if (txt1_6.getText().equalsIgnoreCase("")) { 
            txt1_6.setEditable(true);
        }
        if (txt1_7.getText().equalsIgnoreCase("")) { 
            txt1_7.setEditable(true);
        }
        if (txt1_8.getText().equalsIgnoreCase("")) { 
            txt1_8.setEditable(true);
        }
        if (txt1_9.getText().equalsIgnoreCase("")) { 
            txt1_9.setEditable(true);
        }
        
        if (txt2_1.getText().equalsIgnoreCase("")) { 
            txt2_1.setEditable(true);
        }
        if (txt2_2.getText().equalsIgnoreCase("")) { 
            txt2_2.setEditable(true);
        }
        if (txt2_3.getText().equalsIgnoreCase("")) { 

            txt2_3.setEditable(true);
        }
        if (txt2_4.getText().equalsIgnoreCase("")) { 

            txt2_4.setEditable(true);
        }
        if (txt2_5.getText().equalsIgnoreCase("")) { 

            txt2_5.setEditable(true);
        }
        if (txt2_6.getText().equalsIgnoreCase("")) { 

            txt2_6.setEditable(true);
        }
        if (txt2_7.getText().equalsIgnoreCase("")) { 

            txt2_7.setEditable(true);
        }
        if (txt2_8.getText().equalsIgnoreCase("")) { 

            txt2_8.setEditable(true);
        }
        if (txt2_9.getText().equalsIgnoreCase("")) { 

            txt2_9.setEditable(true);
        }
        
        if (txt3_1.getText().equalsIgnoreCase("")) { 

            txt3_1.setEditable(true);
        }
        if (txt3_2.getText().equalsIgnoreCase("")) { 

            txt3_2.setEditable(true);
        }       
        if (txt3_3.getText().equalsIgnoreCase("")) { 

            txt3_3.setEditable(true);
        }
        if (txt3_4.getText().equalsIgnoreCase("")) { 

            txt3_4.setEditable(true);
        }
        if (txt3_5.getText().equalsIgnoreCase("")) { 

            txt3_5.setEditable(true);
        }
        if (txt3_6.getText().equalsIgnoreCase("")) { 

            txt3_6.setEditable(true);
        }
        if (txt3_7.getText().equalsIgnoreCase("")) { 

            txt3_7.setEditable(true);
        }
        if (txt3_8.getText().equalsIgnoreCase("")) { 

            txt3_8.setEditable(true);
        }
        if (txt3_9.getText().equalsIgnoreCase("")) { 

            txt3_9.setEditable(true);
        }
        
        if (txt4_1.getText().equalsIgnoreCase("")) { 

            txt4_1.setEditable(true);
        }
        if (txt4_2.getText().equalsIgnoreCase("")) { 

            txt4_2.setEditable(true);
        }
        if (txt4_3.getText().equalsIgnoreCase("")) { 

            txt4_3.setEditable(true);
        }
        if (txt4_4.getText().equalsIgnoreCase("")) { 

            txt4_4.setEditable(true);
        }
        if (txt4_5.getText().equalsIgnoreCase("")) { 

            txt4_5.setEditable(true);
        }
        if (txt4_6.getText().equalsIgnoreCase("")) { 

            txt4_6.setEditable(true);
        }
        if (txt4_7.getText().equalsIgnoreCase("")) { 

            txt4_7.setEditable(true);
        }
        if (txt4_8.getText().equalsIgnoreCase("")) { 

            txt4_8.setEditable(true);
        }
        if (txt4_9.getText().equalsIgnoreCase("")) { 

            txt4_9.setEditable(true);
        }
        
        if (txt5_1.getText().equalsIgnoreCase("")) { 

            txt5_1.setEditable(true);
        }
        if (txt5_2.getText().equalsIgnoreCase("")) { 

            txt5_2.setEditable(true);
        }
        if (txt5_3.getText().equalsIgnoreCase("")) { 

            txt5_3.setEditable(true);
        }    
        if (txt5_4.getText().equalsIgnoreCase("")) { 

            txt5_4.setEditable(true);
        }
        if (txt5_5.getText().equalsIgnoreCase("")) { 

            txt5_5.setEditable(true);
        }
        if (txt5_6.getText().equalsIgnoreCase("")) { 

            txt5_6.setEditable(true);
        }
        if (txt5_7.getText().equalsIgnoreCase("")) { 

            txt5_7.setEditable(true);
        }
        if (txt5_8.getText().equalsIgnoreCase("")) { 

            txt5_8.setEditable(true);
        }
        if (txt5_9.getText().equalsIgnoreCase("")) { 

            txt5_9.setEditable(true);
        }
        
        if (txt6_1.getText().equalsIgnoreCase("")) { 

            txt6_1.setEditable(true);
        }
        if (txt6_2.getText().equalsIgnoreCase("")) { 

            txt6_2.setEditable(true);
        }
        if (txt6_3.getText().equalsIgnoreCase("")) { 

            txt6_3.setEditable(true);
        }
        if (txt6_4.getText().equalsIgnoreCase("")) { 

            txt6_4.setEditable(true);
        }
        if (txt6_5.getText().equalsIgnoreCase("")) { 

            txt6_5.setEditable(true);
        }
        if (txt6_6.getText().equalsIgnoreCase("")) { 

            txt6_6.setEditable(true);
        }
        if (txt6_7.getText().equalsIgnoreCase("")) { 
;
            txt6_7.setEditable(true);
        }
        if (txt6_8.getText().equalsIgnoreCase("")) { 

            txt6_8.setEditable(true);
        }
        if (txt6_9.getText().equalsIgnoreCase("")) { 

            txt6_9.setEditable(true);
        }
        
        if (txt7_1.getText().equalsIgnoreCase("")) { 
            txt7_1.setEditable(true);
        }
        if (txt7_2.getText().equalsIgnoreCase("")) { 

            txt7_2.setEditable(true);
        }
        if (txt7_3.getText().equalsIgnoreCase("")) { 

            txt7_3.setEditable(true);
        }
        if (txt7_4.getText().equalsIgnoreCase("")) { 

            txt7_4.setEditable(true);
        }
        if (txt7_5.getText().equalsIgnoreCase("")) { 

            txt7_5.setEditable(true);
        }
        if (txt7_6.getText().equalsIgnoreCase("")) { 

            txt7_6.setEditable(true);
        }
        if (txt7_7.getText().equalsIgnoreCase("")) { 

            txt7_7.setEditable(true);
        }
        if (txt7_8.getText().equalsIgnoreCase("")) { 

            txt7_8.setEditable(true);
        }
        if (txt7_9.getText().equalsIgnoreCase("")) { 

            txt7_9.setEditable(true);
        }
        
        if (txt8_1.getText().equalsIgnoreCase("")) { 

            txt8_1.setEditable(true);
        }
        if (txt8_2.getText().equalsIgnoreCase("")) { 

            txt8_2.setEditable(true);
        }
        if (txt8_3.getText().equalsIgnoreCase("")) { 

            txt8_3.setEditable(true);
        }
        if (txt8_4.getText().equalsIgnoreCase("")) { 

            txt8_4.setEditable(true);
        }
        if (txt8_5.getText().equalsIgnoreCase("")) { 

            txt8_5.setEditable(true);
        }
        if (txt8_6.getText().equalsIgnoreCase("")) { 

            txt8_6.setEditable(true);
        }
        if (txt8_7.getText().equalsIgnoreCase("")) { 

            txt8_7.setEditable(true);
        }
        if (txt8_8.getText().equalsIgnoreCase("")) { 

            txt8_8.setEditable(true);
        }
        if (txt8_9.getText().equalsIgnoreCase("")) { 

            txt8_9.setEditable(true);
        }    
        
        if (txt9_1.getText().equalsIgnoreCase("")) { 

            txt9_1.setEditable(true);
        }
        if (txt9_2.getText().equalsIgnoreCase("")) { 

            txt9_2.setEditable(true);
        }
        if (txt9_3.getText().equalsIgnoreCase("")) { 

            txt9_3.setEditable(true);
        }
        if (txt9_4.getText().equalsIgnoreCase("")) { 

            txt9_4.setEditable(true);
        }
        if (txt9_5.getText().equalsIgnoreCase("")) { 

            txt9_5.setEditable(true);
        }
        if (txt9_6.getText().equalsIgnoreCase("")) { 

            txt9_6.setEditable(true);
        }
        if (txt9_7.getText().equalsIgnoreCase("")) { 
  
            txt9_7.setEditable(true);
        }
        if (txt9_8.getText().equalsIgnoreCase("")) { 
 
            txt9_8.setEditable(true);
        }
        if (txt9_9.getText().equalsIgnoreCase("")) { 
  
            txt9_9.setEditable(true);
        }
    }
    
    public void matrizCero(){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudo.m1[i][j] =  0;
                m2[i][j] = 0;
            }
        }
    }
    
    public int verificarResultado(){
        int check = 0;        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudo.m1[i][j] == m2[i][j]) {
                    check++;
                }
            }
        }
        return check;
    }
    
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
            java.util.logging.Logger.getLogger(SudokuOriginal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SudokuOriginal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SudokuOriginal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SudokuOriginal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
                

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SudokuOriginal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jltiempo1;
    private javax.swing.JLabel jltiempo2;
    private javax.swing.JTextField txt1_1;
    private javax.swing.JTextField txt1_10;
    private javax.swing.JTextField txt1_11;
    private javax.swing.JTextField txt1_12;
    private javax.swing.JTextField txt1_13;
    private javax.swing.JTextField txt1_14;
    private javax.swing.JTextField txt1_15;
    private javax.swing.JTextField txt1_16;
    private javax.swing.JTextField txt1_17;
    private javax.swing.JTextField txt1_18;
    private javax.swing.JTextField txt1_2;
    private javax.swing.JTextField txt1_3;
    private javax.swing.JTextField txt1_4;
    private javax.swing.JTextField txt1_5;
    private javax.swing.JTextField txt1_6;
    private javax.swing.JTextField txt1_7;
    private javax.swing.JTextField txt1_8;
    private javax.swing.JTextField txt1_9;
    private javax.swing.JTextField txt2_1;
    private javax.swing.JTextField txt2_10;
    private javax.swing.JTextField txt2_11;
    private javax.swing.JTextField txt2_12;
    private javax.swing.JTextField txt2_13;
    private javax.swing.JTextField txt2_14;
    private javax.swing.JTextField txt2_15;
    private javax.swing.JTextField txt2_16;
    private javax.swing.JTextField txt2_17;
    private javax.swing.JTextField txt2_18;
    private javax.swing.JTextField txt2_2;
    private javax.swing.JTextField txt2_3;
    private javax.swing.JTextField txt2_4;
    private javax.swing.JTextField txt2_5;
    private javax.swing.JTextField txt2_6;
    private javax.swing.JTextField txt2_7;
    private javax.swing.JTextField txt2_8;
    private javax.swing.JTextField txt2_9;
    private javax.swing.JTextField txt3_1;
    private javax.swing.JTextField txt3_10;
    private javax.swing.JTextField txt3_11;
    private javax.swing.JTextField txt3_12;
    private javax.swing.JTextField txt3_13;
    private javax.swing.JTextField txt3_14;
    private javax.swing.JTextField txt3_15;
    private javax.swing.JTextField txt3_16;
    private javax.swing.JTextField txt3_17;
    private javax.swing.JTextField txt3_18;
    private javax.swing.JTextField txt3_2;
    private javax.swing.JTextField txt3_3;
    private javax.swing.JTextField txt3_4;
    private javax.swing.JTextField txt3_5;
    private javax.swing.JTextField txt3_6;
    private javax.swing.JTextField txt3_7;
    private javax.swing.JTextField txt3_8;
    private javax.swing.JTextField txt3_9;
    private javax.swing.JTextField txt4_1;
    private javax.swing.JTextField txt4_10;
    private javax.swing.JTextField txt4_11;
    private javax.swing.JTextField txt4_12;
    private javax.swing.JTextField txt4_13;
    private javax.swing.JTextField txt4_14;
    private javax.swing.JTextField txt4_15;
    private javax.swing.JTextField txt4_16;
    private javax.swing.JTextField txt4_17;
    private javax.swing.JTextField txt4_18;
    private javax.swing.JTextField txt4_2;
    private javax.swing.JTextField txt4_3;
    private javax.swing.JTextField txt4_4;
    private javax.swing.JTextField txt4_5;
    private javax.swing.JTextField txt4_6;
    private javax.swing.JTextField txt4_7;
    private javax.swing.JTextField txt4_8;
    private javax.swing.JTextField txt4_9;
    private javax.swing.JTextField txt5_1;
    private javax.swing.JTextField txt5_10;
    private javax.swing.JTextField txt5_11;
    private javax.swing.JTextField txt5_12;
    private javax.swing.JTextField txt5_13;
    private javax.swing.JTextField txt5_14;
    private javax.swing.JTextField txt5_15;
    private javax.swing.JTextField txt5_16;
    private javax.swing.JTextField txt5_17;
    private javax.swing.JTextField txt5_18;
    private javax.swing.JTextField txt5_2;
    private javax.swing.JTextField txt5_3;
    private javax.swing.JTextField txt5_4;
    private javax.swing.JTextField txt5_5;
    private javax.swing.JTextField txt5_6;
    private javax.swing.JTextField txt5_7;
    private javax.swing.JTextField txt5_8;
    private javax.swing.JTextField txt5_9;
    private javax.swing.JTextField txt6_1;
    private javax.swing.JTextField txt6_10;
    private javax.swing.JTextField txt6_11;
    private javax.swing.JTextField txt6_12;
    private javax.swing.JTextField txt6_13;
    private javax.swing.JTextField txt6_14;
    private javax.swing.JTextField txt6_15;
    private javax.swing.JTextField txt6_16;
    private javax.swing.JTextField txt6_17;
    private javax.swing.JTextField txt6_18;
    private javax.swing.JTextField txt6_2;
    private javax.swing.JTextField txt6_3;
    private javax.swing.JTextField txt6_4;
    private javax.swing.JTextField txt6_5;
    private javax.swing.JTextField txt6_6;
    private javax.swing.JTextField txt6_7;
    private javax.swing.JTextField txt6_8;
    private javax.swing.JTextField txt6_9;
    private javax.swing.JTextField txt7_1;
    private javax.swing.JTextField txt7_10;
    private javax.swing.JTextField txt7_11;
    private javax.swing.JTextField txt7_12;
    private javax.swing.JTextField txt7_13;
    private javax.swing.JTextField txt7_14;
    private javax.swing.JTextField txt7_15;
    private javax.swing.JTextField txt7_16;
    private javax.swing.JTextField txt7_17;
    private javax.swing.JTextField txt7_18;
    private javax.swing.JTextField txt7_2;
    private javax.swing.JTextField txt7_3;
    private javax.swing.JTextField txt7_4;
    private javax.swing.JTextField txt7_5;
    private javax.swing.JTextField txt7_6;
    private javax.swing.JTextField txt7_7;
    private javax.swing.JTextField txt7_8;
    private javax.swing.JTextField txt7_9;
    private javax.swing.JTextField txt8_1;
    private javax.swing.JTextField txt8_10;
    private javax.swing.JTextField txt8_11;
    private javax.swing.JTextField txt8_12;
    private javax.swing.JTextField txt8_13;
    private javax.swing.JTextField txt8_14;
    private javax.swing.JTextField txt8_15;
    private javax.swing.JTextField txt8_16;
    private javax.swing.JTextField txt8_17;
    private javax.swing.JTextField txt8_18;
    private javax.swing.JTextField txt8_2;
    private javax.swing.JTextField txt8_3;
    private javax.swing.JTextField txt8_4;
    private javax.swing.JTextField txt8_5;
    private javax.swing.JTextField txt8_6;
    private javax.swing.JTextField txt8_7;
    private javax.swing.JTextField txt8_8;
    private javax.swing.JTextField txt8_9;
    private javax.swing.JTextField txt9_1;
    private javax.swing.JTextField txt9_10;
    private javax.swing.JTextField txt9_11;
    private javax.swing.JTextField txt9_12;
    private javax.swing.JTextField txt9_13;
    private javax.swing.JTextField txt9_14;
    private javax.swing.JTextField txt9_15;
    private javax.swing.JTextField txt9_16;
    private javax.swing.JTextField txt9_17;
    private javax.swing.JTextField txt9_18;
    private javax.swing.JTextField txt9_2;
    private javax.swing.JTextField txt9_3;
    private javax.swing.JTextField txt9_4;
    private javax.swing.JTextField txt9_5;
    private javax.swing.JTextField txt9_6;
    private javax.swing.JTextField txt9_7;
    private javax.swing.JTextField txt9_8;
    private javax.swing.JTextField txt9_9;
    // End of variables declaration//GEN-END:variables
}