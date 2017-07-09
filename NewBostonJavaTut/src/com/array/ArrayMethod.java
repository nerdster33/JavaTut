package com.array;

import  java.util.Scanner;

/**
 * Created by Nerd on 6/23/2017.
 */
public class ArrayMethod {
    public static void main(String[] args) {

        int nerd[] = {12, 34, 22, 67, 19};
        change(nerd);

       for(int y: nerd){
           System.out.println(y);
       }
    }

    public  static  void change(int x[]){
        for (int counter = 0; counter < x.length; counter++) {
            x[counter] += 5;

        }

    }
}
