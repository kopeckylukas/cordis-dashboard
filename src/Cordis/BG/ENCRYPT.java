/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cordis.BG;

/**
 * Interface for Encryption
 * @author lukaskopecky
 */
public interface ENCRYPT {
    
    /**
     * Encrypting Decrypted String
     * @param Decrypted Decrypted String
     * @return Encrypted String
     */
    public String Encrypt (String Decrypted);
    
    /**
     * Decrypting Encrypted String
     * @param Encrypted Encrypted String
     * @return Decrypted String
     */
    public String Decrypt (String Encrypted);
    
}
