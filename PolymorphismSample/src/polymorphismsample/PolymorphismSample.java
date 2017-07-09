

package polymorphismsample;


public class PolymorphismSample {

    
    public static void main(String[] args) {
        NaijaNational Phemmy = new NaijaNational("NID100");
        NaijaStudent Niffy = new NaijaStudent("NID200", "SID200");
        NaijaEmployee Debby = new NaijaEmployee("NID300", "EID300");
        
        Phemmy.displayIdentification();
        Niffy.displayIdentification();
        Debby.displayIdentification();
        
    }

}
