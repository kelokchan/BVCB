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
            String url = "jdbc:derby://localhost:1527/BVCBData";
            Connection con = DriverManager.getConnection(url);
            return con;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
}
