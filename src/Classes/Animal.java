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
public class Animal {

    private String ID;
    private String Name;
    private String Gender;
    private int Age;
    private String OwnerID;
    private String Diagnosis;
    private boolean Overnight;
    private String Type;
    private String Last_Fed;

    public String getID() {
        JTable jTable = ProfileWindow.petTable;
        int no = jTable.getRowCount() + 1;
        return "P" + no;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getGender() {
        return Gender;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getOwnerID() {
        return OwnerID;
    }

    public void setOwnerID(String OwnerID) {
        this.OwnerID = OwnerID;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get the value of Overnight
     *
     * @return the value of Overnight
     */
    public boolean isOvernight() {
        return Overnight;
    }

    /**
     * Set the value of Overnight
     *
     * @param Overnight new value of Overnight
     */
    public void setOvernight(boolean Overnight) {
        this.Overnight = Overnight;
    }

    public String getDiagnosis() {
        return Diagnosis;
    }

    public void setDiagnosis(String Diagnosis) {
        this.Diagnosis = Diagnosis;
    }

    public String generateID(JTable jTable) {
        int no = jTable.getRowCount() + 1;
        return "P" + no;
    }

    public String getLast_Fed() {
        return Last_Fed;
    }

    public void setLast_Fed(String Last_Fed) {
        this.Last_Fed = Last_Fed;
    }

}
