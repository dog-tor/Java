/**
 * dog-tor
 * 5/14/14
 * 
 * This program will open a file and add more text to the bottom of that file. 
 */
import java.util.*;
import java.io.*;
public class AppendFile
{
    public static void main (String[] args) throws Exception
    {
        System.out.print("Enter File Name Here: ");
        Scanner myInput = new Scanner(System.in);
        String fileName = myInput.nextLine();
        File file = new File(fileName);
        ArrayList<String> fileArray = new ArrayList<String>();
        System.out.println();
        FileWriter f = new FileWriter("outFile.txt" , true);
        System.out.println();
        
        try
        {
            Scanner myScanner = new Scanner(file);
            while(myScanner.hasNextLine())
            {
                String line = myScanner.nextLine();
                System.out.println(line);
                fileArray.add(line);
                f.write("\r\n" + line);
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found: " + file);
        }
        
        System.out.println("\n\n\n                        File contents from ArrayList");
        System.out.println("                        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for(String x : fileArray)
        {
            System.out.println(x);
        }
        f.close();
    }
}
