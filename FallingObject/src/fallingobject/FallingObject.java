/*
 * Sam Zaffanella
 * 2/9/2016
 * CSC-210
 */
package fallingobject;

/**
 * In order to find the distance of a falling object in a certain
 * length of time, one must use the equation: 
 *x(t) = 0.5 ∗ at2 + vit + xi
 * In this example, the object is traveling with an acceleration of
 * -9.8 m/s squared in 15 seconds.  Both the starting position and
 * velocity are 0.
 **/ 
public class FallingObject {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a = -9.8;
        double t = 15;
        double v = 0;
        double x = 0;
        double D = 0.5 * a * t * t;
        // Above is where I define all of my different variables for the equation
        System.out.println("The distance traveled by this objecy is " + D);
        /* When run, the output should display the following string
        *  followed by function D
        */
        
        
        // TODO code application logic here
    }
    
}
