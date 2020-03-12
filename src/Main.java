

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lukaskopecky
 */
public class Main {
    
    public static void main (String[] args){
       Main exe = new Main();
       exe.execute();
    }
    
    public void execute(){
        DatabaseConnectivity connect = new DatabaseConnectivity();
        connect.hello();
        
    }
}
