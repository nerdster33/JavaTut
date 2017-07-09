package DecisionMaking;

import java.util.Scanner;

/**
 * Created by Nerd on 6/18/2017.
 */
public class StringInSwitchStmt {
    public static void main(String[] args) {

        System.out.println("Select your desired Language: English, Igbo, Yoruba or Hausa");

        Scanner input = new Scanner(System.in);
        String Lang = input.nextLine().toLowerCase();


        switch (Lang){
            case "english":
                System.out.println("Your desired language is English");
                break;
            case "igbo":
                System.out.println("Your desired language is Igbo");
                break;
            case "yoruba":
                System.out.println("Your desired language is Yoruba");
                break;
            case "hausa":
                System.out.println("Your desired language is Hausa");
                break;
            default:
                System.out.println("Inalid Language, please select a valid language!");


        }
    }
}
