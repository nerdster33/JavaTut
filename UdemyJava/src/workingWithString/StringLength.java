package workingWithString;

/**
 * Created by Nerd on 6/19/2017.
 */
public class StringLength {
    public static void main(String[] args) {
        String str = new String("This is String Demo Program");
        System.out.println(str);

        // String str1 = "This is String Demo Program";
        String str1 = "This is String demo Program";

        //System.out.println(str1.length()); // length of string
        int length;
        length = str1.length();
        System.out.println("The string length is "+length);
// str.charAt(12) - to determine the position of a character
        System.out.println("The character at position 12 is "+str.charAt(12));
    }
}
