package edu.csc413.calculator.operators;



import edu.csc413.calculator.evaluator.Evaluator;
import edu.csc413.calculator.evaluator.Operand;

import java.util.HashMap;

public abstract class Operator {
    // The Operator class should contain an instance of a HashMap
    // This map will use keys as the tokens we're interested in,
    // and values will be instances of the Operators.
    // ALL subclasses of operator MUST be in their own file.
    // Example:
    // Where does this declaration go? What should its access level be?
    // Class or instance variable? Is this the right declaration?
    // HashMap operators = new HashMap();
    // operators.put( "+", new AdditionOperator() );
    // operators.put( "-", new SubtractionOperator() );
    private static HashMap<String, Operator> ops;

    static {
        ops = new HashMap<>();
        ops.put("+", new AddOperator());
        ops.put("-", new SubtractOperator());
        ops.put("*", new MultiplyOperator());
        ops.put("/", new DivideOperator());
        ops.put("^", new PowerOperator());
        ops.put("(", new LeftParenOperator());
        ops.put(")", new RightParenOperator());
    }

    public static Operator getOperator(String var) {
        return ops.get(var);
    }
    public abstract int priority();
    public abstract Operand execute(Operand op1, Operand op2 );

    /**
     * determines if a given token is a valid operator.
     * please do your best to avoid static checks
     */
    public static boolean check( String token ) {
        return ops.containsKey(token);
    }

}
