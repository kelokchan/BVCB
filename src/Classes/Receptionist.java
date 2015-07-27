/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Kelok
 */
public class Receptionist extends Person {

    private Connection con = Connect.ConnectDB();
    private Statement stmt = null;

    
    
    public void addStaff() {
        try {
            String Query = "INSERT INTO " + getPosition() + " (Fullname, ID, Password, Position, Gender, Email, PhoneNo) VALUES ('" + getName() + "','" + getID() + "','"
                    + getPassword() + "', '" + getPosition() + "','" + getGender() + "', '" + getEmail() + "', '" + getPhoneNo() + "' )";
            String userQuery = "INSERT INTO USERS VALUES ('" + getID() + "','" + getPassword() + "','" + getPosition() + "', '" + getName() + "')";

            con = Connect.ConnectDB();
            stmt = con.createStatement();
            stmt.execute(Query);
            stmt.execute(userQuery);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    
    public void updateStaff(JTable userJTable) {
        try {
            String selection = userJTable.getModel().getValueAt(userJTable.getSelectedRow(), 0).toString();
            String query = "UPDATE " + getPosition() + " SET Fullname = '" + getName() + "',ID = '" + getID() + "', Password = '" + getPassword()
                    + "', Position = '" + getPosition() + "', Gender = '" + getGender() + "', Email = '" + getEmail() + "', PhoneNo = '" + getPhoneNo() + "' WHERE Fullname = '" + selection + "'";
            con = Connect.ConnectDB();
            stmt = con.createStatement();
            stmt.execute(query);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());

        }
    }

    
    public void deleteStaff() {
        try {
            String Query = "DELETE FROM " + getPosition() + " WHERE Fullname = '" + getName() + "' ; DELETE FROM USERS WHERE ID = '" + getID() + "'";
            con = Connect.ConnectDB();
            stmt = con.createStatement();
            stmt.execute(Query);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
    
    public void createAppointment(String vet, String customer, String pet, String date, String time) {
        try {
            String Query = "INSERT INTO Appointment VALUES ('" + vet + "','" + customer + "','" + pet + "', '"
                    + date + "', '" + time + "')";
            stmt = con.createStatement();
            stmt.execute(Query);
            JOptionPane.showMessageDialog(null, "Appointment added");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    public void updateAppointment(JTable appJTable, String vet, String customer, String pet, String date, String time) {
        try {
            String selection = appJTable.getModel().getValueAt(appJTable.getSelectedRow(), 0).toString();
            stmt = con.createStatement();
            String Query = "UPDATE Appointment SET Vet = '" + vet + "',Customer = '" + customer + "', Pet = '" + pet + "', Date = '" + date
                    + "', Time = '" + time + "' WHERE Vet = '" + selection + "'";
            stmt.execute(Query);
            JOptionPane.showMessageDialog(null, "Appointment updated");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());

        }
    }

    public void cancelAppointment(String vet) {
        try {
            String query = "DELETE FROM Appointment WHERE Vet = '" + vet + "'";
            stmt = con.createStatement();
            stmt.execute(query);
            JOptionPane.showMessageDialog(null, "Appointment deleted");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }

    }

    public void checkIn(String pet_ID, String date, int days, int roomNo) {
        try {
            String Query = "INSERT INTO BoardingList VALUES ('" + pet_ID + "','" + date + "','"
                    + days + "', '" + roomNo + "')";
            String overnightQuery = "Update Pet SET Overnight = 'true' WHERE ID='" + pet_ID + "'";
            stmt = con.createStatement();
            stmt.execute(Query);
            stmt.execute(overnightQuery);
            JOptionPane.showMessageDialog(null, "Checked-in");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Invalid selection");
        }
    }

    public void updateBoarding(JTable boardJTable, String pet_ID, String date, int days, int roomNo) {
        try {
            String selection = boardJTable.getModel().getValueAt(boardJTable.getSelectedRow(), 0).toString();
            stmt = con.createStatement();
            String Query = "UPDATE BoardingList SET Pet_ID = '" + pet_ID + "',Date = '" + date + "', Duration = '" + days
                    + "', RoomNo = '" + roomNo + "' WHERE Pet_ID = '" + selection + "'";
            stmt.execute(Query);
            JOptionPane.showMessageDialog(null, "Updated");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());

        }
    }

    public void checkOut(String pet_ID) {
        try {
            String query = "DELETE FROM BoardingList WHERE Pet_ID = '" + pet_ID + "'";
            String overnightQuery = "UPDATE Pet SET Overnight = 'false' WHERE ID='" + pet_ID + "'";
            stmt = con.createStatement();
            stmt.execute(query);
            stmt.execute(overnightQuery);
            JOptionPane.showMessageDialog(null, "Checked-out");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

}
