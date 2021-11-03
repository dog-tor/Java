/**
 * dog-tor
 *
 * 3/20/2014
 * 
 * This program will be an abstract SuperClass that has a default constructor and two abstract methods.
 */
public class Yacht extends Ship
{
    private int cabins = 0;
    private int chefs = 0;
    
    public Yacht()
    {
        System.out.println(">> Yacht default constructor. <<");
        System.out.println("Class Name: " + getClass().getName());
    }
    
    public int getCabins()
    {
        return cabins;
    }
    
    public int getChefs()
    {
        return chefs;
    }
    
    public void setCabins(int x)
    {
        cabins = x;
    }
    
    public void setChefs(int x)
    {
        chefs = x;
    }
    
    public String sound()
    {
        return ("\nSound for Yacht" + 
                "\n  Loud Horn");
    }
    
    public String miles()
    {
        return ("\nMiles for Yacht" + 
                "\n  30");
    }
    
    public String toString()
    {
        return ("\nToString for Yacht" + 
                "\nVehicleID: " + getVehicleID() +
                "\nColor: " + getColor() +
                "\nAnchors: " + getAnchors() +
                "\nLife Vests: " + getLifeVests() +
                "\nCabins: " + cabins +
                "\nChefs: " + chefs);
    }
}