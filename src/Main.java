

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import java.io.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
/**
/**
 *
 * @author lukaskopecky
 */
public class Main {
    
    public static void main (String[] args) throws Exception{
       Main exe = new Main();
       exe.execute();
    }
    
    public void execute() throws Exception{
        //DatabaseConnectivity connect = new DatabaseConnectivity();
        DatabaseConnectivity.ReadSQLi();
        
    }
}
