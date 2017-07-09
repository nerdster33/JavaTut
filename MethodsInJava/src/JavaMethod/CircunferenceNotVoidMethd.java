

package JavaMethod;

import static JavaMethod.UserDefinedMethod.circumference;
import java.util.Scanner;


public class CircunferenceNotVoidMethd {

    
    public static void main(String[] args) {
        int radius;
        double circum;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of the radius: ");
        radius = input.nextInt(); 
       circum =  circumference(radius);
       System.out.printf("The cirumference is %1.2f\n", circum);
    }
      public static double circumference(int r) {
        double c;
        c = 2 * Math.PI * r;
        return c;
        
        
    }

}
