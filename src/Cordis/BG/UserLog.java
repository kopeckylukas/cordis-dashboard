/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cordis.BG;

import Cordis.DB.DatabaseConnectivity;
import Cordis.Entities.User;

/**
 *
 * @author lukaskopecky
 */
public class UserLog {

    private User localUser;
    DatabaseConnectivity databaseConnectivity;
    
    public UserLog(User localUser) {
        this.localUser = localUser;
        databaseConnectivity = new DatabaseConnectivity("jdbc:sqlite:Users.sqlite3");
    }
    
    
    public Boolean logIn(){ 
       
        long unixTime = System.currentTimeMillis();
        java.sql.Timestamp logTime = new java.sql.Timestamp(unixTime);
        Integer userID = localUser.getID();
        
        String SQL = "insert into ActivityLog ( logTime, logType, userID) "
                + "values('"+logTime+"', 'LOG IN', "+userID+");";
        
        Integer confirm = databaseConnectivity.updateDatabase(SQL);
        
        return confirm == 0;
    }
    
    
    public Boolean logOut(){
        
        long unixTime = System.currentTimeMillis();
        java.sql.Timestamp logTime = new java.sql.Timestamp(unixTime);
        Integer userID = localUser.getID();
        
        String SQL = "insert into ActivityLog ( logTime, logType, userID) "
                + "values('"+logTime+"', 'LOG OUT', "+userID+");";
        
        Integer confirm = databaseConnectivity.updateDatabase(SQL);
        
        return confirm == 0;
    }
    
}
