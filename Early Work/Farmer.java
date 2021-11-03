/**
 * dog-tor
 *
 * 3/3/2014
 * 
 * This program will demonstrate basic inheritance
 * and the "IS-A" relationship between subclasses
 * and superclasses.
 */
public class Farmer extends Person // subclass Farmer extends superclass Person
{
    private String tool  = "None";
    private String crop  = "None";
    
    public Farmer()
    {
        System.out.println(">>> Farmer Default Constructor. <<<");
        System.out.println("Class Name: " + getClass().getName());
    }
    
    // accessor method. Retrieves private data.
    public String getTool()
    {
        return tool;
    }
    
    // mutator method. Change private data.
    public void setTool(String x)
    {
        tool = x;
    }
    
    // accessor method. Retrieves private data.
    public String getCrop()
    {
        return crop;
    }
    
    // mutator method. Change private data.
    public void setCrop(String x)
    {
        crop = x;
    }
    
    public String toString()
    {
        return ("\nToString for Farmer" + 
                "\nName: " + getName() +
                "\nAge: " + getAge() +
                "\nProfession: " + getProfession() +
                "\nTool: " + tool +
                "\nCrop: " + crop);
    }
}