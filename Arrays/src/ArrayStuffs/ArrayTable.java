
package ArrayStuffs;

/**
 *
 * @author Nerd
 */
public class ArrayTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int fistArray [][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
     int secondArray [][] = {{21,22,23,24,25},{30,31,32,34,35},{41,42,43,44,45}};
    
        System.out.println("First Array is: ");
        Show(fistArray);
        System.out.println("");
        System.out.println("Second Array is: ");
        Show(secondArray);
    }
    
     public static void Show(int y[][]){
        for (int row = 0; row < y.length; row++) {
            for (int column = 0; column < y[row].length; column++) {
                System.out.print(y[row][column] +"\t");
            }
            System.out.println("");
        }
    }
    
}
