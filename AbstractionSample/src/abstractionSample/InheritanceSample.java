
package abstractionSample;


public class InheritanceSample {

    
    public static void main(String[] args) {
        NaijaStudent student = new NaijaStudent("SID200100", 1500, "NID1990100", 100000, 20000);
        student.displayDetails();
        student.displayAdditionalStudentDetails();
        
        
        System.out.println();
        
       // NaijaNational  national = new NaijaNational( "NID1990200", 200000, 30000);
       // national.displayDetails();
            
        
    }

}
