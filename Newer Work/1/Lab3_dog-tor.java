/*
 * This program will take three strings from the input and return them in alphabetical order.
 */

package lab3_dog-tor;
/**
 *
 * @author dog-tor
 */
import java.util.Scanner;
public class Lab3_dog-tor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        String first = "";
        String second = "";
        String third = "";
        String firstfinal = "";
        String secondfinal = "";
        String thirdfinal = "";
        int firstint = 1;
        int secondint = 2;
        int thirdint = 3;
        
        System.out.print("Please enter the first word: ");
        first = keyboard.next();
        
        System.out.print("Please enter the second word: ");
        second = keyboard.next();
        
        System.out.print("Please enter the third word: ");
        third = keyboard.next();
        
        //System.out.println("first to second " + first.compareTo(second));
        //System.out.println("first to third " + first.compareTo(third));
        
        //System.out.println("second to first " + second.compareToIgnoreCase(first));
        //System.out.println("second to third " + second.compareToIgnoreCase(third));
        
        //System.out.println("third to first " + third.compareToIgnoreCase(first));
        //System.out.println("third to second " + third.compareToIgnoreCase(second));
        
        firstint = first.compareTo(second) + first.compareTo(third);
        secondint = second.compareTo(first) + second.compareTo(third);
        thirdint = third.compareTo(first) + third.compareTo(second);
        
        if (firstint < secondint && secondint < thirdint && firstint < thirdint)
        {
            System.out.println(first);
            System.out.println(second);
            System.out.println(third);
        }
        
        if (firstint < secondint && secondint > thirdint && firstint < thirdint)
        {
            System.out.println(first);
            System.out.println(third);
            System.out.println(second);
        }
        
        if (firstint > secondint && secondint < thirdint && firstint < thirdint)
        {
            System.out.println(second);
            System.out.println(first);
            System.out.println(third);
        }
        
        if (firstint < secondint && secondint > thirdint && firstint > thirdint)
        {
            System.out.println(second);
            System.out.println(third);
            System.out.println(first);
        }
        
        if (firstint > secondint && secondint < thirdint && firstint > thirdint)
        {
            System.out.println(third);
            System.out.println(first);
            System.out.println(second);
        }
        
        if (firstint > secondint && secondint > thirdint && firstint > thirdint)
        {
            System.out.println(third);
            System.out.println(second);
            System.out.println(first);
        }
        
        if (firstint == secondint && secondint < thirdint)
        {
            System.out.println(first + " " + second);
            System.out.println(third);
        }
        
        if (firstint == secondint && secondint > thirdint)
        {
            System.out.println(third);
            System.out.println(first + " " + second);
        }
        
        if (firstint == thirdint && secondint < thirdint)
        {
            System.out.println(second);
            System.out.println(first + " " + third);
        }
        
        if (firstint == thirdint && secondint > thirdint)
        {
            System.out.println(first + " " + third);
            System.out.println(second);
            
        }
        
        if (secondint == thirdint && secondint > firstint)
        {
            System.out.println(first);
            System.out.println(second + " " + third);
            
        }
        
        if (secondint == thirdint && secondint < firstint)
        {
            System.out.println(second + " " + third);
            System.out.println(first);
        }
        
    }
    
}
