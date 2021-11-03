/** dog-tor
 *  1-28-14
 *
 *  
 *  This program will read in 2 decimal numbers and demonstrate creating objects, multiple methods and 
 *  executing methods of objects.
 */

import java.io.*;
import java.util.*;

public class OOPExample2
{
    private double result = 0;
    Scanner readDouble = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        double x = 0;
        double y = 0;
        
        System.out.println("                                         OOOOO   OOOOO   PPPP       EEEEE   X   X   AAAAA   M     M   PPPP    L       EEEEE      2222             ");
        System.out.println("                                         O   O   O   O   P   P      E        X X    A   A   MM   MM   P   P   L       E              2            ");
        System.out.println("                                         O   O   O   O   PPPP       EEEEE     X     AAAAA   M  M  M   PPPP    L       EEEEE         2             ");
        System.out.println("                                         O   O   O   O   P          E        X X    A   A   M     M   P       L       E           2               ");
        System.out.println("                                         OOOOO   OOOOO   P          EEEEE   X   X   A   A   M     M   P       LLLLL   EEEEE      22222            ");
        System.out.println("                                  -----------------------------------------------------------------------------------------------------------     ");
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
        OOPExample2 myObject = new OOPExample2();
        x = myObject.readNumbers();
        y = myObject.readNumbers();
        
        myObject.addNumbers(x, y);
        myObject.subtractNumbers(x, y);
        myObject.multiplyNumbers(x, y);
        myObject.divideNumbers(x, y);
        
        System.out.println("                                                                                ~~~Program ended~~~");
    }
    
    public double readNumbers()
    {
        System.out.println();
        System.out.println("                                                                         Executing readNumbers method...");
        System.out.println();
        System.out.print("                                                                         Please enter a decimal number: ");
        return readDouble.nextDouble();
    }
    
    public void addNumbers(double num1, double num2)
    {
        System.out.println();
        System.out.println("                                                                         Executing addNumbers method...");
        System.out.println();
        System.out.println("                                                                                     x = " + num1);
        System.out.println("                                                                                     y = " + num2);
        result = num1 + num2;
        
        System.out.println("                                                                                     " + num1 + " + " + num2 + " = " + result);
        System.out.println();
        System.out.println();
    }
    
    public void subtractNumbers(double num1, double num2)
    {
        System.out.println("                                                                         Executing subtractNumbers method...");
        System.out.println();
        System.out.println("                                                                                     x = " + num1);
        System.out.println("                                                                                     y = " + num2);
        result = num1 - num2;
        System.out.println("                                                                                     " + num1 + " - " + num2 + " = " + result);
        System.out.println();
        System.out.println();
    }
    
    public void multiplyNumbers(double num1, double num2)
    {
        System.out.println("                                                                         Executing multiplyNumbers method...");
        System.out.println();
        System.out.println("                                                                                     x = " + num1);
        System.out.println("                                                                                     y = " + num2);
        result = num1 * num2;
        System.out.println("                                                                                     " + num1 + " * " + num2 + " = " + result);
        System.out.println();
        System.out.println();
    }
    
    public void divideNumbers(double num1, double num2)
    {
        System.out.println("                                                                         Executing divideNumbers method...");
        System.out.println();
        System.out.println("                                                                                     x = " + num1);
        System.out.println("                                                                                     y = " + num2);
        result = num1 / num2;
        System.out.println("                                                                                     " + num1 + " / " + num2 + " = " + result);
        System.out.println();
        System.out.println();
    }
}