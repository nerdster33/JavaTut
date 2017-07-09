
package Loops;
import java.util.Scanner;


public class MultiplicationUsingForLoop {

    
    public static void main(String[] args) {
        int num, counter,result;
        
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        
        for ( counter = 1; counter <= 12; counter++) {
            result = num *counter;
          System.out.println(num +" x "+ counter + " = " +result );  
        }
        
        
    }

}
