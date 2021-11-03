/*
 * This program will request the values of an array and print out a histogram based off of the data entered.
 */
package lab10_dog-tor;

/**
 *
 * @author dog-tor
 */
import java.util.Scanner;   // "[I]mport the Scanner class" (Earwood, 2020).
public class Lab10_dog-tor {

    /**
     * @param args - The command line arguments.
     */
    public static void main(String[] args) {
        
	int[] array     // "Declare an int array" (Earwood, 2020).
	= new int [0];	// "Declare an int for the size of the array" (Earwood, 2020).
	Scanner keyboard = new Scanner(System.in);  // "Construct an object of the Scanner class to read user input" (Earwood, 2020).

        System.out.print("Please specify the size of the array: "); // "Ask the user for the size of the array" (Earwood, 2020).
        array = new int[keyboard.nextInt()];    // "Assign this user input to the int variable" (Earwood, 2020).
		
	for (int index = 0; index < array.length; index++)
        {
            System.out.print("Please enter a number to inset into the array: ");    // "Use a loop to continuously ask for values to insert into the array" (Earwood, 2020).
            array[index] = keyboard.nextInt();
        }
        for (int index : array)
        {
                        
            for (int number = 0; number < index; number++ ) // "Use nested loops to iterate over each location of the array" (Earwood, 2020).
            {
                String count = "";
                count += "*";   // "At each location, use the value stored at that location to create a "line" for the histogram" (Earwood, 2020).
                System.out.print(count);
            }
            
            System.out.println();
            
        }
        
    }
    
}

/**
 *                                                 Works Cited
 * 
 * Earwood, B. (2020). 
 */