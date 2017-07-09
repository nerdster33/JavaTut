
package fastfoodpos;
import javax.swing.JOptionPane;

public class FastFoodPOS {

    
    public static void main(String[] args) {
        int packageMeal;
      
            
        
        
        packageMeal= Integer.parseInt(JOptionPane.showInputDialog("Package Meal no: 1, 2, 3"));
        
        
        switch(packageMeal){
            case 1:
                JOptionPane.showMessageDialog(null, "1 Regular Humburger\n 1 Regular Pepsi\n +"
                        + "1 Regular Fries\nAmount: $2.00");
                break;
           case 2:
                JOptionPane.showMessageDialog(null, "1 double Humburger\n 1 Medium Pepsi\n"+ 
                    "1 Medium Fries\nAmount: $2.50");
                break;
              case 3:
                JOptionPane.showMessageDialog(null, "1 Burger Champ\n 1 Large Pepsi\n" + 
                "1 Large Fries\nAmount: $3.00");
                break;
                default:
                JOptionPane.showMessageDialog(null, "Invalid Choice");
                
        }
        
        System.exit(0);
        
    }

}
