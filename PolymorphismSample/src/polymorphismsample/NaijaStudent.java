/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polymorphismsample;


public class NaijaStudent extends NaijaNational{
  public  String studentID;
   
   public NaijaStudent(String initNationalID, String initStudentID){
       super(initNationalID);
       studentID = initStudentID;
       
   }
   
  public void displayIdentification(){
       System.out.println("National ID: "+nationalID);
        System.out.println("Student ID: "+studentID+ "\n");
    }

}
