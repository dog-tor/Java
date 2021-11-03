/*
 * This program will request the user to input two strings and willl call a void method to convert the Strings usign the BigDecimal class and multiply the numbers to finally display a product while using the JOptionPane.
 */
package lab7_dog-tor;

import javax.swing.JOptionPane;
import java.math.BigDecimal;

/**
 *
 * @author dog-tor
 */
public class Lab7_dog-tor {

    /**
     * This is the main method of the program and it will perform the method calls for this application.
     * @param args String
     */
    public static void main(String[] args) {
        
        String num1 = "";
        String num2 = "";
       
        
        num1 = JOptionPane.showInputDialog("Please enter the first number.");
        num2 = JOptionPane.showInputDialog("Please enter the second number.");
        
        safeMultiplication(num1, num2);
        System.exit(0); //always use this method when ending a program using JOptionPane to prevent errors.
        
    }
    /**
    * This method will convert two strings into BigDecimal values, multiply them, and display the product using a JOptionPane message dialog.
    * @param num1 First operand
    * @param num2 Second operand
    */
    public static void safeMultiplication(String num1, String num2) {
        
        BigDecimal bigNum1 = new BigDecimal(num1);
        BigDecimal bigNum2 = new BigDecimal(num2);
        
        JOptionPane.showMessageDialog(null, "The product of the two numbers is: " + (bigNum1.multiply(bigNum2)));
        
    }
    
}