/**
 * dog-tor
 *
 * 3/3/2014
 * 
 * This program will demonstrate basic inheritance
 * and the "IS-A" relationship between subclasses
 * and superclasses.
 */
public class Musician extends Person // subclass Musician extends superclass Person
{
    private String genre       = "Classical";
    private String instrument  = "None";
    
    public Musician()
    {
        System.out.println(">>> Musician Default Constructor. <<<");
        System.out.println("Class Name: " + getClass().getName());
    }
    
    // accessor method. Retrieves private data.
    public String getGenre()
    {
        return genre;
    }
    
    // mutator method. Change private data.
    public void setGenre(String x)
    {
        genre = x;
    }
    
    // accessor method. Retrieves private data.
    public String getInstrument()
    {
        return instrument;
    }
    
    // mutator method. Change private data.
    public void setInstrument(String x)
    {
        instrument = x;
    }
    
    public String toString()
    {
        return ("\nToString for Musician" + 
                "\nName: " + getName() +
                "\nAge: " + getAge() +
                "\nProfession: " + getProfession() +
                "\nGenre: " + genre +
                "\nInstrument: " + instrument);
    }
}
