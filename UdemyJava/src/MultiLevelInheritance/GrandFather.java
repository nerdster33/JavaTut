package MultiLevelInheritance;

/**
 * Created by Nerd on 6/18/2017.
 */
public class GrandFather {

    String grandFirstName = "Akintunde";
    String familyName = "Akinz";
    String village = "Abeokuta";

    String getFullName(){
        String fullName = grandFirstName + " " + familyName;
        return  fullName;
    }
}
