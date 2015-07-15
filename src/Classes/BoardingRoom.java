/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import UI.BoardingWindow;
import java.awt.TextArea;

/**
 *
 * @author Kelok
 */
public class BoardingRoom {

    private String ID;
    private String date;
    private int days;

    public BoardingRoom(String ID, String date, int days) {
        this.ID = ID;
        this.date = date;
        this.days = days;
    }
    
    
    
    public void writeDetails(TextArea ta){
        ta.setText(ID + "\n" + date + "\n" + days);
    }
    
    public void setRoom(String name) {
        int number = Integer.parseInt(name.replaceAll("[^0-9]", ""));
    }
}
