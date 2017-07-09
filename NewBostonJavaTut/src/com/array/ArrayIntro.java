package com.array;

/**
 * Created by Nerd on 6/22/2017.
 */
public class ArrayIntro {
    public static void main(String[] args) {

      //  String fruits[] = new String [7]; // another way of initiating an array
       String fruits[] ={"apples", "oranges", "mangoes", "lemons", "limes",
               "water melons","pineapples",};
       for(String names :fruits ){
           System.out.println("The various fruits are: "+names);
       }

    }
}
