import java.util.Scanner;
class Employee {
    void displayRole(){
        System.out.println("All work is done");
    }
}
class Developer extends Employee{
    @Override
    void displayRole(){
        System.out.println("All coding  problem is done");
    }
}
class Manager extends Employee{
    @Override
    void displayRole(){
        System.out.println("All work is managed");
    }
}
 public class Role {
    public static void main(String[] args){
       try (Scanner sc = new Scanner(System.in)){
        int choice = sc.nextInt();
        Employee e;
        if(choice == 1){
            e = new Employee();
        }
        else if(choice == 2){
            e = new Developer();
        }
        else {
            e = new Manager();
        }

        e.displayRole();
        sc.close();
    }
    }
}