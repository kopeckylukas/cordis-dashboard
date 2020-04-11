package Cordis.BG;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Cordis.DB.DatabaseConnectivity;
import Cordis.DB.GetEntities;
import Cordis.Entities.Organisation;
import Cordis.Entities.Project;
import java.util.List;

/**
 *
 * @author lukaskopecky
 */
public class ConsoleTest implements Runnable {
    
    /**
     * Run Thread
     */
    @Override
    public void run() {
        System.out.println("[ConsoleTest] ... Test is running");
        
        //updateUser();
        databaseConnectivityTest_SELECT();
        //displayAllProjects();
        //displayAllOrganisations();
        
        System.out.println("[ConsoleTest] ... Finished");
    }
    
    public static void updateUser(){
        System.out.println("[updateUser] ... run query");
        
        DatabaseConnectivity databaseConnectivity = new DatabaseConnectivity("jdbc:sqlite:Users.sqlite3");
        
        String name = "Bruce";
        String surname = "Wayne";
        String userEmail = "bat_man.com";
        String userPassword = "qwerty";
        
        String SQL = "insert into Users (userForename, userSurname, useEmail, userPassword) "
                    + "values('"+name+"' ,'"+surname+"' ,'"+userEmail+"' ,'"+userPassword+"' );";
        
        Boolean confirm = databaseConnectivity.updateDatabase(SQL);
        
        if(confirm == true)
            System.out.println("[updateUser] ... updated");
        else
            System.err.println("[updateUser] ... SQLiError");
        
        
        
    }
    
    /**
     * Select Query Test
     */
    public static void databaseConnectivityTest_SELECT(){
        
        DatabaseConnectivity databaseConnectivity = new DatabaseConnectivity();
        
        String query = "SELECT p.proTitle, o.orgName, pa.role, pa.orgEcContribution "
                + "FROM Organisation o "
                + "JOIN Participation pa "
                + "JOIN Project p  "
                + "ON o.orgID = pa.orgID "
                + "AND pa.proID = p.proID";
        
        List<List<String>> list = databaseConnectivity.readDatabase(query, true);
        
        
        
        for (List<String> array : list) {
            
            for (String i : array)  {
                System.out.println(i);
            }
            
            System.out.println("");
        }
        
    }
    
    
    
    /**
    * Retrieve all organisations and saves them into List type Organisation
    */
    public static void displayAllOrganisations() {
        
        GetEntities projectDB = new GetEntities();
        
        System.out.println("Organisation List");
        List<Organisation> org = projectDB.getOrganisation();
        if (org == null) {
            System.err.println("Error! Unable to get Organisation.\n");
        } else {
            System.out.println(org.size());
            Organisation o;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < org.size(); i++) {
                   o = org.get(i);
                   System.out.println("Org "+ i);
                   System.out.println("Org Identifier " + o.getOrgID());
                   System.out.println("OrgName: " + o.getOrgName());
                   System.out.println("ShortName: " + o.getOrgShortName());
                   System.out.println("Country: " + o.getOrgCountry());
                   System.out.println("\n");
                   
            }
            System.out.println(sb.toString());
        }
    }
    
    
    
    /**
     * Retrieve all Projects and saves them into List type Project
     */
    public static void displayAllProjects() {
        
        GetEntities projectDB = new GetEntities();
        
        System.out.println("Project List");
        List<Project> pro = projectDB.getProject();
        if (pro == null) {
            System.err.println("Error! Unable to get project.\n");
        } else {
            System.out.println(pro.size());
            Project p;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < pro.size(); i++) {
                   p = pro.get(i);
                   System.out.println("Pro "+ i);
                   System.out.println("Pro ID "+ p.getProID());
                   System.out.println("Pro RCN "+ p.getProRCN());
                   System.out.println("Pro Acronym "+ p.getProAcronym());
                   System.out.println("Pro Title "+ p.getProTitle());
                   System.out.println("Pro Framework "+ p.getProFramework()); 
                   System.out.println("Pro Start Date "+ p.getProStartDate());
                   System.out.println("Pro End Date "+ p.getProEndDate());
                   System.out.println("Pro URL "+ p.getProURL());
                   System.out.println("Pro Objectives "+ p.getProObjectives());
                   System.out.println("Pro Total Cost "+ p.getProTotalCost());
                   System.out.println("Pro EcCnontribution "+ p.getProEcMaxContribution());
                   System.out.println("Pro Subject "+ p.getProSubject());
                   System.out.println("Pro Status "+ p.getProStatus());
                   System.out.println("\n");
                   
            }
            System.out.println(sb.toString());
        }
    }

    
}
