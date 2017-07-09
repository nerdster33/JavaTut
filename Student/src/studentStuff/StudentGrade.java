
package studentStuff;


public class StudentGrade {

    
    public static void main(String[] args) {
        
        StudentDetails sd = new StudentDetails();
        
        sd.displayDetails();
        sd.name="Nerd";
        sd.grade1 = 98;
        sd.grade2 = 99;
        sd.grade3 = 96;
        
        sd.getAverage();
        sd.displayDetails();
        
         StudentDetails sd2 = new StudentDetails("Phemmy",100, 95,98);
        
        // sd2.getAverage(); // average is already computed in the method
         sd2.displayDetails();   
        
    }

}
