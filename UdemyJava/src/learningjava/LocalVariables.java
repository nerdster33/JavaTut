package learningjava;

/**
 * Program on local variables
 * Created by Nerd on 6/16/2017.
 */
public class LocalVariables {

    public  int sum(){
        int a = 121;
        int b = 234;
        return a + b;
    }


    public static void main(String[] args) {
        LocalVariables obj = new LocalVariables();
        System.out.println("The sum of a and b is "+obj.sum());
    }
}
