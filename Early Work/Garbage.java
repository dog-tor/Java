/**
 * dog-tor
 *
 * 3/20/2014
 * 
 * This program will be an abstract SuperClass that has a default constructor and two abstract methods.
 */
public class Garbage extends Truck
{
    private int poundsOfGarbage = 0;
    private boolean hasRoboticArm = false;
    
    public Garbage()
    {
        System.out.println(">> Garbage default constructor. <<");
        System.out.println("Class Name: " + getClass().getName());
    }
    
    public int getPoundsOfGarbage()
    {
        return poundsOfGarbage;
    }
    
    public boolean getHasRoboticArm()
    {
        return hasRoboticArm;
    }
    
    public void setPoundsOfGarbage(int x)
    {
        poundsOfGarbage = x;
    }
    
    public void setHasRoboticArm(boolean x)
    {
        hasRoboticArm = x;
    }
    
    public String sound()
    {
        return ("\nSound for Garbage" + 
                "\n  Low Honk");
    }
    
    public String miles()
    {
        return ("\nMiles for Garbage" + 
                "\n  50");
    }
    
    public String toString()
    {
        return ("\nToString for Garbage" + 
                "\nVehicleID: " + getVehicleID() +
                "\nColor: " + getColor() +
                "\nCargo Capacity: " + getCargoCapacity() +
                "\nTow Package: " + getTowPackage() +
                "\nPounds Of Garbage: " + poundsOfGarbage +
                "\nHas Robotic Arm: " + hasRoboticArm);
    }
}