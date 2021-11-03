/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accuracy;
import java.math.BigDecimal;

/**
 *
 * @author dog-tor
 */
public class Accuracy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        BigDecimal dollar = new BigDecimal("1.00");
        BigDecimal dime = new BigDecimal("0.10");
        int number = 7;
        
        System.out.println("A dollar minus " + number + " dimes is $" + (dollar.subtract(dime.multiply(new BigDecimal(number)))));
        

        
    }
    
}
