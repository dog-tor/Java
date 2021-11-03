/*
 * This program will accept a password with complexity requirements similar to NIST Special Publication 800-63B or 
 * randomly generate a password for the user and append it to the famous rockyou.txt password list file after verifying it has not been reused.
 * It will also accept a user's full name, username, password, and department, and place this information in another text file 
 * to be used by system administrators for easier account creation proceedures.
 */


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author dog-tor
 */
public class SemesterProject_dog-tor {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        String name = "";
        String department = "";
        String username = "";
        String password = "";
        
        name = requestData("Please enter your full name: "); // Request and append input data to a text file.
        department = requestData("Please enter your department: ");
        username = requestData("Please enter your username: ");
        password = requestData("Please enter a password that meets the following requirements, or type \"gen\" to have one generated for you.\n" + 
                "\n          1. Contains at least 8 characters" + 
                "\n          2. Contains at least 1 number" +
                "\n          3. Contains at least 1 of the following special characters: `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?" +
                "\n          4. Contains at least 1 capital letter" +
                "\n          5. Contains at least 1 lowercase letter\n ");
        
        if (password.equalsIgnoreCase("gen")) // If user wants a password generated for them then this will run
        {
            password = passGen();
            JOptionPane.showMessageDialog(null, "               Your generated password is: \n\n                                  " + 
                    password + "\n\n Please write this down, and keep it somewhere safe.");
        }
        
        if (readFile().contains(password) || password.length() < 8 || passReqs(password) == false)
        {
            while (readFile().contains(password) || password.length() < 8 || passReqs(password) == false)
            {
                password = requestData("\n          ***The password you entered does not meet one or more of the following requirements or has been compromised in previous security breeches.***\n\n" + 
                "          Please enter a new password that meets the following requirements, or type \"gen\" to have one generated for you.\n" + 
                "\n          1. Contains at least 8 characters" + 
                "\n          2. Contains at least 1 number" +
                "\n          3. Contains at least 1 special character such as: `~!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?" +
                "\n          4. Contains at least 1 capital letter" +
                "\n          5. Contains at least 1 lowercase letter\n ");
                
                if (password.equalsIgnoreCase("gen"))
                {
                    password = passGen();
                    JOptionPane.showMessageDialog(null, "               Your generated password is: \n\n                                  " + 
                    password + "\n\n Please write this down, and keep it somewhere safe.");
                }
            }
        }
        
        writeFile(name, department, username, password);// Write the user's name, department, username, and password to the file.
        writeList(password);// Write the user's password to the password list.
	
        System.exit(0); // Always use this method when ending a program using JOptionPane to prevent errors and exit the program properly. 
    }
    
    /**passReqs This method will check to see if the password meets the complexity requirements.
    * @return boolean - Whether or not the supplied password passes the requirements.
    */
    public static boolean passReqs(String password)
    {
        String[] numReqs = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] upLetterReqs = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] lowLetterReqs = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] specialReqs = {"`", "~", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "=", "+", "[", "{", "]", "}", "\\", "|", ";", ":", "'", "\"", ",", "<", ".", ">", "/", "?"};
        boolean num = false; // Set the values to false so that it must pass the test to be true.
        boolean up = false;
        boolean low = false;
        boolean spec = false;
        
        for (String item : numReqs) // Create a loop to iterate over every element in the array.
        {
            if (password.contains(item)) 
            {
                num = true; // Set the value to true if the string contains an element in the array.
            }
        }
        for (String item : upLetterReqs) 
        {
            if (password.contains(item)) 
            {
                up = true;
            }
        }
        for (String item : lowLetterReqs) 
        {
            if (password.contains(item)) 
            {
                low = true;
            }
        }
        for (String item : specialReqs) 
        {
            if (password.contains(item)) 
            {
                spec = true;
            }
        }
        if (num == true && up == true && low == true && spec == true)
        {
            return true; // If password meets requirements by containing an element in each of the arrays then true will be returned.
        }
        else
        return false;
    }
    
    /**passGen This method will generate a complex password for the user.
    * @return String - Contents of the password.
    */
    public static String passGen()
    {
        String[] numReqs = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] upLetterReqs = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] lowLetterReqs = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] specialReqs = {"`", "~", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "=", "+", "[", "{", "]", "}", "\\", "|", ";", ":", "'", "\"", ",", "<", ".", ">", "/", "?"};
        
        String genData = "";
        String genPass = "";
        
        Random randID = new Random(); // Create a random object to parse through each element of each array.
        
        for (int i = 0; i < 2; i++) // for loop to cycle through the generation twice to meet the 8 character requirement.
        {
            int numID = randID.nextInt(numReqs.length); // Create an ID for the location in the array.
            genData = (numReqs[numID]); // Assign the value of the arrays element to a string.
            genPass += genData; // Assign that value to another string to concatenate the values.
            
            int upID = randID.nextInt(upLetterReqs.length);
            genData = (upLetterReqs[upID]);
            genPass += genData;

            int lowID = randID.nextInt(lowLetterReqs.length);
            genData = (lowLetterReqs[lowID]);
            genPass += genData;
            
            int specID = randID.nextInt(specialReqs.length);
            genData = (specialReqs[specID]);
            genPass += genData;
        }

        char[] charArray = genPass.toCharArray(); // Convert and assign the generated password to a char array.
        for (int i = 0; i < charArray.length; i++) 
        {
            int randIndex = randID.nextInt(charArray.length); // Create a random index integer based off of the array's length.
            char c = charArray[i]; // Assign a char equal to the counted index in the array.
            charArray[i] = charArray[randIndex]; // Assign the random element of the array to the counter index.
            charArray[randIndex] = c; // Assign array of randIndex to the char.
        }
        
        return new String(charArray); // Convert charArray to a string and return the value which is now 8 characters long and shuffled.
    }
    
    /**
     * requestData - This method will request data from the user by using the JOptionPane dialog box and assign the given value to a string and return that value.
     * @param inputData - This is the data entered into the input dialogs.
     * @return String - This is the data entered by the user.
     */
    public static String requestData(String inputData) 
    {
        inputData = JOptionPane.showInputDialog(inputData); // Display an input dialog with a message passed into the method.
        return inputData; // Return the value inputted by the user.
    }
    
    /**readFile This method will be used to read data from a file.
    * @return String - Contents of the password list.
    * @throws IOException - This exception is required as we are accessing a file to prevent errors.
    */
    public static String readFile() throws IOException 
    {
        File myFile = new File("rockyou.txt");
	Scanner inputFile;
        String readData = "";
        
            if (!myFile.exists())
            {
                System.out.println("The password list file does not exist.");
                System.exit(0);	
            }
            else
            {
                inputFile = new Scanner(myFile);
                readData = inputFile.useDelimiter("\\Z").next(); // This uses the useDelimiter() method to delimit the input with \Z which is the end of the string so that it can be read with the next() method.
                inputFile.close();
            }
        return readData;
    }
    
    /**
     * writeFile - This method will write the user's full name, department, username, and password to a file called AccountInfo.txt.
     * @param name - This is the user's full name.
     * @param department - This is the user's department.
     * @param username - This is the user's username.
     * @param password - This is the user's password.
     * @throws IOException - This exception is required as we are accessing a file to prevent errors.
     */
    public static void writeFile(String name, String department, String username, String password) throws IOException 
    {
        FileWriter fWriter = new FileWriter("AccountInfo.txt", true); // Declare and initialize the FileWriter and PrintWriter.
	PrintWriter outputFile = new PrintWriter(fWriter); 
	outputFile.println("Name: " + name); // Write the data passed into the method to the file.
        outputFile.println("Department: " + department);
        outputFile.println("Username: " + username);
        outputFile.println("Password: " + password);
	outputFile.close(); // Close the file.
    }
    
    /**
     * writeList - This method will write the user's password to a password list called rockyou.txt.
     * @param password - This is the user's password.
     * @throws IOException - This exception is required as we are accessing a file to prevent errors.
     */
    public static void writeList(String password) throws IOException 
    {
        FileWriter fWriter = new FileWriter("rockyou.txt", true); // Declare and initialize the FileWriter and PrintWriter.
	PrintWriter outputFile = new PrintWriter(fWriter); 
	outputFile.println(password); // Write the data passed into the method to the file.
	outputFile.close(); // Close the file.
    }
}
