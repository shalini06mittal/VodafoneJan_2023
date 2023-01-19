package com.sqli.SQLInjectionDemo.solution;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.h2.tools.RunScript;

public class DatabaseUtil {

   static Connection connection;

   static{
       var url = "jdbc:h2:mem:";
       try {
           connection = DriverManager.getConnection(url);
       }catch(SQLException e){
            System.out.println("Error creating connection: " + e.getMessage());
            throw new RuntimeException("database creation error");
       }
   }

   public static Connection getConnection(){
       return connection;
   }

   public static void main(String[] args) throws FileNotFoundException, SQLException, URISyntaxException {
	loadFile("sql/schema.sql");
}
   public static boolean loadFile(String fileName) throws FileNotFoundException, SQLException, URISyntaxException {
       ClassLoader classloader = DatabaseUtil.class.getClassLoader();
	   
       //ClassLoader classloader = Thread.currentThread().getContextClassLoader();
       
       URL resource = classloader.getResource(fileName);
       System.out.println(resource);
       
       File file = new File(resource.toURI());//new File(classloader.getResource(fileName).getFile());
       //File file = new File(fileName);
       System.out.println(file);
       FileReader reader = new FileReader(file);
       RunScript.execute(getConnection(), reader);
       return true;
   }
}
