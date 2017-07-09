package com.array;

/**
 * Created by Nerd on 6/22/2017.
 */
public class ArrayTable {
    public static void main(String[] args) {
        System.out.println("Index\tvalue");
        int nerd[] = {12, 34, 13, 36, 56, 67};

        for (int counter = 0; counter < nerd.length; counter++) {
            System.out.println(counter + "\t"+nerd[counter ]);
        }
    }
}
