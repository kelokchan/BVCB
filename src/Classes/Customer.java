/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import UI.ProfileWindow;
import javax.swing.JTable;

/**
 *
 * @author Kelok
 */
public class Customer extends Person {

    @Override
    public String getID() {
        JTable jTable = ProfileWindow.cusTable;
        int no = jTable.getRowCount() + 1;
        return "C" + no;
    }
    

}
