
package ArrayStuffs;
import javax.swing.JOptionPane;


public class ArrayRowTotal {

    
    public static void main(String[] args) {
        int num[][] = new int[2][3];
        int sum = 0, x,y;
        
        for ( x = 0; x < 2; x++) {
            for ( y = 0; y < 3; y++) {
                num[x][y]= Integer.parseInt(JOptionPane.showInputDialog("Enter the element["+x+"]["+y+"]"));
               
            }
        }
            
            for ( x = 0; x < 2; x++) {
                sum=0;
           
                for ( y = 0; y < 3; y++) {
               
                sum +=num[x][y];
               }
                JOptionPane.showMessageDialog(null,"The sum of all the elements for row "+x+" is "+ sum);
               
            }
              System.exit(0);   
        }
        
        
    }


