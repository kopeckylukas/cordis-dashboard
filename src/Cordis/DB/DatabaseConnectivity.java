package Cordis.DB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


/**
 * DatabaseConnectivity 
 * Query any local database
 * @author lukaskopecky
 */
public class DatabaseConnectivity {
    
    
    private Connection connection;
    
    /**
     * Default Constructor
     * Creates Connection to SQLite database Cordis2020
     */
    public DatabaseConnectivity(){
        try {
            
            String database = "jdbc:sqlite:Cordis2020.sqlite3";
            connection = DriverManager.getConnection(database);
            System.out.println("[DatabaseConnectivity] ... Database Corids2020.sqlite3: CONNECTED!");
        }catch (SQLException e) {
            
            System.err.println(e);
        } 
    }
    
    /**
     * Universal Constructor
     * Crates connection to any local database
     * @param dbLocation local host location of a SQLite database 
     */
    public DatabaseConnectivity(String database){
        try {
            connection = DriverManager.getConnection(database);
            System.out.println("[DatabaseConnectivity] ... Database "+database+": CONNECTED!");
        }catch (SQLException e) {
            
            System.err.println(e);
        } 
    }
    
    /**
     * Retrieves data from in form of Two Dimensional Array
     * @param <T> List, Type List of Strings
     * @param SQLi SQL query
     * @return Retrieved data form a database in form of 2D Array
     */
    public <T> List readDatabase(String SQLi){
        
        //Try: Connect database and execute query
        try (PreparedStatement st = connection.prepareStatement(SQLi);
            ResultSet resultRow = st.executeQuery()) {
            
            System.out.println("[readDatabase] ... Query executed");
            
            //Creates List of List to be returned
            List<List<String>> listOfRows = new ArrayList();
            
            //Retrieving the ResultSetMetaData object
            ResultSetMetaData rsmd = resultRow.getMetaData();
            
            //Get Number of Retrievd Colums
            int columnNumber = rsmd.getColumnCount();
            
            //Loops through Rows of Retrieved Data
            while(resultRow.next()){
                
                //Creates row list
                List<String> row = new ArrayList();
                
                //Adds columns into rows
                for(int i = 1; i <= columnNumber; i++){
                    
                    row.add(resultRow.getString(i));    
                }
                
                //Adds row into List
                listOfRows.add(row);
            }
            
            //Closes result set retireved from the database
            System.out.println("[readDatabase] ... Connection Closed");
            resultRow.close();
            
            //Returns retrieved data in form of 2D ArrayList
            return listOfRows; 
            
        } catch (SQLException e) {
            
            System.err.println(e);
            return null;    
        } 
    }
    
   
    /**
     * Retrieves data from in form of Two Dimensional Array 
     * First row is name of the columns
     * @param <T> List, Type List of Strings
     * @param SQLi SQL query
     * @return Retrieved data form a database in form of 2D Array
     */
    public <T> List readDatabaseWithNames(String SQLi){
        
        //Try: Connect database and execute query
        try (PreparedStatement st = connection.prepareStatement(SQLi);
            ResultSet resultRow = st.executeQuery()) {
            System.out.println("[readDatabaseWithNames] ... Query executed");
            
            //Creates List of List to be returned
            List<List<String>> listOfRows = new ArrayList();
            
            //Retrieving the ResultSetMetaData object
            ResultSetMetaData rsmd = resultRow.getMetaData();
            
            //Get Number of Retrievd Colums
            int columnNumber = rsmd.getColumnCount();
            
            //Creates First row carrying names of columns
            List<String> firstRow = new ArrayList();
            
            //Adds columns into rows
            for(int i = 1; i <= columnNumber; i++){
                    
                firstRow.add(rsmd.getColumnName(i));    
            }
                
            //Adds row into List
            listOfRows.add(firstRow);
            
            //Loops through Rows of Retrieved Data
            while(resultRow.next()){
                
                //Creates row list
                List<String> row = new ArrayList();
                
                //Adds columns into rows
                for(int i = 1; i <= columnNumber; i++){
                    
                    row.add(resultRow.getString(i));    
                }
                
                //Adds row into List
                listOfRows.add(row);
            }
            
            //Closes result set retireved from the database
            System.out.println("[readDatabaseWithNames] ... Connection Closed");
            resultRow.close();
            
            //Returns retrieved data in form of 2D ArrayList
            return listOfRows; 
            
        } catch (SQLException e) {
            
            System.err.println(e);
            return null;    
        } 
        
    }
    
    
}