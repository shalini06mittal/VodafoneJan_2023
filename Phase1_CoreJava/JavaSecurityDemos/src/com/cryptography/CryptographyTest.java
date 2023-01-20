package com.cryptography;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Security;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Set;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class CryptographyTest {

	public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeySpecException {
		Set<String> messageDigest = Security.getAlgorithms("MessageDigest");
		messageDigest.forEach(x -> System.out.println(x));
		MessageDigest md = null;
		//-18-60125-104-111-68-12074-48-54120-115-6499-71-32-38-19-819885-111-33-126-14-12566-52-5946-22-99
		//-37-61-7751-8-91-96-11549-45-121-95-17-34-61-67-100-77-114-102-119-12211-24-64-6071-94-83-20-91-12-52-638-121-5657-110-18933-45-102-7212510426102-43-5810259358416907462-116-80-128109
		try {
			md = MessageDigest.getInstance("SHA3-512");
		} catch (NoSuchAlgorithmException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		byte[] hashedPassword = md.digest("shalini".getBytes());
		System.out.println(hashedPassword);

		for(byte b:hashedPassword)
			System.out.print(b);
		System.out.println();
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
