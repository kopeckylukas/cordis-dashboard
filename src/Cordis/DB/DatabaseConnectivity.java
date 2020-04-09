package Cordis.DB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Cordis.Entities.Organisation;
import java.io.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.io.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
/**
 *
 * @author lukaskopecky
 */
public class DatabaseConnectivity {
    
    private Connection connection;
    
    public DatabaseConnectivity(){
        try {
            String dbLocation = "jdbc:sqlite:Cordis2020.sqlite3";
            connection = DriverManager.getConnection(dbLocation);        
        } catch (SQLException e) {
            System.err.println(e);
        } 
    }
    
    /**
     *
     * @param sql
     * @param col
     * @return
     */
    public String [][] GetCompoundTable1(String sql, Integer col){

        
       
        try (PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) {
            Integer count = 0;
            while (rs.next()) {
                count++;
            }
            String [][] resultObject = new String[count][col];
            count = 0;
            while (rs.next()){
                for(int i = 0; i<col; i++){
                    resultObject[count][i]= rs.getString(i);
                }        
                count++;        
            }
            //rs.close();
            return resultObject;
        } catch (SQLException e) {
            System.err.println(e);
            return null ;
        }
    }
    
    /**
     * 
     * @param sql string sql query 
     * @param col names of columns
     * @return 
     */
    public String [][] GetCompoundTable(String sql, String [] col) throws Exception {
         Connection con = DriverManager.getConnection("jdbc:sqlite:Cordis2020.sqlite3");
         if(con == null) throw new Exception();
         Statement st = con.createStatement();
         String [] [] toReturn ={};  
            System.out.println("Connected to Cordis");
            
            //String sql = "select orgName, orgID from Organisation where orgCountry = 'CZ'";
           //st.executeUpdate("");
           
            ResultSet s = st.executeQuery(sql);
            
           while(s.next()){
               String Name = s.getString("o.orgName");
               Integer orgID = s.getInt("pa.role");
               
               System.out.println("Name: " + Name+orgID);
           }
           s.close();
        
   
       
        return toReturn;
    }
    
    
    public static void ReadSQLi() throws Exception{
         Connection con = DriverManager.getConnection("jdbc:sqlite:Cordis2020.sqlite3");
         if(con == null) throw new Exception();
         Statement st = con.createStatement();
         
            System.out.println("Connected to Cordis");
            
            String sql = "select Organisation.orgName, Organisation.orgID, Participation.role from Organisation Join Participation ON Organisation.orgID = Participation.orgID where orgCountry = 'CZ'";
           //st.executeUpdate("");
           
            ResultSet s = st.executeQuery(sql);
            
           while(s.next()){
               String Name = s.getString("orgName");
               String Name1 = s.getString("role");
               Integer orgID = s.getInt("orgID");
               
               
               System.out.println("Name: " + Name1+orgID);
           }
           s.close();
           
           
           
           //StringBuilder sb = new StringBuilder(s);
    }

   
    public static void ReadSQLi1() throws Exception{
         Connection con = DriverManager.getConnection("jdbc:sqlite:Cordis2020.sqlite3");
         if(con == null) throw new Exception();
         Statement st = con.createStatement();
         
            System.out.println("Connected to Cordis");
            
            String sql = "SELECT Project.proTitle, Organisation.orgName, Participation.role FROM Organisation JOIN Participation JOIN Project ON Organisation.orgID = Participation.orgID AND Participation.proID = Project.proID";
           //st.executeUpdate("");
           
            ResultSet s = st.executeQuery(sql);
            
           while(s.next()){
               String Name = s.getString(1);
               String Name1 = s.getString(2);
               String orgID = s.getString(3);
               
               
               System.out.println("Name: "+ Name+ Name1+orgID);
           }
           s.close();
           
           
           
           //StringBuilder sb = new StringBuilder(s);
    }
    
    
    
}


