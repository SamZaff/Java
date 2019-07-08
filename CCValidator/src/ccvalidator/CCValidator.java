/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccvalidator;
import java.util.Scanner;
/**
 *
 * @author Sam
 */
public class CCValidator {

    public static boolean isValid(long number) {
        int completeSum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        return (completeSum % 10 == 0) && getSize(number) >= 13 && getSize(number) <= 16 && prefixMatched(number, 1);
    }
    /*
    / This method determines whether or not the credit card is valid by taking
    / all the requirements (methods below) and creating a return statement for
    / all of them are met.
    */
    public static int sumOfDoubleEvenPlace(long number) {
        long d;
        int sum = 0;
        number /= 10;
        while (number > 0) {
            d = (number % 10)*2;
            if (d >= 10) {
                d = (d % 10) + 1;
            }
            sum += d;
            number /= 100;
        }
        return sum;
    }
    /*
    / This is an int method that determines step number 1, or finding the
    / number that is given when adding all even numbers from right to left,
    / multiplyig the number by 2, then adding any two digit numbers together 
    / by the digits.  I decided to combing this method with the getDigit method.
    */
    public static int sumOfOddPlace(long number) {
        long d;
        int sum = 0;
        while (number > 0) {
            d = number % 10;
            sum += d;
            number /= 100;
            //System.out.println(d);
        }
        //System.out.println(sum);
        return sum;
    }
    /*
    / I made a very similar method for step 2 to add up all of the odd numbers
    / from right to left, but of course not multiplying and numbers by 2.
    */
    public static boolean prefixMatched(long number, int d) {
        
        return ((getPrefix(number, d)/10) >= 4 && (getPrefix(number, d)/10) <= 6) || getPrefix(number, d) == 37;
    }
    /*
    / This boolean method determines whether getPrefix(below) gives a valid number
    / aka 4, 5, 6, or 37. The first two digits of the number is divided by 10
    / if the first digit, and only the first digit, is between 4 and 6
    */
    public static int getSize(long d) {
     int cnt = 0;
     while (d > 0) {
         d/=10;
         cnt++;
     }
     return cnt;
    }
    /*
    / getSize is a very simple method that determines the length of the credit
    / card number.  I made a counter variable(cnt) to keep track the number of
    / digits.  In the while statement, I divide by 10 while also adding one to
    / the cnt variable.
    */
    public static long getPrefix(long number, int k) {
        int size = getSize(number);
        if (k > size) return number;
        int div_cnt = size -k;
        for(int i =0; i < div_cnt-1; i++) {
            number = number/10;
        }
        return number;
    }
    /*
    / In this long method, it finds the prefix of the credit card.  I used the
    / method that was given in class in order to determine the prefix.
    */
    public static void main(String[] args) {
        System.out.println("Enter your credit card information below:");
        Scanner input = new Scanner(System.in);
        long cNumber = input.nextLong();
        System.out.println();
        System.out.println("Your credit card number is:" + cNumber);
        if (isValid(cNumber) == true) {
            System.out.println("Your credit card is valid!");
        }
        else {
            System.out.println("Your credit card is invalid!");
        }
    }
    /*
    / In the main, I first make a scanner class for the user input. After
    / a few print statements, I make an if statement to conclusively determine
    / the validity of the credit card by calling the isValid method.
    */
}