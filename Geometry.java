import java.util.Scanner;
abstract class GeometricShape{
    abstract int area();
    abstract int perimeter();
}
class Triangle extends GeometricShape{
    int a,b,c;
    
    Triangle(int a, int b,int c){
     this.a=a;
     this.b=b;
     this.c=c;
    }
    int area(){
      int  s = (a+b+c)/2;
        return (int) Math.sqrt(s * ((s-a)*(s-b)*(s-c)));
    }
    int perimeter(){
        return a+b+c;
    }
}
class Square extends GeometricShape{
    int side;
    Square(int side){
        this.side=side;
    }
    int area(){
        return side*side;
    }
    int perimeter(){
        return 4*side;
    }
}
class Geometry{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a , b and c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter side: ");
        int side = sc.nextInt();
        GeometricShape T = new Triangle(a,b,c);
        T.area();
        T.perimeter(); 
        GeometricShape S = new Square(side);
        S.area();
        S.perimeter();
        System.out.println("Area : " +  T.area());
        System.out.println("Perimeter : " + T.perimeter());
        System.out.println("Area : " +  S.area());
        System.out.println("Perimeter : " + S.perimeter());


    }
}