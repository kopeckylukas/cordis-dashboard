/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cordis.Entities;

/**
 *  Describing Organisation entity form Cordis Database
 * @author lukaskopecky
 */
public class Organisation {
    private Integer orgID;
    private String orgName;
    private String orgShortName;
    private String orgURL;
    private String orgVATNumber;
    private String orgContactForm;
    private String orgCountry;
    private Address location;
    private OrganisationType type;
    
    
    /**
     * Experimental
     * @param orgID Unique numeric identifier of an Organisation (9 digits)
     * @param orgName Full name of Organisation
     * @param orgShortName Short version of Organisation Name or its Abbreviation
     * @param orgCountry Codes for the representation of names of countries and their subdivisions (ISO 3166)
     */
     public Organisation(Integer orgID, String orgName, String orgShortName, String orgCountry){
        this.orgID = orgID;
        this.orgName = orgName;
        this.orgShortName = orgShortName;
        this.orgCountry = orgCountry;
    }
    
    /**
     * Short Constructor (data from entity Organisation Only(
     * @param orgID Unique numeric identifier of an Organisation (9 digits)
     * @param orgName Full name of Organisation
     * @param orgShortName Short version of Organisation Name or its Abbreviation
     * @param orgURL Official website of Organisation (Optional)
     * @param orgVATNumber VAT Number identifier
     * @param orgContactForm URL Address to a contact form 
     * @param orgCountry Codes for the representation of names of countries and their subdivisions (ISO 3166)
     */
    public Organisation(Integer orgID, String orgName, String orgShortName, 
                        String orgURL, String orgVATNumber,String orgContactForm,
                        String orgCountry){
        this.orgID = orgID;
        this.orgName = orgName;
        this.orgShortName = orgShortName;
        this.orgURL = orgURL;
        this.orgVATNumber = orgVATNumber;
        this.orgContactForm = orgContactForm;
        this.orgCountry = orgCountry;
    }
    
    /**
     * Full Constructor
     * @param orgID Unique numeric identifier of an Organisation (9 digits)
     * @param orgName Full name of Organisation
     * @param orgShortName Short version of Organisation Name or its Abbreviation
     * @param orgURL Official website of Organisation (Optional)
     * @param orgVATNumber VAT Number identifier
     * @param orgContactForm URL Address to a contact form 
     * @param orgCountry Codes for the representation of names of countries and their subdivisions (ISO 3166)
     * @param location Value type Address, address of an organisation
     * @param type Organisation Type Organisation 
     */
    public Organisation(Integer orgID, String orgName, String orgShortName, 
                        String orgURL, String orgVATNumber,String orgContactForm,
                        String orgCountry, Address location, 
                        OrganisationType type){
        this.orgID = orgID;
        this.orgName = orgName;
        this.orgShortName = orgShortName;
        this.orgURL = orgURL;
        this.orgVATNumber = orgVATNumber;
        this.orgContactForm = orgContactForm;
        this.orgCountry = orgCountry;
        this.location = location;
        this.type = type;
    }
    
    /**
     * Returns organisation Type 
     * @return Organisation type value
     */
    public OrganisationType getType(){
        return type;
    }
    
    /**
     * Set Type of an Organisation (OrganisationType value accepted only)
     * @param type value Organisation Activity type
     */
    public void setType(OrganisationType type){
        this.type = type;
    }
    
    /**
     * Returns Location in Address pattern
     * @return Address of an Organisation
     */
    public Address getLocation (){
        return location;
    }
    
    /**
     * Set location of Organisation (Address value accepted only)
     * @param location location ID 
     */
    public void setLocation(Address location){
        this.location = location;
    }
    
    /**
     * Gets Country name represented in ISO 3166 
     * Codes for the representation of names of countries and their subdivisions
     * @return Codes for the representation of names of countries and their subdivisions (ISO 3166)
     */
    public String getOrgCountry(){
        return orgCountry;
    }
    
    /**
     * Sets Country name represented in ISO 3166
     * @param orgCountry Codes for the representation of names of countries and their subdivisions (ISO 3166)
     */
    public void setCountry(String orgCountry){
        this.orgCountry = orgCountry;
    }
    
    /**
     * Returns URL Address pointing at contact form at in CordisH2020 database
     * @return URL Address pointing at contact form
     */
    public String getOrgContactForm(){
        return orgContactForm;
    }
    
    /**
     * Sets URL Address pointing at contact form at in CordisH2020 database
     * @param orgContactForm URL Address pointing at contact form
     */
    public void setOrgContactForm(String orgContactForm){
        this.orgContactForm = orgContactForm;
    }
    
    /**
     * Returns VAT Number, as every country has different rules, 
     * VAT Number cannot be considered as Unique Identifier,
     * @return VAT Number of an Organisation
     */
    public String getOrgVATNumber(){
        return orgVATNumber;
    }
    
    /**
     * Sets VAT Number, as every country has different rules, 
     * VAT Number cannot be considered as Unique Identifier,
     * @param orgVATNumber VAT Number of an Organisation
     */
    public void setOrgVATNumber(String orgVATNumber){
        this.orgVATNumber = orgVATNumber;
    }
    
    /**
     * Returns organisation's URL, not mandatory for all organisations
     * @return URL of organisation
     */
    public String getOrgURL(){
        return orgURL;
    }
    
    /**
     * Sets organisation's URL, not mandatory for all organisations
     * @param orgURL URL of organisation
     */
    public void setOrgURL(String orgURL){
        this.orgURL = orgURL;
    }
    
    /**
     * Returns abbreviation of name of an organisation,
     * it is not unique identifier
     * @return Abbreviation of Organisation Name
     */
    public String getOrgShortName(){
        return orgShortName;
    }
    
    /**
     * Sets abbreviation of name of an organisation,
     * it is not unique identifier
     * @param orgShortName Abbreviation of Organisation Name
     */
    public void setOrgShortName(String orgShortName){
        this.orgShortName = orgShortName;
    }
    
    /**
     * Returns Full name of an Organisation
     * @return Full name of organisation, type string
     */
    public String getOrgName(){
        return orgName;
    }
    
    /**
     * Sets Full name of an Organisation
     * @param orgName  Full name of organisation, type string
     */
    public void setOrgName(String orgName){
        this.orgName = orgName;
    }
    
    /**
     * Returns unique identifier of an organisation
     * @return Numeric value, representing an organisation - UNIQUE
     */
    public Integer getOrgID(){
        return orgID;
    }
    
    /**
     * Sets unique identifier of an organisation
     * @param orgID Numeric value, representing an organisation - UNIQUE
     */
    public void setOrgID(Integer orgID){
        this.orgID = orgID;
    }
    
}
