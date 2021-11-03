/*
 * This program will calculate and record the performance of a computer processor specified by the user from multiple data points entered and will append this data to a text file.
 */
package lab9_dog-tor;

/**
 *
 * @author dog-tor
 */
import javax.swing.JOptionPane; // "[I]mport the methods necessary for using dialog boxes and accessing files for writes" (Earwood, 2020).
import java.io.*;
public class Lab9_dog-tor {

    /**
     * @param args - The command line arguments.
     */
    public static void main(String[] args) throws IOException
    {
        String processor = ""; // "Declare a String for the name of the processor" (Earwood, 2020).
        processor = requestData("Please enter the processor name: "); // "Call the requestData method with a message requesting a processor name; store the value returned into the String variable for the name" (Earwood, 2020).
        
        double product = 1; // "Declare variables to hold all of the temporary values for a geometric mean calculation (refer to lab 5)" (Earwood, 2020).
        double input = 0;
        double inputCount = 0;
        double geoMean = 0;
        String dataPoints = ""; // "Additionally, declare a String variable to hold all of the data points" (Earwood, 2020).
        
        while (input != -1 && input >= 0) // "Continuously request data points from the user until the sentinel value of -1 is entered" (Earwood, 2020).
        {
            input = Double.parseDouble(requestData("Please enter a data point.")); // "requestData returns a String; remember to convert this to a double to perform any math operations" (Earwood, 2020).
            if (input >= 1)
            {
                product = input * product;
                inputCount++; // Increase the input count every time the user enters a valid number.
                dataPoints = dataPoints + " " + input; // "[C]oncatenate the values to the String variable for the data points" (Earwood, 2020).
            }
            else if (input < 1 && input != -1)
            {
                JOptionPane.showMessageDialog(null, "Computer processors do not run at negative speeds. Please enter -1 if you are done.");
                input = 1; // Change input value to a 1 to continue the loop.
            }
        }
        
        geoMean = getGeoMean(product, inputCount); // "Call getGeoMean and pass in the product and count; store the result returned into another variable" (Earwood, 2020).
        
        if (input == -1)
        {
            JOptionPane.showMessageDialog(null, "The overall performance for the " + processor + String.format(" on these benchmarks is %.2f", geoMean) + "."); // "Use the showMessageDialog method to display the final metric for this processor" (Earwood, 2020).
            
        }

        writeFile(processor, dataPoints, geoMean);// "[W]rite the name, data points, and geometric mean to the file" (Earwood, 2020).
	
        System.exit(0); // "[E]xit the program properly" (Earwood, 2020). // Always use this method when ending a program using JOptionPane to prevent errors. 
        
    }
    /**
     * requestData - This method will request data from the user by using the JOptionPane dialog box and assign the given value to a string and return that value.
     * @param inputData - This is the data entered into the input dialogs.
     * @return String - This is the name of the processor given.
     */
    public static String requestData(String inputData) 
    {
        inputData = JOptionPane.showInputDialog(inputData); // "Display an input dialog with a message passed into the method" (Earwood, 2020).
        return inputData; // "Return the value input by the user" (Earwood, 2020).
    }
    /**
     * getGeoMean - This method will accept multiple input points and will calculate the geometric mean and return it.
     * @param product - This is the product of the data points.
     * @param inputCount - The input count.
     * @return double - This is the results from the geometric mean calculation.
     */
    public static double getGeoMean(double product, double inputCount) 
    {
	double geoMean = 1;
        geoMean = Math.pow(product, 1/inputCount);// "Return the result of getting the nth-root of the data points" (Earwood, 2020).
        return geoMean;
    }
    /**
     * writeFile - This method will write the name of the processor, the value of the specified data points, and the geometric mean to a file called processor.txt.
     * @param processor - This is the name of the processor.
     * @param dataPoints - This is the data points entered by the user.
     * @param geoMean - This is the geometric mean.
     * @throws IOException - This exception is required as we are accessing a file in this method.
     */
    public static void writeFile(String processor, String dataPoints, double geoMean) throws IOException 
    {
        FileWriter fWriter = new FileWriter("processor.txt", true);// "Declare and initialize the FileWriter and PrintWriter" (Earwood, 2020).
	PrintWriter outputFile = new PrintWriter(fWriter); 
	outputFile.println("Name: " + processor); // "Write the data passed into the method to the file" (Earwood, 2020).
        outputFile.println("Data Points:" + dataPoints);
        outputFile.println("Overall: " + geoMean);
	outputFile.close(); // "Close the file" (Earwood, 2020).
    }
    
}

/**
 *                                                 Works Cited
 * 
 * Earwood, B. (2020). 
 */