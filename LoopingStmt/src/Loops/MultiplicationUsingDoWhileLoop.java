
package Loops;

import java.util.Scanner;


public class MultiplicationUsingDoWhileLoop {

    
    public static void main(String[] args) {
        int num, counter =1,result;
        
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        
         System.out.println("Multiplication Table for "+num);
        do{
           
              result = num *counter;
          System.out.println(num +" x "+ counter + " = " +result ); 
            counter++;
        }while( counter <= 24); // to increase the answer from 12 change the counter value
        
    }

}
