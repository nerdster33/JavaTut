import java.util.Scanner;
import java.io.File;

public class ReadingFile {

    
    public static void main(String[] args)throws Exception{
        File file = new File("d:/readfile.txt");
        Scanner read = new Scanner(file);
        
        while (read.hasNextLine()) {            
            String line = read.nextLine();
            System.out.println(line);
        }
        
        
    }

}
