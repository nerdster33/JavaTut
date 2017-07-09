package com.array;

/**
 * Created by Nerd on 6/23/2017.
 */
public class ArrayMultidimensional {
    public static void main(String[] args) {

        int firstArray[][] = {{8,9,10,11},{20,21,22,23}};
        int secondArray[][] = {{30,31,32,33},{40}, {4,5,6,7}};
        System.out.println("This is the first array");
        Display(firstArray);
        System.out.println();
        System.out.println("This is the second array");
        Display(secondArray);
    }

    public static  void Display(int x[][]){
        for (int row = 0; row < x.length ; row++) { // outer loop
            for (int column = 0; column <x[row].length ; column++) { // inside loop
                System.out.print(x[row][column]+"\t");
            }
            System.out.println();
        }
    }
}
