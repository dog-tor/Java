/** dog-tor
 *  2-4-14
 *
 *  
 *  This program will 
 */

public class Dog
{
    private String name     = "unknown";
    private String owner    = "John Doe";
    private String color    = "black and white";
    private double weight   = 0.0;
    private double age      = 0.0;
    
    // default constructor. Runes once when an object is created
    // and is usually used to intializes values.
    public Dog()
    {
        System.out.println("Dog object created!");
    }
    
    // accessor method. Retrieves private data.
    public String getName()
    {
        return name;
    }
    
    // mutator method. Change private data.
    public void setName(String x)
    {
        name = x;
    }
    
    // accessor method. Retrieves private data.
    public String getOwner()
    {
        return owner;
    }
    
    // mutator method. Change private data.
    public void setOwner(String x)
    {
        owner = x;
    }
    
    // accessor method. Retrieves private data.
    public double getWeight()
    {
        return weight;
    }
    
    // mutator method. Change private data.
    public void setWeight(double x)
    {
        weight = x;
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
    
    // This method describes how to print an object.
    public String toString()
    {
        System.out.println("Executing toString method...");
        return ("\n     Dog:      " + name +
                "\n     Owner:    " + owner +
                "\n     Color:    " + color +
                "\n     Weight:   " + weight +
                "\n     Age:      " + age +
                "\n");
    }
}