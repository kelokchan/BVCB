/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vet;

/**
 *
 * @author Kelok
 */
public class Pet {
    
        private String Name;

    /**
     * Get the value of Name
     *
     * @return the value of Name
     */
    public String getName() {
        return Name;
    }

    /**
     * Set the value of Name
     *
     * @param Name new value of Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    private String Gender;

    /**
     * Set the value of Gender
     *
     * @param Gender new value of Gender
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    private int Age;

    /**
     * Get the value of Age
     *
     * @return the value of Age
     */
    public int getAge() {
        return Age;
    }

    /**
     * Set the value of Age
     *
     * @param Age new value of Age
     */
    public void setAge(int Age) {
        this.Age = Age;
    }

    private String Breed;

    /**
     * Get the value of Breed
     *
     * @return the value of Breed
     */
    public String getBreed() {
        return Breed;
    }

    /**
     * Set the value of Breed
     *
     * @param Breed new value of Breed
     */
    public void setBreed(String Breed) {
        this.Breed = Breed;
    }

    private int OwnerID;

    /**
     * Get the value of OwnerID
     *
     * @return the value of OwnerID
     */
    public int getOwnerID() {
        return OwnerID;
    }

    /**
     * Set the value of OwnerID
     *
     * @param OwnerID new value of OwnerID
     */
    public void setOwnerID(int OwnerID) {
        this.OwnerID = OwnerID;
    }

    
}
