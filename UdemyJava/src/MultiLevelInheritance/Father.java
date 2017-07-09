package MultiLevelInheritance;

/**
 * Created by Nerd on 6/18/2017.
 */


public class Father extends GrandFather {

    String fatherFirstName = "Gabriel";
    String middleName = super.grandFirstName;
    String lastName = super.familyName;
}
