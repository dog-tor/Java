
package lab1_dog-tor;

/**
 * This program will print to the screen the value of English units compared to Metric units.
 * @author dog-tor.
 **/
public class Lab1_dog-tor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //The following three variables will be English units.
        double miles = 5.4979;
        double gallons = 80;
        double pounds = 137;
        
        //The following three variables will be Metric units.
        double kilometers = miles * 1.60934;
        double liters = gallons * 3.78541;
        double kilograms = pounds * 0.453592;
        
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
        System.out.println(gallons + " gallons is equal to " + liters + " liters.");
        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.");
    }
    
}
