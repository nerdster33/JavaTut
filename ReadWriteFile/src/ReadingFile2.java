import java.util.Scanner;
import java.io.*;


public class ReadingFile2 {

    
    public static void main(String[] args) throws Exception{
        File file = new File("d:/readfile2.txt");
        try{
          Scanner read = new Scanner(file);
        
        while (read.hasNextLine()) {            
            String line = read.nextLine();
            System.out.println(line);
         }
        } 
        catch(FileNotFoundException e){
        System.out.println("Error: cannot find the file specified");
                
        }
        finally{
               System.out.println("Please file location!"); 
                }
      }
        
    }


