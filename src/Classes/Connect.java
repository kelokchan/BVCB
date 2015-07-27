/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Kelok
 */
public class Connect {

    Connection con = null;
    Statement stmt = null;

    public static Connection ConnectDB() {
        try {
            String url = "jdbc:ucanaccess://BVCBData.accdb";
            Connection con = DriverManager.getConnection(url);
            return con;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return null;
        }
    }

    public static void populateComboBox(JComboBox jcb, String query, String column) {
        try {
            jcb.removeAllItems();
            Connection con1 = ConnectDB();
            Statement stmt1 = con1.createStatement();
            ResultSet rs = stmt1.executeQuery(query);
            while (rs.next()) {
                jcb.addItem(rs.getString(column));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
