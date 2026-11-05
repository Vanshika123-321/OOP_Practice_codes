class Grandparent{

    public Grandparent() {
        System.out.println("Grandparent COnstructor");
    }
    
}
class parents extends Grandparent{

    public parents() {
        System.out.println("parents construtor");
    }
    
}
class child extends parents {

    public child() {
        System.out.println("Child constructor");
    }
    
}
public class Family {
    public static void main(String[] args) {
        child c = new child();
    }
}