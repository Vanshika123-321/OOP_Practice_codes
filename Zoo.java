 abstract class Animal{
    abstract void sound();
}
class Lion extends  Animal{
  
    void sound(){
        System.out.println("lion's roar");
    }
}
class Tiger extends Animal{

    void sound(){
        System.out.println("tiger's growl");
    }
}
public class Zoo {
    public static void main(String[] args){
     Animal lion = new Lion();
     lion.sound();
     Animal tiger =   new Tiger();
     tiger.sound();
     
    }
} 
    

