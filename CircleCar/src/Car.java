/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sam
 */
public class Car {
    
    private String model;
    private String make;
    private int miles;
    private int year;
    Car() {
        
    }
    Car(String newModel, String newMake, int newYear,int newMiles) {
        this.model = newModel;
        this.make = newMake;
        this.year = newYear;
        this.miles = newMiles;
    }
    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return the miles
     */
    public int getMiles() {
        return miles;
    }

    /**
     * @param miles the miles to set
     */
    public void setMiles(int miles) {
        this.miles = miles;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
    void addMiles(int m) {
        miles += m;
    }
    public static void main(String[] args) {
        Car T = new Car("Escape", "Ford", 2012, 4000);
        System.out.println(T.getMake());
        T.addMiles(50);
        System.out.println(T.getMiles());
    }    
}
