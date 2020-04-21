/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cordis.Entities;

/**
 * Entity User which is used for Activity logging
 * @author lukaskopecky
 */
public class User {
    private Integer ID;
    private String type;
    private String name;
    private String surname;

   public User(){
       
   }
    
    /**
     * Constructor
     * @param ID identifier used by SQL database
     * @param type A administrator or U user
     * @param name Forename of a user
     * @param surname Surname of a user 
     */
    public User(Integer ID, String type, String name, String surname) {
        this.ID = ID;
        this.type = type;
        this.name = name;
        this.surname = surname;
    }

    /**
     * Gets user identifier
     * @return 
     */
    public Integer getID() {
        return ID;
    }

    /**
     * Gets user type 
     * @return A for an Administrator U for a user
     */
    public String getType() {
        return type;
    }

    /**
     * Gets First name 
     * @return First Name of an user 
     */
    public String getName() {
        return name;
    }

    /**
     * Gets Last Name of A user 
     * @return name
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets user identifier
     * @param ID A for an Administrator U for a user
     */
    public void setID(Integer ID) {
        this.ID = ID;
    }

    /**
     * Sets user type 
     * @param type A for an Administrator U for a user
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Sets First name 
     * @param name First name of a user 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets Surname 
     * @param surname Surname of a user
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "User{" + "ID=" + ID + ", type=" + type + ", name=" + name + ", surname=" + surname + '}';
    }
  
}
