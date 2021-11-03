/**
 * dog-tor
 *
 * 3/20/2014
 * 
 * This program will be an abstract SuperClass that has a default constructor and two abstract methods.
 */
public class Family extends Car
{
    private int children = 0;
    private boolean hasGoodGasMileage = false;
    
    public Family()
    {
        System.out.println(">> Family default constructor. <<");
        System.out.println("Class Name: " + getClass().getName());
    }
    
    public int getChildren()
    {
        return children;
    }
    
    public boolean getHasGoodGasMileage()
    {
        return hasGoodGasMileage;
    }
    
    public void setChildren(int x)
    {
        children = x;
    }
    
    public void setHasGoodGasMileage(boolean x)
    {
        hasGoodGasMileage = x;
    }
    
    public String sound()
    {
        return ("\nSound for Family" + 
                "\n  Beep");
    }
    
    public String miles()
    {
        return ("\nMiles for Family" + 
                "\n  200");
    }
    
    public String toString()
    {
        return ("\nToString for Family" + 
                "\nVehicleID: " + getVehicleID() +
                "\nColor: " + getColor() +
                "\nIs Automatic: " + getIsAutomatic() +
                "\nHas Sun Roof: " + getHasSunRoof() +
                "\nChildren: " + children +
                "\nHas Good Gas Mileage: " + hasGoodGasMileage);
    }
}