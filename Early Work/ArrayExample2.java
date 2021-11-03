/** dog-tor
 *  4-10-14
 *  
 *  This program will demonstrate the use of arrays.
 */
public class ArrayExample2
{
    public static void main(String[] args)
    {
        String students[] = new String[7];
        int lengthOfStudents = students.length;
        
        System.out.println("The length of array students is: " + lengthOfStudents);
        
        students[0] = "Bob";
        students[1] = "Billy";
        students[2] = "John";
        students[3] = "Alamo";
        students[4] = "Zack";
        students[5] = "Ariel";
        students[6] = "Jacob";
        
        System.out.println("                      Students");
        System.out.println("                  ----------------");
        for (int x = 0; x < lengthOfStudents; x++)
        {
            System.out.println("students[" + x + "] = " + students[x]);
        }
    }
}