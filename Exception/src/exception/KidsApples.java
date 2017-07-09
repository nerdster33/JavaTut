
package exception;
import java.util.InputMismatchException;
import java.util.Scanner;


public class KidsApples {

    
    public static void main(String[] args) {
        int numKids, pieces, left;
        Scanner input = new Scanner(System.in);
        
        try{
        System.out.println("Enter the number of kids who will receive apples: ");
        
         numKids =input.nextInt();
        numKids = Math.abs(numKids);
        pieces = 24/numKids;
        left = 24 -(numKids*pieces); 
            System.out.println("Each kid will receive "+pieces +" of apples");
            System.out.println(left+" apples wiil be left");
        
        }catch(ArithmeticException e){
            System.out.println("Error: Division by zero");
        
        }catch(InputMismatchException e){
            System.out.println("Error: Non-interger input");
        }
        finally{
            System.out.println("Thank you!");
        }
    }

}
