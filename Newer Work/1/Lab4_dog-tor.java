/*
 * This program will use the JOptionPane class and switch statements to match terms and create flash cards used to study for the exam.
 */
package lab4_dog-tor;

/**
 *
 * @author dog-tor
 */
import javax.swing.JOptionPane;
public class Lab4_dog-tor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String choice = ""; // Declaring a string named choice
        choice = JOptionPane.showInputDialog("Select one of the following five terms:\n 1. Declaration\n 2. Assignment\n 3. Initialization\n 4. Sequential Structure\n 5. Decision Structure");
        
        switch (choice) { //here we are starting our switch for the input of choice
            case "1":   //if the input is equal to 1 then:
                JOptionPane.showMessageDialog(null, "Stating the name of a variable and the type of data it will hold.");
                break;
            case "2":   //if the input is equal to 2 then:
                JOptionPane.showMessageDialog(null, "Storing a value into a variable.");
                break;
            case "3":   //if the input is equal to 3 then:
                JOptionPane.showMessageDialog(null, "First time a value is stored into a variable.");
                break;
            case "4":   //if the input is equal to 4 then:
                JOptionPane.showMessageDialog(null, "Statements are executed one after the other without branching off in another direction.");
                break;
            case "5":   //if the input is equal to 5 then:
                JOptionPane.showMessageDialog(null, "Specific actions are taken based on some condition.");
                break;
            default:    //if the input is not 1, 2, 3, 4, or 5 then:
                JOptionPane.showMessageDialog(null, "Please indicate either 1, 2, 3, 4, or 5.");
            
        }
        
        System.exit(0); //always use this method when ending a program using JOptionPane to prevent errors.
        
    }
    
}
