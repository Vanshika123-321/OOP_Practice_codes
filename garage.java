class vehicle {
    void startEngine(){
        System.out.println("strting vehicle engine");
    }
    void stopEngine(){
        System.out.println("stopping the vehicle engine");
    }
}
class car extends vehicle{
    void startEngine(){
        System.out.println("starting an car engine");
    }
    void stopEngine(){
        System.out.println("stopping car engine");
    }
}
class Moterbike extends vehicle{
    void startEngine(){
        System.out.println("staring moterbike engine");
    }
    void stopEngine(){
        System.out.println("Stopping MB engine");
    }
}
public class garage {
public static void main(String[] args) {
    vehicle v = new vehicle();
     v.startEngine();
     v.stopEngine();
        vehicle c = new car();
        c.startEngine();
        c.stopEngine();
        vehicle m = new Moterbike();
        m.startEngine();
        m.stopEngine();
    }
}