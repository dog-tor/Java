/*
 * This program will allow us to read data from a specified line in a file, and append data to the particular file by using multiple methods and the Scanner class.
 */
package lab8_dog-tor;

/**
 *
 * @author dog-tor
 */

import java.util.Scanner;
import java.io.*;

public class Lab8_dog-tor {

    /**
     * @param args the command line arguments
     * @throws IOException
     */
    public static void main(String[] args) throws IOException 
    {
        int choice = 0;
        String content = "";
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Would you like to read form the file (1) or write to the file (2)? ");
        choice = keyboard.nextInt();
        
        if (choice == 1)
        {
            System.out.print("What line would you like to read? ");
            choice = keyboard.nextInt();
            
            content = readFile(choice);     //Due to the instructions stating to call the method, then print the String, I assigned the method call's return data to a String, then printed it.
            System.out.println(content);    //However, I previously condensed both of these lines into "System.out.println(readFile(choice);" but I wanted to make sure I did it according to your instructions.
        }
        else if (choice == 2)
        {
            keyboard = new Scanner(System.in);
            //keyboard.nextLine().indexOf(0); //Would the top line be the better option since it recreates it?
            System.out.print("What would you like to write to the file? ");
            
            content = keyboard.nextLine();
            writeFile(content);
        }
        else
        {
            System.out.println("You entered the wrong choice!");
            System.exit(0);
        }
    }
    
    /**readFile This method will be used to read data from a file at a specified line.
    * @param choice Specified line
    * @return String - Contents of the line
    * @throws IOException
    */
    public static String readFile(int choice) throws IOException 
    {
        File myFile = new File("/home/user/Data.txt");
	Scanner inputFile;
        String readData = "";
        
            if (!myFile.exists())
            {
                System.out.println("The file does not exist.");
                System.exit(0);	
            }
            else
            {
                inputFile = new Scanner(myFile);
                if (choice >=1)
                {
                    for (int count = 0; count < choice - 1; count++) 
                    {
                        inputFile.nextLine();
                    }
                    
                    readData = inputFile.nextLine();
                }
                inputFile.close();
            }
        return readData;
    }
    
    /**writeFile This method will be used to append data to a file.
    * @param content Content appended to the file
    * @throws IOException
    */
    public static void writeFile(String content) throws IOException 
    {
        FileWriter fWriter = new FileWriter("/home/user/Data.txt", true);
        PrintWriter outputFile = new PrintWriter(fWriter);
        outputFile.println(content);
        outputFile.close();
    }
}
