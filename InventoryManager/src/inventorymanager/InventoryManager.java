/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanager;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sam
 */
public class InventoryManager {

    public static void printInventory(Item[] items) {
        System.out.printf("%-15s%-15s%-15s\n", "name", "quantity", "Price per unit");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }
    /* 
     * This simple method prints both the header as well as all of the information
     * pertaining to each object.
     */
    public static void checkLowInventory(Item[] items) {
        int z = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].getQuantity() < 5) {
                System.out.println(items[i]);
            }
            else {
                z++;
            }
            if (z == 10) {
                System.out.println("All items have quantity greater than 5");
            }
                
        }
    }
    /*
     * Inside this method, a for loop is used in order to check if any
     * inventory is low. If any is low or under 5. If so, it prints items
     */
    public static void totalInventoryValue(Item[] items) {
        double total = 0;
        for (int i = 0; i < items.length; i++) {
            total += items[i].getQuantity()*items[i].getPrice_per_unit();
        }
        System.out.println(total);
    }
    /*
     * This method adds up the total inventory value through a simple
     * for loop
     */
    public static void main(String[] args) {
        File fn = new File("items.txt");
        Scanner input;
        Scanner console;
        Item[] items = new Item[10];
        // I created a couyple scanner classes as well as an array item class
        try {
            input = new Scanner(fn);
            String n;
            int q;
            double p;
            for (int i = 0; i < 10; i++) {
                n = input.next();
                q = input.nextInt();
                p = input.nextDouble();
                items[i]  = new Item(n, q, p);
            }
            char option;
            console = new Scanner(System.in);
            while (true) {
                System.out.println("Please enter your option: ");
                System.out.print("Print Inventory (p), check inventory (c), print total value of inventory (v), and exit (e): ");
                option = console.next().charAt(0);
                switch(option) {
                    case 'p':
                        printInventory(items);
                        break;
                    case 'c':
                        checkLowInventory(items);
                        break;
                    case 'v':
                        totalInventoryValue(items);
                        break;
                    case 'e':
                        System.exit(0); 
                }
            }
        }catch(FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        // The following try catch was copied down in class
    }
    
}
