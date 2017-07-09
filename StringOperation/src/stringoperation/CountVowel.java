

package stringoperation;
import java.util.Scanner;
import java.lang.String;



public class CountVowel {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        char c;
        int x,counter=0;
        
        System.out.println("Enter a string: ");
        str = input.nextLine();
        str = str.toLowerCase();
        
        for ( x = 0; x < str.length(); x++) {
            c = str.charAt(x);
            
            
            // single quote for char
            if(c == 'a' || c == 'e'  || c == 'i'  || c == 'o'  || c == 'u' )
                counter++;
            }
            System.out.println("There are "+counter+" vowels ");
        
        
    }

}
