/**
 * dog-tor
 *
 * 3/20/2014
 * 
 * This program will be an abstract SuperClass that has a default constructor and two abstract methods.
 */
public class Passenger extends Plane
{
    private int attendants = 0;
    private int blankets = 0;
    
    public Passenger()
    {
        System.out.println(">> Passenger default constructor. <<");
        System.out.println("Class Name: " + getClass().getName());
    }
    
    public int getAttendants()
    {
        return attendants;
    }
    
    public int getBlankets()
    {
        return blankets;
    }
    
    public void setAttendants(int x)
    {
        attendants = x;
    }
    
    public void setBlankets(int x)
    {
        blankets = x;
    }
    
    public String sound()
    {
        return ("\nSound for Passenger" + 
                "\n  Loud Swish");
    }
    
    public String miles()
    {
        return ("\nMiles for Passenger" + 
                "\n  5002");
    }
    
    public String toString()
    {
        return ("\nToString for Passenger" + 
                "\nVehicleID: " + getVehicleID() +
                "\nColor: " + getColor() +
                "\nPilots: " + getPilots() +
                "\nParachutes: " + getParachutes() +
                "\nAttendants: " + attendants +
                "\nBlankets: " + blankets);
    }
}