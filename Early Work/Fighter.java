/**
 * dog-tor
 *
 * 3/20/2014
 * 
 * This program will be an abstract SuperClass that has a default constructor and two abstract methods.
 */
public class Fighter extends Plane
{
    private int missles = 0;
    private int bullets = 0;
    
    public Fighter()
    {
        System.out.println(">> Fighter default constructor. <<");
        System.out.println("Class Name: " + getClass().getName());
    }
    
    public int getMissles()
    {
        return missles;
    }
    
    public int getBullets()
    {
        return bullets;
    }
    
    public void setMissles(int x)
    {
        missles = x;
    }
    
    public void setBullets(int x)
    {
        bullets = x;
    }
    
    public String sound()
    {
        return ("\nSound for Fighter" + 
                "\n  Swish");
    }
    
    public String miles()
    {
        return ("\nMiles for Fighter" + 
                "\n  1052");
    }
    
    public String toString()
    {
        return ("\nToString for Fighter" + 
                "\nVehicleID: " + getVehicleID() +
                "\nColor: " + getColor() +
                "\nPilots: " + getPilots() +
                "\nParachutes: " + getParachutes() +
                "\nMissles: " + missles +
                "\nBullets: " + bullets);
    }
}