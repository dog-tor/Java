/* dog-tor
 *
 * 10/1/2013
 * 
 * This program will loop from 1 to 100 and keep a rumming total of the loop variable.
 * 
 */

public class LoopCount
{
    public static void main(String[] args)
    {
        int loopTotal = 0;
        
        System.out.println("                      ___   ___   __        ___  ___              _____    ");
        System.out.println("               |     |   | |   | |  |      |    |   | |   | |\\  |   |      ");
        System.out.println("               |     |   | |   | |_ /      |    |   | |   | | \\ |   |      ");
        System.out.println("               |____ |___| |___| |         |___ |___| |___| |  \\|   |      ");
        System.out.println("                    Number of loops:            Running total:");
        System.out.println("                    ----------------            --------------");
        System.out.println();
        
        for (int x = 1; x <= 100; x++)
        {
            loopTotal = loopTotal + x;
            
            if (x >= 0 && x <= 9)
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