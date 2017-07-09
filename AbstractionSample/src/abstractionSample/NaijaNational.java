package abstractionSample;


abstract public class NaijaNational { // when abstract is added u cant instantiate it
    // public class NaijaNational {
    public String nationalID;
    public int insurance, stipend;
    
    public NaijaNational(String initNationalID, int initInsurance, int initStipend){
        nationalID = initNationalID;
         insurance = initInsurance;
         stipend = initStipend;
    }
    
    abstract  public double stipendNextIncrease(); // jus declared
        
    
    public void setNationalID(String newValue){
        nationalID = newValue;
    }
    
    public void setInsurance(int newValue){
        insurance = newValue;
    }
    
    public void setStipend(int newValue){
        stipend = newValue;
    }
    
    public void displayDetails(){
        System.out.println("National ID: "+nationalID);
        System.out.println("Insurance: "+insurance);
        System.out.println("Stipend: "+stipend);
        
    }

}
