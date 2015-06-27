/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vet;

import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author Kelok
 */
public class Connect {

    Connection con = null;
    Statement stmt = null;

    public static Connection ConnectDB() {
        try {
            String url = "jdbc:ucanaccess://C:/Users/Kelok/Documents/NetBeansProjects/BVCB/BVCBData.accdb";
            Connection con = DriverManager.getConnection(url);
            return con;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
}
