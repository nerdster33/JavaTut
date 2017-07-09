

package multithread;


public class MultiThread {

    
    public static void main(String[] args) {
        CountUp up = new CountUp();
        CountDown down = new CountDown();
        down.start();
        up.start();
        
        try{
            Thread.sleep(5000);
        }catch(Exception e){}
        up.finished= true;
        down.finished=true;
    }

}
