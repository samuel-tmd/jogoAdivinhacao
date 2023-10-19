/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.adivinhator;

import java.util.ArrayList;

/**
 *
 * @author 202108365
 */
public class FormPerguntas extends javax.swing.JFrame {

    private int indiceAtual = 0;
    
    /**
     * Creates new form FormPerguntas
     */
    public FormPerguntas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jlblPergunta = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jbttProxima = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setText("Adivinhator");

        jlblPergunta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlblPergunta.setText("O jogador atua na europa?");
        jlblPergunta.setToolTipText("");

        jRadioButton1.setText("Sim");

        jRadioButton2.setText("Não");
        jRadioButton2.setActionCommand("Não");

        jbttProxima.setText("Prosseguir");
        jbttProxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttProximaActionPerformed(evt);
            }
        });

        jLabel3.setText("...");
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jbttProxima)
                            .addComponent(jlblPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jlblPergunta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbttProxima)
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbttProximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttProximaActionPerformed

        ArrayList<String> perguntas = new ArrayList<>();
        perguntas.add("O jogador atua na Europa?");
        perguntas.add("O jogador atua no Brasil?");
        perguntas.add("O jogador tem mais de 25 anos de idade?");
        perguntas.add("O jogador é atacante?");
        perguntas.add("O jogador é meio campista?");
        perguntas.add("O jogador é lateral?");
        perguntas.add("O jogador é zagueiro?");
        perguntas.add("O jogador é goleiro?");
        perguntas.add("O jogador é destro?");
        perguntas.add("O jogador atua na Inglaterra?");
        perguntas.add("Ele atua na França?");
        perguntas.add("Ele atua no Arsenal?");
        perguntas.add("Ele atua no Newcastle?");
        perguntas.add("Ele atua no Monaco?");
        perguntas.add("Ele atua no Real Madrid?");
        perguntas.add("O jogador foi revelado no Santos?");
         
        jlblPergunta.setText(perguntas.get(indiceAtual));
        
    if (indiceAtual < perguntas.size() - 1) {
        indiceAtual++;
    } else {
        indiceAtual = 0;
            }
            //    jbttProxima.setText("Novo Texto da Label" + perguntas.get(indiceAtual));

    }//GEN-LAST:event_jbttProximaActionPerformed

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
            java.util.logging.Logger.getLogger(FormPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPerguntas().setVisible(true);
            }
        });
        
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JButton jbttProxima;
    private javax.swing.JLabel jlblPergunta;
    // End of variables declaration//GEN-END:variables
}