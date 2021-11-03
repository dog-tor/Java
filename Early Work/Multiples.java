/* dog-tor
 *
 * 10/9/2013
 * 
 * This program will print out the multiples of each number 1 - 5 up to 25.
 * 
 */

public class Multiples
{
    public static void main(String[] args)
    {
        int loopTotal = 0;
        
        System.out.println("               Multiples of the numbers 1-5 up to 25");
        System.out.println("               -------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println("                                /|  ");
        System.out.println("                               / |  ");
        System.out.println("                                 |  ");
        System.out.println("                                 |  ");
        System.out.println("                               -----");
        System.out.println();
        System.out.println("                          Multiples of 1:");
        System.out.println("                          ---------------");
        System.out.print("                          ");
        for (int one = 1; one <= 25; one++)
        {
            if (one >= 1 && one <= 24)
            {
                System.out.print(one + ", ");
            }
            else if (one == 25)
            {
                System.out.print(one);
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("                                /  \\  ");
        System.out.println("                               /    |  ");
        System.out.println("                                  /    ");
        System.out.println("                                /      ");
        System.out.println("                               -----   ");
        System.out.println();
        System.out.println("                          Multiples of 2:");
        System.out.println("                          ---------------");
        System.out.print("                          ");
        for (int two = 2; two <= 25; two = two + 2)
        {
            if (two >= 2 && two <= 22)
            {
                System.out.print(two + ", ");
            }
            else if (two == 24)
            {
                System.out.print(two);
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("                               / \\  ");
        System.out.println("                                _/  ");
        System.out.println("                                 \\  ");
        System.out.println("                               \\ /  ");
        System.out.println();
        System.out.println("                          Multiples of 3:");
        System.out.println("                          ---------------");
        System.out.print("                          ");
        for (int three = 3; three <= 25; three = three + 3)
        {
            if (three >= 3 && three <= 21)
            {
                System.out.print(three + ", ");
            }
            else if (three == 24)
            {
                System.out.print(three);
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("                              |   |  ");
        System.out.println("                              |___|  ");
        System.out.println("                                  |  ");
        System.out.println("                                  |  ");
        System.out.println();
        System.out.println("                          Multiples of 4:");
        System.out.println("                          ---------------");
        System.out.print("                          ");
        for (int four = 4; four <= 25; four = four + 4)
        {
            if (four >= 4 && four <= 20)
            {
                System.out.print(four + ", ");
            }
            else if (four == 24)
            {
                System.out.print(four);
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("                               ____ ");
        System.out.println("                              |     ");
        System.out.println("                              |___  ");
        System.out.println("                                  \\ ");
        System.out.println("                                   | ");
        System.out.println("                               ___/ ");
        System.out.println();
        System.out.println("                          Multiples of 5:");
        System.out.println("                          ---------------");
        System.out.print("                          ");
        for (int five = 5; five <= 25; five = five + 5)
        {
            if (five >= 5 && five <= 20)
            {
                System.out.print(five + ", ");
            }
            else if (five == 25)
            {
                System.out.print(five);
            }
        }
    }
}    