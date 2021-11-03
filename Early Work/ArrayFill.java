/** dog-tor
 *  4-16-14
 *  
 *  This program will demonstrate the use of arrays with fill.
 */
public class ArrayFill
{
    public static void main(String[] args)
    {
        int emptyNumbers[] = new int[50];
        int lengthOfemptyNumbers = emptyNumbers.length;
        int remainder = 0;
        
        System.out.println("                                  AAAAA   RRRR    RRRR    AAAAA   Y   Y      FFFFF   IIIII   L       L         ");
        System.out.println("                                  A   A   R   R   R   R   A   A    Y Y       F         I     L       L         ");
        System.out.println("                                  AAAAA   RRRR    RRRR    AAAAA     Y        FFFFF     I     L       L         ");
        System.out.println("                                  A   A   R  R    R  R    A   A     Y        F         I     L       L         ");
        System.out.println("                                  A   A   R   R   R   R   A   A     Y        F       IIIII   LLLLL   LLLLL     ");
        System.out.println("                             --------------------------------------------------------------------------------- ");
        System.out.println();
        System.out.println();
        System.out.println("              The length of emptyNumbers is: " + lengthOfemptyNumbers);
        System.out.println();
        System.out.println();
        System.out.println("              Numbers divisible by 3");
        System.out.println("            --------------------------");
        for (int x = 0; x < lengthOfemptyNumbers; x++)
        {
            emptyNumbers[x] = x;
            remainder = x % 3;
            if (remainder == 0)
            {
                System.out.println("                       " + emptyNumbers[x]);
            }
        }
        
    }
}