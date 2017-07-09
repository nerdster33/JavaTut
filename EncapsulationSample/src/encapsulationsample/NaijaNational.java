

package encapsulationsample;


public class NaijaNational {
public String nationID;
public int insurance;
 
     public NaijaNational(){
         nationID ="";
            insurance=0;
     }
     public void setNationalID(String initNationalID){
        nationID =initNationalID;
     }
     
     public void setInsurance(int initInsurance){
       insurance=initInsurance;
     }
     
     public String getNationalID(){
         return nationID;
     }
     
     public int getInsurance(){
         return insurance;
     }
}

