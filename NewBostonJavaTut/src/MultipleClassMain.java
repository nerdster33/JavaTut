import java.util.Scanner;

/**
 * Created by Nerd on 6/20/2017.
 */
public class MultipleClassMain {
    public static void main(String[] args) {

        // for Multiple class 1
//        System.out.println("Please type type your name:");
//        Scanner input = new Scanner(System.in);
//        String name = input.nextLine();
//
//        MultipleClass1 mc1 = new MultipleClass1();
//        mc1.simpleMessage(name);

        // for Multipleclass 2
        System.out.println("Please Enter name of first female child:");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine(); //

        MultipleClass2 mc2 = new MultipleClass2();

        mc2.setName(name);
        mc2.saying();
    }
}
