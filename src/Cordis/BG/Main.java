package Cordis.BG;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Cordis.Entities.User;
import Cordis.UI.LogPage;
import Cordis.UI.ExperimentalLukas;


/**
 * Entry Point of the Project
 * @author lukaskopecky
 */
public class Main{
    
    
   
    public static void main (String[] args){
        System.out.println("[CORDIS] ... Welcome to Dashboard");
        
        //New Thread runs Console Output -- Experimental
        Thread test = new Thread(new ConsoleTest());
        test.start();
        
        
        //Runds Main program
        Main run = new Main();
        run.execute();
    }
    
    /**
     * Run the Main Program
     */
    public void execute(){
        System.out.println("[Execute] ... Start");
        
        
        
        
       
        //Display jFrame
//        ExperimentalLukas lukas = new ExperimentalLukas();
//        lukas.setVisible(true);
        
        //Dislay the log page
        LogPage log = new LogPage();
        log.setVisible(true);

        System.out.println("[Execute] ... Execution Finished");
    }

    
}
