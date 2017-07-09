/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package evenorodd;
import javax.swing.JOptionPane;


public class EvenOrOdd {

    
    public static void main(String[] args) {
        int num;
		String numString;
		
		numString = JOptionPane.showInputDialog("Enter your number of choice:");
		num = Integer.parseInt(numString);
		if ((num%2)== 0) {
			JOptionPane.showMessageDialog(null, num+ " is an even number");
		} else {
			JOptionPane.showMessageDialog(null, num+ " is an odd number");
		}
    }

}
