/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author Kelok
 */
public class Report {

    public String setLabel(JComboBox reportComboBox) {
        String reportLabel = "";
        switch (reportComboBox.getSelectedItem().toString()) {
            case ("Customer"):
                reportLabel = "Number of registered customers: ";
                break;
            case ("Pet"):
                reportLabel = "Number of registered pets: ";
                break;
            case ("BoardingList"):
                reportLabel = "Number of pets staying overnight: ";
                break;
        }
        return reportLabel;
    }

    public int boardingIncome(int count) {
        String query = "SELECT SUM(Duration) AS TotalDays FROM BoardingList";
        int income = 0;
        try {
            Connection con = Connect.ConnectDB();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                int totalDays = rs.getInt("TotalDays");
                income = count * totalDays * 50;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return income;
    }

    public static void toExcel(JTable table, String type, String additionalString) {
        String fileName = "";
        File file = null;
        switch (type) {
            case ("Customer"):
                fileName = "CustomerReport.xls";
                break;
            case ("Pet"):
                fileName = "PetReport.xls";
                break;
            case ("BoardingList"):
                fileName = "BoardingReport.xls";
                break;
        }
        
        file = new File(fileName);
        
        try {
            TableModel model = table.getModel();
            try (FileWriter excel = new FileWriter(file)) {
                for (int i = 0; i < model.getColumnCount(); i++) {
                    excel.write(model.getColumnName(i) + "\t");
                }

                excel.write("\n");

                for (int i = 0; i < model.getRowCount(); i++) {
                    for (int j = 0; j < model.getColumnCount(); j++) {
                        if (model.getValueAt(i, j) == null) {
                            excel.write("" + "\t");
                        } else {
                            excel.write(model.getValueAt(i, j).toString() + "\t");
                        }
                    }
                    excel.write("\n");
                }

                excel.write("\n" + additionalString);
                JOptionPane.showMessageDialog(null, "Report is generated");
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
