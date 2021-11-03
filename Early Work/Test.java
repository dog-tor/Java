/* dog-tor
 *
 * 11/21/2013
 * 
 * This program will read a int number from the keyboard to specify the type of data to read in, then read that data and print it out.
 * 
 */

import java.io.*;
import java.util.*;

public class Test
{
    public static void main(String[] args)
    {
        boolean keepLooping = true;
        String color        = "Poop Brown";
        String myLine       = "";
        
        Scanner readLine = new Scanner(System.in);
        while ( keepLooping )
        {
            System.out.println();
            System.out.println();
            System.out.print("                                     Please enter a color here(enter done to stop): ");
            myLine = readLine.nextLine();
            color = myLine;
            System.out.println();
            System.out.println();
            if (myLine.equals("done"))
            {
                keepLooping = false;
                System.out.println();
                System.out.println();
                System.out.println("                                      The value of color is: " + color);
                System.out.println("                                         ~~~Program Terminated~~~");
            }
            else
            {
                System.out.println();
                System.out.println();
                System.out.println("                                      The value of keepLooping is: " + keepLooping);
            }
        }
    }
}