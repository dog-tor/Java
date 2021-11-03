/* dog-tor
 *
 * 9/20/2013
 * 
 * This program will print out 1 of 8 messages based on the value of an integer variable.
 * 
 */

import java.util.*;

public class CrazyEight
{
    public static void main(String[] args)
    {
        Random randomGenerator = new Random();
        
        int x = randomGenerator.nextInt(8); // valid numbers are 1 to 8
        
        System.out.println("Welcome to dog-tor's Magical Crazy Eight-Ball");
        System.out.println("-------------------------------------------");
        System.out.println();
        System.out.println("        ______________                      ");
        System.out.println("       /              \\                    ");
        System.out.println("      /                \\                   ");
        System.out.println("     /        ___       \\                  ");
        System.out.println("    |        /   \\       |                 ");
        System.out.println("    |       |  " + x + "  |      |          ");
        System.out.println("    |        \\___/       |                 ");
        System.out.println("     \\                  /                  ");
        System.out.println("      \\                /                   ");
        System.out.println("       \\ ____________ /                    ");
        System.out.println("                                           ");
        System.out.println();
        System.out.println("*Shake* *Shake* *Shake*");
        System.out.println();
        System.out.println("...");
        System.out.println();
        
        if (x == 1)
        {
            System.out.println("You will get a lot of money.");
        }
        else if (x == 2)
        {
            System.out.println("Try again!");
        }
        else if (x == 3)
        {
            System.out.println("You ugly.");
        }
        else if (x == 4)
        {
            System.out.println("You wasted money buying this.");
        }
        else if (x == 5)
        {
            System.out.println("You will get a raise in 2 days.");
        }
        else if (x == 6)
        {
            System.out.println("Turn around, there's something behind you.");
        }
        else if (x == 7)
        {
            System.out.println("Crazy 7 is better.");
        }
        else if (x == 8)
        {
            System.out.println("You will die tomorrow.");
        }
        else if (x >= 9)
        {
            System.out.println("HOW DID YOU GET THAT NUMBER?!");
            System.out.println("Your number is: " + x);
        }
        else if (x <= 0)
        {
            System.out.println("HOW DID YOU GET THAT NUMBER?!");
            System.out.println("Your number is: " + x);
        }
    }
}