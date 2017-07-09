package learningjava;

/**
 * program for static variables
 * Created by Nerd on 6/16/2017.
 */
public class StaticVariables {
   final static  String studentName = "Phemmy"; // to make it constant
    static  int regNo = 1001;

    public static void main(String[] args) {
       // studentName = "Oluwafemi";
        System.out.println("Student name is "+studentName);
        System.out.println("Registration number is "+regNo);
        System.out.println("Student name is "+StaticVariables.studentName+ " with registration No. " +StaticVariables.regNo);


    }
}

