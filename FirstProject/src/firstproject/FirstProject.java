

package firstproject;
import java.util.Scanner;

public class FirstProject {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer: ");
       int num = input.nextInt();
        OddOrEven od = new OddOrEven();
        od.displayOddOrEven(num);
    }

}
