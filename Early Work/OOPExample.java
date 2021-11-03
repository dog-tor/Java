/** dog-tor
 *  1-22-14
 *
 *  
 *  This program will demonstrate creating objects, multiple methods and 
 *  executing methods of objects.
 */
public class OOPExample
{
    private double x = 5;
    private double y = 3;
    private double addResult = 0;
    private double subtractResult = 0;
    private double multiplyResult = 0;
    private double divideResult = 0;
    
    public static void main(String[] args)
    {
        System.out.println("                                              OOOOO   OOOOO   PPPP       EEEEE   X   X   AAAAA   M     M   PPPP    L       EEEEE          ");
        System.out.println("                                              O   O   O   O   P   P      E        X X    A   A   MM   MM   P   P   L       E              ");
        System.out.println("                                              O   O   O   O   PPPP       EEEEE     X     AAAAA   M  M  M   PPPP    L       EEEEE          ");
        System.out.println("                                              O   O   O   O   P          E        X X    A   A   M     M   P       L       E              ");
        System.out.println("                                              OOOOO   OOOOO   P          EEEEE   X   X   A   A   M     M   P       LLLLL   EEEEE          ");
        System.out.println("                                       ------------------------------------------------------------------------------------------------   ");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                                                                         Executing main method...");
        System.out.println();
        System.out.println();
        
        // Create OOPExample object named myObject
        OOPExample myObject = new OOPExample();
        myObject.doSomething();
        myObject.addNumbers();
        myObject.subtractNumbers();
        myObject.multiplyNumbers();
        myObject.divideNumbers();
        
        System.out.println("                                                                                ~~~Program ended~~~");
    }
    
    //Method to do something
    public void doSomething()
    {
        System.out.println("                                                                         Executing doSomething method...");
        System.out.println();
        System.out.println();
    }
    
    public void addNumbers()
    {
        System.out.println("                                                                         Executing addNumbers method...");
        System.out.println();
        System.out.println("                                                                                     x = " + x);
        System.out.println("                                                                                     y = " + y);
        addResult = x + y;
        System.out.println("                                                                                     " + x + " + " + y + " = " + addResult);
        System.out.println();
        System.out.println();
    }
    
    public void subtractNumbers()
    {
        System.out.println("                                                                         Executing subtractNumbers method...");
        System.out.println();
        System.out.println("                                                                                     x = " + x);
        System.out.println("                                                                                     y = " + y);
        subtractResult = x - y;
        System.out.println("                                                                                     " + x + " - " + y + " = " + subtractResult);
        System.out.println();
        System.out.println();
    }
    
    public void multiplyNumbers()
    {
        System.out.println("                                                                         Executing multiplyNumbers method...");
        System.out.println();
        System.out.println("                                                                                     x = " + x);
        System.out.println("                                                                                     y = " + y);
        multiplyResult = x * y;
        System.out.println("                                                                                     " + x + " * " + y + " = " + multiplyResult);
        System.out.println();
        System.out.println();
    }
    
    public void divideNumbers()
    {
        System.out.println("                                                                         Executing divideNumbers method...");
        System.out.println();
        System.out.println("                                                                                     x = " + x);
        System.out.println("                                                                                     y = " + y);
        divideResult = x / y;
        System.out.println("                                                                                     " + x + " / " + y + " = " + divideResult);
        System.out.println();
        System.out.println();
    }
}