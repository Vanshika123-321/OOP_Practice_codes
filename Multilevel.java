 import java.util.Scanner;
class Person {
   void displayperson(String name, int id, String Rs){
    System.out.println("Name: " + name);
    System.out.println("Id: " + id);
    System.out.println("Research Area: " + Rs);
    }
    
}
class Student extends Person{
    void displayperson(String name, int id, String Rs){
    System.out.println("Name: " + name);
    System.out.println("Id: " + id);
    System.out.println("Research Area: " + Rs);
}
}
class gradutate extends Student{
    void displayperson(String name, int id, String Rs){
    System.out.println("Name: " + name);
    System.out.println("Id: " + id);
    System.out.println("Research Area: " + Rs);
}
}
class Multilevel{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String  name = sc.nextLine();
        System.out.println("Enter Id: ");
        int id = sc.nextInt();
        System.out.println("Enter Reasearch area: ");
        String  Rs = sc.nextLine();
        gradutate g = new gradutate();
        g.displayperson(name,id,Rs);


    }
} 
    

