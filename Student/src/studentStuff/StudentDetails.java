
package studentStuff;


public class StudentDetails {
    
    String name;
    int grade1,grade2,grade3;
    double average;
    
    public StudentDetails(){
         name="no name";
         grade1 = 0;
         grade2 = 0;
         grade3 = 0;
         average = 0;
         
    }
    public StudentDetails(String n, int g1, int g2, int g3){
        name = n;
        grade1 = g1;
        grade2 = g2;
        grade3 = g3;
        average = (grade1+ grade2 +grade3)/3;
    }
    
    public double getAverage(){
         average = (grade1+ grade2 +grade3)/3;
        return average;
    }
    
    public  void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Average: "+average);
    }

}
