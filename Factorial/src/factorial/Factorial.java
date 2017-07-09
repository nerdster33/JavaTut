

package factorial;
import javax.swing.JOptionPane;


public class Factorial {

    
    public static void main(String[] args) {
        int num, counter, factorial = 1;
        
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        
        for ( counter = num; counter >= 1; counter--) {
            factorial *= counter;
            
        }
        JOptionPane.showMessageDialog(null, "The factorial of "+num + " is "+factorial);
        System.exit(0);
        
    }

}
