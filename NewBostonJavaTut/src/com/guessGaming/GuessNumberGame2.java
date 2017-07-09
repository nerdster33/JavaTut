package com.guessGaming;
import java.util.Random;
import java.util.Scanner;
/**
 * Created by Nerd on 6/23/2017.
 */
public class GuessNumberGame2 {


    public static void main(String[] args) {

        boolean resume = true; // Create a condition to continue or quit the program.
        Random dice = new Random();
        int number, guess;
        Scanner input = new Scanner(System.in);
        // then wrap the whole application (i.e. the methods in a while statement)
        while (resume) { // so the application will restart while resume is true.
            System.out.println("Select a number between 1 to 6: ");
            guess = input.nextInt();
            number = 1 + dice.nextInt(6);
            if (number == guess) {
                System.out.println("Congratulation!");
                resume = false;
                //it will exit while resume is false. this is a good example of
                // Situations where the while loop is used over for loop.
            } else {
                System.out.println("Sorry, you lost! Try again, the correct number is " + number);

            }
        }
    }
}
