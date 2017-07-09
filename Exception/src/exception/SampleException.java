

package exception;


public class SampleException {

    
    public static void main(String[] args) {
        int sum;
        int grades[] = {90, 95, 98};
        
        try{
                System.out.println("Welcome to this program!");
                sum = grades[1] + grades[2] + grades[3];
                System.out.println("The sum is "+sum);
        }catch(Exception e){
            System.out.println("Error "+e);
        }finally{
            System.out.println("This block is always executed no matter what!");
        }
    }

}
