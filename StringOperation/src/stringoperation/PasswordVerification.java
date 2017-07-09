
package stringoperation;
import java.util.Scanner;
import java.lang.String;


public class PasswordVerification {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pwd, vpwd;
        
         System.out.println("Enter your password: ");
        pwd = input.nextLine();
        System.out.println("Verified password: ");
         vpwd = input.nextLine();
         
         if (pwd.equals(vpwd)) {
             System.out.println("Password Verified!");
        //}else if(pwd.equals(vpwd.toLowerCase()) || pwd.equals(vpwd.toLowerCase())){
       }else if(pwd.equalsIgnoreCase(vpwd) ){
            System.out.println("Case Problem!");
        }else{
            System.out.println("Failure!");
        }
        
        
        
    }

}
