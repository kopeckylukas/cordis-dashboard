/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cordis.Entities;

/**
 *  Describing Programme entity form Cordis Database
 * @author lukaskopecky
 */
public class Programme {
    private String programmeID;
    
    /**
     * Constructor to Create Objects Programme
     * @param programmeID programme Code
     */
    public Programme(String programmeID){
        this.programmeID = programmeID;
    }
    
    /**
     * Sets programme ID
     * @param programmeID programme Code 
     */
    public void setProgrammeID(String programmeID){
        this.programmeID = programmeID;
    }
    
    /**
     * Gets programme ID
     * @return Programme ID
     */
    public String getProgrammeID(){
        return programmeID;
    }
    
    /**
     * To String Method 
     * @return "Programme ID: " + programmeID
     */
    @Override
    public String toString(){
        return "Programme ID: "+ programmeID;
    }
}
