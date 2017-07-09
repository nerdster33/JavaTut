
package ArrayStuffs;
import java.util.Scanner;
import java.util.Arrays;


public class ArraySorting {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
      int nums[]=  new int[5];
      int x; // x is counter;
      
        for (x = 0; x < 5; x++) {
            System.out.println("Enter number for nums["+x+"]:");
            nums[x]=input.nextInt();
            
        }
        System.out.println("Numbers entered before sorting: ");
        for(int y:nums){
            System.out.print(y +" ");
            
        }
        System.out.println();
                
        Arrays.sort(nums);
        for (x = 0; x < 5; x++) {
            System.out.println("nums["+x+"]: "+nums[x]);
       }    
    }

}
