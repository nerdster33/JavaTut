package workingWithString;

/**
 * Created by Nerd on 6/19/2017.
 */
public class ImmutableString {
    public static void main(String[] args) {
        String str = new String("This is String Demo Program");
        str = str + " . by Nerd";
        System.out.println(str);
    }
}
