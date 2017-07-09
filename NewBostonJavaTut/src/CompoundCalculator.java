import java.util.Scanner;

/**
 * Created by Nerd on 6/21/2017.
 */
public class CompoundCalculator {
    public static void main(String[] args) {

        double amount;
        System.out.println("Please enter the principal");
        Scanner input = new Scanner(System.in);
        Double principal = input.nextDouble();
        System.out.println("Please enter the rate in decimal format");
        Double rate = input.nextDouble();
        System.out.println("Please enter the total number of year");
        int yearTotal = input.nextInt();

        for (int year = 1; year <= yearTotal; year++) {
            amount = principal * Math.pow(1 + rate, year);
            System.out.println("year "+year +" The compound interest after is "+amount);
            }
        }



    }

