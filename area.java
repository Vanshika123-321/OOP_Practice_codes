import java.util.Scanner;
class shape{
    public double calculateArea(){
        return 0.0;
    }
}
class Circle extends shape{
    double radius;

    public Circle(double radius) {
     this.radius=radius;
    }
    @Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
}
class Rectangle extends shape{
    
    double length,breadth;

    public Rectangle(double length, double breadth) {
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    public double calculateArea(){
        return length*breadth;
    }
}
class Triangle extends shape{
    double b,h;

    public Triangle(double b, double h) {
      this.b=b;
      this.h=h;
    }
   @Override

   public double calculateArea(){
        return (0.5*b*h);
    }
}
public class area{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        System.out.println("Enter length and breadth: ");
        double length  = sc.nextDouble();
        double breadth = sc.nextDouble();
        System.out.println("Enter base and height: ");
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        shape c = new Circle(radius);
        c.calculateArea();
        shape R = new Rectangle(length,breadth);
        R.calculateArea();
        shape T = new Triangle(b,h);
        T.calculateArea();
        System.out.println("Area of circle: " + c.calculateArea());
        System.out.println("Area of Rectangle: " +R.calculateArea());
        System.out.println("Area of Triangle: " +T.calculateArea() );
    }
}