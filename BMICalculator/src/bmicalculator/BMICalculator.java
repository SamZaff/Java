/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bmicalculator;
import java.util.Scanner;
/**
 *
 * @author Sam
 */
public class BMICalculator {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner FN = new Scanner(System.in);
    System.out.println("What is your first name? ");
    String First = FN.next();
    //User inputs is asked their first name
    Scanner LN = new Scanner(System.in);
    System.out.println("Last name?");
    String Last = LN.next();
    //user is asked their last name
    Scanner H = new Scanner(System.in);
    System.out.println("How tall are you? (in inches)");
    int Height = H.nextInt();
    //user is asked their height
    Scanner W = new Scanner(System.in);
    System.out.println("How much do you weigh? (lb)");
    double Weight = W.nextDouble();
    //user is asked their weight
    double BMI = Weight/(Height*Height)*703;
    //program calculates the user's BMI by using the above equation
    int FT = Height/12;
    int INCH = Height%12;
    System.out.println("NAME:   " + First + " " + Last);
    System.out.println("HEIGHT: " + FT + " ft. " + INCH + " in.");
    System.out.println("WEIGHT: " + Weight);
    //the above 4 lines print the submitted data as well as various strings
    if (BMI <= 18.5) {
        System.out.println("BMI:    UNDERWEIGHT");
    }
    else if (BMI >= 18.5 && BMI <= 24.9){
        System.out.println("BMI:    NORMAL WEIGHT");
    }
    else if (BMI >= 25 && BMI <= 29.9){
        System.out.println("BMI:    OVERWEIGHT");
    }
    else if (BMI >= 30){
        System.out.println("BMI:    OBESE");
    }
    
    
        // TODO code application logic here
    }
    
}
