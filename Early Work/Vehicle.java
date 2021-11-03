/**
 * dog-tor
 *
 * 3/20/2014
 * 
 * This program will be an abstract SuperClass that has a default constructor and two abstract methods.
 */
public abstract class Vehicle
{
    private String vehicleID = "ZKL967";
    private String color = "Blue";
    public Vehicle()
    {
        System.out.println("Vehicle default constructor.");
    }
    
    public String getVehicleID()
    {
        return vehicleID;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public void setVehicleID(String x)
    {
        vehicleID = x;
    }
    
    public void setColor(String x)
    {
        color = x;
    }
    
    abstract public String sound();
    
    abstract public String toString();
}