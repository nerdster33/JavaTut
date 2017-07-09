
package demoanimal;


public class Animal {
    String name = "Animal";
    int speed = 0;
    int weight = 0;
    
    void changeName(String n){
        name = n;
       
    }
    
    void changeSpeed(int s){
        speed = s;
       
    }
    
    void changeWeight(int w){
       weight= w;
       
    }
    void printStates(){
        System.out.println("Name: "+name);
         System.out.println("Speed: "+speed+"\t Weight: "+weight +"\n");
          
        
    }
}
