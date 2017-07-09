/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaoptionpane;
import javax.swing.JOptionPane;


public class JavaOptionPane {

    
    public static void main(String[] args) {
        String name;
        int count;
        
        name = JOptionPane.showInputDialog("Enter your name: ");
        count = name.length();
        JOptionPane.showMessageDialog(null, "Your name has "+count + " letters");
        System.exit(0);
        
    }

}
