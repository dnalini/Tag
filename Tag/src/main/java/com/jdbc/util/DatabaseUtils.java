package com.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtils {
	 private static String url = "jdbc:mysql://localhost:3306/<<dbname>>";
	 
	 public static Connection getConnection() {
         Connection con = null;
         try {
               Class.forName("com.mysql.jdbc.Driver");
               con = DriverManager.getConnection(url, "<<username>>", "<<password>>");
         } catch (SQLException e) {
               e.printStackTrace();
         } catch (ClassNotFoundException e) {
               e.printStackTrace();
         }
         return con;
   }
	 
}
