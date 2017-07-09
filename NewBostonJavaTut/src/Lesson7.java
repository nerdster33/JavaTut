import java.util.Scanner;

/**
 * Basic Calculator
 * Created by Nerd on 6/19/2017.
 */
public class Lesson7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double firstNum, secondNum, result;
        System.out.println("Enter first number: ");
        firstNum = input.nextDouble();
        System.out.println("Enter second number: ");
        secondNum = input.nextDouble();
        System.out.println("Select the operation 1 - plus, 2- minus, 3- multiply, 4-divison");
        int option = input.nextInt();

        switch (option){
            case 1:
                result= firstNum + secondNum;
                System.out.println("The Sum of "+firstNum +" and "+secondNum + " is:"+result);
                break;
            case 2:
                result= firstNum - secondNum;
                System.out.println("The difference of "+firstNum +" and "+secondNum + " is:"+result);
                break;
            case 3:
                result= firstNum * secondNum;
                System.out.println("The product of "+firstNum +" and "+secondNum + " is:"+result);
                break;
            case 4:
                result= firstNum / secondNum;
                System.out.println("The division of "+firstNum +" by "+secondNum + " is:"+result);
                break;
                default:
                    System.out.println("Invalid operation, select a valid operation");
        }

    }
}
