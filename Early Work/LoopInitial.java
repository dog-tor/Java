/* dog-tor
 *
 * 11/13/2013
 * 
 * This program will print my initials to the screen in the same pattern that was used in LoopFun.
 * 
 */

public class LoopInitial
{
    public static void main(String[] args)
    {
        System.out.println("                                                                                                    Loop Initial");
        System.out.println("                                                                                                    ------------");
        System.out.println("                                                                     L        OOOOO    OOOOO    PPPP       IIIII   N   N                                       ");
        System.out.println("                                                                     L        O   O    O   O    P   P        I     NN  N                         ");
        System.out.println("                                                                     L        O   O    O   O    PPPP         I     N N N                         ");
        System.out.println("                                                                     L        O   O    O   O    P            I     N  NN                         ");
        System.out.println("                                                                     LLLLL    OOOOO    OOOOO    P          IIIII   N   N                         ");
        System.out.println();
        
        int by2 = 0;
        for (int x = 0; x <= 200; x++)
        {
            by2 = x % 2;
            
            if (by2 == 0)
            {
            }
            else
            {
                System.out.println("W");
            }
            
            for (int y = 0; y < x; y++)
            {
                System.out.print(" ");
            }
        }
        for (int x = 200; x >= 0; x--)
        {
            by2 = x % 2;
            
            if (by2 == 0)
            {
            }
            else
            {
                System.out.println("W");
            }
            
            for (int y = 0; y < x; y++)
            {
                System.out.print(" ");
            }
        }
    }
}