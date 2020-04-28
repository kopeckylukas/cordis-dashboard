/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cordis.BG;

import Cordis.DB.DatabaseConnectivity;
import Cordis.Entities.User;

/**
 * Class which is responsible for user Logs
 * @author lukaskopecky
 */
public class UserLog {

    private  User localUser;
    DatabaseConnectivity databaseConnectivity;
    
    public UserLog(User localUser) {
        this.localUser = localUser;
        databaseConnectivity = new DatabaseConnectivity("jdbc:sqlite:Users.sqlite3");
    }
    
    /**
     * Log In user
     * @return returns true if SQL error Number ==0
     */
    public Boolean logIn(){ 
       
        long unixTime = System.currentTimeMillis();
        java.sql.Timestamp logTime = new java.sql.Timestamp(unixTime);
        Integer userID = localUser.getID();
        
        String SQL = "insert into ActivityLog ( logTime, logType, userID) "
                + "values('"+logTime+"', 'LOG IN', "+userID+");";
        
        Integer confirm = databaseConnectivity.updateDatabase(SQL);
        
        return confirm == 0;
    }
    
    /**
     * Log Out user
     * @return returns true if SQL error Number ==0
     */
    public Boolean logOut(){
        
        long unixTime = System.currentTimeMillis();
        java.sql.Timestamp logTime = new java.sql.Timestamp(unixTime);
        Integer userID = localUser.getID();
        
        String SQL = "insert into ActivityLog ( logTime, logType, userID) "
                + "values('"+logTime+"', 'LOG OUT', "+userID+");";
        
        Integer confirm = databaseConnectivity.updateDatabase(SQL);
        
        return confirm == 0;
    }
    
    /**
     * Universal method to register any user log
     * @param activity string name of activity
     * @return returns true if SQL error Number ==0
     */
    public Boolean logActivity(String activity){
        
        long unixTime = System.currentTimeMillis();
        java.sql.Timestamp logTime = new java.sql.Timestamp(unixTime);
        Integer userID = localUser.getID();
        
        String SQL = "insert into ActivityLog ( logTime, logType, userID) "
                + "values('"+logTime+"', '"+activity+"', "+userID+");";
        
        Integer confirm = databaseConnectivity.updateDatabase(SQL);
        
        return confirm == 0;
    }
    
}
