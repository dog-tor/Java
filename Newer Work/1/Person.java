/*
 * Please see Tester.java for the program's description.
 */
package test;

import java.util.Random;

/**
 *
 * @author dog-tor
 */
public class Person {
    
    private String name = "";
    private int ssn = 0;
    
    /**
    * Person - This method contains the person's name and a random number generator to generate their SSN.
    * @param newName - This is the person's new name.
    */
    public Person(String newName)
    {
        name = newName;
        Random randNumbers = new Random();
        ssn = randNumbers.nextInt(899999999) + 100000000;
    }
    /**
    * setName - This method will set the person's name.
    * @param newName - This is the person's new name.
    */
    public void setName(String newName)
    {
        name = newName;
    }
    /**
    * getName - This method will return the person's name.
    * @return String - This is the person's name.
    */
    public String getName()
    {
        return name;
    }
    /**
    * getSsn - This method return the person's SSN.
    * @return int - This is the person's SSN.
    */
    public int getSsn()
    {
        return ssn;
    }
}
