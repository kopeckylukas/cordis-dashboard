/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cordis.BG;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Encryption method of user Passwords
 * @author BalthasarHoettges
 */
public class Encryption implements ENCRYPT {

    /**
     * Encrypting Message
     * @param Decrypted message to be Encrypted
     * @return encrypted message
     */
    @Override
    public String Encrypt(String Decrypted) {
        
        String data = Decrypted; //get data from where ??


        
        String algorithm = "MD5";
         
        Long ra = new Long(1588013803);
        Long nd= new Long(155501353);
        Long o= new Long(753647304);
        Long m = new Long(88442211);
        
        
        byte s = ra.byteValue();
        byte a = nd.byteValue();
        byte l = o.byteValue();
        byte t = m.byteValue();

        byte[] salt = {s,a,l,t};


         String encryptedpassword = null;
        try {
            encryptedpassword = generateHash(data, algorithm, salt);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Encryption.class.getName()).log(Level.SEVERE, null, ex);
        }

            

        return encryptedpassword;
    }

    @Override
    public String Decrypt(String Encrypted) {
        
        return Encrypted;
    }

    private static String generateHash(String data, String algorithm,byte [] salt) throws NoSuchAlgorithmException {

        MessageDigest digest = MessageDigest.getInstance(algorithm);

        digest.reset();
        
        
        digest.update(salt);

        byte [] hash = digest.digest(data.getBytes());

        return bytesToStringHex(hash);

    }



    private final static char[] hexArray = "0123456789ABCDEF".toCharArray();



    public static String bytesToStringHex (byte[]bytes){

        char[]hexChars = new char[bytes.length * 2];

        for (int j = 0; j < bytes.length; j++){

            int v = bytes[j] & 0xFF;

            hexChars[j*2] = hexArray[v >>> 4];

            hexChars [j* 2+1]= hexArray [v & 0x0F];



        }

        return new String (hexChars);

    }


    //need to store salt (random) somehow otherwise decryption will not work

    public static byte[] createSalt() {

        byte[] bytes = new byte[20];

        SecureRandom random = new SecureRandom ();

        random.nextBytes(bytes);

        return bytes;



    }
    
}
