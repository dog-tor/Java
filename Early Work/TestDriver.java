/** dog-tor
 *  2-4-14
 *
 *  
 *  This program will demonstrate OOP programming concepts including
 *  constructors, encapsulation and data hiding.
 */
public class TestDriver
{
    public static void main(String[] args)
    {
        System.out.println("Executing main method...");
        Dog myDog = new Dog();
        Ferret myFerret = new Ferret();
        Cat myCat = new Cat();
        
        System.out.println(myDog);
        System.out.println(myFerret);
        System.out.println(myCat);
        
        System.out.println("myDog's name is: " + myDog.getName());
        myDog.setName("Ralph");
        System.out.println("myDog's name is: " + myDog.getName());
        
        System.out.println("myDog's owner is: " + myDog.getOwner());
        myDog.setOwner("Bob");
        System.out.println("myDog's owner is: " + myDog.getOwner());
        
        System.out.println("myDog's weight is: " + myDog.getWeight());
        myDog.setWeight(5.6);
        System.out.println("myDog's weight is: " + myDog.getWeight());
        
        System.out.println("myDog's age is: " + myDog.getAge());
        myDog.setAge(7);
        System.out.println("myDog's age is: " + myDog.getAge());
        
        System.out.println();
        
        System.out.println("myFerret's name is: " + myFerret.getName());
        myFerret.setName("Jorge");
        System.out.println("myFerret's name is: " + myFerret.getName());
        
        System.out.println("myFerret's owner is: " + myFerret.getOwner());
        myFerret.setOwner("Billy");
        System.out.println("myFerret's owner is: " + myFerret.getOwner());
        
        System.out.println("myFerret's weight is: " + myFerret.getWeight());
        myFerret.setWeight(6.9);
        System.out.println("myFerret's weight is: " + myFerret.getWeight());
        
        System.out.println("myFerret's age is: " + myFerret.getAge());
        myFerret.setAge(5);
        System.out.println("myFerret's age is: " + myFerret.getAge());
    }
}