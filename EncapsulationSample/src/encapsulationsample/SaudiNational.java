/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package encapsulationsample;


public class SaudiNational {
   private String nationID;
    private int insurance;
 
     public SaudiNational(){
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
