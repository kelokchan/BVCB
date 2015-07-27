/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Kelok
 */
public class Vet extends Person {

    private String Expertise;
    private String Expertise_2;

    public String getExpertise() {
        return Expertise;
    }

    public void setExpertise(String expertise) {
        this.Expertise = expertise;
    }

    public String getExpertise_2() {
        return Expertise_2;
    }

    public void setExpertise_2(String Expertise_2) {
        this.Expertise_2 = Expertise_2;
    }

    public void addExpertise(String ID) {
        try {
            con = Connect.ConnectDB();
            stmt = con.createStatement();
            String additionalQuery = "UPDATE Vet SET Expertise = '" + Expertise + "', Expertise_2 = '" + Expertise_2 + "' WHERE ID = '" + ID + "'";
            stmt.execute(additionalQuery);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    public void updateExpertise(JTable userJTable) {
        try {
            String selection = userJTable.getModel().getValueAt(userJTable.getSelectedRow(), 0).toString();
            con = Connect.ConnectDB();
            stmt = con.createStatement();
            String additionalQuery = "UPDATE Vet SET Expertise = '" + Expertise + "', Expertise_2 = '" + Expertise_2 + "' WHERE ID = '" + selection + "'";
            stmt.execute(additionalQuery);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    public void submitDiagnosis(JTable vetAppJTable, String diagnosis) {
        int row = vetAppJTable.getSelectedRow();
        String pet_id = vetAppJTable.getModel().getValueAt(row, 1).toString();
        String query = "UPDATE Pet SET Diagnosis = '" + diagnosis + "' WHERE ID = '" + pet_id + "'";
        try {
            Connection con = Connect.ConnectDB();
            Statement stmt = con.createStatement();
            stmt.execute(query);
            JOptionPane.showMessageDialog(null, "Diagnosis/Prognosis submitted");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
