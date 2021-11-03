/* dog-tor
 * 10/15/2013
 * 
 * This program will print an X that moves across the screen from left to right and back to the left
 * 
 */

public class LoopFun
{
    public static void main(String[] args)
    {
        System.out.println("                                                                                                    Loop Fun");
        System.out.println("                                                                                                    --------");
        System.out.println("                                                                     L        OOOOO    OOOOO    PPPP         FFFFF    U   U    NN    N                                               ");
        System.out.println("                                                                     L        O   O    O   O    P   P        F        U   U    N N   N             ");
        System.out.println("                                                                     L        O   O    O   O    PPPP         FFFFF    U   U    N  N  N             ");
        System.out.println("                                                                     L        O   O    O   O    P            F        U   U    N   N N             ");
        System.out.println("                                                                     LLLLL    OOOOO    OOOOO    P            F        UUUUU    N    NN             ");
        System.out.println();
        
        for (int x = 0; x <= 200; x++)
        {
            for (int y = 0; y < x; y++)
            {
                System.out.print(" ");
            }
            
            System.out.println("X");
            
        }
        for (int x = 199; x >= 0; x--)
        {
            for (int y = 0; y < x; y++)
            {
                System.out.print(" ");
            }
            
            System.out.println("X");
            
        }
    }
}