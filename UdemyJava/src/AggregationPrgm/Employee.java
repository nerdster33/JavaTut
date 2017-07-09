package AggregationPrgm;

/**
 * Created by Nerd on 6/18/2017.
 */
public class Employee {
    int empId;
    String name;
    Address address; // aggragation

    public Employee(int empId, String name, Address address){
        this.empId = empId;
        this.name = name;
        this.address = address;
    }

    void EmployeeDetails(){
        System.out.println("Employee Name "+name);
        System.out.println("Employee ID: "+empId);
        System.out.println("Employee Address: \n"+address.street +" "+address.city+" "+address.state+" "+address.country);



    }

    public static void main(String[] args) {

Address addy = new Address("17, Maryola street", "Ojo", "Lagos", "Nigeria");

Employee emp1 = new Employee(101, "Phemmy Akinz", addy);
emp1.EmployeeDetails();

    }
}
