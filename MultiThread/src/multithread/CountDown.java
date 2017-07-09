/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multithread;


public class CountDown extends Thread{
        public boolean finished= false;
    public void run(){
        for(int x=1000000; x>0; x--) {
            if(finished)break;
            System.out.println("CountDown: "+x);
        }
    }
}
