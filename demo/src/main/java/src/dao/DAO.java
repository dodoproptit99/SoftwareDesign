/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author local
 */
public class DAO {
   public static Connection con;
   
   public DAO() {
       if(con == null) {
           String dbUrl = "jdbc:mysql://localhost:3306/pttk?autoReconnect=true&useSSL=false";
           String dbClass = "com.mysql.jdbc.Driver";
           
           try {
               Class.forName(dbClass);
               con = DriverManager.getConnection(dbUrl, "root", "root");
               System.out.println("Success connect sql!!");
           } catch (Exception ex) {
               ex.printStackTrace();
           }
           
       }
   }
}
