import java.util.Scanner;
class Student {
    String name;
    Student(String name){
        this.name = name; 
    }
}
class CollegeStudent extends Student{
    String cource;

    public CollegeStudent(String name , String cource) {
        super(name);
        this.cource=cource;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Cource name: " + cource);
    }
}
public class student {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Name: ");
    String name =sc.nextLine();
    System.out.println("Enter Cource Name: ");
    String cource = sc.nextLine();
    CollegeStudent cs = new CollegeStudent(name,cource);
    cs.display();
    }
}