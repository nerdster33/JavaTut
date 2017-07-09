package DoubtClarification;

/**
 * Created by Nerd on 6/18/2017.
 */
public class StudentInfo {

    private int regNo;
    private  String name;
    private  int age;
    private  String address;

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        StudentInfo stu1 = new StudentInfo();
        stu1.setName("Femi");
        stu1.setRegNo(1001);
        stu1.setAge(18);
        stu1.setAddress("Close 30, Satellite town, Lagos.");

        System.out.println("Student Name is "+stu1.getName());
        System.out.println("Student Registation No.  is "+stu1.getRegNo());
        System.out.println("Student Age is "+stu1.getAge());
        System.out.println("Student Address is "+stu1.getAddress());
    }
}
