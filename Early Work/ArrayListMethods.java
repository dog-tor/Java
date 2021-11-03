/** dog-tor
 *  4-21-14
 *  
 *  This program will demonstrate ArrayList methods.
 */
import java.util.*;
public class ArrayListMethods
{
    public static void main (String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        
        System.out.println("              The ArrayList is empty: " + names.isEmpty());
        
        System.out.println("              Adding names to the array list...");

        names.add("Joe Who");
        names.add("Linda Sue");
        names.add("Jack Black");
        names.add("Batman");
        names.add("Spiderman");
        names.add("dog-tor is a BAMF yeeee boii");
        
        System.out.println("              The ArrayList is empty: " + names.isEmpty());
        System.out.println("              The size of ArrayList is: " + names.size());
        System.out.println("              Adding value Michael to index 6...");
        names.add(6,"Michael");
        System.out.println("              replacing index 6 with the value Billy...");
        names.set(6,"Billy");
        System.out.println("              The returned value from the 6th position is: " + names.get(6));
        System.out.println("              The array list contain the name Jacky: " + names.contains("Jacky"));
        System.out.println("              Removing the value Billy from the 6th position of the ArrayList...");
        names.remove(6);
        System.out.println("              The returned index of the 1st value found of Batman is: " + names.indexOf("Batman"));
        System.out.println();
        System.out.println();
        System.out.println("              Then names in the array list are: ");
        
        for (String x : names)
        {
            System.out.println("                            " + x);
        }
    }
}