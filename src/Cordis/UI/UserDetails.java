/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cordis.UI;

import Cordis.BG.UserLog;
import Cordis.DB.DatabaseConnectivity;
import Cordis.Entities.User;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 * Front-End Application, Displaying user Details, enables to change user type
 * @author lukaskopecky
 */
public class UserDetails extends javax.swing.JFrame {
    
    User localUser;
    private static DatabaseConnectivity connect = new DatabaseConnectivity("jdbc:sqlite:Users.sqlite3");

    /**
     * Creates new form UserDetails
     * @param localUser object User who is signed in
     */
    public UserDetails(User localUser) {
        initComponents();
        this.localUser = localUser;
        usernameField.setText(localUser.getName() +" "+ localUser.getSurname());
        
        //Displaying default table
        defaultTable();
        
        UserLog log = new UserLog(localUser);
        log.logActivity("User Details");
    }

    /**
     * If user has not been parsed
     */
    private UserDetails() {
        initComponents();
        this.localUser = null;
        
        defaultTable();
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
        adminSign = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        userDetailsSign = new javax.swing.JLabel();
        userActSign = new javax.swing.JLabel();
        userDetSign = new javax.swing.JLabel();
        logOutSign = new javax.swing.JLabel();
        dashboardTab = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        footerLab = new javax.swing.JLabel();
        fotterLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        surnameSearchLabel1 = new javax.swing.JLabel();
        searchUsernameField = new javax.swing.JTextField();
        informLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        adminSign.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        adminSign.setForeground(new java.awt.Color(255, 153, 102));
        adminSign.setText("CORDIS ");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        userDetailsSign.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        userDetailsSign.setForeground(new java.awt.Color(255, 153, 102));
        userDetailsSign.setText("Administrator - USER DETAILS BOARD");

        userActSign.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        userActSign.setForeground(new java.awt.Color(204, 204, 204));
        userActSign.setText("USER ACTIVITY BOARD");
        userActSign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userActSignMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userActSignMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userActSignMouseEntered(evt);
            }
        });

        userDetSign.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        userDetSign.setForeground(new java.awt.Color(255, 153, 102));
        userDetSign.setText("USER DETAILS");

        logOutSign.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        logOutSign.setForeground(new java.awt.Color(204, 204, 204));
        logOutSign.setText("LOG OUT");
        logOutSign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logOutSignMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOutSignMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOutSignMouseEntered(evt);
            }
        });

        dashboardTab.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        dashboardTab.setForeground(new java.awt.Color(204, 204, 204));
        dashboardTab.setText("DASHBOARD");
        dashboardTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dashboardTabMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardTabMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardTabMouseEntered(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        footerLab.setForeground(new java.awt.Color(255, 153, 102));
        footerLab.setText("Created by Group 4 ");

        fotterLabel.setForeground(new java.awt.Color(153, 153, 153));
        fotterLabel.setText("Members: Lukas Kopecky (w1701833) - Mhanaj Hossain (w1679296) - Md Reyad (w1689489) - Balthasar Hoettges (w1710494)");

        usernameField.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        usernameField.setForeground(new java.awt.Color(204, 204, 204));
        usernameField.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        usernameField.setText("Username");

        userTable.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Log In", "Log Out", "Duration"
            }
        ));
        userTable.setRowHeight(18);
        userTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(userTable);

        surnameSearchLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        surnameSearchLabel1.setForeground(new java.awt.Color(204, 204, 204));
        surnameSearchLabel1.setText("SEARCH");

        searchUsernameField.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        searchUsernameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        searchUsernameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchUsernameFieldKeyReleased(evt);
            }
        });

        informLabel.setBackground(new java.awt.Color(255, 255, 255));
        informLabel.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        informLabel.setForeground(new java.awt.Color(204, 204, 204));
        informLabel.setText("*To Change User Type Click on a user in the table");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adminSign, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(410, 410, 410)
                                .addComponent(userDetailsSign))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(userActSign)
                                        .addGap(18, 18, 18)
                                        .addComponent(userDetSign)
                                        .addGap(18, 18, 18)
                                        .addComponent(dashboardTab)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 874, Short.MAX_VALUE)
                                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(logOutSign))
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1)))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(informLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(surnameSearchLabel1)
                .addGap(18, 18, 18)
                .addComponent(searchUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(fotterLabel)
                        .addGap(438, 438, 438))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(footerLab)
                        .addGap(728, 728, 728))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userDetailsSign)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(adminSign)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashboardTab, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(userActSign)
                        .addComponent(userDetSign)
                        .addComponent(logOutSign)
                        .addComponent(usernameField)))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(surnameSearchLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(informLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(footerLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fotterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 102));
        userDetailsSign.setBorder(label_border);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DashboardLogom.png")));

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

    private void logOutSignMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutSignMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 153, 102));
        logOutSign.setBorder(label_border);  
    }//GEN-LAST:event_logOutSignMouseEntered

    private void logOutSignMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutSignMouseExited
        // TODO add your handling code here:
          logOutSign.setBorder(null);
    }//GEN-LAST:event_logOutSignMouseExited

    private void userActSignMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userActSignMouseExited
        // TODO add your handling code here:
        userActSign.setBorder(null);
    }//GEN-LAST:event_userActSignMouseExited

    private void userActSignMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userActSignMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 153, 102));
        userActSign.setBorder(label_border);        
    }//GEN-LAST:event_userActSignMouseEntered

    private void dashboardTabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardTabMouseExited
        // TODO add your handling code here:
        dashboardTab.setBorder(null);
    }//GEN-LAST:event_dashboardTabMouseExited

    private void dashboardTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardTabMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 153, 102));
        dashboardTab.setBorder(label_border); 
    }//GEN-LAST:event_dashboardTabMouseEntered

    /**
     * Change user type
     * @param evt mouse pressed on JTable
     */
    private void userTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTableMousePressed
        // TODO add your handling code here:
        
        //Slecting rew
        Integer row = userTable.getSelectedRow();
        
        //Selecting value
        String email = (String) userTable.getValueAt(row, 0);
        String type = (String) userTable.getValueAt(row, 3);
        
        
        
     
        //user type is Currently User
        if(type.equals("User")){
            
            //Message to be dispalyed 
            String msg = "Do you want to set user "+email+" to Adnministrator?";
            
            //Output from dialogue 
            int n = JOptionPane.showConfirmDialog(null, msg, "Change to ADMINISTRATOR?", JOptionPane.YES_NO_OPTION);
           
            //if a user pressed Yes in the Dialogue
            if (n == 0) {
               
                //user is set to Administrator
                String query = "update Users set userType = 'A' where userEmail LIKE '"+email+"';";
               
                //process the query
                connect.updateDatabase(query);
               
                //dispaly default table
                defaultTable();
            }        
        }
        
        //If user Type is Currently Administrator
        if(type.equals("Administrator")){
            
            //Message to be dispalyed 
            String msg = "Do you want to set Administrator "+email+" to User?";
            
            //Output from dialogue 
            int n = JOptionPane.showConfirmDialog(null, msg, "Change to USER?", JOptionPane.YES_NO_OPTION);
            
            //if a user pressed Yes in the Dialogue
            if (n == 0) {
               
                //user is set to Administrator
                String query = "update Users set userType = 'U' where userEmail LIKE '"+email+"';";
               
                //process the query
                connect.updateDatabase(query);
               
                //dispaly default table
                defaultTable();
            }
         
        }
     
    }//GEN-LAST:event_userTableMousePressed

    /**
     * Filtering users
     * @param evt key released
     */
    private void searchUsernameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchUsernameFieldKeyReleased
      
        //Initialising local variables
        String query;
        String searchFor = searchUsernameField.getText();
       
        //intialising query
        query = "select  userEmail as Username, userForename as Name, userSurname as Surname, userType as \"User Type\","
                + " userQuestion as \"Security Question\", userAnswer as \"Security Answer\", userPassword as Password, userRegDate as \"Registration Date\" "
                + "from Users "
                + "WHERE (userEmail LIKE '%"+searchFor+"%'"
                + "OR userForename LIKE '%"+searchFor+"%'"
                + "OR userSurname LIKE '%"+searchFor+"%');";
        
        
        //executing query and retrieving data
        List<List<String>> list = connect.readDatabase(query, true);
       
        if(list.size() > 1){
       
            //Creates Array of Columns names
            String [] nameOfCompoundCategories = new String [list.get(1).size()];
            //Populating Array Of Columns Names 
            for(int n = 0; n<list.get(0).size(); n++){
                nameOfCompoundCategories [n] = list.get(0).get(n);
            }

            //load data into the JTable
            Object[][] compoundData = new String[list.size()-1][list.get(1).size()];
            for(int l = 1; l<list.size(); l++){
                for(int r = 0; r<list.get(l).size(); r++){
                    
                    //If detail equlas to Administrator or User
                    if(r == 3){
                        
                        String type = list.get(l).get(r);
                        if(type.equals("A"))
                            compoundData [l-1] [r] = "Administrator";
                        else
                            compoundData [l-1] [r] = "User";

                    }else{
                        compoundData [l-1] [r] = list.get(l).get(r);
                    }


                }

            } 

            //update JTable
            System.out.println("[UserDetail] ... Displaying JTable, List of Columns");
            DefaultTableModel compoundModel = (DefaultTableModel) userTable.getModel();
            compoundModel.setDataVector(compoundData,nameOfCompoundCategories);
            
        }else{
           
            //If compbination has not been found
            String message = searchFor+" not Found";
           
            JOptionPane.showMessageDialog(null, message,
                        "Key Word Not Found", JOptionPane.WARNING_MESSAGE);
           
            searchUsernameField.setText(null);
           
           
            defaultTable();
           
       }
    }//GEN-LAST:event_searchUsernameFieldKeyReleased

    /**
     * Log out
     * @param evt on press
     */
    private void logOutSignMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutSignMousePressed
        // TODO add your handling code here:
        UserLog log = new UserLog(localUser);
        log.logOut();
        
        LogPage logp = new LogPage();
        logp.setVisible(true);
        logp.pack();
        logp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_logOutSignMousePressed

    /**
     * Switch to Dashboard
     * @param evt on press
     */
    private void dashboardTabMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardTabMousePressed
        // TODO add your handling code here:
       
        
        
        Dashboard das = new Dashboard(localUser);
        das.setVisible(true);
        das.pack();
        das.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_dashboardTabMousePressed

    /**
     * Switch to user Activity
     * @param evt 
     */
    private void userActSignMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userActSignMousePressed
        // TODO add your handling code here:
        
        
        
        UserActivity userAct = new UserActivity(localUser);
        userAct.setVisible(true);
        userAct.pack();
        userAct.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();  
    }//GEN-LAST:event_userActSignMousePressed

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
            java.util.logging.Logger.getLogger(UserDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDetails().setVisible(true);
            }
        });
    }
    
    /**
     * Displaying default table view
     */
    public final void defaultTable(){
        //Intialise default query
        
        //preparing query
        String query = "select  userEmail as Username, userForename as Name, userSurname as Surname, userType as \"User Type\","
                + " userQuestion as \"Security Question\", userAnswer as \"Security Answer\", userPassword as Password, userRegDate as \"Registration Date\" "
                + "from Users;";
        
        //Creates list of Lists 
        List<List<String>> list = connect.readDatabase(query, true);
        
        //Creates Array of Columns names
        String [] nameOfCompoundCategories = new String [list.get(1).size()];
        
        //Populating Array Of Columns Names 
        for(int n = 0; n<list.get(0).size(); n++){
            nameOfCompoundCategories [n] = list.get(0).get(n);
        }
        
        
        //loading data
        Object[][] compoundData = new String[list.size()-1][list.get(1).size()];
        //go throuhg rows
        for(int l = 1; l<list.size(); l++){
            //go thorough columns
            for(int r = 0; r<list.get(l).size(); r++){
                
                if(r == 3){
                    String type = list.get(l).get(r);
                    if(type.equals("A"))
                        compoundData [l-1] [r] = "Administrator";
                    else
                        compoundData [l-1] [r] = "User";
                    
                    
                }else{
                    compoundData [l-1] [r] = list.get(l).get(r);
                }
                
                
            }
            
        } 
            
        //updating JTable
        System.out.println("[JFrame] ... Displaying JTable, List of Columns");
        DefaultTableModel compoundModel = (DefaultTableModel) userTable.getModel();
        compoundModel.setDataVector(compoundData,nameOfCompoundCategories); 
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminSign;
    private javax.swing.JLabel dashboardTab;
    private javax.swing.JLabel footerLab;
    private javax.swing.JLabel fotterLabel;
    private javax.swing.JLabel informLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logOutSign;
    private javax.swing.JTextField searchUsernameField;
    private javax.swing.JLabel surnameSearchLabel1;
    private javax.swing.JLabel userActSign;
    private javax.swing.JLabel userDetSign;
    private javax.swing.JLabel userDetailsSign;
    private javax.swing.JTable userTable;
    private javax.swing.JLabel usernameField;
    // End of variables declaration//GEN-END:variables
}
