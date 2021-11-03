/* dog-tor
 *
 * 11/20/2013
 * 
 * This program will read a number from the keyboard, then print the number, then print the number multiplied by 5 and finally print the number with 8 added to it.
 * 
 */

import java.io.*;
import java.util.*;

public class ScanInt
{
    public static void main(String[] args)
    {
        int numberIn = 0;
        int result = 0;
        
        Scanner KbReader = new Scanner(System.in);
        
        System.out.println("                                  SSSSS   CCCCC   AAAAA   N   N      IIIII   N   N   TTTTT              ");
        System.out.println("                                  S       C       A   A   NN  N        I     NN  N     T                ");
        System.out.println("                                  SSSSS   C       AAAAA   N N N        I     N N N     T                ");
        System.out.println("                                      S   C       A   A   N  NN        I     N  NN     T                ");
        System.out.println("                                  SSSSS   CCCCC   A   A   N   N      IIIII   N   N     T                ");
        System.out.println("                             ------------------------------------------------------------------         ");
        System.out.println();
        
        System.out.print("                                                   Please enter a number: ");
        
        numberIn = KbReader.nextInt();
        result = numberIn * 5;
        
        System.out.println("                                                   Your number is: " + numberIn);
        System.out.println("                                                   Your number " + numberIn + " multiplied by 5 is: " + result);
        
        result = numberIn + 8;
        
        System.out.println("                                                   Your number " + numberIn + " plus 8 is: " + result);
    }
}