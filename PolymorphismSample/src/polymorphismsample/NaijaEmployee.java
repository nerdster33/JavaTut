
package polymorphismsample;


public class NaijaEmployee extends NaijaNational{
  public  String employeeID;
  
  public NaijaEmployee(String initNationalID, String initEmployeeID){
      super(initNationalID);
      employeeID = initEmployeeID;
  }
  
  public void displayIdentification(){
       System.out.println("National ID: "+nationalID);
        System.out.println("Employee ID: "+employeeID+ "\n");
    }

}
