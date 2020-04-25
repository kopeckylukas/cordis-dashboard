/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cordis.UI;

import Cordis.BG.Encryption;
import Cordis.DB.DatabaseConnectivity;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 * Registration
 * @author lukaskopecky & mhanaj
 */
public class RegPage extends javax.swing.JFrame {
    
    DatabaseConnectivity databaseConnectivity;
    Encryption encryption;
    
    /**
     * Constructor Initialising security Questions
     */
    public RegPage() {
        initComponents();
        System.out.println("[RegPage] ... isConnected");
        
       
        //Initialise Security Questions
        securityQuestionBox.addItem("Select a question ... ");
        securityQuestionBox.addItem("What is your mother’s maiden name?");
        securityQuestionBox.addItem("What is the name of the road you grew up on?");
        securityQuestionBox.addItem("What is the name of the hospital you were born at?");
        securityQuestionBox.addItem("Where did you go to high school/college?");
        securityQuestionBox.addItem("What Is your favorite book?");
        
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
        emailLab1 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JTextField();
        emailLab2 = new javax.swing.JLabel();
        surnameLabel = new javax.swing.JTextField();
        emailLab3 = new javax.swing.JLabel();
        emailLabel = new javax.swing.JTextField();
        emailLab4 = new javax.swing.JLabel();
        securityQuestionBox = new javax.swing.JComboBox();
        emailLab5 = new javax.swing.JLabel();
        securityAnswerBox = new javax.swing.JTextField();
        emailLab6 = new javax.swing.JLabel();
        passLabel1 = new javax.swing.JPasswordField();
        emailLab7 = new javax.swing.JLabel();
        confirmPassword = new javax.swing.JPasswordField();
        registerButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fotterLabel = new javax.swing.JLabel();
        footerLab = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(59, 79, 87));

        signInLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        signInLabel.setForeground(new java.awt.Color(204, 204, 204));
        signInLabel.setText("Sign In");
        signInLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signInLabelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signInLabelMouseEntered(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("or");

        signUpLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        signUpLabel.setForeground(new java.awt.Color(255, 153, 102));
        signUpLabel.setText("Sign Up");

        emailLab1.setForeground(new java.awt.Color(255, 153, 102));
        emailLab1.setText("Name:");

        emailLab2.setForeground(new java.awt.Color(255, 153, 102));
        emailLab2.setText("Surname: ");

        emailLab3.setForeground(new java.awt.Color(255, 153, 102));
        emailLab3.setText("Email: ");

        emailLab4.setForeground(new java.awt.Color(255, 153, 102));
        emailLab4.setText("Security Question");

        securityQuestionBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                securityQuestionBoxActionPerformed(evt);
            }
        });

        emailLab5.setForeground(new java.awt.Color(255, 153, 102));
        emailLab5.setText("Security Answer");

        emailLab6.setForeground(new java.awt.Color(255, 153, 102));
        emailLab6.setText("Password");

        emailLab7.setForeground(new java.awt.Color(255, 153, 102));
        emailLab7.setText("Confirtm Password");

        registerButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 153, 102));
        registerButton.setText("REGISTER");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailLab7)
                    .addComponent(emailLab6)
                    .addComponent(emailLab5)
                    .addComponent(emailLab4)
                    .addComponent(emailLab3)
                    .addComponent(emailLab2)
                    .addComponent(emailLab1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(securityQuestionBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(emailLabel)
                        .addComponent(surnameLabel)
                        .addComponent(nameLabel)
                        .addComponent(securityAnswerBox)
                        .addComponent(passLabel1)
                        .addComponent(confirmPassword)
                        .addComponent(registerButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signInLabel)
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(signUpLabel)
                .addGap(163, 163, 163))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signInLabel)
                    .addComponent(signUpLabel)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(emailLab1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailLab2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(surnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailLab3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailLab4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(securityQuestionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailLab5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(securityAnswerBox, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailLab6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailLab7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(registerButton)
                .addGap(27, 27, 27))
        );

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 102));
        jLabel3.setText("CORDIS");

        fotterLabel.setForeground(new java.awt.Color(153, 153, 153));
        fotterLabel.setText("Members: Lukas Kopecky (w1701833) - Mhanaj Hossain (w1679296) - Md Reyad (w1689489) - Balthasar Hoettges (w1710494)");

        footerLab.setForeground(new java.awt.Color(255, 153, 102));
        footerLab.setText("Created by Group 4 ");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(401, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(534, 534, 534))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(fotterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(392, 392, 392))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(463, 463, 463)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(695, 695, 695)
                                .addComponent(footerLab)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(footerLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fotterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DashboardLogo.png")));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Open Sign IN Frame
     * @param evt mouse click event 
     */
    private void signInLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInLabelMouseClicked
        
        LogPage log = new LogPage();
        log.setVisible(true);
        log.pack();
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_signInLabelMouseClicked

    /**
     * Sign IN - Sign colour change
     * @param evt Mouse Over event
     */
    private void signInLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInLabelMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 153, 102));
        signInLabel.setBorder(label_border);
    }//GEN-LAST:event_signInLabelMouseEntered

    /**
     * Sign IN - Sign colour change
     * @param evt Mouse Over event
     */
    private void signInLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInLabelMouseExited
        // TODO add your handling code here:
         signInLabel.setBorder(null);
    }//GEN-LAST:event_signInLabelMouseExited

    /**
     * Registration Button, Opens Sign
     * Created By Lukas Kopecky
     * @param evt on click event 
     */
    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        
        //Get Input Values
        String userForename = nameLabel.getText();
        String userSurname = surnameLabel.getText();
        String userEmail = emailLabel.getText().toLowerCase();
        String userPassword = String.valueOf(passLabel1.getPassword());
        String passwordConfirm = String.valueOf(confirmPassword.getPassword());
        String securityAnswer = securityAnswerBox.getText();
        String securityQuestion = (String) securityQuestionBox.getSelectedItem();
        
        
        //If any fields are empty 
        if(userForename.isEmpty() ||userSurname.isEmpty()||userEmail.isEmpty()||userPassword.isEmpty()||passwordConfirm.isEmpty() ||
                securityAnswer.isEmpty() || securityQuestion.equals("Select a question ... ")){
            
            System.out.println("[RegPage] ... Required Fields. Please, fill in all required fields!");
            
            //Display Error Dialog
            JOptionPane.showMessageDialog(null, "Please, fill in all required fields!", "Required Fields", JOptionPane.WARNING_MESSAGE);
           
        //If Non of the fields are empty    
        }else{
            
            //Normalising Email Address, following 3 lines of code
            /*
            Gupta, L. (2016) Java email validation using regex [https://howtodoinjava.com/regex/java-regex-validate-email-address/].
            */
            String emailRegex = "^(.+)@(.+)$";
            Pattern pattern = Pattern.compile(emailRegex);
            Matcher emailMatcher = pattern.matcher(userEmail);
            
            
            /*Rahim, V. (2019) Java Regular Expression Password Validation Example. [https://www.javacodeexamples.com/java-regular-expression-password-validation-example/519]. 
            ^ - start of the string
            (?=.*[0-9]) - Positive look ahead expression for any number
            (?=.*[a-z]) - Positive look ahead expression for lower case letter
            (?=.*[A-Z]) - Positive look ahead expression for upper case letter
            (?=.*[!@#$%^&*]) - Positive look ahead expression for any special character
            (?=\\S+$) - Positive look ahead expression for \S (non-space character)
            . – any character
            {8,} - minimum 8 characters in length
            $ - end of the string
            */
            String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*])(?=\\S+$).{8,}$";
            
            
     
            //If does not matches pattern
            if (emailMatcher.matches() == false){
                
                System.out.println("[RegPage] ... Invalid Email Addres. Make sure your Address has a valid format");
                
                //Display Error Dialog
                JOptionPane.showMessageDialog(null, "Email Address is not in valid Format, Please check format of your emal Address",
                        "Invalid Email Adress", JOptionPane.WARNING_MESSAGE);   
            
            //Password Pattern    
            }else if (!userPassword.matches(passwordRegex)){    
                
                System.out.println("[RegPage] ... Password is too weak!");
                
                //Dispaly Error Dialog
                String message = "Please make sure your password contains at least \n"
                        + "8 characters \nOne capital letter (e.g. A) \nOne lower case letter (e.g. a) \n"
                        + "One Special charcter (e.g. &) \nOne number (e.g. 1)";
                JOptionPane.showMessageDialog(null, message,
                        "Password is not Strong enough", JOptionPane.WARNING_MESSAGE); 
                
            //If passwords do not match
            }else if(!userPassword.equals(passwordConfirm)){
                
                System.out.println("[RegPage] ... Passwords do not match!");
                
                //Dispaly Error Dialog
                 JOptionPane.showMessageDialog(null, "Your Passwords are not matching, please enter them again",
                        "Passwords are not matching", JOptionPane.WARNING_MESSAGE);
            
            //IF All error condition == false     
            }else{
                
                
                //Creating Unix Timestamp
                long unixTime = System.currentTimeMillis();
                java.sql.Timestamp regDate = new java.sql.Timestamp(unixTime);
                
                //Connecting database
                databaseConnectivity = new DatabaseConnectivity("jdbc:sqlite:Users.sqlite3");
                
                //EncryptiongPassword
                encryption = new Encryption();
                String encryptedPwd = encryption.Encrypt(userPassword);

                //Initialising query
                String SQL = "insert into Users (userForename, userSurname, userEmail, userQuestion, userAnswer, userPassword, userRegDate) "
                            + "values('"+userForename+"' ,'"+userSurname+"' ,'"+userEmail+"' ,'"+securityQuestion+"' ,'"+securityAnswer+"','"+encryptedPwd+"' ,'"+regDate+"');";

                //Running query
                Integer ErrNo = databaseConnectivity.updateDatabase(SQL);
                
                //Check Error Number
                switch (ErrNo) {
                    case 0:
                        {
                            System.out.println("[RegPage] ... ErrNo 0, registration success!");
                            
                           
                            String message = "User "+userForename+" "+ userSurname + " has been registered. Your username is "+ userEmail+"\n"
                                    + "Continue to Sign In";
                            JOptionPane.showMessageDialog(null, message);
                            
                            //Opens Sign In Frame
                            LogPage log = new LogPage(userEmail, userPassword);
                            log.setVisible(true);
                            log.pack();
                            log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            this.dispose();
                            
                            break;
                        }
                    case 19:
                        {
                            System.out.println("[RegPage] ... ErrNo 19, Email Address Already in Use!");
                            
                            
                            String message = "Email Address "+ userEmail +" is already in use. If you have already an account, Sign In or use differnt email address.";
                            JOptionPane.showMessageDialog(null, message,"INVALID EMAIL ADDRESS", JOptionPane.WARNING_MESSAGE);
                            
                            break;
                        }
                    case 1:
                        {
                            System.out.println("[RegPage] ... ErrNo 1, Invalid character in form, database error!");
                            
                            
                            String message = "Invalid characters in some fields. Please Make sure you are not using characters as \' or  \\ ";
                            JOptionPane.showMessageDialog(null, message,"INVALID INPUT", JOptionPane.WARNING_MESSAGE);
                            
                            break;
                        }
                    default:
                        {
                            System.err.println("[RegPage] ... ErrNo "+ErrNo+", SQL ERROR!");
                            
                            
                            String message = "SQL ERROR! Error No: "+ ErrNo+". Contact your IT Support!";
                            JOptionPane.showMessageDialog(null, message,"SQL ERROR", JOptionPane.ERROR_MESSAGE);
                            
                            break;
                        }
                }
            }    
        }      
    }//GEN-LAST:event_registerButtonActionPerformed

    private void securityQuestionBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_securityQuestionBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_securityQuestionBoxActionPerformed

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
            java.util.logging.Logger.getLogger(RegPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmPassword;
    private javax.swing.JLabel emailLab1;
    private javax.swing.JLabel emailLab2;
    private javax.swing.JLabel emailLab3;
    private javax.swing.JLabel emailLab4;
    private javax.swing.JLabel emailLab5;
    private javax.swing.JLabel emailLab6;
    private javax.swing.JLabel emailLab7;
    private javax.swing.JTextField emailLabel;
    private javax.swing.JLabel footerLab;
    private javax.swing.JLabel fotterLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameLabel;
    private javax.swing.JPasswordField passLabel1;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField securityAnswerBox;
    private javax.swing.JComboBox securityQuestionBox;
    private javax.swing.JLabel signInLabel;
    private javax.swing.JLabel signUpLabel;
    private javax.swing.JTextField surnameLabel;
    // End of variables declaration//GEN-END:variables
}
