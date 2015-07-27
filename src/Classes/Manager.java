/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import UI.ScheduleWindow;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Kelok
 */
public class Manager extends Person {

    public void addSchedule(String day, String vet) {
        try {
            for (int i = 1; i <= 3; i++) {

                String query = "UPDATE Schedule SET " + day + " = '" + vet + "' WHERE RowNo = " + i + "";

                Connection con = Connect.ConnectDB();
                Statement stmt = con.createStatement();
                stmt.execute(query);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please select a vet / duplicate vet allocation", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void checkExp(String vet_id) {
        String query = "SELECT * FROM Vet WHERE ID = '" + vet_id + "'";
        String exp = null;
        String exp_2 = null;
        try {
            Connection con = Connect.ConnectDB();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                exp = rs.getString("Expertise");
                exp_2 = rs.getString("Expertise_2");
                switch (exp) {
                    case "Dog":
                        ScheduleWindow.dogBox.setSelected(true);
                        break;
                    case "Cat":
                        ScheduleWindow.catBox.setSelected(true);
                        break;
                    case "Hamster":
                        ScheduleWindow.hamsterBox.setSelected(true);
                        break;
                    case "Rabbit":
                        ScheduleWindow.rabbitBox.setSelected(true);
                        break;
                    case "Reptile":
                        ScheduleWindow.reptileBox.setSelected(true);
                        break;
                }
                switch (exp_2) {
                    case "Dog":
                        ScheduleWindow.dogBox.setSelected(true);
                        break;
                    case "Cat":
                        ScheduleWindow.catBox.setSelected(true);
                        break;
                    case "Hamster":
                        ScheduleWindow.hamsterBox.setSelected(true);
                        break;
                    case "Rabbit":
                        ScheduleWindow.rabbitBox.setSelected(true);
                        break;
                    case "Reptile":
                        ScheduleWindow.reptileBox.setSelected(true);
                        break;
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
