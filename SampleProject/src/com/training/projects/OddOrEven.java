package com.training.projects;
import javax.swing.JOptionPane;

public class OddOrEven {

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
