/**
 * Created by Nerd on 6/20/2017.
 */
public class MultipleClass2 {
    public  void  simpleMessage(String name){
        System.out.println("Hello, "+ name);
    }

    private  String girlName;

    public  void setName(String  name){
        girlName = name;

    }
    public  String getName(){

        return  girlName;

    }
    public  void  saying(){
       // System.out.println("My first baby girl name is: "+girlName); // another form below
       // System.out.printf("The name of my first princess is %s", girlName);
       // System.out.println();
        System.out.printf("The name of my first princess is %s", getName());

    }
}
