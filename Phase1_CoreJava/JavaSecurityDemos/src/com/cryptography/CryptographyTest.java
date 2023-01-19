package com.cryptography;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class CryptographyTest {

	public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeySpecException {
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		byte[] hashedPassword = md.digest("shalini".getBytes());
		System.out.println(hashedPassword);
	
		byte[] hashedPassword1 = md.digest("kshitij".getBytes());
		System.out.println(hashedPassword1);
	
		
		
		
		SecureRandom random = new SecureRandom();
		byte[] salt = new byte[16];
		random.nextBytes(salt);
		KeySpec spec = new PBEKeySpec("shalini".toCharArray(), salt, 65536, 128);
		SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
		byte[] hash = factory.generateSecret(spec).getEncoded();
		System.out.println("hash "+hash);

	}

}
