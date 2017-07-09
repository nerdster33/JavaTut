
import java.io.FileWriter;
import java.io.BufferedWriter;


public class WritingFile {

    
    public static void main(String[] args)throws Exception{
        FileWriter writeFile = new FileWriter("d:/writefile.txt");
        BufferedWriter write = new BufferedWriter(writeFile);
        
        for(int i=1; i<=10;i++){
            write.write(Integer.toString(i));
           write.flush();
        }
       
        
    }

}
