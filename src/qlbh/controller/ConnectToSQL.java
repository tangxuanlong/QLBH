/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Steven
 */
public class ConnectToSQL {
    
    
    public static Connection getConnection(){ 
        try {
            String dbURL = "jdbc:sqlserver://127.0.0.1;databaseName=QLBH;user=sa;password=123456";
            Connection conn = DriverManager.getConnection(dbURL);
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectToSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void main(String args[]) throws SQLException {
       Connection c = getConnection();
        System.out.println(c.toString());
        c.close();
  }
}
    
     

