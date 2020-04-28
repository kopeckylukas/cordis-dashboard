/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cordis.Entities;

/**
 * Describing Funding_Scheme entity form Cordis Database
 * @author lukaskopecky
 */
public class FundingScheme {
    private String fCode;
    private String fTitle;
    private String fDescription;
    private String fLanguage;
    
    public FundingScheme(String fCode, String fTitle, String fDescription, String fLanguage){
        this.fCode = fCode;
        this.fTitle = fTitle;
        this.fDescription = fDescription;
        this.fLanguage = fLanguage;
    }
    
    /**
     * Gets Lingua Franca for projects of this funding Scheme (ISO 639-1)
     * @return language Code (ISO 639-1)
     */
    public String getFLanguage(){
        return fLanguage;
    }
    
    /**
     * Returns Description of Funding Scheme
     * @return Plain Text
     */
    public String getFDescription(){
        return fDescription;
    }
    
    /**
     * Returns Name of Funding Scheme
     * @return Name
     */
    public String getFTitle(){
        return fTitle;
    }
    
    /**
     * Returns Funding Scheme Code, also represents PK in SQLite database
     * @return Funding scheme code
     */
    public String getFCode(){
        return fCode;
    }
    
    /**
     * Sets Lingua Franca for Funding Scheme (ISO 639-1)
     * @param fLanguage Language Code (ISO 639-1)
     */
    public void fLanguage(String fLanguage){
        this.fLanguage = fLanguage;
    }
    
    /**
     * Sets Description of Funding Scheme
     * @param fDescription Description of Funding Scheme
     */
    public void setDescription(String fDescription){
        this.fDescription = fDescription;
    }
    
    /**
     * Sets Name of Organisation Activity Type 
     * @param fTitle Name of Organisation Activity Type 
     */
    public void setFTitle (String fTitle){
        this.fTitle = fTitle;
    }
    
    /**
     * Sets Funding Scheme Code,  also represents PK in SQLite database
     * @param fCode Funding Scheme Code
     */
    public void setFCode(String fCode){
        this.fCode = fCode;
    }
    
}
