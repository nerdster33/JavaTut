/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ArrayStuffs;
import java.util.Scanner;
import java.util.Arrays;


public class MultidimensionalArray {

    
    public static void main(String[] args) {
       // 2 loops - 1st loop the row, 2nd loop the column
        int sum = 0;
        Scanner input = new Scanner(System.in);
        int num[][] = new int[2][3];
        
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.println("Please the num["+x+"]["+y+"]:" );
              num[x][y]  = input.nextInt();
             sum = sum + num[x][y];
            }
        } 
        System.out.println("The sum is "+sum);
        
        // print all the element of the array
        System.out.println("The array is: ");
        for(int a=0; a<2; a++){
            for (int b = 0; b < 3; b++) {
                System.out.print(num[a][b] + " ");
                
            }
            System.out.println();
        }
        
        
    }

}
