/* dog-tor
 *
 * 11/21/2013
 * 
 * This program will read a int number from the keyboard to specify the type of data to read in, then read that data and print it out. Then it will ask the user to run the program again.
 * 
 */

import java.io.*;
import java.util.*;

public class TestNames
{
    public static void main(String[] args)
    {
        String  firstName       = "";
        String  lastName        = "";
        String  socialNum       = "";
        String  choice          = "";
        int     entries         = 0;
        boolean keepLooping     = true;
        
        Scanner readFirst   = new Scanner(System.in);
        Scanner readLast    = new Scanner(System.in);
        Scanner readSsn     = new Scanner(System.in);
        Scanner readChoice  = new Scanner(System.in);
        
        while ( keepLooping )
        {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("                                            TTTTT   EEEEE   SSSSS   TTTTT      N   N   AAAAA   M     M   EEEEE   SSSSS                                    ");
            System.out.println("                                              T     E       S         T        NN  N   A   A   MM   MM   E       S                                   ");
            System.out.println("                                              T     EEEEE   SSSSS     T        N N N   AAAAA   M  M  M   EEEEE   SSSSS                               ");
            System.out.println("                                              T     E           S     T        N  NN   A   A   M     M   E           S                        ");
            System.out.println("                                              T     EEEEE   SSSSS     T        N   N   A   A   M     M   EEEEE   SSSSS                                 ");
            System.out.println("                                       ------------------------------------------------------------------------------------                  ");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("                                                                 Name Registration Program");
            System.out.println("                                                              -------------------------------");
            System.out.println();
            
            System.out.print("                                                                 Enter first name: ");
            firstName = readFirst.nextLine();
            
            System.out.println();
            System.out.print("                                                                 Enter last name: ");
            lastName = readLast.nextLine();
            
            System.out.println();
            System.out.print("                                                                 Enter SSN (###-##-####): ");
            socialNum = readSsn.nextLine();
            
            entries = entries + 1;
            
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("                                                                   Registered");
            System.out.println("                                                                ----------------");
            System.out.println();
            System.out.println("                                                                       First name: " + firstName);
            System.out.println("                                                                       Last name: " + lastName);
            System.out.println("                                                                       SSN: " + socialNum);
            System.out.println();
            System.out.println("                                                                       People registered this session: " + entries);
            
            System.out.println();
            System.out.println();
            System.out.print("                                                              Enter stop to end program or press enter to continue: ");
            choice = readChoice.nextLine();
            
            if (choice.equals("stop") || choice.equals("Stop") || choice.equals("STOP"))      
            {
                keepLooping = false;
                System.out.println();
                System.out.println();
                System.out.println("                                                                       Total people registered this session: " + entries);
                System.out.println("                                                                               ~~~Program Terminated~~~");
            }
            else
            {
                System.out.println("                                                           You pressed enter...");
            }
        }
    }
}