/** dog-tor
 *  2-12-14
 *
 *  
 *  This program will 
 */

public class Cat
{
    private String name = "Garfield";
    
    // default constructor. Runs once when an object is created
    public Cat()
    {
        System.out.println("Cat default constructor");
        name = "unknown";
    }
    
    public Cat(String x)
    {
        System.out.println("Cat constructor with a String value passed.");
        name = x;
    }
    // This method describes how to print an object.
    public String toString()
    {
        System.out.println("Cat toString method running");
        return ("\nMy Cat's name is " + name);
    }
}