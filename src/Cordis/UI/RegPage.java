/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cordis.UI;

import Cordis.DB.DatabaseConnectivity;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author hossa
 */
public class RegPage extends javax.swing.JFrame {

    /**
     * Creates new form RegPage
     */
    public RegPage() {
        initComponents();
        System.out.println("[RegPage] ... isConnected");
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
        signUpLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        signInLabel = new javax.swing.JLabel();
        surnameLabel = new javax.swing.JTextField();
        nameLabel = new javax.swing.JTextField();
        nameLab = new javax.swing.JLabel();
        surnameLab = new javax.swing.JLabel();
        emailLabel = new javax.swing.JTextField();
        emailLab = new javax.swing.JLabel();
        passLabel = new javax.swing.JTextField();
        passConfirmLabel = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        confirmPasswordLab = new javax.swing.JLabel();
        passwordLab = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        securityQuestion = new javax.swing.JLabel();
        securityAnswer = new javax.swing.JLabel();
        securityButton = new javax.swing.JTextField();
        fotterLabel = new javax.swing.JLabel();
        footerLab = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(59, 79, 87));
        jPanel2.setForeground(new java.awt.Color(45, 74, 103));

        signUpLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        signUpLabel.setForeground(new java.awt.Color(255, 153, 102));
        signUpLabel.setText("Sign Up");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("or");

        signInLabel.setBackground(new java.awt.Color(187, 187, 187));
        signInLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        signInLabel.setForeground(new java.awt.Color(204, 204, 204));
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

        surnameLabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                surnameLabelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                surnameLabelFocusLost(evt);
            }
        });
        surnameLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnameLabelActionPerformed(evt);
            }
        });

        nameLabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameLabelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameLabelFocusLost(evt);
            }
        });

        nameLab.setBackground(new java.awt.Color(255, 153, 102));
        nameLab.setForeground(new java.awt.Color(255, 153, 102));
        nameLab.setText("Name:");

        surnameLab.setForeground(new java.awt.Color(255, 153, 102));
        surnameLab.setText("Surname:");

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

        passLabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passLabelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passLabelFocusLost(evt);
            }
        });

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

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        confirmPasswordLab.setForeground(new java.awt.Color(255, 153, 102));
        confirmPasswordLab.setText("Confirm Password:");

        passwordLab.setForeground(new java.awt.Color(255, 153, 102));
        passwordLab.setText("Password:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        securityQuestion.setForeground(new java.awt.Color(255, 153, 102));
        securityQuestion.setText("Choose your security question");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(securityAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(signUpLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(signInLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(passwordLab, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailLab, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(surnameLab, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nameLab, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nameLabel)
                                .addComponent(surnameLabel)
                                .addComponent(emailLabel)
                                .addComponent(passLabel)
                                .addComponent(passConfirmLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                .addComponent(confirmPasswordLab, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(securityQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(securityButton)))
                .addGap(154, 154, 154))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpLabel)
                    .addComponent(jLabel2)
                    .addComponent(signInLabel))
                .addGap(18, 18, 18)
                .addComponent(nameLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(surnameLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(surnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmPasswordLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passConfirmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(securityQuestion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(securityAnswer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(securityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(registerButton)
                .addGap(20, 20, 20))
        );

        fotterLabel.setForeground(new java.awt.Color(153, 153, 153));
        fotterLabel.setText("Members: Lukas Kopecky (w1701833) - Mhanaj Hossain (w1679296) - Md Reyad (w1689489) - Balthasar Hoettges (w1710494)");

        footerLab.setForeground(new java.awt.Color(255, 153, 102));
        footerLab.setText("Created by Group 4 ");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(648, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(662, 662, 662))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(footerLab, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(818, 818, 818))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(fotterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(536, 536, 536))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(footerLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fotterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

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
     * Method for sign Up Process
     *
     * @param evt on click event
     */
    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:

        String userForename = nameLabel.getText();
        String userSurname = surnameLabel.getText();
        String userEmail = emailLabel.getText();
        String userPassword = passLabel.getText();
        String passwordConfirm = passLabel.getText();

        if (userForename.equals("Name") || userSurname.equals("Surname") || userEmail.equals("Email")
                || userPassword.equals("Password") || passwordConfirm.equals("Confirm Password")) {

            System.out.println("[RegPage] ... Required Fields. Please, fill in all required fields!");
            JOptionPane.showMessageDialog(null, "Please, fill in all required fields!", "Required Fields", JOptionPane.WARNING_MESSAGE);

        } else {

            //Normalising Email Address, following 3 lines of code
            /*
             Gupta, L (2016) Java email validation using regex [Source code]. https://howtodoinjava.com/regex/java-regex-validate-email-address/
             */
            String regex = "^(.+)@(.+)$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(userEmail);

            if (matcher.matches() == false) {

                JOptionPane.showMessageDialog(null, "Email Address is not in valid Format, Please check format of your emal Address",
                        "Invalid Email Adress", JOptionPane.WARNING_MESSAGE);
            } else if (!userPassword.equals(passwordConfirm)) {
                JOptionPane.showMessageDialog(null, "Your Passwords are not matching, please enter them again",
                        "Passwords are not matching", JOptionPane.WARNING_MESSAGE);
            } else {

                //Conecting Database and running qurey
                DatabaseConnectivity databaseConnectivity = new DatabaseConnectivity("jdbc:sqlite:Users.sqlite3");

                String SQL = "insert into Users (userForename, userSurname, userEmail, userPassword) "
                        + "values('" + userForename + "' ,'" + userSurname + "' ,'" + userEmail + "' ,'" + userPassword + "' );";

                Integer ErrNo = databaseConnectivity.updateDatabase(SQL);

                if (ErrNo == 0) {
                    System.out.println("[RegPage] ... User " + userForename + " " + userSurname + ""
                            + " has been registered. Your username is " + userEmail);

                    String message = "User " + userForename + " " + userSurname + " has been registered. Your username is " + userEmail + "\n"
                            + "Continue to Sign In";
                    JOptionPane.showMessageDialog(null, message);

                    LogPage log = new LogPage();
                    log.setVisible(true);
                    log.pack();
                    log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    this.dispose();

                } else if (ErrNo == 19) {
                    System.out.println("[RegPage] ... Email Address " + userEmail + " is already in use. "
                            + "If you have already an account click Sign In, or use differnt email address.");

                    String message = "Email Address " + userEmail + " is already in use. If you have already an account, Sign In or use differnt email address.";
                    JOptionPane.showMessageDialog(null, message, "INVALID EMAIL ADDRESS", JOptionPane.WARNING_MESSAGE);

                } else if (ErrNo == 1) {
                    System.out.println("[RegPage] ... Invalid Character in some fields");

                    String message = "Invalid characters in some fields. Please Make sure you are not using characters as \' or  \\ ";
                    JOptionPane.showMessageDialog(null, message, "INVALID INPUT", JOptionPane.WARNING_MESSAGE);

                } else {
                    System.err.println("[RegPage] ... SQLError code: " + ErrNo);

                    String message = "SQL ERROR! Error No: " + ErrNo + ". Contact your IT Support!";
                    JOptionPane.showMessageDialog(null, message, "SQL ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }

        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void passConfirmLabelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passConfirmLabelFocusLost
        // TODO add your handling code here:
        if (passConfirmLabel.getText().trim().equals("")
                || passConfirmLabel.getText().trim().toLowerCase().equals("confirm password")) {
            passConfirmLabel.setText("Confirm Password");
            passConfirmLabel.setForeground(java.awt.Color.gray);
        }
    }//GEN-LAST:event_passConfirmLabelFocusLost

    private void passConfirmLabelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passConfirmLabelFocusGained
        // TODO add your handling code here:
        if (passConfirmLabel.getText().trim().toLowerCase().equals("confirm password")) {
            passConfirmLabel.setText("");
            passConfirmLabel.setForeground(java.awt.Color.black);
        }
    }//GEN-LAST:event_passConfirmLabelFocusGained

    private void passLabelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passLabelFocusLost
        // TODO add your handling code here:
        if (passLabel.getText().trim().equals("")
                || passLabel.getText().trim().toLowerCase().equals("password")) {
            passLabel.setText("Password");
            passLabel.setForeground(java.awt.Color.gray);
        }
    }//GEN-LAST:event_passLabelFocusLost

    private void passLabelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passLabelFocusGained
        // TODO add your handling code here:
        if (passLabel.getText().trim().toLowerCase().equals("password")) {
            passLabel.setText("");
            passLabel.setForeground(java.awt.Color.black);
        }
    }//GEN-LAST:event_passLabelFocusGained

    private void emailLabelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailLabelFocusLost
        // TODO add your handling code here:
        if (emailLabel.getText().trim().equals("")
                || emailLabel.getText().trim().toLowerCase().equals("email")) {
            emailLabel.setText("Email");
            emailLabel.setForeground(java.awt.Color.gray);
        }
    }//GEN-LAST:event_emailLabelFocusLost

    private void emailLabelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailLabelFocusGained
        // TODO add your handling code here:
        if (emailLabel.getText().trim().toLowerCase().equals("email")) {
            emailLabel.setText("");
            emailLabel.setForeground(java.awt.Color.black);
        }
    }//GEN-LAST:event_emailLabelFocusGained

    private void surnameLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surnameLabelActionPerformed

    private void surnameLabelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_surnameLabelFocusLost
        // TODO add your handling code here:
        if (surnameLabel.getText().trim().equals("")
                || surnameLabel.getText().trim().toLowerCase().equals("surname")) {
            surnameLabel.setText("Surname");
            surnameLabel.setForeground(java.awt.Color.gray);
        }
    }//GEN-LAST:event_surnameLabelFocusLost

    private void surnameLabelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_surnameLabelFocusGained
        // TODO add your handling code here:
        if (surnameLabel.getText().trim().toLowerCase().equals("surname")) {
            surnameLabel.setText("");
            surnameLabel.setForeground(java.awt.Color.black);
        }
    }//GEN-LAST:event_surnameLabelFocusGained

    private void nameLabelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameLabelFocusLost
        // TODO add your handling code here:
        if (nameLabel.getText().trim().equals("")
                || nameLabel.getText().trim().toLowerCase().equals("name")) {
            nameLabel.setText("Name");
            nameLabel.setForeground(java.awt.Color.gray);
        }
    }//GEN-LAST:event_nameLabelFocusLost

    private void nameLabelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameLabelFocusGained
        // TODO add your handling code here:
        if (nameLabel.getText().trim().toLowerCase().equals("name")) {
            nameLabel.setText("");
            nameLabel.setForeground(java.awt.Color.black);
        }
    }//GEN-LAST:event_nameLabelFocusGained

    private void signInLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInLabelMouseExited
        // TODO add your handling code here:
        signInLabel.setBorder(null);
    }//GEN-LAST:event_signInLabelMouseExited

    private void signInLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInLabelMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 153, 102));
        signInLabel.setBorder(label_border);
    }//GEN-LAST:event_signInLabelMouseEntered

    private void signInLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInLabelMouseClicked
        // TODO add your handling code here:
        LogPage log = new LogPage();
        log.setVisible(true);
        log.pack();
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_signInLabelMouseClicked

    private void securityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_securityButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_securityButtonActionPerformed

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
    private javax.swing.JLabel confirmPasswordLab;
    private javax.swing.JLabel emailLab;
    private javax.swing.JTextField emailLabel;
    private javax.swing.JLabel footerLab;
    private javax.swing.JLabel fotterLabel;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nameLab;
    private javax.swing.JTextField nameLabel;
    private javax.swing.JTextField passConfirmLabel;
    private javax.swing.JTextField passLabel;
    private javax.swing.JLabel passwordLab;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel securityAnswer;
    private javax.swing.JTextField securityButton;
    private javax.swing.JLabel securityQuestion;
    private javax.swing.JLabel signInLabel;
    private javax.swing.JLabel signUpLabel;
    private javax.swing.JLabel surnameLab;
    private javax.swing.JTextField surnameLabel;
    // End of variables declaration//GEN-END:variables
}
