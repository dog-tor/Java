/* dog-tor
 *
 * 9/11/2013
 * 
 * This program will define the basic data types int and double; add, subtracts, multiplies, and divides the numbers together and prints the values to the screen.
 * 
 */
public class NumberFun
{
    public static void main(String[] args)
    {
        int cats = 42;
        int dogs = 62;
        int intTotal = cats + dogs;
        int moreDogs = dogs - cats;
        
        double money = 8;
        double tHours = 20;
        double totalMoney = money * tHours;
        double hoursPD = tHours / 4;
        
        System.out.println("dog-tor");
        System.out.println("09/11/2013");
        System.out.println();
        System.out.println("Number Fun");
        System.out.println("----------");
        System.out.println();
        System.out.println("Addition & Subtraction:");
        System.out.println();
        System.out.println("There are " + cats + " cats.");
        System.out.println("There are " + dogs + " dogs.");
        System.out.println();
        System.out.println("There are " + intTotal + " animals total.");
        System.out.println("There are " + moreDogs + " more dogs than cats.");
        System.out.println();
        System.out.println("Multiplication & division:");
        System.out.println();
        System.out.println("John makes $" + money + " per hour.");
        System.out.println("John gets " + tHours + " per week.");
        System.out.println();
        System.out.println("John makes $" + totalMoney + " hours per week.");
        System.out.println();
        System.out.println("If John works the same amount of hours per day for 4 days");
        System.out.println("a week, then how many hours does he work for each day?");
        System.out.println();
        System.out.println("If he works " + tHours + " hours a week and you divide that by 4 days");
        System.out.println("then he works for a total of " + hoursPD + " hours per day.");
    }
}