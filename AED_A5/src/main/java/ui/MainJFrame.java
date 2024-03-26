/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.ui;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import model.Business.Business;
import model.Business.ConfigureABusiness;
import model.UserAccountManagement.UserAccount;
import model.UserAccountManagement.UserAccountDirectory;


/**
 *
 * @author nasik
 */
public class MainJFrame extends javax.swing.JFrame {
    
    Business business = ConfigureABusiness.initialize();
    

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
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

        SplitHomeArea = new javax.swing.JSplitPane();
        ActionSideJPanel = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        pwdtxtPassword = new javax.swing.JPasswordField();
        lblTitle = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ActionSideJPanel.setBackground(new java.awt.Color(204, 204, 255));

        lblUsername.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUsername.setText("User Name");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPassword.setText("Password");

        lblTitle.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("SUPPLIER");

        javax.swing.GroupLayout ActionSideJPanelLayout = new javax.swing.GroupLayout(ActionSideJPanel);
        ActionSideJPanel.setLayout(ActionSideJPanelLayout);
        ActionSideJPanelLayout.setHorizontalGroup(
            ActionSideJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ActionSideJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ActionSideJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ActionSideJPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnLogin)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ActionSideJPanelLayout.createSequentialGroup()
                        .addGroup(ActionSideJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pwdtxtPassword)
                            .addComponent(txtUsername)
                            .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                        .addContainerGap(22, Short.MAX_VALUE))))
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ActionSideJPanelLayout.setVerticalGroup(
            ActionSideJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ActionSideJPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblTitle)
                .addGap(45, 45, 45)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwdtxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin)
                .addContainerGap(379, Short.MAX_VALUE))
        );

        SplitHomeArea.setLeftComponent(ActionSideJPanel);

        userProcessContainer.setBackground(new java.awt.Color(153, 204, 255));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        SplitHomeArea.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitHomeArea, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitHomeArea)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        
        String un = txtUsername.getText();
        char[] PasswordChar = pwdtxtPassword.getPassword();
        String Password = new String(PasswordChar);
        
        UserAccountDirectory uad = business.getUserAccountDirectory();
        UserAccount userAccount = uad.AuthenticateUser(un, Password);
        if(userAccount == null){
            JOptionPane.showMessageDialog(this, "No account exists with the given credentials");
            return;
        }
        
        WorkAreaJPanel workAreaJPanel = new WorkAreaJPanel(userProcessContainer, business);
        userProcessContainer.add("WorkAreaJPanel", workAreaJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ActionSideJPanel;
    private javax.swing.JSplitPane SplitHomeArea;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField pwdtxtPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
