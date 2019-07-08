package edu.csc413.calculator.evaluator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvaluatorUI extends JFrame implements ActionListener {

    private TextField txField = new TextField();
    private Panel buttonPanel = new Panel();
    Evaluator calcEvaluator = new Evaluator();
    String x = "";  //Full equation in string form
    // total of 20 buttons on the calculator,
    // numbered from left to right, top to bottom
    // bText[] array contains the text for corresponding buttons
    private static final String[] bText = {
        "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3",
        "*", "0", "^", "=", "/", "(", ")", "C", "CE"
    };

    /**
     * C  is for clear, clears entire expression
     * CE is for clear expression, clears last entry up until the last operator.
     */
    private Button[] buttons = new Button[bText.length];

    public static void main(String argv[]) {
        EvaluatorUI calc = new EvaluatorUI();
    }

    public EvaluatorUI() {
        setLayout(new BorderLayout());
        this.txField.setPreferredSize(new Dimension(600, 50));
        this.txField.setFont(new Font("Courier", Font.BOLD, 28));

        add(txField, BorderLayout.NORTH);
        txField.setEditable(false);

        add(buttonPanel, BorderLayout.CENTER);
        buttonPanel.setLayout(new GridLayout(5, 4));

        //create 20 buttons with corresponding text in bText[] array
        Button bt;
        for (int i = 0; i < EvaluatorUI.bText.length; i++) {
            bt = new Button(bText[i]);
            bt.setFont(new Font("Courier", Font.BOLD, 28));
            buttons[i] = bt;
        }

        //add buttons to button panel
        for (int i = 0; i < EvaluatorUI.bText.length; i++) {
            buttonPanel.add(buttons[i]);
        }

        //set up buttons to listen for mouse input
        for (int i = 0; i < EvaluatorUI.bText.length; i++) {
            buttons[i].addActionListener(this);
        }

        setTitle("Calculator");
        setSize(400, 400);
        setLocationByPlatform(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent arg0) { //EDITED
        this.txField.setText(this.txField.getText()+arg0.getActionCommand());
        // You need to fill in this fuction
        if (arg0.getSource() == buttons[0]){
            x += bText[0];

        }else if (arg0.getSource() == buttons[1]){
            x += bText[1];

        }else if (arg0.getSource() == buttons[2]){
            x += bText[2];

        }else if (arg0.getSource() == buttons[3]){
            x += bText[3];
            //txField.setText("");

        }else if (arg0.getSource() == buttons[4]){
            x += bText[4];

        }else if (arg0.getSource() == buttons[5]){
            x += bText[5];

        }else if (arg0.getSource() == buttons[6]) {
            x += bText[6];

        }else if (arg0.getSource() == buttons[7]){
            x += bText[7];


        }else if (arg0.getSource() == buttons[8]){
            x += bText[8];

        }else if (arg0.getSource() == buttons[9]){
            x += bText[9];

        }else if (arg0.getSource() == buttons[10]){
            x += bText[10];

        }else if (arg0.getSource() == buttons[11]){
            x += bText[11];
            //txField.setText("");

        }else if (arg0.getSource() == buttons[12]){
            x += bText[12];

        }else if (arg0.getSource() == buttons[13]){
            x += bText[13];
            //txField.setText("");

        }else if (arg0.getSource() == buttons[14]){
            txField.setText("");
            txField.setText(Integer.toString(calcEvaluator.eval(x)));
            x = txField.getText();

        }else if (arg0.getSource() == buttons[15]){
            x += bText[15];
            //txField.setText("");

        }else if (arg0.getSource() == buttons[16]){
            x += bText[16];

        }else if (arg0.getSource() == buttons[17]){
            x += bText[17];

        }else if (arg0.getSource() == buttons[18]){
            txField.setText("");
            x = "";

        }else if (arg0.getSource() == buttons[19]){
            if (txField.getText().length()  < 3) {
                txField.setText(txField.getText().substring(0, txField.getText().length() - 3));
            }
            else {
                txField.setText("");
            }
            x = txField.getText();
        }
    }

}
