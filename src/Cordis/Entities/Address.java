/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cordis.Entities;

/**
 *
 * @author lukaskopecky
 */
public class Address {
    private Integer locationID;
    private String address;
    private String postcode;
    private String city;
    
    public Address(String address, String postcode, String city) {
        this.address = address;
        this.postcode = postcode;
        this.city = city;
    }
    
/**
 * @param locationID represents PK in SQLite Database
 * @param address represents Street Name and House Number
 * @param postcode represents Postal/Zip code
 * @param city represents name of City where this address is located in
 */    
    public Address(Integer locationID, String address, String postcode, String city) {
        this.address = address;
        this.postcode = postcode;
        this.city = city;
        this.locationID = locationID;
    }
    
    /**
     * 
     * @return Value type String returns postcode
     */
    public String getCity(){
        return city;
    }
    
    /**
     * 
     * @return Value type String returns Postcode
     */
    public String getPostcode(){
        return postcode;
    }
    
    /**
     * @return Value type String represents Street and House No
     */
    public String getAddress(){
        return address;
    }
    
    /**
     * 
     * @return Numeric Value used in SQLite Database as Primary key
     */
    public Integer getLocationID(){
        return locationID;
    }
    
    /**
     * sets city
     * @param city value to be set
     */
    public void setCity(String city){
        this.city = city;
    }
    
    /**
     * sets postcode
     * @param postcode value to be set
     */
    public void setPostcode(String postcode){
        this.postcode = postcode;
    }
    
    /**
     * sets address
     * @param address value to be set 
     */
    public void setAddress(String address){
        this.address = address;
    }
    
    /**
     * sets numerical value used in SQLite database as Primary Key
     * @param locationID number of location used among database
     */
    public void setLocationID(Integer locationID){
        this.locationID = locationID;
    }
    
}
