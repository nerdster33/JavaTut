package com.guessGaming;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Nerd on 6/22/2017.
 */
public class GuessNumberGame {
    public static void main(String[] args) {

        Random dice = new Random();
        int number,guess;

        System.out.println("Select a number between 1 to 6: ");

        Scanner input = new Scanner(System.in);
        guess = input.nextInt();
        number = 1 + dice.nextInt(6);

        if (number == guess){
            System.out.println("Congratulation!");
        }else {
            System.out.println("Sorry, you lost! Try again, the correct number is "+ number);

        }



    }
}
