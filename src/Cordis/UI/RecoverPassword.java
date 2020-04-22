/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cordis.UI;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author hossa
 */
public class RecoverPassword extends javax.swing.JFrame {

    /**
     * Creates new form RecoverPassword
     */
    public RecoverPassword() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        emailLabel = new javax.swing.JTextField();
        emailLab = new javax.swing.JLabel();
        passwordLab = new javax.swing.JLabel();
        passLabel = new javax.swing.JTextField();
        confirmPasswordLab = new javax.swing.JLabel();
        passConfirmLabel = new javax.swing.JTextField();
        securityQuestion = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        securityAnswer = new javax.swing.JLabel();
        securityButton = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        signInLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        signUpLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        fotterLabel = new javax.swing.JLabel();
        footerLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 153, 102));

        jPanel2.setBackground(new java.awt.Color(59, 79, 87));

        emailLabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailLabelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailLabelFocusLost(evt);
            }
        });

        emailLab.setForeground(new java.awt.Color(255, 153, 102));
        emailLab.setText("Email:");

        passwordLab.setForeground(new java.awt.Color(255, 153, 102));
        passwordLab.setText("New  Password:");

        passLabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passLabelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passLabelFocusLost(evt);
            }
        });

        confirmPasswordLab.setForeground(new java.awt.Color(255, 153, 102));
        confirmPasswordLab.setText("Confirm New Password:");

        passConfirmLabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passConfirmLabelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passConfirmLabelFocusLost(evt);
            }
        });
        passConfirmLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passConfirmLabelActionPerformed(evt);
            }
        });

        securityQuestion.setForeground(new java.awt.Color(255, 153, 102));
        securityQuestion.setText("Security Question");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        securityAnswer.setForeground(new java.awt.Color(255, 153, 102));
        securityAnswer.setText(" Security  Answer");

        securityButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                securityButtonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                securityButtonFocusLost(evt);
            }
        });
        securityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                securityButtonActionPerformed(evt);
            }
        });

        confirmButton.setText("Confirm");

        signInLabel.setBackground(new java.awt.Color(187, 187, 187));
        signInLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        signInLabel.setForeground(new java.awt.Color(255, 153, 102));
        signInLabel.setText("Sign In");
        signInLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signInLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signInLabelMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("or");

        signUpLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        signUpLabel.setForeground(new java.awt.Color(255, 153, 102));
        signUpLabel.setText("Sign Up");
        signUpLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signUpLabelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signUpLabelMouseEntered(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 102));
        jLabel3.setText("Recovery Password");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(securityAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLab, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLabel)
                            .addComponent(passLabel)
                            .addComponent(passConfirmLabel)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(securityQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(securityButton, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(passwordLab, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmPasswordLab, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(signInLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(signUpLabel))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel3)))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(emailLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(securityQuestion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(securityAnswer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(securityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmPasswordLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passConfirmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(confirmButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signInLabel)
                    .addComponent(jLabel2)
                    .addComponent(signUpLabel))
                .addGap(35, 35, 35))
        );

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        fotterLabel.setForeground(new java.awt.Color(153, 153, 153));
        fotterLabel.setText("Members: Lukas Kopecky (w1701833) - Mhanaj Hossain (w1679296) - Md Reyad (w1689489) - Balthasar Hoettges (w1710494)");

        footerLab.setForeground(new java.awt.Color(255, 153, 102));
        footerLab.setText("Created by Group 4 ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(865, 865, 865)
                .addComponent(footerLab, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(669, 669, 669))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1902, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(fotterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(301, 301, 301))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 261, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(footerLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fotterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1911, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailLabelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailLabelFocusGained
        // TODO add your handling code here:
        if (emailLabel.getText().trim().toLowerCase().equals("email")) {
            emailLabel.setText("");
            emailLabel.setForeground(java.awt.Color.black);
        }
    }//GEN-LAST:event_emailLabelFocusGained

    private void emailLabelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailLabelFocusLost
        // TODO add your handling code here:
        if (emailLabel.getText().trim().equals("")
            || emailLabel.getText().trim().toLowerCase().equals("email")) {
            emailLabel.setText("Email");
            emailLabel.setForeground(java.awt.Color.gray);
        }
    }//GEN-LAST:event_emailLabelFocusLost

    private void passLabelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passLabelFocusGained
        // TODO add your handling code here:
        if (passLabel.getText().trim().toLowerCase().equals("password")) {
            passLabel.setText("");
            passLabel.setForeground(java.awt.Color.black);
        }
    }//GEN-LAST:event_passLabelFocusGained

    private void passLabelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passLabelFocusLost
        // TODO add your handling code here:
        if (passLabel.getText().trim().equals("")
            || passLabel.getText().trim().toLowerCase().equals("password")) {
            passLabel.setText("Password");
            passLabel.setForeground(java.awt.Color.gray);
        }
    }//GEN-LAST:event_passLabelFocusLost

    private void passConfirmLabelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passConfirmLabelFocusGained
        // TODO add your handling code here:
        if (passConfirmLabel.getText().trim().toLowerCase().equals("confirm password")) {
            passConfirmLabel.setText("");
            passConfirmLabel.setForeground(java.awt.Color.black);
        }
    }//GEN-LAST:event_passConfirmLabelFocusGained

    private void passConfirmLabelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passConfirmLabelFocusLost
        // TODO add your handling code here:
        if (passConfirmLabel.getText().trim().equals("")
            || passConfirmLabel.getText().trim().toLowerCase().equals("confirm password")) {
            passConfirmLabel.setText("Confirm Password");
            passConfirmLabel.setForeground(java.awt.Color.gray);
        }
    }//GEN-LAST:event_passConfirmLabelFocusLost

    private void passConfirmLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passConfirmLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passConfirmLabelActionPerformed

    private void securityButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_securityButtonFocusGained
        // TODO add your handling code here:
        if (securityButton.getText().trim().toLowerCase().equals("security answer")) {
            securityButton.setText("");
            securityButton.setForeground(java.awt.Color.black);
        }
    }//GEN-LAST:event_securityButtonFocusGained

    private void securityButtonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_securityButtonFocusLost
        // TODO add your handling code here:
        if (securityButton.getText().trim().equals("")
            || securityButton.getText().trim().toLowerCase().equals("security answer")) {
            securityButton.setText("Security Answer");
            securityButton.setForeground(java.awt.Color.gray);
        }
    }//GEN-LAST:event_securityButtonFocusLost

    private void securityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_securityButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_securityButtonActionPerformed

    private void signInLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInLabelMouseClicked
        // TODO add your handling code here:
        LogPage log = new LogPage();
        log.setVisible(true);
        log.pack();
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_signInLabelMouseClicked

    private void signInLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInLabelMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 153, 102));
        signInLabel.setBorder(label_border);
    }//GEN-LAST:event_signInLabelMouseEntered

    private void signInLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInLabelMouseExited
        // TODO add your handling code here:
        signInLabel.setBorder(null);
    }//GEN-LAST:event_signInLabelMouseExited

    private void signUpLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpLabelMouseClicked
        //TODO add your handling code here:
        RegPage reg = new RegPage();
        reg.setVisible(true);
        reg.pack();
        reg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_signUpLabelMouseClicked

    private void signUpLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpLabelMouseExited
        signUpLabel.setBorder(null);
    }//GEN-LAST:event_signUpLabelMouseExited

    private void signUpLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpLabelMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 153, 102));
        signUpLabel.setBorder(label_border);
    }//GEN-LAST:event_signUpLabelMouseEntered

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(RecoverPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecoverPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecoverPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecoverPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecoverPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel confirmPasswordLab;
    private javax.swing.JLabel emailLab;
    private javax.swing.JTextField emailLabel;
    private javax.swing.JLabel footerLab;
    private javax.swing.JLabel fotterLabel;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField passConfirmLabel;
    private javax.swing.JTextField passLabel;
    private javax.swing.JLabel passwordLab;
    private javax.swing.JLabel securityAnswer;
    private javax.swing.JTextField securityButton;
    private javax.swing.JLabel securityQuestion;
    private javax.swing.JLabel signInLabel;
    private javax.swing.JLabel signUpLabel;
    // End of variables declaration//GEN-END:variables
}
