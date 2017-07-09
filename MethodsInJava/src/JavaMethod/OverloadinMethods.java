
package JavaMethod;
import java.util.Scanner;


public class OverloadinMethods {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side,length,width,perim;
        
        
        // methd with 1 argmt
        System.out.println("Enter the value of the side:");
        side=input.nextInt();
        perim=perimeter(side);
        System.out.println("The perimeter of a square is "+perim);
        
        // methd with 2 argmt
         System.out.println("Enter the value of the length:");
        length=input.nextInt();
        System.out.println("Enter the value of the width:");
        width=input.nextInt();
        perim=perimeter(length, width);
        System.out.println("The perimeter of a rectangle is "+perim);
                
        // methd with no argmt
       perimeter(); 
    }
    public static int perimeter(int s){
      int p = 4*s;
        return p;
    }
    
    public static int perimeter(int l,int w){
        
       int p = 2*(l+w);
        return p;
        
    }
    
    public static void perimeter(){
        System.out.println("The perimeter is the addition of all the sides of a given shape");
       
    }

}
