package InheritancePrgm;

/**
 * Created by Nerd on 6/18/2017.
 */
public class CompanyEmployeeInfo {
    public static void main(String[] args) {
        Engineer eng1 = new Engineer();
        System.out.println("Employee Details are:");
        System.out.println("Employee name: "+eng1.companyName);
        System.out.println("Employee Name: "+eng1.name);
        System.out.println("Employee Country Of Origin: "+eng1.country);
        //System.out.println("Employee Basic salary: "+eng1.salary);
        System.out.println("Employee name: "+eng1.getSalary());
        System.out.println("Employee Statue: "+eng1.statue);


    }
}
