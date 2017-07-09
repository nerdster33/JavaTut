package UsingInterface;

public class UsingInterface implements Student,Employee{
    
    public  void study(){
        System.out.println("As a student, I study");
    }
    public void takeExam(){
        System.out.println("As a student, I take exam");

    }
    
     public  void work(){
        System.out.println("As an employee, I work");
    }
    public void receiveSalary(){
        System.out.println("As an employee, I receive salary");

    }
    
    
    public static void main(String[] args) {
        UsingInterface Phemmy = new UsingInterface();
        Phemmy.study();
        Phemmy.takeExam();
        
        Phemmy.work();
        Phemmy.receiveSalary();
        
       // Student nerd = new Student(); // cant instantiate an interface
    }

}
