/*
 * This program will print out a table to the console and format numbers and text using printf format specifiers.
 */
package formattedtable_dog-tor;

/**
 *
 * @author dog-tor
 */
public class FormattedTable_dog-tor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.printf("----------------------------------\n");
        System.out.printf("|%-10s|%-10s|%-10s|\n", "Cost","Quantity","Total");
        System.out.printf("----------------------------------\n");
        System.out.printf("|%,10.2f" + "|%10d" + "|%,10.2f" + "|\n", 49.99, 10, 49.99 * 10);
        System.out.printf("----------------------------------\n");
        System.out.printf("|%,10.2f" + "|%10d" + "|%,10.2f" + "|\n", 89.99, 15, 89.99 * 15);
        System.out.printf("----------------------------------\n");
        System.out.printf("|%,10.2f" + "|%10d" + "|%,10.2f" + "|\n", 29.99, 20, 29.99 * 20);
        System.out.printf("----------------------------------\n");
    }
    
}