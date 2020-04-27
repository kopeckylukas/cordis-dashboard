/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cordis.UI;

import Cordis.BG.UserLog;
import Cordis.DB.DatabaseConnectivity;
import Cordis.DB.GetEntities;
import Cordis.Entities.Organisation;
import Cordis.Entities.User;
import Cordis.UI.LogPage;
import Cordis.UI.ProjectDetails;
import Cordis.UI.UserActivity;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author lukaskopecky
 */
public final class Dashboard extends javax.swing.JFrame {
    
    
    
    HashMap<Integer, String> pie_chart_data = null;
    LinkedHashMap<Integer, String> line_chart_data = null;
    HashMap<Integer, String> bar_chart_data_for_DE = null;
    HashMap<Integer, String> bar_chart_data_for_FR = null;
    HashMap<Integer, String> bar_chart_data_for_IT = null;
    HashMap<Integer, String> bar_chart_data_for_UK = null;
    HashMap<Integer, String> bar_chart_data_for_ES = null;
    List<Organisation> orgs = null;

    LinkedHashMap<Integer, String> h = null;

    //Creating object of class GetEntities
    GetEntities projectDB = new GetEntities();
    
    
    User localUser;
    private static DatabaseConnectivity connect = new DatabaseConnectivity();

    /**
     * Creates new form UserActivity
     */
    public Dashboard() {
        initComponents();
        this.localUser = null;
        
        totalCost();
        ecTotal();
        totalOrg();
        psDefault();
        
        
        //view default table input
        //defaultTable();
        
        graph_panel.setLayout(new FlowLayout());
        graph_panel2.setLayout(new FlowLayout());
        setLocationRelativeTo(this);
        setResizable(false);
        //All Organiztions
        LinkedHashMap<List<Organisation>, LinkedHashMap<Integer, String>> hm = projectDB.search(null);
        for (Map.Entry<List<Organisation>, LinkedHashMap<Integer, String>> entry : hm.entrySet()) {
            orgs = entry.getKey();
            h = entry.getValue();
        }
        //Pir Chart Data
        pie_chart_data = projectDB.getOrganizationsCountByCountries();
        //Line Chart Data
        line_chart_data = projectDB.getProjectsByYear();
        //Bar Chart Data
        bar_chart_data_for_DE = projectDB.getTop5OrganizationsByActivity("DE");
        bar_chart_data_for_FR = projectDB.getTop5OrganizationsByActivity("FR");
        bar_chart_data_for_IT = projectDB.getTop5OrganizationsByActivity("IT");
        bar_chart_data_for_UK = projectDB.getTop5OrganizationsByActivity("UK");
        bar_chart_data_for_ES = projectDB.getTop5OrganizationsByActivity("ES");
        //dataset for pie chart
        DefaultPieDataset dataset = new DefaultPieDataset();

        for (HashMap.Entry<Integer, String> entry : pie_chart_data.entrySet()) {
            //Adding data from hashmap to dataset for chart
            dataset.setValue(getCountryName(entry.getValue()), entry.getKey());
        }

        //Creating the Pie Chart
        JFreeChart chart = ChartFactory.createPieChart3D("Proportion Of Organisations Per Selected Countries", dataset, true, true, false);

        //Creating Panel for chart
        ChartPanel panel = new ChartPanel(chart);

        //Switching on the mouse events for the chart panel
        panel.setDomainZoomable(true);

        graph_panel.add(panel, BorderLayout.CENTER);
        graph_panel.add(panel);
        

        //dataset for bar chart
        DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();

        //Adding data from hashmap to dataset for chart for top 5 Countries
        for (HashMap.Entry<Integer, String> entry : bar_chart_data_for_DE.entrySet()) {
            dataset2.addValue(entry.getKey(), getCountryName("DE"), entry.getValue());
        }
        for (HashMap.Entry<Integer, String> entry : bar_chart_data_for_FR.entrySet()) {
            dataset2.addValue(entry.getKey(), getCountryName("FR"), entry.getValue());
        }
        for (HashMap.Entry<Integer, String> entry : bar_chart_data_for_IT.entrySet()) {
            dataset2.addValue(entry.getKey(), getCountryName("IT"), entry.getValue());
        }
        for (HashMap.Entry<Integer, String> entry : bar_chart_data_for_UK.entrySet()) {
            dataset2.addValue(entry.getKey(), getCountryName("UK"), entry.getValue());
        }
        for (HashMap.Entry<Integer, String> entry : bar_chart_data_for_ES.entrySet()) {
            dataset2.addValue(entry.getKey(), getCountryName("ES"), entry.getValue());
        }
        //Creating the Bar Chart
        JFreeChart chart2 = ChartFactory.createBarChart3D(
                "Activity Types Of Organisations Within Top-5 Countries",
                "Types Of Activities",
                "Range Of Activities",
                dataset2,
                PlotOrientation.VERTICAL,
                true, true, false);
        //Creating Panel for chart
        ChartPanel panel2 = new ChartPanel(chart2);

        //Switching on the mouse events for the chart panel
        panel2.setDomainZoomable(true);

       graph_panel2.add(panel2, BorderLayout.CENTER);
       graph_panel2.add(panel2);
        
    }
    
    
    
    /**
     * Constructor in use if accessed form program, displays data
     * @param localUser user displaying the page 
     */
    Dashboard(User localUser) {
        initComponents();
        this.localUser = localUser;
        usernameField.setText(localUser.getName()+" "+localUser.getSurname());
        
        
        //view defautl table input
        //defaultTable();
        
        //admin Button
        if(localUser.getType().equals("U")){
            administratorDetailLable.setVisible(false);
        }
        if(localUser.getType().equals("A")){
            administratorDetailLable.setVisible(true);
        }
        
        UserLog log = new UserLog(localUser);
        log.logActivity("Overview");
       
        totalCost();
        ecTotal();
        totalOrg();
        psDefault();
        
        
        //view default table input
        //defaultTable();
        
        graph_panel.setLayout(new FlowLayout());
        graph_panel2.setLayout(new FlowLayout());
        setLocationRelativeTo(this);
        setResizable(false);
        //All Organiztions
        LinkedHashMap<List<Organisation>, LinkedHashMap<Integer, String>> hm = projectDB.search(null);
        for (Map.Entry<List<Organisation>, LinkedHashMap<Integer, String>> entry : hm.entrySet()) {
            orgs = entry.getKey();
            h = entry.getValue();
        }
        //Pir Chart Data
        pie_chart_data = projectDB.getOrganizationsCountByCountries();
        //Line Chart Data
        line_chart_data = projectDB.getProjectsByYear();
        //Bar Chart Data
        bar_chart_data_for_DE = projectDB.getTop5OrganizationsByActivity("DE");
        bar_chart_data_for_FR = projectDB.getTop5OrganizationsByActivity("FR");
        bar_chart_data_for_IT = projectDB.getTop5OrganizationsByActivity("IT");
        bar_chart_data_for_UK = projectDB.getTop5OrganizationsByActivity("UK");
        bar_chart_data_for_ES = projectDB.getTop5OrganizationsByActivity("ES");
        //dataset for pie chart
        DefaultPieDataset dataset = new DefaultPieDataset();

        for (HashMap.Entry<Integer, String> entry : pie_chart_data.entrySet()) {
            //Adding data from hashmap to dataset for chart
            dataset.setValue(getCountryName(entry.getValue()), entry.getKey());
        }

        //Creating the Pie Chart
        JFreeChart chart = ChartFactory.createPieChart3D("Proportion Of Organisations Per Selected Countries", dataset, true, true, false);

        //Creating Panel for chart
        ChartPanel panel = new ChartPanel(chart);

        //Switching on the mouse events for the chart panel
        panel.setDomainZoomable(true);

        graph_panel.add(panel, BorderLayout.CENTER);
        graph_panel.add(panel);
        

        //dataset for bar chart
        DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();

        //Adding data from hashmap to dataset for chart for top 5 Countries
        for (HashMap.Entry<Integer, String> entry : bar_chart_data_for_DE.entrySet()) {
            dataset2.addValue(entry.getKey(), getCountryName("DE"), entry.getValue());
        }
        for (HashMap.Entry<Integer, String> entry : bar_chart_data_for_FR.entrySet()) {
            dataset2.addValue(entry.getKey(), getCountryName("FR"), entry.getValue());
        }
        for (HashMap.Entry<Integer, String> entry : bar_chart_data_for_IT.entrySet()) {
            dataset2.addValue(entry.getKey(), getCountryName("IT"), entry.getValue());
        }
        for (HashMap.Entry<Integer, String> entry : bar_chart_data_for_UK.entrySet()) {
            dataset2.addValue(entry.getKey(), getCountryName("UK"), entry.getValue());
        }
        for (HashMap.Entry<Integer, String> entry : bar_chart_data_for_ES.entrySet()) {
            dataset2.addValue(entry.getKey(), getCountryName("ES"), entry.getValue());
        }
        //Creating the Bar Chart
        JFreeChart chart2 = ChartFactory.createBarChart3D(
                "Activity Types Of Organisations Within Top-5 Countries",
                "Types Of Activities",
                "Range Of Activities",
                dataset2,
                PlotOrientation.VERTICAL,
                true, true, false);
        //Creating Panel for chart
        ChartPanel panel2 = new ChartPanel(chart2);

        //Switching on the mouse events for the chart panel
        panel2.setDomainZoomable(true);

       graph_panel2.add(panel2, BorderLayout.CENTER);
       graph_panel2.add(panel2);
        
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
        userActivitySign = new javax.swing.JLabel();
        overviewLabel = new javax.swing.JLabel();
        projectDetailsLabale = new javax.swing.JLabel();
        logOutSign = new javax.swing.JLabel();
        administratorDetailLable = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        footerLab = new javax.swing.JLabel();
        fotterLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JLabel();
        graph_panel3 = new javax.swing.JPanel();
        ecTotal = new javax.swing.JLabel();
        footerLab3 = new javax.swing.JLabel();
        ecContribution = new javax.swing.JComboBox<String>();
        graphDisplay = new javax.swing.JComboBox<String>();
        graph_panel5 = new javax.swing.JPanel();
        totalCostLabel = new javax.swing.JLabel();
        footerLab4 = new javax.swing.JLabel();
        totalCost = new javax.swing.JComboBox<String>();
        graph_panel4 = new javax.swing.JPanel();
        ecTotalO = new javax.swing.JLabel();
        footerLab5 = new javax.swing.JLabel();
        ecContributionO = new javax.swing.JComboBox<String>();
        graph_panel6 = new javax.swing.JPanel();
        fsLabel = new javax.swing.JLabel();
        footerLab6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        fsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        graph_panel = new javax.swing.JPanel();
        graph_panel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMinimumSize(new java.awt.Dimension(1680, 990));
        jPanel1.setPreferredSize(new java.awt.Dimension(1680, 900));

        adminSign.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        adminSign.setForeground(new java.awt.Color(255, 153, 102));
        adminSign.setText("CORDIS ");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        userActivitySign.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        userActivitySign.setForeground(new java.awt.Color(255, 153, 102));
        userActivitySign.setText("DASHBOARD - OVERVIEW");

        overviewLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        overviewLabel.setForeground(new java.awt.Color(255, 153, 102));
        overviewLabel.setText("OVERVIEW");

        projectDetailsLabale.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        projectDetailsLabale.setForeground(new java.awt.Color(204, 204, 204));
        projectDetailsLabale.setText("PROJECT DETAILS");
        projectDetailsLabale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                projectDetailsLabaleMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                projectDetailsLabaleMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                projectDetailsLabaleMouseEntered(evt);
            }
        });

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

        administratorDetailLable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        administratorDetailLable.setForeground(new java.awt.Color(204, 204, 204));
        administratorDetailLable.setText("ADMINISTRATOR PAGE");
        administratorDetailLable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                administratorDetailLableMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                administratorDetailLableMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                administratorDetailLableMouseEntered(evt);
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

        graph_panel3.setBackground(new java.awt.Color(59, 79, 87));

        ecTotal.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        ecTotal.setForeground(new java.awt.Color(204, 204, 204));
        ecTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ecTotal.setText(" Contribution Total");

        footerLab3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        footerLab3.setForeground(new java.awt.Color(255, 153, 102));
        footerLab3.setText("European Commission Contribution on Projects");

        ecContribution.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        ecContribution.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Total", "Minimum", "Maximum", "Average" }));
        ecContribution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecContributionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout graph_panel3Layout = new javax.swing.GroupLayout(graph_panel3);
        graph_panel3.setLayout(graph_panel3Layout);
        graph_panel3Layout.setHorizontalGroup(
            graph_panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graph_panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(graph_panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(graph_panel3Layout.createSequentialGroup()
                        .addComponent(ecTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(ecContribution, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(graph_panel3Layout.createSequentialGroup()
                        .addComponent(footerLab3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        graph_panel3Layout.setVerticalGroup(
            graph_panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, graph_panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(footerLab3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(graph_panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ecContribution, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ecTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        graphDisplay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Proportion Of Organisations Per Selected Countries", "Running Projects Per Year" }));
        graphDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphDisplayActionPerformed(evt);
            }
        });

        graph_panel5.setBackground(new java.awt.Color(59, 79, 87));

        totalCostLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        totalCostLabel.setForeground(new java.awt.Color(204, 204, 204));
        totalCostLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalCostLabel.setText(" Contribution Total");

        footerLab4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        footerLab4.setForeground(new java.awt.Color(255, 153, 102));
        footerLab4.setText("Total cost of Projects");

        totalCost.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        totalCost.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Total", "Minimum", "Maximum", "Average" }));
        totalCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalCostActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout graph_panel5Layout = new javax.swing.GroupLayout(graph_panel5);
        graph_panel5.setLayout(graph_panel5Layout);
        graph_panel5Layout.setHorizontalGroup(
            graph_panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graph_panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(graph_panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(graph_panel5Layout.createSequentialGroup()
                        .addComponent(totalCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(graph_panel5Layout.createSequentialGroup()
                        .addComponent(footerLab4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        graph_panel5Layout.setVerticalGroup(
            graph_panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graph_panel5Layout.createSequentialGroup()
                .addComponent(footerLab4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(graph_panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        graph_panel4.setBackground(new java.awt.Color(59, 79, 87));

        ecTotalO.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        ecTotalO.setForeground(new java.awt.Color(204, 204, 204));
        ecTotalO.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ecTotalO.setText(" Contribution Total");

        footerLab5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        footerLab5.setForeground(new java.awt.Color(255, 153, 102));
        footerLab5.setText("European Commision Contribution on Organisations");

        ecContributionO.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        ecContributionO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Total", "Minimum", "Maximum", "Average" }));
        ecContributionO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecContributionOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout graph_panel4Layout = new javax.swing.GroupLayout(graph_panel4);
        graph_panel4.setLayout(graph_panel4Layout);
        graph_panel4Layout.setHorizontalGroup(
            graph_panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graph_panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(graph_panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(graph_panel4Layout.createSequentialGroup()
                        .addComponent(ecTotalO, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ecContributionO, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(graph_panel4Layout.createSequentialGroup()
                        .addComponent(footerLab5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        graph_panel4Layout.setVerticalGroup(
            graph_panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, graph_panel4Layout.createSequentialGroup()
                .addComponent(footerLab5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(graph_panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ecTotalO, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ecContributionO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        graph_panel6.setBackground(new java.awt.Color(59, 79, 87));

        fsLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        fsLabel.setForeground(new java.awt.Color(204, 204, 204));
        fsLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fsLabel.setText("Click on a item in the table ");

        footerLab6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        footerLab6.setForeground(new java.awt.Color(255, 153, 102));
        footerLab6.setText("Number of Projects by Funding Schemes");

        javax.swing.GroupLayout graph_panel6Layout = new javax.swing.GroupLayout(graph_panel6);
        graph_panel6.setLayout(graph_panel6Layout);
        graph_panel6Layout.setHorizontalGroup(
            graph_panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graph_panel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(footerLab6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, graph_panel6Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(fsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        graph_panel6Layout.setVerticalGroup(
            graph_panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graph_panel6Layout.createSequentialGroup()
                .addComponent(footerLab6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fsTable.setBackground(new java.awt.Color(59, 79, 87));
        fsTable.setForeground(new java.awt.Color(204, 204, 204));
        fsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        fsTable.setGridColor(new java.awt.Color(59, 79, 87));
        fsTable.setSelectionBackground(new java.awt.Color(81, 81, 81));
        fsTable.setSelectionForeground(new java.awt.Color(255, 153, 102));
        fsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fsTableMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(fsTable);

        jPanel2.setBackground(new java.awt.Color(59, 79, 87));

        javax.swing.GroupLayout graph_panelLayout = new javax.swing.GroupLayout(graph_panel);
        graph_panel.setLayout(graph_panelLayout);
        graph_panelLayout.setHorizontalGroup(
            graph_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );
        graph_panelLayout.setVerticalGroup(
            graph_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout graph_panel2Layout = new javax.swing.GroupLayout(graph_panel2);
        graph_panel2.setLayout(graph_panel2Layout);
        graph_panel2Layout.setHorizontalGroup(
            graph_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
        );
        graph_panel2Layout.setVerticalGroup(
            graph_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(graph_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(graph_panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(graph_panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(graph_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminSign)
                .addGap(489, 489, 489)
                .addComponent(userActivitySign))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(285, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1581, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(761, 761, 761)
                .addComponent(footerLab))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(459, 459, 459)
                .addComponent(fotterLabel))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(overviewLabel)
                    .addGap(18, 18, 18)
                    .addComponent(projectDetailsLabale)
                    .addGap(18, 18, 18)
                    .addComponent(administratorDetailLable)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(logOutSign))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(graph_panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(graph_panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(graph_panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(graph_panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(graphDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adminSign)
                            .addComponent(userActivitySign))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(overviewLabel)
                    .addComponent(projectDetailsLabale)
                    .addComponent(administratorDetailLable)
                    .addComponent(logOutSign)
                    .addComponent(usernameField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(graphDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(graph_panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(graph_panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(graph_panel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(graph_panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(footerLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fotterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 102));
        userActivitySign.setBorder(label_border);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/DashboardLogom.png")));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 925, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void administratorDetailLableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_administratorDetailLableMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 153, 102));
        administratorDetailLable.setBorder(label_border);
    }//GEN-LAST:event_administratorDetailLableMouseEntered

    private void administratorDetailLableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_administratorDetailLableMouseExited
        // TODO add your handling code here:
        administratorDetailLable.setBorder(null);
    }//GEN-LAST:event_administratorDetailLableMouseExited

    private void administratorDetailLableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_administratorDetailLableMousePressed
        // TODO add your handling code here:

        //Activity log

        UserActivity act = new UserActivity(localUser);
        act.setVisible(true);
        act.pack();
        act.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_administratorDetailLableMousePressed

    private void logOutSignMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutSignMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 153, 102));
        logOutSign.setBorder(label_border);
    }//GEN-LAST:event_logOutSignMouseEntered

    private void logOutSignMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutSignMouseExited
        // TODO add your handling code here:
        logOutSign.setBorder(null);
    }//GEN-LAST:event_logOutSignMouseExited

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

    private void projectDetailsLabaleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectDetailsLabaleMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 153, 102));
        projectDetailsLabale.setBorder(label_border);
    }//GEN-LAST:event_projectDetailsLabaleMouseEntered

    private void projectDetailsLabaleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectDetailsLabaleMouseExited
        // TODO add your handling code here:
        projectDetailsLabale.setBorder(null);
    }//GEN-LAST:event_projectDetailsLabaleMouseExited

    private void projectDetailsLabaleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectDetailsLabaleMousePressed
        // TODO add your handling code here:

        //Activity log

        ProjectDetails detail = new ProjectDetails(localUser);
        detail.setVisible(true);
        detail.pack();
        detail.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();

    }//GEN-LAST:event_projectDetailsLabaleMousePressed

    private void graphDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphDisplayActionPerformed
        String choice = (String) graphDisplay.getSelectedItem();
        
        if(choice.equals("Proportion Of Organisations Per Selected Countries")){
            
            // TODO add your handling code here:
        graph_panel.removeAll();
        graph_panel.repaint();
        graph_panel.revalidate();

        //dataset for pie chart
        DefaultPieDataset dataset = new DefaultPieDataset();

        for (HashMap.Entry<Integer, String> entry : pie_chart_data.entrySet()) {
            //Adding data from hashmap to dataset for chart
            dataset.setValue(getCountryName(entry.getValue()), entry.getKey());
        }

        //Creating the Pie Chart
        JFreeChart chart = ChartFactory.createPieChart3D("Proportion Of Organisations Per Countries", dataset, true, true, false);

        //Creating Panel for chart
        ChartPanel panel = new ChartPanel(chart);

        //Switching on the mouse events for the chart panel
        panel.setDomainZoomable(true);

        graph_panel.add(panel, BorderLayout.CENTER);
        graph_panel.add(panel);
        graph_panel.repaint();
        graph_panel.revalidate();
            
        }
        
         if(choice.equals("Running Projects Per Year")){
             
              // TODO add your handling code here:
        graph_panel.removeAll();
        graph_panel.repaint();
        graph_panel.revalidate();

        //dataset for line chart
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (HashMap.Entry<Integer, String> entry : line_chart_data.entrySet()) {
            if (entry.getValue() != null) {
                //Adding data from linkedhashmap to dataset for chart
                dataset.addValue(entry.getKey(), "Projects", entry.getValue());
            }
        }

        //Creating the Line Chart
        JFreeChart chart = ChartFactory.createLineChart(
                "Running Projects Per Year",
                "Year", "Number of Projects ",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        //Creating Panel for chart
        ChartPanel panel = new ChartPanel(chart);

        //Switching on the mouse events for the chart panelF
        panel.setDomainZoomable(true);
        graph_panel.add(panel);
        graph_panel.repaint();
        graph_panel.revalidate();
             
         }
        
    }//GEN-LAST:event_graphDisplayActionPerformed

    private void ecContributionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecContributionActionPerformed
        String choice = (String) ecContribution.getSelectedItem();
        String query;
        
        switch (choice){
            case "Total":
                query = "SELECT SUM (proEcMaxContribution) FROM Project;";
                break;
            case "Minimum":
                query = "SELECT MIN (proEcMaxContribution) FROM Project;";
                break;
            case "Maximum":
                query = "SELECT MAX (proEcMaxContribution) FROM Project;";
                break;
            case "Average":
                query = "SELECT AVG (proEcMaxContribution) FROM Project;";
                break;
            default:
                 query = "SELECT SUM (proEcMaxContribution) FROM Project;";   
                    
        }
        
        
        
        List<List<String>> list = connect.readDatabase(query, false);
        
        
        
        String message;
        if ("".equals(list.get(0).get(0))){
            message = "N/A";
        }else{
            message = "€ "+ list.get(0).get(0);
        }
       
        ecTotal.setText(message);
    }//GEN-LAST:event_ecContributionActionPerformed

    private void totalCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalCostActionPerformed
         String choice = (String) totalCost.getSelectedItem();
        String query;
        
        switch (choice){
            case "Total":
                query = "SELECT SUM (proTotalCost) FROM Project;";
                break;
            case "Minimum":
                query = "SELECT MIN (proTotalCost) FROM Project;";
                break;
            case "Maximum":
                query = "SELECT MAX (proTotalCost) FROM Project;";
                break;
            case "Average":
                query = "SELECT AVG (proTotalCost) FROM Project;";
                break;
            default:
                 query = "SELECT SUM (proTotalCost) FROM Project;";   
                    
        }
        
        
        
        List<List<String>> list = connect.readDatabase(query, false);
        
        
        
        String message;
        if ("".equals(list.get(0).get(0))){
            message = "N/A";
        }else{
            message = "€ "+ list.get(0).get(0);
        }
        
        totalCostLabel.setText(message);
    }//GEN-LAST:event_totalCostActionPerformed

    private void ecContributionOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecContributionOActionPerformed
        String choice = (String) ecContributionO.getSelectedItem();
        String query;
        
        switch (choice){
            case "Total":
                query = "SELECT SUM (orgEcContribution) FROM Participation;";
                break;
            case "Minimum":
                query = "SELECT MIN (orgEcContribution) FROM Participation;";
                break;
            case "Maximum":
                query = "SELECT MAX (orgEcContribution) FROM Participation;";
                break;
            case "Average":
                query = "SELECT AVG (orgEcContribution) FROM Participation;";
                break;
            default:
                 query = "SELECT SUM (orgEcContribution) FROM Participation;";   
                    
        }
        
        
        
        List<List<String>> list = connect.readDatabase(query, false);
        
        String message;
        if ("".equals(list.get(0).get(0))){
            message = "N/A";
        }else{
            message = "€ "+ list.get(0).get(0);
        }
        
        ecTotalO.setText(message);
    }//GEN-LAST:event_ecContributionOActionPerformed

    private void fsTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fsTableMousePressed
        Integer row = fsTable.getSelectedRow();
        
        //Selecting value
        String fCode = (String) fsTable.getValueAt(row, 0);
        
        
        String query = "SELECT COUNT(proID) FROM Project WHERE fCode LIKE '"+fCode+"';";
        
        List<List<String>> list = connect.readDatabase(query, false);
        
       
             
     
        
        fsLabel.setText(list.get(0).get(0));
    }//GEN-LAST:event_fsTableMousePressed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Dashboard().setVisible(true);
            }
        });
    }
    
    public void psDefault(){
        String query = "SELECT fCode as \"Code\", fTitle as \"Funding Scheme\"  FROM Funding_Scheme;";
        
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
        DefaultTableModel compoundModel = (DefaultTableModel) fsTable.getModel();
        compoundModel.setDataVector(compoundData,nameOfCompoundCategories); 
    }
    
    public void totalOrg(){
        
        String query = "SELECT SUM (orgEcContribution) FROM Participation;";
        List<List<String>> list = connect.readDatabase(query, false);
        
        String message = "€ "+ list.get(0).get(0);
        ecTotalO.setText(message);
    }
    
     public void totalCost(){
        
        String query = "SELECT SUM (proTotalCost) FROM Project;";
        List<List<String>> list = connect.readDatabase(query, false);
        
        String message = "€ "+ list.get(0).get(0);
        totalCostLabel.setText(message);
    }
    
    
    
    public void ecTotal(){
        
        String query = "SELECT SUM (proEcMaxContribution) FROM Project;";
        List<List<String>> list = connect.readDatabase(query, false);
        
        String message = "€ "+ list.get(0).get(0);
        ecTotal.setText(message);
    }
    

    /**
     * Returns full name of a country based on (ISO 3166)
     * Created by Md Reyad
     * @param s ISO 3166
     * @return Full name of a country
     */
    public String getCountryName(String s) {
        String cm = "none";
        switch (s) {
            case "DE":
                cm = "Germany";
                break;
            case "ES":
                cm = "Spain";
                break;
            case "FR":
                cm = "France";
                break;
            case "IT":
                cm = "Italy";
                break;
            case "UK":
                cm = "United Kingdoms";
                break;
            case "NL":
                cm = "Netherland";
                break;
            case "BE":
                cm = "Belgium";
                break;
            case "EL":
                cm = "Greece";
                break;
            case "AT":
                cm = "Austria";
                break;
            case "PL":
                cm = "Poland";
                break;
            case "SE":
                cm = "Sweden";
                break;
            case "CH":
                cm = "Switzerland";
                break;
            case "NO":
                cm = "Norway";
                break;
            case "DK":
                cm = "Denmark";
                break;
            case "IE":
                cm = "Ireland";
                break;
            default:
                cm = "no-matached";
        }
        return cm;
    }
    
   
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminSign;
    private javax.swing.JLabel administratorDetailLable;
    private javax.swing.JComboBox<String> ecContribution;
    private javax.swing.JComboBox<String> ecContributionO;
    private javax.swing.JLabel ecTotal;
    private javax.swing.JLabel ecTotalO;
    private javax.swing.JLabel footerLab;
    private javax.swing.JLabel footerLab3;
    private javax.swing.JLabel footerLab4;
    private javax.swing.JLabel footerLab5;
    private javax.swing.JLabel footerLab6;
    private javax.swing.JLabel fotterLabel;
    private javax.swing.JLabel fsLabel;
    private javax.swing.JTable fsTable;
    private javax.swing.JComboBox<String> graphDisplay;
    private javax.swing.JPanel graph_panel;
    private javax.swing.JPanel graph_panel2;
    private javax.swing.JPanel graph_panel3;
    private javax.swing.JPanel graph_panel4;
    private javax.swing.JPanel graph_panel5;
    private javax.swing.JPanel graph_panel6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logOutSign;
    private javax.swing.JLabel overviewLabel;
    private javax.swing.JLabel projectDetailsLabale;
    private javax.swing.JComboBox<String> totalCost;
    private javax.swing.JLabel totalCostLabel;
    private javax.swing.JLabel userActivitySign;
    private javax.swing.JLabel usernameField;
    // End of variables declaration//GEN-END:variables
}
