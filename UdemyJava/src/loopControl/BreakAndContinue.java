package loopControl;

/**
 * Break And Continue
 * Break : it exit the loop completely
 * Continue : it skip that exact condition
 * Created by Nerd on 6/18/2017.
 */
public class BreakAndContinue {
    public static void main(String[] args) {

        int marks[] = {50, 70, 80, 95, 68};
        System.out.println("Enhanced for loop method");
        System.out.println("Marks are ");
        for (int x : marks  ) {
            if (x==80)
               // break;
                continue;
            System.out.println(" \t"+x);
        }
    }
}
