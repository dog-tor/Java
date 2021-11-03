/**
 * dog-tor
 *
 * 3/20/2014
 * 
 * This program will be an abstract SuperClass that has a default constructor and two abstract methods.
 */
public class Sports extends Car
{
    private double zeroToSixty = 0.0;
    private boolean hasNitrous = false;
    
    public Sports()
    {
        System.out.println(">> Sports default constructor. <<");
        System.out.println("Class Name: " + getClass().getName());
    }
    
    public double getZeroToSixty()
    {
        return zeroToSixty;
    }
    
    public boolean getHasNitrous()
    {
        return hasNitrous;
    }
    
    public void setZeroToSixty(double x)
    {
        zeroToSixty = x;
    }
    
    public void setHasNitrous(boolean x)
    {
        hasNitrous = x;
    }
    
    public String sound()
    {
        return ("\nSound for Sports" + 
                "\n  Honk");
    }
    
    public String miles()
    {
        return ("\nMiles for Sports" + 
                "\n  104");
    }
    
    public String toString()
    {
        return ("\nToString for Sports" + 
                "\nVehicleID: " + getVehicleID() +
                "\nColor: " + getColor() +
                "\nIs Automatic: " + getIsAutomatic() +
                "\nHas Sun Roof: " + getHasSunRoof() +
                "\nZero To Sixty: " + zeroToSixty +
                "\nHas Nitrous: " + hasNitrous);
    }
}