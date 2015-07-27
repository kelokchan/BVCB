/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Kelok
 */
public class BoardingStaff extends Person {

    public void submitStatus(JTable boardJTable, String status, String last_fed) {
        int row = boardJTable.getSelectedRow();
        String pet_id = boardJTable.getModel().getValueAt(row, 0).toString();
        String query = "UPDATE Pet SET Status = '" + status + "', Last_Fed = '" + last_fed + "'WHERE ID = '" + pet_id + "'";
        try {
            Connection con = Connect.ConnectDB();
            Statement stmt = con.createStatement();
            stmt.execute(query);
            JOptionPane.showMessageDialog(null, "Submitted");
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
