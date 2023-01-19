package com.encrypt.decrypt;

import java.io.FileInputStream;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class DecryptionExample implements Constants {
    public static void main(String[] args) throws Exception {
 
        // Read the encrypted data
        FileInputStream fis = new FileInputStream(DATA_FILE);
        byte[] temp = new byte[ (int) DATA_FILE.length()];
        int bytesRead = fis.read(temp);
        byte[] data = new byte[bytesRead];
        System.arraycopy(temp, 0, data, 0, bytesRead);
 
 
        // Read the cipher settings
        FileInputStream eksis = new FileInputStream( KEY_FILE );
        bytesRead = eksis.read(temp);
        byte[] encodedKeySpec = new byte[bytesRead];
        System.arraycopy(temp, 0, encodedKeySpec, 0, bytesRead);
 
        // Recreate the secret/symmetric key
        SecretKeySpec skeySpec = new SecretKeySpec( encodedKeySpec, "Blowfish");
 
        // Create the cipher for encrypting
        Cipher cipher = Cipher.getInstance("Blowfish");
        cipher.init(Cipher.DECRYPT_MODE, skeySpec);
 
        // Decrypt the data
        byte[] decrypted = cipher.doFinal(data);
 
        System.out.println("**** "+decrypted);
        System.out.println(DATA);
        // Validate successful decryption
        for (int i = 0; i < decrypted.length; i++) {
        	System.out.println(decrypted[i]+ " : "+DATA[i]);
        	System.out.println((char)decrypted[i]+ " : "+(char)DATA[i]);
            if ( decrypted[ i ] != DATA[ i ] ) {
            	
                System.err.println( "Decrypted data wrong at byte " + i + "!" );
                System.exit( 1 );
            }
        }
        System.err.println( "Success!" );
    }


}
