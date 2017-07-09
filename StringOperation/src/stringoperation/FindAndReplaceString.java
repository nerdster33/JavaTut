

package stringoperation;
import java.util.Scanner;
import java.lang.String;



public class FindAndReplaceString {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str, strFind, strReplace, strNew;
        
        System.out.println("Enter string: ");
        str = input.nextLine();
        System.out.println("Enter string to find: ");
        strFind = input.nextLine();
        System.out.println("Enter string to replace: ");
        strReplace = input.nextLine();
        
        strNew=str.replaceAll(strFind, strReplace);
        
        System.out.println("Old string is:  "+str);
         System.out.println("New string is:  "+strNew);

        
    }

}
