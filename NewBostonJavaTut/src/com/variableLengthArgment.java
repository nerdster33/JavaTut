package com;

/**
 * Created by Nerd on 6/24/2017.
 */
public class variableLengthArgment {
    public static void main(String[] args) {
        System.out.println("The average is: " +Average(1, 2, 3, 4, 5, 6));
        System.out.println("The average is: " +Average(10,20,30,40,50,60,70,80,90,100));
    }

    public static double Average(int... numbers) {// for argument with unknown variable
        int total = 0;

        for (int x : numbers) {
            total += x;
        }
            return total / numbers.length;

    }

}
