/**
 * dog-tor
 *
 * 3/3/2014
 * 
 * This program will demonstrate basic inheritance
 * and the "IS-A" relationship between subclasses
 * and superclasses.
 */
public class Student extends Person // subclass Student extends superclass Person
{
    private String favSubject = "Art";
    private double gpa        = 0.0;
    
    public Student()
    {
        System.out.println(">>> Student Default Constructor. <<<");
        System.out.println("Class Name: " + getClass().getName());
    }
    
    // accessor method. Retrieves private data.
    public String getFavSubject()
    {
        return favSubject;
    }
    
    // mutator method. Change private data.
    public void setFavSubject(String x)
    {
        favSubject = x;
    }
    
    // accessor method. Retrieves private data.
    public double getGpa()
    {
        return gpa;
    }
    
    // mutator method. Change private data.
    public void setGpa(double x)
    {
        gpa = x;
    }
    
    public String toString()
    {
        return ("\nToString for Student" + 
                "\nName: " + getName() +
                "\nAge: " + getAge() +
                "\nProfession: " + getProfession() +
                "\nFavorite Subject: " + favSubject +
                "\nGPA: " + gpa);
    }
}
