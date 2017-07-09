package learningjava;

/**
 * program for instance variables
 * Created by Nerd on 6/16/2017.
 */
public class InstanceVariable {

    public String studentName;
   public int regNo = 1001;

    public  void setStudentName(String name){
        studentName = name;
    }

    InstanceVariable(String name1){
        studentName = name1;
        System.out.println("This student name inside the constructor is "+ studentName);
    }


    public static void main(String[] args) {
        InstanceVariable obj = new InstanceVariable("Phemmy Akinz");

        obj.setStudentName("Nerd");
        //System.out.println("Student name is "+ studentName);
        System.out.println("The student name is " + obj.studentName + " with registration number " + obj.regNo);
    }
}
