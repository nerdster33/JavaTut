
package Loops;
import java.util.Scanner;


public class MultiplicationUsingWhileLoop {

    
    public static void main(String[] args) {
        int num, counter =1,result;
        
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        
        while( counter <= 12){
              result = num *counter;
          System.out.println(num +" x "+ counter + " = " +result ); 
            counter++;
        }
        
    }

}
