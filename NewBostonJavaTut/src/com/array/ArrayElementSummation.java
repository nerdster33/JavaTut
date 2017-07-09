package com.array;

/**
 * Created by Nerd on 6/23/2017.
 */
public class ArrayElementSummation {
    public static void main(String[] args) {
        int[] nerd = {20, 12, 53, 33, 67};
        int sum = 0;

        for (int counter = 0; counter <nerd.length ; counter++) {
            sum += nerd[counter];
            //System.out.println(sum); // cumulative sum
        }
        System.out.println("The total of all the numbers is: " +sum);
    }
}
