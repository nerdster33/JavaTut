
package JavaMethod;

import java.util.Scanner;


public class MainForStaticMthd {

    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         StaticMthd myUDM = new StaticMthd ();
        int side,length,width,perim;
        
     
        
        // methd with 1 argmt
        System.out.println("Enter the value of the side:");
        side=input.nextInt();
        //perim=myUDM.perimeter(side);
        perim =  StaticMthd.perimeter(side);
        System.out.println("The perimeter of a square is "+perim);
        
        // methd with 2 argmt
         System.out.println("Enter the value of the length:");
        length=input.nextInt();
        System.out.println("Enter the value of the width:");
        width=input.nextInt();
        //perim=myUDM.perimeter(length, width);
         perim =  StaticMthd.perimeter(length, width);
        System.out.println("The perimeter of a rectangle is "+perim);
                
        // methd with no argmt
      // myUDM.perimeter();
        StaticMthd.perimeter();
        
        
    }

}
