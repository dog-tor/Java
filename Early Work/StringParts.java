/* dog-tor
 *
 * 12/16/2013
 * 
 * This program will read in a string from thekeyboard and print out the string and string length.
 * 
 */

import java.io.*;
import java.util.*;

public class StringParts
{
    public static void main(String[] args)
    {
        int     length          = 0;
        int     subLength       = 0;
        String  string          = "";
        String  subString       = "";
        int     startPosition   = 0;
        int     endB4Position   = 0;
        boolean keepLooping     = true;
        
        Scanner readString     = new Scanner(System.in);
        Scanner readStartValue = new Scanner(System.in);
        Scanner nums2Print     = new Scanner(System.in);
        
        while (keepLooping)
        {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("                                            SSSSS   TTTTT   RRRR     IIIII   N   N    GGG       PPPP    AAAAA   RRRR    TTTTT   SSSSS        ");
            System.out.println("                                            S         T     R   R      I     NN  N   G          P   P   A   A   R   R     T     S            ");
            System.out.println("                                            SSSSS     T     RRRR       I     N N N   G GGG      PPPP    AAAAA   RRRR      T     SSSSS        ");
            System.out.println("                                                S     T     R  R       I     N  NN   G   G      P       A   A   R  R      T         S        ");
            System.out.println("                                            SSSSS     T     R   R    IIIII   N   N    GGG       P       A   A   R   R     T     SSSSS        ");
            System.out.println("                                       ---------------------------------------------------------------------------------------------------   ");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.print("                                       Please enter a string (Entering nothing will stop the program): ");
            string = readString.nextLine();
            length = string.length();
            
            if (length == 0)      
            {
                keepLooping = false;
                System.out.println();
                System.out.println();
                System.out.println("                                                                               ~~~Program Terminated~~~");
            }
            else
            {
                System.out.println("                                       The string you entered is: " + string);
                System.out.println("                                       The length of this string is: " + length);
                System.out.println();
                System.out.println();
                System.out.print("                                       Please enter a starting value: ");
                startPosition = readStartValue.nextInt();
                
                System.out.print("                                       Please enter the number of characters to print from that starting value: ");
                endB4Position = startPosition + nums2Print.nextInt();
                System.out.println();
                System.out.println();
                if ( startPosition >= 0 && endB4Position <= string.length())
                {
                    subString = string.substring(startPosition, endB4Position);
                    subLength = subString.length();
                    System.out.println();
                    System.out.println();
                    System.out.println("                                       My substring is: " + subString);
                    System.out.println("                                       The length of this substring is: " + subLength + " characters.");
                    System.out.println("                                       Starting at position: " + startPosition + " and ending before: " + endB4Position);
                }
                else
                {
                    System.out.println();
                    System.out.println();
                    System.out.println("                                       SubString index ranges out of bounds!");
                    System.out.println("                                       Starting at position: " + startPosition + " and ending before: " + endB4Position);
                }
            }
        }
    }
}