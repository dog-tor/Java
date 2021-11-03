/*
 * This program will take two values from input and find the mean.
 */

package geometricmean_dog-tor;
import javax.swing.JOptionPane;
/**
 *
 * @author dog-tor
 */
public class GeometricMean_dog-tor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String input = "";
        double number1 = 0.0;
        double number2 = 0.0;
        double result = 0.0;
        
        input = JOptionPane.showInputDialog("Please enter the first number.");
        number1 = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Please enter the second number.");
        number2 = Double.parseDouble(input);
        
        JOptionPane.showMessageDialog(null, "The geometric mean of these two numbers is " + (result = Math.sqrt(number1 * number2)));
        
        System.exit(0);
    }
    
}
