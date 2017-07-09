package MultiLevelInheritance;

/**
 * Created by Nerd on 6/18/2017.
 */
public class Family {
    public static void main(String[] args) {
        Son son1 = new Son();
        System.out.println("Son information is as follows:");
        System.out.println("Full Name is: "+son1.firstName + " "+son1.fatherFirstName + " "+ son1.familyName);
        System.out.println("Father's Name: "+son1.fatherFirstName + " "+son1.middleName + " "+ son1.familyName);
        System.out.println("Grandfather's Name: "+son1.getFullName() + " He is from "+son1);


    }
}
