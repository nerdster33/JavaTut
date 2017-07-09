
package ArrayStuffs;
import java.util.Scanner;


public class StudentsGrades {

    
    public static void main(String[] args) {
        int x, y, sum=0;
        Scanner input = new Scanner(System.in);
        int grades[][] = new int[3][3];
        float Averg;
        
        for ( x = 0; x < 3; x++) {
            for ( y = 0; y < 3; y++) {
                System.out.println("Enter the grades of the student "+x+" in Course "+y+": ");
                grades[x][y]=input.nextInt();
                
            }
            
        }
         for ( x = 0; x < 3; x++){
             sum = 0;
             for ( y = 0; y < 3; y++) {
                 sum = grades[x][y];
             }
             Averg = sum/y;
             System.out.println("The average of student "+x+" is "+Averg);
         }
        
        
    }

}
