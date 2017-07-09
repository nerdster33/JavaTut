/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multithread;


public class CountUp extends Thread{
    public boolean finished= false;
    public void run(){
        for (int x = 1; x < 100000; x++) {
            if(finished)break;
            System.out.println("CountDown: "+x);
        }
    }

}
