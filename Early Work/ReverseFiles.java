/**
 * dog-tor
 * 5/21/14
 *
 *
 * This program will print an input file from last line to first line. (Backwards)
 */
import java.io.*;
import java.util.*;
public class ReverseFiles
{
    public static void main(String[] args) throws Exception
    {
        System.out.print("Enter input file name: ");
        Scanner myInput = new Scanner(System.in);
        String fileName = myInput.nextLine();
        File file = new File(fileName);
        ArrayList<String> fileArray = new ArrayList<String>();
        FileWriter f = new FileWriter("BackwardsFile.txt");
        int size = fileArray.size();
        try
        {
            Scanner myScanner = new Scanner(file);
            while(myScanner.hasNextLine())
            {
                String line = myScanner.nextLine();
                System.out.println(line);
                fileArray.add(line);
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found: " + file);
        }
        for( size = 12 ; size >= 0; size --)
        {
            f.write("\r\n" + fileArray.get(size));
        }
        f.close();
    }
}