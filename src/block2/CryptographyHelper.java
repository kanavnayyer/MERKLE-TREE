/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package block2;

import java.security.MessageDigest;

/**
 *
 * @author kanav
 */




public class CryptographyHelper {
   public static String hash(String data) {

        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(data.getBytes("UTF-8"));
            StringBuilder hexadecimalString = new StringBuilder();
            for (int i = 0; i < hash.length; i++) {
                String hexadecimal = Integer.toHexString(0xff & hash[i]);
                if (hexadecimal.length() == 1) {
                hexadecimalString.append('0');}
                	hexadecimalString.append(hexadecimal);
            }
return hexadecimalString.toString();
        } catch (Exception e) {
            throw new RuntimeException (e);
        }

        
    }   
}
