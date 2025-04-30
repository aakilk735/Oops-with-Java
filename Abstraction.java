abstract class Test{
  public abstract  void TurnOn();
  public abstract void TurnOff();
}
class TvRemote extends Test{
    @Override
     public void TurnOn(){
        System.out.println("please TurnOn the TV");
    }
    @Override
    public void TurnOff(){
        System.out.println("Please TurnOff the TV");
    }
}
public class Abstraction {
    public static void main(String[] args) {
         TvRemote sc=new TvRemote();
         sc.TurnOff();
         sc.TurnOff();
    }
}
