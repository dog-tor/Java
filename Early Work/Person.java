/**
 * dog-tor
 *
 * 3/3/2014
 * 
 * This program will demonstrate basic inheritance
 * and the "IS-A" relationship between subclasses
 * and superclasses.
 */
abstract public class Person
{
    public String name        = "John Doe";
    public String profession  = "None";
    public double age         = 0.0;
    
    public Person()
    {
        System.out.println("Person default constructor.");
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String x)
    {
        name = x;
    }
    
    // accessor method. Retrieves private data.
    public double getAge()
    {
        return age;
    }
    
    // mutator method. Change private data.
    public void setAge(double x)
    {
        age = x;
    }
    
    // accessor method. Retrieves private data.
    public String getProfession()
    {
        return profession;
    }
    
    // mutator method. Change private data.
    public void setProfession(String x)
    {
        profession = x;
    }
    
    abstract public String toString();
}