 class A {
    void display(){
    System.out.println("A");
    }
}
class B extends A{
    void display(){
    System.out.println("B");
    }
}
class Col extends A {
    void display(){
        System.out.println("C");
    }
}
public class Test1 {
    public static void main (String[] args){
        Col c = new Col();
        c.display();
    }
}