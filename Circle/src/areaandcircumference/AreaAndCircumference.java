/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package areaandcircumference;
import javax.swing.JOptionPane;


public class AreaAndCircumference {

    
    public static void main(String[] args){
        double radius, area, circumference;
        String radiusString;
        
        radiusString = JOptionPane.showInputDialog("Enter the radius for the circle: ");
        radius = Double.parseDouble(radiusString);
        area = Math.PI * Math.pow(radius, 2);
        circumference = 2*Math.PI *radius;
        JOptionPane.showMessageDialog(null, "Circumfe is "+circumference + "\n and Area is "+area);
        System.exit(0);
        
        
        
    }

}
