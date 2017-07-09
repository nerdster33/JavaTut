/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dayoftheweek;
import java.util.Scanner;


public class DayOfTheWeek {

    
    public static void main(String[] args) {
        int day;
        System.out.println("Select a number to show the day of the week:");
        Scanner input =  new Scanner(System.in);
        if (input.hasNextInt()) { // used to ensure that integer is used
            
        
        day = input.nextInt();
        
        
        switch(day){
            case 1: 
                System.out.println("Day 1 - is Sunday");
                break;
             case 2: 
                System.out.println("Day 2 - is Monday");
                break;
             case 3: 
                System.out.println("Day 3 - is Tuesday");
                break;
             case 4: 
                System.out.println("Day 4 - is Wednesday");
                break;
             case 5: 
                System.out.println("Day 5 - is Thursday");
                break;
             case 6: 
                System.out.println("Day 6 - is Friday");
                break;
               case 7: 
                System.out.println("Day 7 - is Saturday");
                break;
               default:
                   System.out.println("Invalid number");
                break;
        }
        } else{
            System.out.println("Sorry, ensure you input an integer!");
        }
    }

}
