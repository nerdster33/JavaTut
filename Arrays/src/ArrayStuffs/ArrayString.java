
package ArrayStuffs;
import java.util.Scanner;
import java.util.Arrays;


public class ArrayString {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String names[] = new String[5];
        
        System.out.println("Enter the names");
        for (int i = 0; i < 5; i++) {
            names[i] = input.nextLine();
            
        }
        System.out.println("List of name entered before sorting:");
        for(String y: names){
            System.out.print(y+ " ");
        }
        Arrays.sort(names);
        System.out.println("\nList of name after sorting:");
        for(String z: names){
            System.out.print(z+ " ");
        }
        
    }

}
