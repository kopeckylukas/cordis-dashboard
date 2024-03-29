/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
* hello it's Mhanaj
 */
package Cordis.UI;

import Cordis.BG.Encryption;
import Cordis.BG.UserLog;
import Cordis.DB.DatabaseConnectivity;
import Cordis.Entities.User;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 * Login Frame
 * @author hossa AND lukaskopecky
 */
public class LogPage extends javax.swing.JFrame {
    
    private User localUser;
    Encryption encryption;
    
    DatabaseConnectivity databaseConnectivity = new DatabaseConnectivity("jdbc:sqlite:Users.sqlite3");
    
     public LogPage(User user) {
        initComponents();
        System.out.println("[LogPage] ... isConnected");
        localUser = user;
    }

    public LogPage() {
        initComponents();
        System.out.println("[LogPage] ... isConnected");
        localUser = null;
    }
    
    public LogPage(String email, String password){
        initComponents();
        System.out.println("[LogPage] ... isConnected");
        localUser = null;
        UsernameT.setText(email);
        PasswordT.setText(password);
    }

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        signInLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        signUpLabel = new javax.swing.JLabel();
        UsernameT = new javax.swing.JTextField();
        emailLab1 = new javax.swing.JLabel();
        passwordLab1 = new javax.swing.JLabel();
        PasswordT = new javax.swing.JPasswordField();
        passwordLab = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        footerLab = new javax.swing.JLabel();
        fotterLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(59, 79, 87));

        signInLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        signInLabel.setForeground(new java.awt.Color(255, 153, 102));
        signInLabel.setText("Sign In");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("or");

        signUpLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        signUpLabel.setForeground(new java.awt.Color(204, 204, 204));
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

        UsernameT.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        UsernameT.setForeground(new java.awt.Color(153, 153, 153));

        emailLab1.setForeground(new java.awt.Color(255, 153, 102));
        emailLab1.setText("Email:");

        passwordLab1.setForeground(new java.awt.Color(255, 153, 102));
        passwordLab1.setText("Password:");

        PasswordT.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        PasswordT.setForeground(new java.awt.Color(153, 153, 153));

        passwordLab.setForeground(new java.awt.Color(255, 153, 102));
        passwordLab.setText("Forgotten Password");
        passwordLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordLabMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passwordLabMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passwordLabMouseEntered(evt);
            }
        });

        submit.setBackground(new java.awt.Color(204, 204, 204));
        submit.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 153, 102));
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PasswordT, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLab1)
                            .addComponent(passwordLab1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(signInLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(signUpLabel))
                                .addComponent(UsernameT, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(passwordLab)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signInLabel)
                    .addComponent(jLabel2)
                    .addComponent(signUpLabel))
                .addGap(32, 32, 32)
                .addComponent(emailLab1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsernameT, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordLab1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordT, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(submit)
                .addGap(43, 43, 43))
        );

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        footerLab.setForeground(new java.awt.Color(255, 153, 102));
        footerLab.setText("Created by Group 4 ");

        fotterLabel.setForeground(new java.awt.Color(153, 153, 153));
        fotterLabel.setText("Members: Lukas Kopecky (w1701833) - Mhanaj Hossain (w1679296) - Md Reyad (w1689489) - Balthasar Hoettges (w1710494)");

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 102));
        jLabel3.setText("CORDIS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(705, 705, 705)
                .addComponent(footerLab)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(404, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(543, 543, 543))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(fotterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(401, 401, 401))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(footerLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fotterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DashboardLogo.png")));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Submit method, SIGN IN USER
     * Created BY Mhanaj Hossain, updated by Lukas Kopecky
     * @param evt action on click
     */
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed

        System.out.println("[LogPage] ... Login Process");
        
        //Scan Input
        String username = UsernameT.getText().toLowerCase();
        String password = String.valueOf(PasswordT.getPassword());
        
        //if user did not fill up any 
        if (username.isEmpty() || password.isEmpty()){
         
            System.out.println("[LogPage] ... Please, fill in all required fields!");
            
            JOptionPane.showMessageDialog(null, "Please, fill in all required fields!", "Required Fields", JOptionPane.WARNING_MESSAGE);
            
        //if entered all mandatory fiels, program will query data
        }else{
            
            System.out.println("[LogPage] ... Connecting User Database");
            
            //Initialising Query
            String SQL = "SELECT userType, userForename, userSurname, userEmail, userPassword, userID "
                        +"FROM Users "
                        +"WHERE userEmail LIKE '"+username+"'";
            
            //Initialising output 2D list
            List<List<String>> list = databaseConnectivity.readDatabase(SQL, false);
 
            
            //if return list is empty
            if(list.isEmpty()){
                
                System.out.println("[LogPage] ... Username not found");
                
                JOptionPane.showMessageDialog(null, "Please enter valid Username or Sign Up.", "Username not found", JOptionPane.WARNING_MESSAGE);
            
            //    
            }else{
                String userType = list.get(0).get(0);
                String userForename = list.get(0).get(1);
                String userSurname = list.get(0).get(2);
                String userEmail = list.get(0).get(3);
                String userPassword = list.get(0).get(4);
                Integer userNo = Integer.parseInt(list.get(0).get(5));
                
                //Encryptiong Password User Entered Password
                encryption = new Encryption();
                String encryptedPwd = encryption.Encrypt(password);
                
                
                //If Both Username and Password matching AND Usertype is "User"
                if(userPassword.equals(encryptedPwd) && userEmail.equals(username) && userType.equals("U") ){
                    
                    System.out.println("[LogPage] ... Welcome User "+userForename+" "+userSurname);
                    
                    //Optional Welcome Sign
//                    String Message = "Welcome User "+userForename+" "+userSurname;
//                    JOptionPane.showMessageDialog(null, Message);
                    
                    //Creating User Object to represent signed user.
                    localUser = new User (userNo, userType, userForename, userSurname);
                    
                    //Creating user Log
                    UserLog log = new UserLog(localUser);
                    log.logIn();
                    
                    //Creating Frame Dashboard
                    Dashboard dash = new Dashboard(localUser);
                    dash.setVisible(true);
                    dash.pack();
                    dash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    
                    this.dispose();
                    
                //If Both Username and Password matching AND Usertype is "Administrator"    
                }else if (userPassword.equals(encryptedPwd) && userEmail.equals(username) && userType.equals("A")){
                    System.out.println("[LogPage] ... Welcome Administrator");
                
                    //Optional Welcome Sign
//                    JOptionPane.showMessageDialog(null,  "Welcome Administrator");
                    
                    //Creating User Object to represent signed user.
                    localUser = new User (userNo, userType, userForename, userSurname);
                    
                    //Creating user Log
                    UserLog log = new UserLog(localUser);
                    log.logIn();
                    
                    //Creating Frame UserActivity
                    UserActivity ua = new UserActivity(localUser);
                    ua.setVisible(true);
                    ua.pack();
                    ua.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    
                    this.dispose();
                    
                    
                //If passowrds are not matching    
                }else{
                
                    System.out.println("[LogPage] ... Incorrect Password. Please Enter Correct Password or choose Forgotten Password");
                    
                    JOptionPane.showMessageDialog(null,
                                                "Please Enter Correct Password or choose Forgotten Password.",
                                                "Incorrect Password",
                                                JOptionPane.ERROR_MESSAGE);
                }
                
            }
                 
        }        
        
    }//GEN-LAST:event_submitActionPerformed

    /**
     * Sign Up Page Anchor
     * Created by Mhanaj
     * @param evt Mouse Clicked
     */
    private void signUpLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpLabelMouseClicked
        //TODO add your handling code here:
        RegPage reg = new RegPage();
        reg.setVisible(true);
        reg.pack();
        reg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_signUpLabelMouseClicked

    /**
     * Forgotten Password Sign -line change
     * @param evt Mouse Over
     */
    private void signUpLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpLabelMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 153, 102));
        signUpLabel.setBorder(label_border);
    }//GEN-LAST:event_signUpLabelMouseEntered

    /**
     * Forgotten Password Sign -line change
     * @param evt Mouse Over
     */
    private void signUpLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpLabelMouseExited
        signUpLabel.setBorder(null);
    }//GEN-LAST:event_signUpLabelMouseExited

    /**
     * Forgotten Password Sign -line change
     * @param evt Mouse Over
     */
    private void passwordLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordLabMouseClicked
        // TODO add your handling code here:
        RecoverPassword rec = new RecoverPassword();
        rec.setVisible(true);
        rec.pack();
        rec.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_passwordLabMouseClicked

    /**
     * Forgotten Password Sign -line change
     * @param evt Mouse Over
     */
    private void passwordLabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordLabMouseExited
        // TODO add your handling code here:
        passwordLab.setBorder(null);
    }//GEN-LAST:event_passwordLabMouseExited

    /**
     * Forgotten Password Sign -line change
     * @param evt Mouse Over
     */
    private void passwordLabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordLabMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 153, 102));
        passwordLab.setBorder(label_border);
    }//GEN-LAST:event_passwordLabMouseEntered

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
            java.util.logging.Logger.getLogger(LogPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordT;
    private javax.swing.JTextField UsernameT;
    private javax.swing.JLabel emailLab1;
    private javax.swing.JLabel footerLab;
    private javax.swing.JLabel fotterLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel passwordLab;
    private javax.swing.JLabel passwordLab1;
    private javax.swing.JLabel signInLabel;
    private javax.swing.JLabel signUpLabel;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
