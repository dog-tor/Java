/** dog-tor
 *  4-7-14
 *  
 *  This program will demonstrate the use of arrays.
 */
public class ArrayExample
{
    public static void main(String[] args)
    {
        int studentAverages[] = { 74, 75, 79, 85, 86 };
        int lengthOfStudentAverages = studentAverages.length;
        int emptyArray[] = new int[7];
        int lengthOfemptyArray = emptyArray.length;
        String myString[] = new String[7];
        
        System.out.println("The length of array studentAverage is: " + lengthOfStudentAverages);
        System.out.println("studentAverages[0] = " + studentAverages[0]);
        System.out.println("studentAverages[1] = " + studentAverages[1]);
        System.out.println("studentAverages[2] = " + studentAverages[2]);
        System.out.println("studentAverages[3] = " + studentAverages[3]);
        System.out.println("studentAverages[4] = " + studentAverages[4]);
        
        System.out.println("\n\n For Loop to print each element of array studentAverages.");
        for (int x = 0; x < lengthOfStudentAverages; x++)
        {
            System.out.println("studentAverages[" + x + "] = " + studentAverages[x]);
        }
        
        System.out.println("\n\n For Loop to print each element of array emptyArray.");
        for (int x = 0; x < lengthOfemptyArray; x++)
        {
            System.out.println("emptyArray[" + x + "] = " + emptyArray[x]);
        }
        emptyArray[3] = 987;
        
        System.out.println("\n\n For Loop to print each element of array emptyArray.");
        for (int x = 0; x < lengthOfemptyArray; x++)
        {
            myString[x] = "" + x;
            
            System.out.println("emptyArray[" + x + "] = " + emptyArray[x]);
            System.out.println("myString[" + x + "] = " + myString[x]);
        }
        
    }
}