
package threadinjava;


public class ThreadInJava extends Thread {
    public boolean finished= false;
    
    public void run(){
        for (int x = 1; x < 1000000; x++) {
            if (finished) break;
               
            
            System.out.println(x);
        }
    }

    
    public static void main(String[] args) {
        ThreadInJava sample = new ThreadInJava();
        sample.start();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            sample.finished=true;
        }
        sample.finished=true;
    }

}
