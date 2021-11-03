/*
 * This program will take the principal balance, interest rate, and elapsed years to calculate a final amount with interest.
 */
package lab2_dog-tor;
import java.util.Scanner;

/**
 *
 * @author dog-tor
 */
public class Lab2_dog-tor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        double principal = 0.0;
        double interest = 0.0;
        double years = 0.0;
        double total = 0.0;
        
        System.out.print("Please specify the principal balance: "); 
        principal = keyboard.nextInt(); // Takes input value and puts it into principal.
        
        System.out.print("Please specify the interest rate (%): "); 
        interest = keyboard.nextInt(); // Takes input value and puts it into interest.
        
        interest = interest / 100; // This will convert the interest to a percentage.
        
        System.out.print("Please specify the number of elapsed years: "); 
        years = keyboard.nextInt(); // Takes input value and puts it into years.
        
        total = principal * Math.pow((1 + interest),years); // Inputs values into the A=P(1+r)^t formula
        
        total = Math.round(total * 100.0) / 100.0; // This will round the final amount with interest to the nearest two decimal places.
        
        System.out.println("The final amount with interest is: $" + String.format("%,.2f",total)); // Outputs the final value and formats it.
        
    }
    
}
