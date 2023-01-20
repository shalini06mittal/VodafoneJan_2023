package com.sqli.logs.solution;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

import org.h2.tools.RunScript;

public class DatabaseUtil {

   static Connection connection;

   static{
       var url = "jdbc:h2:mem:";
       try {
           connection = DriverManager.getConnection(url);
           loadFile("sql/schema.sql");
           loadFile("sql/data.sql");
       }catch(SQLException | FileNotFoundException e){
            System.out.println("Error creating connection: " + e.getMessage());
            throw new RuntimeException("database creation error");
       }
   }

   public static Connection getConnection(){
       return connection;
   }

   public static boolean loadFile(String fileName) throws FileNotFoundException, SQLException {
       ClassLoader classLoader = DatabaseUtil.class.getClassLoader();
       File file = new File(classLoader.getResource(fileName).getFile());
       FileReader reader = new FileReader(file);
       RunScript.execute(getConnection(), reader);
       return true;
   }
}
