/*
 * This program will implement a Monte Carlo simulation of die tolls using for loops, file input, and randomness.
 */
package lab6_dog-tor;

/**
 *
 * @author dog-tor
 */
import java.io.*;
import java.util.Random;

public class Lab6_dog-tor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        int side1 = 0;
        int side2 = 0;
        int side3 = 0;
        int side4 = 0;
        int side5 = 0;
        int side6 = 0;
        int count = 0;
        
        File rollsFile = new File("/home/user/Rolls.txt");
        PrintWriter outputFile = new PrintWriter(rollsFile);
        
        
        for (count = 1; count <=10000; count++)
        {
            Random randNumbers = new Random();
            int randomNum = randNumbers.nextInt(6) + 1;
            
            if (randomNum == 1) side1++;
            if (randomNum == 2) side2++;
            if (randomNum == 3) side3++;
            if (randomNum == 4) side4++;
            if (randomNum == 5) side5++;
            if (randomNum == 6) side6++;
            
        }
            System.out.printf("The number of ones rolled was: %,d. The percentage of ones rolled was: %.2f%%.%n", side1, side1 * 0.01);
            outputFile.printf("The number of ones rolled was: %,d. The percentage of ones rolled was: %.2f%%.%n", side1, side1 * 0.01);
            
            System.out.printf("The number of twos rolled was: %,d. The percentage of twos rolled was: %.2f%%.%n", side2, side2 * 0.01);
            outputFile.printf("The number of twos rolled was: %,d. The percentage of twos rolled was: %.2f%%.%n", side2, side2 * 0.01);
            
            System.out.printf("The number of threes rolled was: %,d. The percentage of threes rolled was: %.2f%%.%n", side3, side3 * 0.01);
            outputFile.printf("The number of threes rolled was: %,d. The percentage of threes rolled was: %.2f%%.%n", side3, side3 * 0.01);
            
            System.out.printf("The number of fours rolled was: %,d. The percentage of fours rolled was: %.2f%%.%n", side4, side4 * 0.01);
            outputFile.printf("The number of fours rolled was: %,d. The percentage of fours rolled was: %.2f%%.%n", side4, side4 * 0.01);
            
            System.out.printf("The number of fives rolled was: %,d. The percentage of fives rolled was: %.2f%%.%n", side5, side5 * 0.01);
            outputFile.printf("The number of fives rolled was: %,d. The percentage of fives rolled was: %.2f%%.%n", side5, side5 * 0.01);
            
            System.out.printf("The number of sixes rolled was: %,d. The percentage of sixes rolled was: %.2f%%.%n", side6, side6 * 0.01);
            outputFile.printf("The number of sixes rolled was: %,d. The percentage of sixes rolled was: %.2f%%.%n", side6, side6 * 0.01);
            
            
            outputFile.close();
    }
    
}
