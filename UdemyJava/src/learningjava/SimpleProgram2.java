package learningjava;

/**
 * Created by Nerd on 6/14/2017.
 */
public class SimpleProgram2 {



    public int sum(){
        int num1 = 12;
        int num2 = 55;
        return  num1 + num2;
    }

    public double multiply(){
        double a = 101.2;
        double b = 23.5;
        return a * b;
    }

    public float division(){
        float c = 55.2f;
        int d = 23;
        return c/d;
    }


    public static void main(String[] args) {
        SimpleProgram2 obj1 = new SimpleProgram2();

        //System.out.println("the sum of number 1 and number 2 is  " + obj1);
        System.out.println("T  he sum of number 1 and number 2 is: " + obj1.sum());
        System.out.println("The product of a and b is: " + obj1.multiply());
        System.out.println("The division of c and d is: " + obj1.division());

    }
}
