/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hourlywagecal;
import javax.swing.JOptionPane;


public class LabourerSalary {

    
    public static void main(String[] args) {
        double hrs, sal; 
        String hrsString;
        
        hrsString = JOptionPane.showInputDialog("Enter the number of hours worked for the day: ");
        hrs = Double.parseDouble(hrsString);
        
        if (hrs <= 4) {
            sal = hrs* 8;
            //System.out.println("The total salary for "+hrs+ " hours"+ " is "+sal);
           // JOptionPane.showMessageDialog(null, "The total salary is "+sal);
        } else {
            sal = 32 + (hrs-4)*10;
            // JOptionPane.showMessageDialog(null, "The total salary is "+sal);
        }
        
        JOptionPane.showMessageDialog(null, "The total salary is $"+sal);
        System.exit(0);
        
    }

}
