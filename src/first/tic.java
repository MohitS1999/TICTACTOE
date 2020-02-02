/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class tic extends javax.swing.JFrame {
    private String startGame="X";
    private int xcount=0;
    private int ocount=0;

    /**
     * Creates new form tic
     */
    public tic() {
        initComponents();
        setSize(1200,600);
        setLocationRelativeTo(null);
    }
    private void gameScore(){
     jLabel4.setText(String.valueOf(xcount));  
      jLabel5.setText(String.valueOf(ocount));  
    }
    private  void choose(){
        if(startGame.equalsIgnoreCase("X")){
            startGame="o";
        }
        else{
            startGame="X";
        }
    }
    private void wingame(){
        String b1=jButton1.getText();
        String b2=jButton2.getText();
        String b3=jButton3.getText();
        String b4=jButton4.getText();
        String b5=jButton5.getText();
        String b6=jButton6.getText();
        String b7=jButton7.getText();
        String b8=jButton8.getText();
        String b9=jButton9.getText();
        if(b1=="X"&&b2=="X"&&b3=="X"){
        JOptionPane.showMessageDialog(this,"Player X WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
        xcount++;
        gameScore();
        jButton1.setBackground(Color.GREEN);
        jButton2.setBackground(Color.GREEN);
        jButton3.setBackground(Color.GREEN);
        jLabel4.setBackground(Color.GREEN);
        }
          if(b4=="X"&&b5=="X"&&b6=="X"){
        JOptionPane.showMessageDialog(this,"Player X WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
        xcount++;
        gameScore();
        jButton4.setBackground(Color.GREEN);
        jButton5.setBackground(Color.GREEN);
        jButton6.setBackground(Color.GREEN);
        }
            if(b7=="X"&&b8=="X"&&b9=="X"){
        JOptionPane.showMessageDialog(this,"Player X WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
        xcount++;
        gameScore();
        jButton7.setBackground(Color.GREEN);
        jButton8.setBackground(Color.GREEN);
        jButton9.setBackground(Color.GREEN);
        }
              if(b1=="X"&&b4=="X"&&b7=="X"){
        JOptionPane.showMessageDialog(this,"Player X WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
        xcount++;
        gameScore();
        jButton1.setBackground(Color.GREEN);
        jButton4.setBackground(Color.GREEN);
        jButton7.setBackground(Color.GREEN);
        }
                if(b2=="X"&&b5=="X"&&b8=="X"){
        JOptionPane.showMessageDialog(this,"Player X WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
        xcount++;
        gameScore();
        jButton2.setBackground(Color.GREEN);
        jButton5.setBackground(Color.GREEN);
        jButton8.setBackground(Color.GREEN);
        }
                  if(b3=="X"&&b6=="X"&&b9=="X"){
        JOptionPane.showMessageDialog(this,"Player X WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
        xcount++;
        gameScore();
        jButton3.setBackground(Color.GREEN);
        jButton6.setBackground(Color.GREEN);
        jButton9.setBackground(Color.GREEN);
        }
                    if(b1=="X"&&b5=="X"&&b9=="X"){
        JOptionPane.showMessageDialog(this,"Player X WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
        xcount++;
        gameScore();
        jButton1.setBackground(Color.GREEN);
        jButton5.setBackground(Color.GREEN);
        jButton9.setBackground(Color.GREEN);
        }
                      if(b3=="X"&&b5=="X"&&b7=="X"){
        JOptionPane.showMessageDialog(this,"Player X WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
        xcount++;
        gameScore();
        jButton3.setBackground(Color.GREEN);
        jButton5.setBackground(Color.GREEN);
        jButton7.setBackground(Color.GREEN);
        }
         if(b1=="o"&&b2=="o"&&b3=="o"){
        JOptionPane.showMessageDialog(this,"Player o WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
        ocount++;
        gameScore();
        jButton1.setBackground(Color.GREEN);
        jButton2.setBackground(Color.GREEN);
        jButton3.setBackground(Color.GREEN);
        }
          if(b4=="o"&&b5=="o"&&b6=="o"){
        JOptionPane.showMessageDialog(this,"Player o WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
        ocount++;
        gameScore();
        jButton4.setBackground(Color.GREEN);
        jButton5.setBackground(Color.GREEN);
        jButton6.setBackground(Color.GREEN);
        }
            if(b7=="o"&&b8=="o"&&b9=="o"){
        JOptionPane.showMessageDialog(this,"Player o WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
        ocount++;
        gameScore();
        jButton7.setBackground(Color.GREEN);
        jButton8.setBackground(Color.GREEN);
        jButton9.setBackground(Color.GREEN);
        }
              if(b1=="o"&&b4=="o"&&b7=="o"){
        JOptionPane.showMessageDialog(this,"Player o WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
        ocount++;
        gameScore();
        jButton1.setBackground(Color.GREEN);
        jButton4.setBackground(Color.GREEN);
        jButton7.setBackground(Color.GREEN);
        }
                if(b2=="o"&&b5=="o"&&b8=="o"){
        JOptionPane.showMessageDialog(this,"Player o WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
        ocount++;
        gameScore();
        jButton2.setBackground(Color.GREEN);
        jButton5.setBackground(Color.GREEN);
        jButton8.setBackground(Color.GREEN);
        }
                  if(b3=="o"&&b6=="o"&&b9=="o"){
        JOptionPane.showMessageDialog(this,"Player o WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
        ocount++;
        gameScore();
        jButton3.setBackground(Color.GREEN);
        jButton6.setBackground(Color.GREEN);
        jButton9.setBackground(Color.GREEN);
        }
                    if(b1=="o"&&b5=="o"&&b9=="o"){
        JOptionPane.showMessageDialog(this,"Player o WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
        ocount++;
        gameScore();
        jButton1.setBackground(Color.GREEN);
        jButton5.setBackground(Color.GREEN);
        jButton9.setBackground(Color.GREEN);
        }
                      if(b3=="o"&&b5=="o"&&b7=="o"){
        JOptionPane.showMessageDialog(this,"Player o WINS","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
        ocount++;
        gameScore();
        jButton3.setBackground(Color.GREEN);
        jButton5.setBackground(Color.GREEN);
        jButton7.setBackground(Color.GREEN);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jbtnreset = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jbtnexit = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC_TAC_TOE");

        jPanel2.setBackground(new java.awt.Color(102, 0, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIC TAC TOE");
        jPanel2.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setLayout(new java.awt.GridLayout(3, 5, 3, 3));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel6.setText("PLAYER X:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel6)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Calibri Light", 1, 48)); // NOI18N
        jLabel3.setText("PLAYER 0:");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(74, 74, 74))
        );

        jPanel3.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(204, 204, 204));

        jbtnreset.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnreset.setText("RESET");
        jbtnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jbtnreset)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(jbtnreset)
                .addGap(69, 69, 69))
        );

        jPanel3.add(jPanel17);

        jPanel18.setBackground(new java.awt.Color(204, 204, 204));

        jbtnexit.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnexit.setText("EXIT");
        jbtnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(jbtnexit)
                .addGap(63, 63, 63))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(jbtnexit)
                .addGap(74, 74, 74))
        );

        jPanel3.add(jPanel18);

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(startGame);
          if(startGame.equalsIgnoreCase("X")){
            jButton5.setForeground(Color.RED);
        }
        else{
             jButton5.setForeground(Color.blue);
        }
          choose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jButton1.setText(startGame);
          if(startGame.equalsIgnoreCase("X")){
            jButton1.setForeground(Color.RED);
        }
        else{
             jButton1.setForeground(Color.blue);
        }
          choose();
          wingame();
    }//GEN-LAST:event_jButton1ActionPerformed
    private JFrame frame;
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
  jButton9.setText(startGame);
          if(startGame.equalsIgnoreCase("X")){
            jButton9.setForeground(Color.RED);
        }
        else{
             jButton9.setForeground(Color.blue);
        }
          choose();
          wingame();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jbtnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnresetActionPerformed
      jButton1.setText(null);
       jButton2.setText(null);
        jButton3.setText(null);
         jButton4.setText(null);
         jButton5.setText(null);
          jButton6.setText(null);
           jButton7.setText(null);
            jButton8.setText(null);
             jButton9.setText(null);
            jButton1.setBackground(Color.DARK_GRAY);
              jButton2.setBackground(Color.DARK_GRAY);
                jButton3.setBackground(Color.DARK_GRAY);
                  jButton4.setBackground(Color.DARK_GRAY);
                    jButton5.setBackground(Color.DARK_GRAY);
                      jButton6.setBackground(Color.DARK_GRAY);
                        jButton7.setBackground(Color.DARK_GRAY);
                          jButton8.setBackground(Color.DARK_GRAY);
                            jButton9.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_jbtnresetActionPerformed

    private void jbtnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnexitActionPerformed
       frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want  to exit","TIC TAC TOE",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION);
        {
        System.exit(0);
        } frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want  to exit","TIC TAC TOE",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION);
        {
        System.exit(0);
        }
    }//GEN-LAST:event_jbtnexitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(startGame);
          if(startGame.equalsIgnoreCase("X")){
            jButton2.setForeground(Color.RED);
        }
        else{
             jButton2.setForeground(Color.blue);
        }
          choose();
          wingame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       jButton3.setText(startGame);
          if(startGame.equalsIgnoreCase("X")){
            jButton3.setForeground(Color.RED);
        }
        else{
             jButton3.setForeground(Color.blue);
        }
          choose();
          wingame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       jButton4.setText(startGame);
          if(startGame.equalsIgnoreCase("X")){
            jButton4.setForeground(Color.RED);
        }
        else{
             jButton4.setForeground(Color.blue);
        }
          choose();
          wingame();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     jButton6.setText(startGame);
          if(startGame.equalsIgnoreCase("X")){
            jButton6.setForeground(Color.RED);
        }
        else{
             jButton6.setForeground(Color.blue);
        }
          choose();
          wingame();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         jButton7.setText(startGame);
          if(startGame.equalsIgnoreCase("X")){
            jButton7.setForeground(Color.RED);
        }
        else{
             jButton7.setForeground(Color.blue);
        }
          choose();
          wingame();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
     jButton8.setText(startGame);
          if(startGame.equalsIgnoreCase("X")){
            jButton8.setForeground(Color.RED);
        }
        else{
             jButton8.setForeground(Color.blue);
        }
          choose();
          wingame();
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JButton jbtnexit;
    private javax.swing.JButton jbtnreset;
    // End of variables declaration//GEN-END:variables
}
