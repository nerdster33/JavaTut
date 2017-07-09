
package hourlywagecal;
import java.util.Scanner;

public class HourlyWageCal {

    
    public static void main(String[] args) {
        
        // not too cool way of solving
//        int hour, rate, sh;
//        double pay;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number of hours worked for the day: ");
//        hour = input.nextInt();
//        
//        rate = 4 * 8;
//        sh = (hour -4)*10;
//        pay = rate + sh;
//        System.out.println("Total Salary for the day is "+pay);
        
        int hrs;
        double sal;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of hours worked for the day: ");
       hrs = input.nextInt();
       
        if (hrs <= 4) {
            sal = hrs* 8;
            System.out.println("The total salary for "+hrs+ " hours"+ " is "+sal);
        } else {
            sal = 32 + (hrs-4)*10;
            System.out.println("The total salary for "+hrs+ " hours"+ " is "+sal);
        }
        
        
        
        
        
    }

}
