/**
 * dog-tor
 *
 * 3/3/2014
 * 
 * This program will demonstrate basic inheritance
 * and the "IS-A" relationship between subclasses
 * and superclasses.
 */
public class Teacher extends Person // subclass Teacher extends superclass Person
{
    private String subject = "Math";
    private int students   = 23;
    
    public Teacher()
    {
        System.out.println(">>> Teacher Default Constructor. <<<");
        System.out.println("Class Name: " + getClass().getName());
    }
    
    // accessor method. Retrieves private data.
    public String getSubject()
    {
        return subject;
    }
    
    // mutator method. Change private data.
    public void setSubject(String x)
    {
        subject = x;
    }
    
    // accessor method. Retrieves private data.
    public int getStudents()
    {
        return students;
    }
    
    // mutator method. Change private data.
    public void setStudents(int x)
    {
        students = x;
    }
    
    public String toString()
    {
        return ("\nToString for Teacher" + 
                "\nName: " + getName() +
                "\nAge: " + getAge() +
                "\nProfession: " + getProfession() +
                "\nSubject: " + subject +
                "\nStudents: " + students);
    }
}
