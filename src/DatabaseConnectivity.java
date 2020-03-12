/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.io.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
/**
 *
 * @author lukaskopecky
 */
public class DatabaseConnectivity {
    
    
    public DatabaseConnectivity (){
        //Constructor
        
    }
    
    public static void hello(){
        System.out.println("hello");
    }
    
    public static void ReadSQLi() throws Exception{
         Connection con = DriverManager.getConnection("jdbc:sqlite:Cordis2020.sqlite3");
         if(con == null) throw new Exception();
         Statement st = con.createStatement();
         
            System.out.println("connected gl");
            
            String sql = "select orgName from Organisation where orgID = 999974359";
           //st.executeUpdate("");
           
            ResultSet s = st.executeQuery(sql);
           
           //StringBuilder sb = new StringBuilder(s);
    }
    
    
}


