package workingWithString;

/**
 * Created by Nerd on 6/19/2017.
 */
public class StringDemo {
    public static void main(String[] args) {
        String str = new String("This is String Demo Program");
        System.out.println(str);

       // String str1 = "This is String Demo Program";
        String str1 = "This is String demo Program";
        System.out.println(str1);
        System.out.println();

        System.out.println(str == str1);
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1 ));


    }
}
