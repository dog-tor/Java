/**
 * dog-tor
 *
 * 3/20/2014
 * 
 * This program will be an abstract SuperClass that has a default constructor and two abstract methods.
 */
public abstract class Truck extends Vehicle
{
    private int cargoCapacity = 0;
    private boolean towPackage = false;
    
    public Truck()
    {
        System.out.println("> Truck default constructor. <");
    }
    
    public int getCargoCapacity()
    {
        return cargoCapacity;
    }
    
    public boolean getTowPackage()
    {
        return towPackage;
    }
    
    public void setCargoCapacity(int x)
    {
        cargoCapacity = x;
    }
    
    public void setTowPackage(boolean x)
    {
        towPackage = x;
    }
    
    public String sound()
    {
        return ("\nSound for Truck" + 
                "\n  Loud Honk");
    }
    
    public String toString()
    {
        return ("\nToString for Truck" + 
                "\nVehicleID: " + getVehicleID() +
                "\nColor: " + getColor() +
                "\nCargo Capacity: " + cargoCapacity +
                "\nTow Package: " + towPackage);
    }
    
    abstract public String miles();
}