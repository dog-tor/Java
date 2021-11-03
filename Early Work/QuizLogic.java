/* dog-tor
 *
 * 10/28/2013
 * 
 * This program will print out the answer to the questions 2, 7, 8, 9, 10, 11, and 12.
 * 
 */

public class QuizLogic
{
    public static void main(String[] args)
    {
        System.out.println("                                ___               _______   ____                 ___        ___     _____     ___             ");
		System.out.println("                              /     \\   |      |     |         /        |      /     \\    /     \\     |     /     \\           ");
		System.out.println("                             |       |  |      |     |        /         |     |       |  |    ___     |    |                  ");
		System.out.println("                             |     \\ |  |      |     |       /          |     |       |  |       |    |    |                  ");
		System.out.println("                              \\ ___ /\\   \\____/   ___|___   /____       |____  \\ ___ /    \\ ___ /   __|__   \\ ___ /           ");
		System.out.println();
		System.out.println();

        System.out.println("                                                              Question 2");
        System.out.println("                                                              ----------");
		System.out.print("                                                              ");
        for (int x = 1; x < 5; x++)
        {
            System.out.print(x + ", ");
        }
        
        System.out.println();
		System.out.println();
        
        System.out.println("                                                              Question 7");
        System.out.println("                                                              ----------");
        int x = 12;
        
        if (x < 12 || x >= 45)
        {
            System.out.println("                                                              What?");
        }
        else
        {
            System.out.println("                                                              No way!");
        }
        
        System.out.println();
        
        System.out.println("                                                              Question 8");
        System.out.println("                                                              ----------");
        int y = 25;
        
        if (y < 23 || y > 25)
        {
            System.out.println("                                                              What?");
        }
        else if (y < 50 && y < 20)
        {
            System.out.println("                                                              JAVA");
        }
        else if (y >= 0 && y <= 23)
        {
            System.out.println("                                                              Where?");
        }
        else
        {
            System.out.println("                                                              I'm not confused!!!");
        }
        
        System.out.println();
        
        System.out.println("                                                              Question 9");
        System.out.println("                                                              ----------");
		System.out.print("                                                              ");
        for (int z = 5; z < 11; z = z + 2)
        {
            if (z != 9)
            {
                System.out.print(z + ", ");
            }
        }
        
        System.out.println();
		System.out.println();
        
        System.out.println("                                                              Question 10");
        System.out.println("                                                              -----------");
		System.out.print("                                                              ");
        for (int a = 1; a <= 5; a++)
        {
            if (a >= 5)
            {
                System.out.print(a + ", ");
            }
            else
            {
                System.out.print("OK");
            }
        }
        
        System.out.println();
		System.out.println();

        System.out.println("                                                              Question 11");
        System.out.println("                                                              -----------");
		System.out.print("                                                              ");
        for (int b = 0; b < 11; b = b + 5)
        {
            if (b >= 5)
            {
                System.out.print("*" + b + ", ");
            }
        }
        
        System.out.println();
		System.out.println();
        
        System.out.println("                                                              Question 12");
        System.out.println("                                                              -----------");
		System.out.print("                                                              ");
        int c = 4;
        if (c >= 4)
        {
            if ( c != 13)
            {
                System.out.print("Dude!");
            }
            else if (c <= 13)
            {
                System.out.print("Hello!");
            }
        }
        else
        {
            System.out.print("GoodBye!");
        }
    }
}