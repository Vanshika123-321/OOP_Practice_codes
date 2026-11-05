import java.util.Scanner;
 class Vehicle {
    void display(){
        System.out.println("Vehicle");
    }
}
class Car extends Vehicle {
    @Override
    void display(){
        System.out.println("Car starts with key");
    }

}
class Bike extends Vehicle{
    @Override
    void display(){
       System.out.println("Bike starts with button");
    }
}
public class Demo{
    public static void main(String[] args ){
   try (Scanner sc = new Scanner(System.in)){
    int choise = sc.nextInt();
    Vehicle v;
    if(choise==1){
      v = new Bike();
      v.display();
    }
    else if(choise==2){
        v = new Car();
        v.display();
    }
    else{
        System.out.println("Invalid choice");
    }
    }
}
}