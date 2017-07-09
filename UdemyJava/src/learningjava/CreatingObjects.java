package learningjava;

/**
 * Created by Nerd on 6/14/2017.
 */
public class CreatingObjects {

    public CreatingObjects(){
        System.out.println("I am in the constructor");
    }

    public CreatingObjects(String name){
        System.out.println("My name is " +name );
    }

    public void messageMethod(){
        System.out.println("I am in the message method");
    }

    public static void main(String[] args) {
        CreatingObjects obj1 = new  CreatingObjects("Oluwaphemmy ");
        CreatingObjects obj3 = new  CreatingObjects("Person");

        CreatingObjects obj2 = new  CreatingObjects("Nerd");
        obj1.messageMethod();
        }
}
