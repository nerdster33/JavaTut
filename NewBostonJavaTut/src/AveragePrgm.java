import java.util.Scanner;

/**
 * Created by Nerd on 6/21/2017.
 */
public class AveragePrgm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your 10 numbers, and press enter:");
        double total = 0,grade,average,counter = 0;

        while (counter < 10){
            grade = input.nextDouble();
            total = total + grade;
            counter++;
        }
        average = total/10;
        System.out.println("The average is "+average);
    }
}
