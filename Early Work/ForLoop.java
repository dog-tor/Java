/* dog-tor
 *
 * 10/4/2013
 * 
 * This program will print out all the even numbers between 1 and 200.
 * 
 */

public class ForLoop
{
    public static void main(String[] args)
    {
        int loopTotal = 0;
        
        System.out.println("                   ___  ___   __                    ___   ___   __     ");
        System.out.println("                  |___ |   | |  |            |     |   | |   | |  |    ");
        System.out.println("                  |    |   | |_ /            |     |   | |   | |_ /    ");
        System.out.println("                  |    |___| |  \\            |____ |___| |___| |      ");
        System.out.println();
        System.out.println("                    Number of loops:            Running total:");
        System.out.println("                    ----------------            --------------");
        System.out.println();
        
        for (int x = 0; x <= 200; x = x + 2)
        {
            loopTotal = loopTotal + x;
            
            if (x == 0)
            {
                
            }
            else if (x >= 0 && x <= 9)
            {
                System.out.println("                    Loop # " + x + "                    Running total: " + loopTotal);
            }
            else if (x >= 10 && x <= 99)
            {
                System.out.println("                    Loop # " + x + "                   Running total: " + loopTotal);
            }
            else if (x >= 100 && x <= 999)
            {
                System.out.println("                    Loop # " + x + "                  Running total: " + loopTotal);
            }
        }
    }
}