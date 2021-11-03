/**
 * dog-tor
 *
 * 3/20/2014
 * 
 * This program will be an abstract SuperClass that has a default constructor and two abstract methods.
 */
public class Cruise extends Ship
{
    private int pools = 0;
    private int slides = 0;
    
    public Cruise()
    {
        System.out.println(">> Cruise default constructor. <<");
        System.out.println("Class Name: " + getClass().getName());
    }
    
    public int getPools()
    {
        return pools;
    }
    
    public int getSlides()
    {
        return slides;
    }
    
    public void setPools(int x)
    {
        pools = x;
    }
    
    public void setSlides(int x)
    {
        slides = x;
    }
    
    public String sound()
    {
        return ("\nSound for Cruise" + 
                "\n  Fog Horn");
    }
    
    public String miles()
    {
        return ("\nMiles for Cruise" + 
                "\n  500");
    }
    
    public String toString()
    {
        return ("\nToString for Cruise" + 
                "\nVehicleID: " + getVehicleID() +
                "\nColor: " + getColor() +
                "\nAnchors: " + getAnchors() +
                "\nLife Vests: " + getLifeVests() +
                "\nPools: " + pools +
                "\nSlides: " + slides);
    }
}