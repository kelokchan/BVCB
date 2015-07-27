/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JTable;

/**
 *
 * @author Kelok
 */
public class BoardingRoom {


    private Connection con = null;
    private Statement stmt = null;


    public boolean checkOccupied(int selectedRoom, JTable boardJTable) {
        boolean isOccupied = false;
        for (int i = 0; i < boardJTable.getRowCount(); i++) {
            int occupiedRoomNo = (Integer) boardJTable.getModel().getValueAt(i, 3);
            if (selectedRoom == occupiedRoomNo) {
                isOccupied = true;
            }
        }
        return isOccupied;
    }

    public int calculatePrice(int duration){
        return duration * 50; 
    }
}
