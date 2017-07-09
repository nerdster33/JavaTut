package inheritance;


import inheritance.NaijaNational;


public class NaijaStudent extends NaijaNational {
    public String studentID;
    public int allowance;
    
    public NaijaStudent(String initStudentID, int initAllowance, String initNationalID, int initInsurance, int initStipend ){
        super(initNationalID, initInsurance, initStipend);
        studentID = initStudentID;
        allowance = initAllowance;
    }
    
     public void setStudentID(int newValue){
        stipend = newValue;
    }
     
     public void setAllowance(int newValue){
        allowance = newValue;
    }
    
    public void displayAdditionalStudentDetails(){
        System.out.println("Student ID: "+studentID);
        System.out.println("Allowance: "+allowance);
      
        
    }

}
