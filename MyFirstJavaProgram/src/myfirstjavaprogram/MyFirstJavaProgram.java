
package myfirstjavaprogram;
import java.util.Scanner;

/**
 *
 * @author Nerd
 */
public class MyFirstJavaProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Welcome to Java Programming! "+ name);
    }
    
}
