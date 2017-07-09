package loopControl;

/**
 * Program for enhanced for lopp or for each Loop
 * Created by Nerd on 6/18/2017.
 */
public class EnhancedForLoop {
    public static void main(String[] args) {

        int marks[] = {50, 70, 80, 95, 68};
        System.out.println("for loop method");
        System.out.println("Marks are: " );
        for (int i = 0; i < marks.length; i++) {
            System.out.println(" \t"+marks[i]);
        }
        // for each loop method
        System.out.println("Enhanced for loop method");
        System.out.println("Marks are ");
        for (int x : marks
             ) {
            System.out.println(" \t"+x);
        }
    }
}
