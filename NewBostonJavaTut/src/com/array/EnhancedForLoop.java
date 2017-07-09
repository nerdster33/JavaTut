package com.array;

/**
 * Created by Nerd on 6/23/2017.
 */
public class EnhancedForLoop {
    public static void main(String[] args) {

        int nerd[] = {2, 34,54,67,88};
        int total = 0;

        for(int number : nerd){ // for(type identifier : array name)
            total += number;
           // System.out.println(total);
        }
        System.out.println("The total value of the array element is:  "+total);
    }
}
