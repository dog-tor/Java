/* dog-tor
 *
 * 11/4/2013
 * 
 * This program will print a pyramid across the screen.
 * 
 */

public class LoopShape
{
    public static void main(String[] args)
    {
        System.out.println("                                                               L        OOOOO    OOOOO    PPPP         SSSSS    H   H     AAA     PPPP     EEEEE      ");
        System.out.println("                                                               L        O   O    O   O    P   P        S        H   H    A   A    P   P    E          ");
        System.out.println("                                                               L        O   O    O   O    PPPP         SSSSS    HHHHH    AAAAA    PPPP     EEEEE      ");
        System.out.println("                                                               L        O   O    O   O    P                S    H   H    A   A    P        E          ");
        System.out.println("                                                               LLLLL    OOOOO    OOOOO    P            SSSSS    H   H    A   A    P        EEEEE      ");
        System.out.println("                                                           -----------------------------------------------------------------------------------------");
        System.out.println();
        
        
        int totalHeight = 100;
        
        for(int x = 0; x < totalHeight; x++)
        {
            for(int y = x + totalHeight; y < totalHeight * 2; y++)
            {
                System.out.print(" ");
            }
            for(int z = 0; z < x * 2; z++)
            {
                System.out.print("X");
            }
            
            System.out.println("X");
        }
    }
}