/* dog-tor
 *
 * 10/15/2013
 * 
 * This program will print out the multiples of 9 from 0 to 120.
 * 
 */

public class LoopTest
{
    public static void main(String[] args)
    {
        System.out.println("               Multiples of 9 from 0 to 120");
        System.out.println("               ----------------------------");
        System.out.println("                           ____   ");
        System.out.println("                          |    |  ");
        System.out.println("                          |____|  ");
        System.out.println("                               |  ");
        System.out.println("                               |  ");
        System.out.println();
        System.out.print("                 ");
        
        for (int nine = 9; nine <= 120; nine = nine + 9)
        {
            if (nine >= 9 && nine <= 61)
            {
                System.out.print(nine + ", ");
            }
            else if (nine == 72)
            {
                System.out.print(nine);
                System.out.println();
                System.out.println();
            }
            else if (nine == 81)
            {
                System.out.println("                       SuperStar 81");
                System.out.println();
                System.out.print("                     ");
            }
            else if (nine >= 90 && nine <= 108)
            {
                System.out.print(nine + ", ");
            }
            else if (nine == 117)
            {
                System.out.print(nine);
            }
        }
    }
}