/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.*;

/**
 *
 * @author Kelok
 */
public class Appointment {

    private String Vet;
    private String Customer;
    private String Date;
    private static final List<Appointment> appList = new ArrayList<>();

    public Appointment(String Vet, String Customer, String Date) {
        this.Vet = Vet;
        this.Customer = Customer;
        this.Date = Date;
        appList.add(this);
    }

    public List<Appointment> getList() {
        return appList;
    }


    public String getVet() {
        return Vet;
    }

    public void setVet(String Vet) {
        this.Vet = Vet;
    }


    public String getCustomer() {
        return Customer;
    }

    public void setCustomer(String Customer) {
        this.Customer = Customer;
    }


    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

}
