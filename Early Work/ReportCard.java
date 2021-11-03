/* dog-tor
 *
 * 9/17/2013
 * 
 * This program will compute a grade average and print a report card to the screen.
 * 
 */
public class ReportCard
{
    public static void main(String[] args)
    {
        int grade1 = 63;
        int grade2 = 72;
        int grade3 = 95;
        int grade4 = 78;
        int grade5 = 84;
        int grade6 = 94;
        int grade7 = 89;
        int total = grade1 + grade2 + grade3 + grade4 + grade5 + grade6 + grade7; 
        
        double average = total / 7;
        
        String course1 = "Algebra 2";
        String course2 = "English 3";
        String course3 = "US History";
        String course4 = "Physics";
        String course5 = "Spanish 2";
        String course6 = "CS 1";
        String course7 = "Psychology";
        
        System.out.println("dog-tor");
        System.out.println("09/11/2013");
        System.out.println();
        System.out.println("Report Card");
        System.out.println("-----------");
        System.out.println();
        System.out.println("Student: Tor, Dog");
        System.out.println();
        System.out.println(" Course                      Grade");
        System.out.println("________                    _______");
        System.out.println("1. " + course1 + "                  " + grade1);
        System.out.println("2. " + course2 + "                  " + grade2);
        System.out.println("3. " + course3 + "                 " + grade3);
        System.out.println("4. " + course4 + "                    " + grade4);
        System.out.println("5. " + course5 + "                  " + grade5);
        System.out.println("6. " + course6 + "                       " + grade6);
        System.out.println("7. " + course7 + "                 " + grade7);
        System.out.println();
        System.out.println("Average: " + average);
        System.out.println();
        System.out.println();
        System.out.println();
    }
}