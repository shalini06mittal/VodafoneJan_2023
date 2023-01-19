package com.java.policy;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.AccessControlException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Permission;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class JavaPolicyTest extends SecurityManager {



	public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeySpecException {
		
		
		/*
	     No security manager is enabled by default. Thus all security checks 
	     to protected resources and operations are disabled. In order to enable 
	     security checks, the security manager must be enabled also
		 */

		// Security manager is disabled, read/write access to "java.home" system property is allowed
		//System.setProperty("java.home", "123456");
		System.out.println("java.home is : " + System.getProperty("java.home"));
		System.out.println("java.version is : " + System.getProperty("java.version"));

		System.setProperty("java.security.policy", "file:/Users/shalu06/Desktop/JavaDemos/JavaSecurityDemos/java.policy");
		// Enable the security manager
		try {

			SecurityManager securityManager = new SecurityManager();

			
			System.setSecurityManager(securityManager);
			new URL("http://www.google.com").openConnection().connect();
		} catch (SecurityException se) {

			System.out.println("error");
			se.printStackTrace();
			// SecurityManager already set
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {

			//System.setProperty("java.home", "123456");
			//System.setProperty("java.version", "123456");
		} catch (AccessControlException ace) {
			System.out.println("********");
			System.out.println("java.version is : " + System.getProperty("java.version"));
			System.out.println("java.home is : " + System.getProperty("java.home"));
			System.out.println("Write access to the java.home system property is not allowed!");
			ace.printStackTrace();
		}

	}

}
