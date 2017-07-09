package workingWithString;

/**
 * Created by Nerd on 6/19/2017.
 */
public class StringToChar {
    public static void main(String[] args) {
        String str = new String("This is the string Demo program");
        System.out.println(str);
        char[] chr = str.toCharArray(); // to convert string to xter
        for (char c:chr)
              {
                  System.out.println(c);
        }
    }
}
