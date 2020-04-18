/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cordis.UI;

import Cordis.DB.DatabaseConnectivity;
import Cordis.DB.GetEntities;
import Cordis.Entities.Organisation;
import Cordis.Entities.Project;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lukaskopecky
 */
public class LukasPart extends javax.swing.JFrame {

     private static GetEntities projectDB = new GetEntities();
     private static DatabaseConnectivity connect = new DatabaseConnectivity();
  
    /**
     * Constructs JFrame
     */
    public LukasPart() {
        //jLabel3.setText("Organisations");
        initComponents();
        
    //DISPLAY PROJECT TABLE
        //Retrieves List of Projects
        List<Organisation> org = projectDB.getOrganisation("orgCountry LIKE 'uk'");
        
        //Names of Columns
        Object [] nameOfOrgCategories = { "ID", "Name", "Short Name", "Country"};
        
        //Creates 2D Arary to dispalay data
        Object[][] orgData = new String[org.size()][4];
        
        //Populates 2D Array to display 
        for (int r=0; r<org.size(); r++) {
            orgData[r][0]=org.get(r).getOrgID().toString();
            orgData[r][1]=org.get(r).getOrgName();
            orgData[r][2]=org.get(r).getOrgShortName();
            orgData[r][3]=org.get(r).getOrgCountry();
        }
        
        //Displays jTable
        System.out.println("[JFrame] ... Displaying JTable, Organisation");
        DefaultTableModel orgModel = (DefaultTableModel) TestTable.getModel();
        orgModel.setDataVector(orgData,nameOfOrgCategories);  
        
        
        
    //DISPLAY PROJECT TABLE
        //Retrieves List of Projects
        List<Project> pro = projectDB.getProject();
        
        //Names of Columns
        Object [] nameOfProCategories = { "ID", "RCN", "Acronym", "Title", "Status",
            "Start", "End", "Total Cost", "EC Contribution", "TopicID", "CallID"};
        
        //Creates 2D Array to display data 
        Object[][] proData = new String[pro.size()][11];
        
        //Populates 2D array by data in List Type Project
        for (int r=0; r<pro.size(); r++) {
            proData[r][0]=pro.get(r).getProID().toString();
            proData[r][1]=pro.get(r).getProRCN().toString();
            proData[r][2]=pro.get(r).getProAcronym();
            proData[r][3]=pro.get(r).getProTitle();
            proData[r][4]=pro.get(r).getProStatus();
            proData[r][5]=pro.get(r).getProStartDate().toString();
            proData[r][6]=pro.get(r).getProEndDate().toString();
            proData[r][7]=pro.get(r).getProTotalCost().toString();
            proData[r][8]=pro.get(r).getProEcMaxContribution().toString();
            proData[r][9]=pro.get(r).getTopicID();
            proData[r][10]=pro.get(r).getCallID();   
        }
        
        //Displays jTable
        System.out.println("[JFrame] ... Displaying JTable, Project");
        DefaultTableModel proModel = (DefaultTableModel) ProjectTable.getModel();
        proModel.setDataVector(proData,nameOfProCategories); 
        
        
        
    //DISPLAY COMPOUND TABLE
        //Query to be executed
        String query = "SELECT p.proTitle AS Project, o.orgName AS Organisation, pa.role, pa.orgEcContribution "
                + "FROM Organisation o "
                + "JOIN Participation pa JOIN Project p  "
                + "ON o.orgID = pa.orgID "
                + "AND pa.proID = p.proID";
        
        //Creates list of Lists 
        List<List<String>> list = connect.readDatabase(query, true);
        
        //Creates Array of Columns names
        String [] nameOfCompoundCategories = new String [list.get(1).size()];
        //Populating Array Of Columns Names 
        for(int n = 0; n<list.get(0).size(); n++){
            nameOfCompoundCategories [n] = list.get(0).get(n);
        }
        
        Object[][] compoundData = new String[list.size()-1][list.get(1).size()];
        for(int l = 1; l<list.size(); l++){
            for(int r = 0; r<list.get(l).size(); r++){
                compoundData [l-1] [r] = list.get(l).get(r);
            }
            
        } 
            
        System.out.println("[JFrame] ... Displaying JTable, List of Columns");
        DefaultTableModel compoundModel = (DefaultTableModel) CompoundTable.getModel();
        compoundModel.setDataVector(compoundData,nameOfCompoundCategories); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        TestTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProjectTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        CompoundTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TestTable);

        jLabel3.setText("Organisation");

        ProjectTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(ProjectTable);

        jLabel4.setText("Project");

        CompoundTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(CompoundTable);

        jLabel5.setText("Compond table");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1044, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(398, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
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
            java.util.logging.Logger.getLogger(LukasPart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LukasPart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LukasPart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LukasPart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LukasPart().setVisible(true);
                
                
                
            }
        });
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CompoundTable;
    private javax.swing.JTable ProjectTable;
    private javax.swing.JTable TestTable;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
