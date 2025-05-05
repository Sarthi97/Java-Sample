//  Ques1
class Manager{
    void work(){
        System.out.println("Manager in Metting");
    }
   }
   class Employee extends Manager {
    void AttendMetting(){
        System.out.println("Employee is Working");
    }
   }

public class Q3{
public static void main(String[] args) {
//    Manager mgr = new Manager(); 
   Employee obj = new Employee();
   obj.work();
   obj.AttendMetting();

}
} 