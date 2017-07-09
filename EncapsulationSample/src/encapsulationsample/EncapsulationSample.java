
package encapsulationsample;


public class EncapsulationSample {

    
    public static void main(String[] args) {
        NaijaNational student = new NaijaNational();
        //SaudiNational student1 = new SaudiNational();
        System.out.println("National ID: "+student.nationID);
        System.out.println("Insurance: "+student.insurance);
        System.out.println("");
        student.setNationalID("NID110");
        student.setInsurance(120000);
        
        System.out.println("National ID: "+student.nationID);
        System.out.println("Insurance: "+student.insurance);
        
        System.out.println(""); // to show encapulation
        SaudiNational student1 = new SaudiNational();
        student1.setNationalID("NID110");
        student1.setInsurance(120000);
       // System.out.println("National ID: "+student1.nationID);
         System.out.println("National ID: "+student1.getNationalID());
       // System.out.println("Insurance: "+student1.insurance);
           System.out.println("Insurance: "+student1.getInsurance());
        System.out.println("");
        
        
        System.out.println("National ID: "+student1.getNationalID());
        System.out.println("Insurance: "+student1.getInsurance());
        

    }

}
