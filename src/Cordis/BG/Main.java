package Cordis.BG;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Cordis.DB.DatabaseConnectivity;
import Cordis.Entities.Organisation;
import Cordis.DB.getDataByObject;
import Cordis.Entities.Project;
import Cordis.UI.LukasPart;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.Date;

import java.io.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import org.sqlite.util.StringUtils;
/**
/**
 *
 * @author lukaskopecky
 */
public class Main{
    
    private static getDataByObject projectDB = new getDataByObject();
    private static DatabaseConnectivity connect = new DatabaseConnectivity();
   
    public static void main (String[] args) throws Exception{
       Main exe = new Main();
           
       exe.execute();
       
    }
    
    public void execute() throws Exception{
       
        
        System.out.println("[Execute] ... Start");
        
        /* TESTING FUNCTIONS */
        
        databaseConnectivityTest_SELECT();
       
        //displayAllOrganisations();
        

     
        //displayAllProjects();
//        LukasPart frame = new LukasPart();
//        frame.setVisible(true);

        System.out.println("[Execute] ... END");
    }
    
    /**
     * Select Query Test
     */
    public static void databaseConnectivityTest_SELECT(){
        String query = "SELECT p.proTitle, o.orgName, pa.role FROM Organisation o JOIN Participation pa JOIN Project p  ON o.orgID = pa.orgID AND pa.proID = p.proID";
        
        List<List<String>> list = connect.readDatabase(query);
        
        
        
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
        System.out.println("Organisation List");
        List<Organisation> org = projectDB.getOrganisation();
        if (org == null) {
            System.out.println("Error! Unable to get Organisation.\n");
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
