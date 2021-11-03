/*
 * Please see Tester.java for the program's description.
 */
package test;

/**
 *
 * @author dog-tor
 */
public class Square {
    
    private double side;

    
    public Square(double newSide)
    {
        side = newSide;
    } 
    
    public void setSide(double newSide)
    {
        side = newSide;
    }
    
    public double getSide()
    {
        return side;
    }
    
    public double getArea()
    {
        return side * side;
    }
    
}
