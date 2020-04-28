/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cordis.Entities;

/**
 *  Describing OrganisationType entity form Cordis Database
 * @author lukaskopecky
 */
public class OrganisationType {
    private String oCode;
    private String oTitle;
    private String oDescription;
    private String oLanguage;
    
    public OrganisationType(String oCode, String oTitle, String oDescription, String oLanguage){
        this.oCode = oCode;
        this.oTitle = oTitle;
        this.oDescription = oDescription;
        this.oLanguage = oLanguage;
    }
    
    /**
     * Returns Language Code for Organisation Activity type (ISO 639-1)
     * @return (ISO 639-1)
     */
    public String getOLanguage(){
        return oLanguage;
    }
    
    /**
     * Returns description of Activity type
     * @return Description of Activity Type
     */
    public String getODescription(){
        return oDescription;
    }
    
    /**
     * Returns Organisation Activity Type Title
     * @return Title of Organisation Activity Type
     */
    public String getOTitle(){
        return oTitle;
    }
    
    /**
     * Organisation Code, also represents PK in SQLite database
     * @return Organisation Code, also represents PK in SQLite database
     */
    public String getOCode(){
        return oCode;
    }
    
    /**
     * Sets Lingua franca for organisations of this type
     * @param oLanguage Lingua franca for organisations of this type
     */
    public void oLanguage(String oLanguage){
        this.oLanguage = oLanguage;
    }
    
    /**
     * Sets Description of Activity Type
     * @param oDescription Description of Activity Type
     */
    public void setDescription(String oDescription){
        this.oDescription = oDescription;
    }
    
    /**
     * Sets Title of Organisation Activity Type
     * @param oTitle Name of Organisation Activity Type 
     */
    public void setOTitle (String oTitle){
        this.oTitle = oTitle;
    }
    
    /**
     * Sets Organisation Code, also represents PK in SQLite database
     * @param oCode Organisation Code represents PK in SQLite database
     */
    public void setOCode(String oCode){
        this.oCode = oCode;
    }
}
