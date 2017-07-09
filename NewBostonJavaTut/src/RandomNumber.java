import java.util.Random;

/**
 * Created by Nerd on 6/22/2017.
 */
public class RandomNumber {
    public static void main(String[] args) {
        Random dice = new Random();
        int number;

        for (int counter = 1; counter <=10 ; counter++) {
            //number = dice.nextInt(6);
            number = 1 + dice.nextInt(6);
            System.out.println(number +" ");

        }
    }
}
