package edu.csc413.calculator.evaluator;
/**
 * Operand class used to represent an operand
 * in a valid mathmetical expression.
 */
public class Operand {
  /**
  * construct operand from string token.
  */
  int var;
  public Operand( String token ) {
    var = Integer.valueOf(token);
  }
  /**
   * construct operand from integer
   */
  public Operand( int value ) {
    var = value;
  }
  /**
   * return value of operand
   */
  public int getValue() { return var; }
  /**
   * Check to see if given token is a valid
   * operand.
   */
  public static boolean check( String token ) {
    try {
      Integer.valueOf(token);
    }
    catch (NumberFormatException e ){
      //System.err.println("Cannot convert given string to integer");
      return false;
    }
    return true;
  }
}
