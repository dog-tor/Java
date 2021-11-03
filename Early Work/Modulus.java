/* dog-tor
 *
 * 10/22/2013
 * 
 * This program will loop from 1 to 50 incrementing by 1 and print all the numbers 
 * evenly divisible by three using the modulus operator and an "if" statement, and
 * loop 1 to 100 and print all the numbers that are each divisible by 2, 3 and 15.
 * 
 */

public class Modulus
{
    public static void main(String[] args)
    {
        int by2 = 0;
        int by3 = 0;
        int by15 = 0;
        
        
        System.out.println("                                  ___    ____            ");
        System.out.println("                                 |      |    |           ");
        System.out.println("                                 |___   |    |           ");
        System.out.println("                                     \\  |    |           ");
        System.out.println("                                  ___/  |____|           ");
        System.out.println();
        System.out.println("                     Numbers divisible by 3 from 1 to 50");
        System.out.println("                     -----------------------------------");
        System.out.println();
        System.out.print("          ");
        
        for (int x = 1; x <= 50; x++)
        {
            by3 = x % 3;
            if (by3 == 0 && x < 48)
            {
                System.out.print(x + ", ");
            }
            else if (x == 48)
            {
                System.out.print(x);
                System.out.println();
                System.out.println();
            }
        }
        
        System.out.println();
        System.out.println();
        System.out.println("                                    ____    ____                            ");
        System.out.println("                             /|    |    |  |    |                           ");
        System.out.println("                              |    |    |  |    |                           ");
        System.out.println("                              |    |    |  |    |                           ");
        System.out.println("                            __|__  |____|  |____|                           ");
        System.out.println();
        System.out.println("               Numbers divisible by 2, 3, and 15 from 1 to 100");
        System.out.println("               -----------------------------------------------");
        System.out.println();
        System.out.print("                                 ");
        
        for (int x = 1; x <= 100; x++)
        {
            by2 = x % 2;
            by3 = x % 3;
            by15 = x % 15;
            if (by2 == 0 && by3 == 0 && by15 == 0 && x < 90)
            {
                System.out.print(x + ", ");
            }
            else if (by2 == 0 && by3 == 0 && by15 == 0 && x == 90)
            {
                System.out.print(x);
                System.out.println();
            }
        }
    }
}