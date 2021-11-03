/*
 * This program will calculate the geometric mean of inputted positive values and performs the final calculation after the user inputs a zero.
 */
package lab5_dog-tor;

/**
 *
 * @author dog-tor
 */
import java.util.Scanner;
public class Lab5_dog-tor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double product = 1;
        double input = 1;
        double inputCount = 0;
        double geoMean = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
            
        while (input != 0 && input >=1)
        {
            System.out.print("Please enter a number: ");
            input = keyboard.nextDouble();
            
            if (input >=1)
            {
                product = input * product;
                inputCount++; //increase the input count every time the user inserts a valid number.
            }
            else if (input < 0)
            {
                System.out.println("WARNING: Negative measurements cannot be used.");
                input = 1; //change input value to a 1 to continue the loop.
            }
        }
        
        geoMean = Math.pow(product, 1/inputCount); //deoMean is calculated by taking the product and raising it to to the power of 1/n.
        
        if (input == 0)
        {
            System.out.printf("The geometric mean of the numbers provided is %.2f.\n", geoMean); //final result
            
        }
        
        
    }
    
}
