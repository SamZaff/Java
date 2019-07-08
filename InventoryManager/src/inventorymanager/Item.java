/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanager;

/**
 *
 * @author Sam
 */
public class Item {
    private String name;
    private int quantity;
    private double price_per_unit;
    // Above is where I set the three data fields for this program
    Item() {
        
    }
    Item(String newName, int newQuan, double PPU) {
        name = newName;
        quantity = newQuan;
        price_per_unit = PPU;
    }
    /*
     * I then created two constructors: one empty no args constructor and 
     * another that initializes all data fields
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the price_per_unit
     */
    public double getPrice_per_unit() {
        return price_per_unit;
    }

    /**
     * @param price_per_unit the price_per_unit to set
     */
    public void setPrice_per_unit(double price_per_unit) {
        this.price_per_unit = price_per_unit;
    }
    public String toString() {
        return String.format("%-15s%-15s%-15s", this.name, this.quantity, this.price_per_unit);
    }
    // This to string method returns the data fields in string format
}
