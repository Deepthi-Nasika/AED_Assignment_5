/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.java.ui;

import javax.swing.JPanel;

/**
 *
 * @author nasik
 */
public class WorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    /**
     * Creates new form WorkAreaJPanel
     */
    public WorkAreaJPanel(JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnProductCtlg = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        btnProductCtlg.setBackground(new java.awt.Color(204, 204, 255));
        btnProductCtlg.setText("Product Catalog");
        btnProductCtlg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductCtlgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btnProductCtlg, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(590, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btnProductCtlg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(491, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductCtlgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductCtlgActionPerformed

        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnProductCtlgActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProductCtlg;
    // End of variables declaration//GEN-END:variables
}