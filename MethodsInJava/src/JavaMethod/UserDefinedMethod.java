

package JavaMethod;
import java.util.Scanner;

public class UserDefinedMethod {

    
    public static void main(String[] args) {
        int radius;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of the radius: ");
        radius = input.nextInt(); 
        circumference(radius);
    }
    
    public static void circumference(int r) {
        double c;
        c = 2 * Math.PI * r;
        System.out.printf("The cirumference is %1.2f\n", c);
        
    }

}
