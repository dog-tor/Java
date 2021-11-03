/**
 * dog-tor
 * 5/16/2014
 *
 * 
 * This program will as the user to enter two input files. Read a line from each file, and then print to Mix.txt.
 */
import java.io.*;
import java.util.*;
public class MixFiles
{
    public static void main(String[] args) throws Exception
    {
        System.out.print("Enter File Name Here: ");
        Scanner myInput = new Scanner(System.in);
        String fileName = myInput.nextLine();
        File file = new File(fileName);
        
        System.out.println();
        System.out.print("Enter Second File Name Here: ");
        String fileName2 = myInput.nextLine();
        File file2 = new File(fileName2);
        
        FileWriter f = new FileWriter("Mix.txt");

        try
        {
            Scanner myScanner = new Scanner(file);
            Scanner myScanner2 = new Scanner(file2);
            while(myScanner.hasNextLine() || myScanner2.hasNextLine())
            {
                if(myScanner.hasNextLine())
                {
                    String line = myScanner.nextLine();
                    System.out.println(line);
                    f.write("\r\n" + line);
                }
                
                if(myScanner2.hasNextLine())
                {
                    String line2 = myScanner2.nextLine();
                    System.out.println(line2);
                    f.write("\r\n >>>  " + line2);
                }
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found: " + file);
        }

        f.close();
    }
}