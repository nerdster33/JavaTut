

package JavaMethod;

import static JavaMethod.OverloadinMethods.perimeter;
import java.util.Scanner;


public class MyMainMethod {

    
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         MyMethods myUDM = new  MyMethods ();
        int side,length,width,perim;
        
        
        // methd with 1 argmt
        System.out.println("Enter the value of the side:");
        side=input.nextInt();
        perim=myUDM.perimeter(side);
        System.out.println("The perimeter of a square is "+perim);
        
        // methd with 2 argmt
         System.out.println("Enter the value of the length:");
        length=input.nextInt();
        System.out.println("Enter the value of the width:");
        width=input.nextInt();
        perim=myUDM.perimeter(length, width);
        System.out.println("The perimeter of a rectangle is "+perim);
                
        // methd with no argmt
       myUDM.perimeter();
        
    }

}
