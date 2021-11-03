/** dog-tor
 *  4-15-14
 *  
 *  This program will demonstrate the use of arrays with fun.
 */
public class ArrayFun
{
    public static void main(String[] args)
    {
        double grades[] = { 74.0, 75.2, 79.6, 85.1, 86.8 };
        int lengthOfgrades = grades.length;
        double total = 0.0;
        double average = 0.0;
        
        System.out.println("                                  AAAAA   RRRR    RRRR    AAAAA   Y   Y      FFFFF   U   U   N   N        ");
        System.out.println("                                  A   A   R   R   R   R   A   A    Y Y       F       U   U   NN  N        ");
        System.out.println("                                  AAAAA   RRRR    RRRR    AAAAA     Y        FFFFF   U   U   N N N        ");
        System.out.println("                                  A   A   R  R    R  R    A   A     Y        F       U   U   N  NN        ");
        System.out.println("                                  A   A   R   R   R   R   A   A     Y        F       UUUUU   N   N        ");
        System.out.println("                             --------------------------------------------------------------------------     ");
        System.out.println();
        System.out.println();
        System.out.println("The length of array grades is: " + lengthOfgrades);
        System.out.println();
        System.out.println();
        for (int x = 0; x < lengthOfgrades; x++)
        {
            System.out.println("grades[" + x + "] = " + grades[x]);
            total = total + grades[x];
        }
        
        average = total / lengthOfgrades;
        System.out.println();
        System.out.println();
        System.out.println("total of grades = " + total);
        System.out.println("average of grades = " + average);
        
    }
}