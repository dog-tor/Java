/**
 * dog-tor
 *
 * 3/20/2014
 * 
 * This program will be an abstract SuperClass that has a default constructor and two abstract methods.
 */
public abstract class Plane extends Vehicle
{
    private int pilots = 0;
    private int parachutes = 0;
    
    public Plane()
    {
        System.out.println("> Plane default constructor. <");
    }
    
    public int getPilots()
    {
        return pilots;
    }
    
    public int getParachutes()
    {
        return parachutes;
    }
    
    public void setPilots(int x)
    {
        pilots = x;
    }
    
    public void setParachutes(int x)
    {
        parachutes = x;
    }
    
    public String sound()
    {
        return ("\nSound for Plane" + 
                "\n  Loud Swish");
    }
    
    public String toString()
    {
        return ("\nToString for Plane" + 
                "\nVehicleID: " + getVehicleID() +
                "\nColor: " + getColor() +
                "\nPilots: " + pilots +
                "\nParachutes: " + parachutes);
    }
    
    abstract public String miles();
}