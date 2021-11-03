/* dog-tor
 *
 * 11/21/2013
 * 
 * This program will read a int number from the keyboard to specify the type of data to read in, then read that data and print it out. Then it will ask the user to run the program again.
 * 
 */

import java.io.*;
import java.util.*;

public class ScanChoice
{
    public static void main(String[] args)
    {
        int     choice          = 0;
        int     numberInt       = 0;
        double  numberDouble    = 0.0;
        String  lineString      = "";
        boolean keepLooping     = true;
        boolean loopYesNo       = true;
        String  myLine          = "";
        
        Scanner readInt     = new Scanner(System.in);
        Scanner readDouble  = new Scanner(System.in);
        Scanner readString  = new Scanner(System.in);
        Scanner readLine    = new Scanner(System.in);
        
        while ( keepLooping )
        {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("                                         SSSSS   CCCCC   AAAAA   N   N      CCCCC   H   H   OOOOO   IIIII   CCCCC   EEEEE         ");
            System.out.println("                                         S       C       A   A   NN  N      C       H   H   O   O     I     C       E             ");
            System.out.println("                                         SSSSS   C       AAAAA   N N N      C       HHHHH   O   O     I     C       EEEEE         ");
            System.out.println("                                             S   C       A   A   N  NN      C       H   H   O   O     I     C       E             ");
            System.out.println("                                         SSSSS   CCCCC   A   A   N   N      CCCCC   H   H   OOOOO   IIIII   CCCCC   EEEEE         ");
            System.out.println("                                    ------------------------------------------------------------------------------------------    ");
            System.out.println();
            System.out.println("                                                            What type of data do you want to read in?");
            System.out.println();
            System.out.println("                                                                   1. Read in a Integer number.");
            System.out.println("                                                                   2. Read in a Double number.");
            System.out.println("                                                                   3. Read in a String.");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.print("                                                              Enter your choice here: ");
            
            choice = readInt.nextInt();
        
            if (choice == 1)
            {
                System.out.println();
                System.out.println("                                                              You chose to read in a Integer number...");
                System.out.println();
                System.out.print("                                                              Please enter an Interger number: ");
                
                numberInt = readInt.nextInt();
                
                System.out.println();
                System.out.println("                                                              Your Integer number was " + numberInt + ".");
                System.out.println();
            }
            else if (choice == 2)
            {
                System.out.println();
                System.out.println("                                                              You chose to read in a Double number...");
                System.out.println();
                System.out.print("                                                              Please enter a Double number: ");
                
                numberDouble = readDouble.nextDouble();
                
                System.out.println();
                System.out.println("                                                              Your Double number was " + numberDouble);
                System.out.println();
            }
            else if (choice == 3)
            {
                System.out.println();
                System.out.println("                                                              You chose to read in a String...");
                System.out.println();
                System.out.print("                                                              Please enter a String: ");
                
                lineString = readString.nextLine();
                
                System.out.println();
                System.out.println("                                                              Your String was " + lineString + ".");
                System.out.println();
            }
            else
            {
                System.out.println();
                System.out.println("                                                              You chose an invalid number.");
                System.out.println();
            }
            System.out.println("                                                              Would you like to retry? yes or no?");
            System.out.print("                                                                             ");
            myLine = readLine.nextLine();
            while ( loopYesNo )
            {
                //System.out.println("While - LoopYesNo: " + loopYesNo);
                if (myLine.equals("yes") || myLine.equals("Yes") || myLine.equals("YEs") || myLine.equals("YeS") || myLine.equals("YES") || myLine.equals("yEs") || myLine.equals("yeS") || myLine.equals("yES"))
                {
                    loopYesNo = false;
                    //System.out.println("Yes - LoopYesNo: " + loopYesNo);
                    //System.out.println("Yes - KeepLooping: " + keepLooping);
                }
                else if (myLine.equals("no") || myLine.equals("No") || myLine.equals("NO") || myLine.equals("nO"))
                {
                    keepLooping = false;
                    loopYesNo = false;
                    System.out.println();
                    System.out.println();
                    System.out.println("                                                               ~~~Program Terminated~~~");
                    //System.out.println("No - LoopYesNo: " + loopYesNo);
                    //System.out.println("No - KeepLooping: " + keepLooping);
                }
                else
                {
                    System.out.println();
                    System.out.println("                                                              Please enter yes or no.");
                    System.out.println();
                    System.out.print("                                                                             ");
                    myLine = readLine.nextLine();
                }
            }
            loopYesNo = true;
        }
    }
}