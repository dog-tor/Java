/**
 * dog-tor
 *
 * 3/20/2014
 * 
 * This program will be an abstract SuperClass that has a default constructor and two abstract methods.
 */
public class Cargo extends Truck
{
    private int wheels = 0;
    private boolean camper = false;
    
    public Cargo()
    {
        System.out.println(">> Cargo default constructor. <<");
        System.out.println("Class Name: " + getClass().getName());
    }
    
    public int getWheels()
    {
        return wheels;
    }
    
    public boolean getCamper()
    {
        return camper;
    }
    
    public void setWheels(int x)
    {
        wheels = x;
    }
    
    public void setCamper(boolean x)
    {
        camper = x;
    }
    
    public String sound()
    {
        return ("\nSound for Cargo" + 
                "\n  Loud Honk");
    }
    
    public String miles()
    {
        return ("\nMiles for Cargo" + 
                "\n  406");
    }
    
    public String toString()
    {
        return ("\nToString for Cargo" + 
                "\nVehicleID: " + getVehicleID() +
                "\nColor: " + getColor() +
                "\nCargo Capacity: " + getCargoCapacity() +
                "\nTow Package: " + getTowPackage() +
                "\nWheels: " + wheels +
                "\nCamper: " + camper);
    }
}