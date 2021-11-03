/**
 * dog-tor
 *
 * 3/20/2014
 * 
 * This program will be an abstract SuperClass that has a default constructor and two abstract methods.
 */
public abstract class Ship extends Vehicle
{
    private int anchors = 0;
    private int lifeVests = 0;
    
    public Ship()
    {
        System.out.println("> Ship default constructor. <");
    }
    
    public int getAnchors()
    {
        return anchors;
    }
    
    public int getLifeVests()
    {
        return lifeVests;
    }
    
    public void setAnchors(int x)
    {
        anchors = x;
    }
    
    public void setLifeVests(int x)
    {
        lifeVests = x;
    }
    
    public String sound()
    {
        return ("\nSound for Ship" + 
                "\n  Loud Horn");
    }
    
    public String toString()
    {
        return ("\nToString for Ship" + 
                "\nVehicleID: " + getVehicleID() +
                "\nColor: " + getColor() +
                "\nAnchors: " + anchors +
                "\nLife Vests: " + lifeVests);
    }
    
    abstract public String miles();
}