
abstract class  Instrument{
 abstract void play();
 abstract void tune();
}
class Glocknspiel extends Instrument{
    @Override
    public void play(){
        System.out.println("Play");
    }
    @Override
    public void tune(){
        System.out.println("It can tune");
    }
}
class violin extends Instrument{
    @Override
   public void play(){
        System.out.println("It is play");
    }
    @Override
    public void tune(){
        System.out.println("It also tune");
    }
}
public class Music{
    public static void main(String[] args) {
        Instrument G = new Glocknspiel();
        G.play();
        G.tune();
        Instrument v = new violin();
        v.play();
        v.tune();
    }
}