/**
 * Created by Nerd on 6/28/2017.
 */
import javax.swing.JOptionPane;
public class JavaOptionPane {
    public static void main(String[] args) {
        String name;
        int count;

        name = JOptionPane.showInputDialog("Enter the your name:");
        count = name.length();
        JOptionPane.showMessageDialog(null,"Your name contains "+count+ " letters");
        System.exit(0);
    }

}
