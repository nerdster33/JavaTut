
package demoanimal;


public class DemoAnimal {

    
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        
        
        animal1.changeName("Cow");
        animal1.changeSpeed(10);
        animal1.changeWeight(500);
        animal1.printStates();
        
        animal2.changeName("Cheetah");
        animal2.changeSpeed(500);
        animal2.changeWeight(120);
         animal1.printStates();
    }

}
