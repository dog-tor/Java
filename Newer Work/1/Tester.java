/*
 * This program will is a demo of a Square class implemented based off of a UML class diagram. 
 * The Square class will have its own methods that we will call in this Tester class which will get and set 
 * the length of the square's sides, and return its area. 
 */
package test;

/**
 *
 * @author dog-tor
 */
public class Tester {
    
    /**
    * @param args - The command line arguments.
    */
    public static void main(String[] args)
    {
        Square shape = new Square(5.0); // Set the side length for the square.
        
        System.out.println("The length of a side of this square is " + shape.getSide() + "."); // Call the square's side length.

        shape.setSide(9.0); // Change the square's side length.
        
        System.out.println("The length of a side of this square is " + shape.getSide() + "."); // Call the square's side length again.
        System.out.println("The area of this square is " + shape.getArea() + "."); // Call the square's area.
    }    
}