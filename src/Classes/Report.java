/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import UI.CreateReport;
import java.io.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author Kelok
 */
public class Report {

    public static void toExcel(JTable table, File file, String additionalString) {
        try {
            TableModel model = table.getModel();
            try (FileWriter excel = new FileWriter(file)) {
                for (int i = 0; i < model.getColumnCount(); i++) {
                    excel.write(model.getColumnName(i) + "\t");
                }
                
                excel.write("\n");
                
                for (int i = 0; i < model.getRowCount(); i++) {
                    for (int j = 0; j < model.getColumnCount(); j++) {
                        if(model.getValueAt(i, j) == null){
                            excel.write("" + "\t");
                        }else{
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
