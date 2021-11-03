/*
 * This program will calculate the compound interest with three lines of data from a file and print the output to the file.
 */
package fileinterest_dog-tor;

/**
 *
 * @author dog-tor
 */
import java.io.*;
import java.util.Scanner;

public class FileInterest_dog-tor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        double balance = 0;
        double interestRate = 0;
        double years = 0;

        File interestFile = new File("/home/user/Interest.txt");
        
        FileWriter fWriter = new FileWriter("/home/user/Interest.txt", true);
        Scanner inputFile = new Scanner(interestFile);
        
        
        while (inputFile.hasNext())
        {
            balance = inputFile.nextDouble();
            interestRate = inputFile.nextDouble();
            years = inputFile.nextDouble();
        }
        
        PrintWriter outputFile = new PrintWriter(fWriter);
        
        double answer = balance * Math.pow(1 + interestRate/100, years);
        outputFile.println("\nThe final amount with compound interest for the specified data is: $" + String.format("%,.2f",answer));
        
        inputFile.close();
        outputFile.close();
        
        
    }
    
}
