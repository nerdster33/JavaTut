/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javabasicmaths;
import java.util.Scanner;


public class JavaBasicMaths {

    
    public static void main(String[] args) {
        float num, half, quater, doubled, square;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = input.nextFloat();
        
        half = num/2;
        quater = num/4;
        doubled = num * 2;
        square = num * num;
        
        System.out.println("The half of "+num + " is "+ half);
        System.out.printf("Quater of %f is %f \n", num, quater);
         System.out.printf("Double of %f is %f \n", num, doubled);
          System.out.printf("Square of %f is %f \n", num, square);
        
        
        
        
    }

}
