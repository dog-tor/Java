/**
 * dog-tor
 * 3/20/2014
 * 
 * This program will be an abstract SuperClass that has a default constructor and two abstract methods.
 */
public abstract class Car extends Vehicle
{
    private boolean isAutomatic = false;
    private boolean hasSunRoof = false;
    
    public Car()
    {
        System.out.println("> Car default constructor. <");
    }
    
    public boolean getIsAutomatic()
    {
        return isAutomatic;
    }
    
    public boolean getHasSunRoof()
    {
        return hasSunRoof;
    }
    
    public void setIsAutomatic(boolean x)
    {
        isAutomatic = x;
    }
    
    public void setHasSunRoof(boolean x)
    {
        hasSunRoof = x;
    }
    
    public String sound()
    {
        return ("\nSound for Car" + 
                "\n  Beep");
    }
    
    public String toString()
    {
        return ("\nToString for Car" + 
                "\nVehicleID: " + getVehicleID() +
                "\nColor: " + getColor() +
                "\nIs Automatic: " + isAutomatic +
                "\nHas Sun Roof: " + hasSunRoof);
    }
    
    abstract public String miles();
}