/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cordis.UI;

import Cordis.BG.Encryption;
import Cordis.DB.DatabaseConnectivity;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author lukaskopecky & hossa
 */
public class RecoverPassword extends javax.swing.JFrame {

    DatabaseConnectivity databaseConnectivity = new DatabaseConnectivity("jdbc:sqlite:Users.sqlite3");
    
    String globalEmail;
    String globalAnswer;
    Encryption encryption;
    
    /**
     * Creates new form RecoverPassword
     */
    public RecoverPassword() {
        initComponents();
        System.out.println("[RecoverPassword] ... is Connected");
        
        
        //arranges visble and unvisible elemnts
        questionLabel.setVisible(false);
        questionBox.setText("");
        
        answerLabel.setVisible(false);
        answerBox.setVisible(false);
        
        fistButton.setVisible(false);
        
        pwdLabel.setVisible(false);
        pwdBox.setVisible(false);
        
        confLabel.setVisible(false);
        confBox.setVisible(false);
        
        secButton.setVisible(false);
        
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
        emailBox = new javax.swing.JTextField();
        emailLab = new javax.swing.JLabel();
        questionLabel = new javax.swing.JLabel();
        answerLabel = new javax.swing.JLabel();
        answerBox = new javax.swing.JTextField();
        fistButton = new javax.swing.JButton();
        signInLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        signUpLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        questionBox = new javax.swing.JLabel();
        secButton = new javax.swing.JButton();
        pwdLabel = new javax.swing.JLabel();
        confLabel = new javax.swing.JLabel();
        pwdBox = new javax.swing.JPasswordField();
        confBox = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        fotterLabel = new javax.swing.JLabel();
        footerLab = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 153, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(1680, 900));
        jPanel1.setMinimumSize(new java.awt.Dimension(1440, 900));
        jPanel1.setPreferredSize(new java.awt.Dimension(1650, 900));

        jPanel2.setBackground(new java.awt.Color(59, 79, 87));

        emailBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mailCheckOnRlease(evt);
            }
        });

        emailLab.setForeground(new java.awt.Color(255, 153, 102));
        emailLab.setText("Email:");

        questionLabel.setForeground(new java.awt.Color(255, 153, 102));
        questionLabel.setText("Security Question");

        answerLabel.setForeground(new java.awt.Color(255, 153, 102));
        answerLabel.setText(" Security  Answer");

        fistButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        fistButton.setForeground(new java.awt.Color(255, 153, 102));
        fistButton.setText("CONFIRM");
        fistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fistButtonActionPerformed(evt);
            }
        });

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
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password Recovery");

        questionBox.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        questionBox.setForeground(new java.awt.Color(204, 204, 204));
        questionBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        questionBox.setText("SecurityQuestionDisplay");

        secButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        secButton.setForeground(new java.awt.Color(255, 153, 102));
        secButton.setText("SET NEW PASSWORD");
        secButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secButtonActionPerformed(evt);
            }
        });

        pwdLabel.setForeground(new java.awt.Color(255, 153, 102));
        pwdLabel.setText("New Password");

        confLabel.setForeground(new java.awt.Color(255, 153, 102));
        confLabel.setText("Confirm Password");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pwdBox, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(questionBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(emailBox)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(answerBox)
                        .addComponent(fistButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(secButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confBox, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(answerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailLab, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pwdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(confLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap(200, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(signInLabel)
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addComponent(signUpLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(emailLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailBox, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(questionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(questionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(answerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(answerBox, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fistButton)
                .addGap(18, 18, 18)
                .addComponent(pwdLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwdBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(secButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signInLabel)
                    .addComponent(jLabel2)
                    .addComponent(signUpLabel))
                .addGap(19, 19, 19))
        );

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        fotterLabel.setForeground(new java.awt.Color(153, 153, 153));
        fotterLabel.setText("Members: Lukas Kopecky (w1701833) - Mhanaj Hossain (w1679296) - Md Reyad (w1689489) - Balthasar Hoettges (w1710494)");

        footerLab.setForeground(new java.awt.Color(255, 153, 102));
        footerLab.setText("Created by Group 4 ");

        jLabel4.setFont(new java.awt.Font("Malgun Gothic", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 102));
        jLabel4.setText("CORDIS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 331, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(532, 532, 532))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(437, 437, 437))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(footerLab, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(651, 651, 651))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(fotterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4)))
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(footerLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fotterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DashboardLogo.png")));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1520, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signUpLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpLabelMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 153, 102));
        signUpLabel.setBorder(label_border);
    }//GEN-LAST:event_signUpLabelMouseEntered

    private void signUpLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpLabelMouseExited
        signUpLabel.setBorder(null);
    }//GEN-LAST:event_signUpLabelMouseExited

    /**
     * Display Registration Page
     * @param evt on click
     */
    private void signUpLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpLabelMouseClicked
        //TODO add your handling code here:
        RegPage reg = new RegPage();
        reg.setVisible(true);
        reg.pack();
        reg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_signUpLabelMouseClicked

    private void signInLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInLabelMouseExited
        // TODO add your handling code here:
        signInLabel.setBorder(null);
    }//GEN-LAST:event_signInLabelMouseExited

    private void signInLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInLabelMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 153, 102));
        signInLabel.setBorder(label_border);
    }//GEN-LAST:event_signInLabelMouseEntered

    /**
     * Display Log Page
     * @param evt on click
     */
    private void signInLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInLabelMouseClicked
        // TODO add your handling code here:
        LogPage log = new LogPage();
        log.setVisible(true);
        log.pack();
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_signInLabelMouseClicked

    /**
     * Check email
     * @param evt on key release
     */
    private void mailCheckOnRlease(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mailCheckOnRlease
        System.out.println("[RecoverPassword] ... checking email");
        
        //get text from email box
        String recoveryE = emailBox.getText().toLowerCase();
        
        //initilise query 
        String Query = "select userEmail, userQuestion, userAnswer, userID from Users where userEmail LIKE '"+recoveryE+"';";
        
        //run and retrieve data
        List<List<String>> list = databaseConnectivity.readDatabase(Query, false);
        
        
        //if email's been found
        if (!list.isEmpty()){
            
            String toDisplay = list.get(0).get(1);
            
            //display questin and answer
            questionBox.setText(toDisplay);
            answerBox.setVisible(true);
            fistButton.setVisible(true);
            questionLabel.setVisible(true);
            answerLabel.setVisible(true);
            
            //set global variables
            this.globalEmail = list.get(0).get(0).toLowerCase(); 
            this.globalAnswer = list.get(0).get(2).toLowerCase();
            
            System.out.println("[RecoverPassword] ... email found");
        }
        
        //otherwise return oringal state
        else{
            answerBox.setVisible(false);
            fistButton.setVisible(false);
            questionBox.setText("");
            questionLabel.setVisible(false);
            answerLabel.setVisible(false);
            
            this.globalEmail = null; 
            this.globalAnswer = null;
            
        }
    }//GEN-LAST:event_mailCheckOnRlease

    /**
     * Check if answer matches
     * @param evt on click
     */
    private void fistButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fistButtonActionPerformed
        // TODO add your handling code here:
        String newAnswer = answerBox.getText().toLowerCase();
        
        
        if(newAnswer.equals(globalAnswer)){
            
            System.out.println("[RecoverPassword] ... answers matching");
            
            
            emailLab.setVisible(false);
            emailBox.setVisible(false);
            
            questionLabel.setVisible(false);
            questionBox.setVisible(false);
        
            answerLabel.setVisible(false);
            answerBox.setVisible(false);
        
            fistButton.setVisible(false);
            
            pwdLabel.setVisible(true);
            pwdBox.setVisible(true);
        
            confLabel.setVisible(true);
            confBox.setVisible(true);
        
            secButton.setVisible(true);
        }
        
    }//GEN-LAST:event_fistButtonActionPerformed

    /**
     * New Password
     * @param evt on click event
     */
    private void secButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secButtonActionPerformed
        
        System.out.println("[RecoverPassword] ... set new pwd");
        
        //get text from password fields
        String newPWD = String.valueOf(pwdBox.getPassword());
        String newConf = String.valueOf(pwdBox.getPassword());
        
        if(newPWD.isEmpty() || newConf.isEmpty()){
            
            System.out.println("[RecoverPassword] ... empty fields");
            
            //Display Error Dialog
            JOptionPane.showMessageDialog(null, "Please, fill in all required fields!", "Required Fields", JOptionPane.WARNING_MESSAGE);
            
        }else{
            
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
            
            //check if new password and confirm password matching
            if(!newPWD.equals(newConf)){
            
            System.out.println("[RecoverPassword] ... passwords are not matching");
            
            //Dispaly Error Dialog
                 JOptionPane.showMessageDialog(null, "Your Passwords are not matching, please enter them again",
                        "Passwords are not matching", JOptionPane.WARNING_MESSAGE);
            
            
            //check if pwd marching pattern
            }else if (!newPWD.matches(passwordRegex)){    
                
                System.out.println("[RecoverPassword] ... Password is too weak!");
                
                //Dispaly Error Dialog
                String message = "Please make sure your password contains at least \n"
                        + "8 characters \nOne capital letter (e.g. A) \nOne lower case letter (e.g. a) \n"
                        + "One Special charcter (e.g. &) \nOne number (e.g. 1)";
                JOptionPane.showMessageDialog(null, message,
                        "Password is not Strong enough", JOptionPane.WARNING_MESSAGE); 
                
            //if previous conditions == false, update database 
            }else{
               
                //EncryptiongPassword
                encryption = new Encryption();
                String encryptedPwd = encryption.Encrypt(newPWD);
                
                
                //Initialising query
                String SQL = "update Users set userPassword = '"+encryptedPwd+"' where  userEmail LIKE '"+globalEmail+"';";
                

                //Running query
                Integer ErrNo = databaseConnectivity.updateDatabase(SQL);
                
                if(ErrNo == 0){
                    
                    String message = "Password Updated";
                        JOptionPane.showMessageDialog(null, message);
                            
                       //Opens Sign In Frame
                    LogPage log = new LogPage(globalEmail, newPWD);
                    log.setVisible(true);
                    log.pack();
                    log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    this.dispose();         
                    
                }else{
                    
                    System.err.println("[RegPage] ... ErrNo "+ErrNo+", SQL ERROR!");
                            
                            
                    String message = "SQL ERROR! Error No: "+ ErrNo+". Contact your IT Support!";
                    JOptionPane.showMessageDialog(null, message,"SQL ERROR", JOptionPane.ERROR_MESSAGE);
                                  
                                       
                }
                
                
                
            }
            
            
            
        }
        
        
    }//GEN-LAST:event_secButtonActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecoverPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerBox;
    private javax.swing.JLabel answerLabel;
    private javax.swing.JPasswordField confBox;
    private javax.swing.JLabel confLabel;
    private javax.swing.JTextField emailBox;
    private javax.swing.JLabel emailLab;
    private javax.swing.JButton fistButton;
    private javax.swing.JLabel footerLab;
    private javax.swing.JLabel fotterLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField pwdBox;
    private javax.swing.JLabel pwdLabel;
    private javax.swing.JLabel questionBox;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JButton secButton;
    private javax.swing.JLabel signInLabel;
    private javax.swing.JLabel signUpLabel;
    // End of variables declaration//GEN-END:variables
}
