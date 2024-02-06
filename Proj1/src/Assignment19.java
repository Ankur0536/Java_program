abstract class TVs{
    public void switchOn(){
        System.out.println("Switch on TV");
    }
    public void changeChannel(){
        System.out.println("change channel on TV");
    }
    abstract public void switchOff();
}
class SmartTvs extends TVs {
    @Override
    public void switchOn() {
        System.out.println("Switch on smart TV");
    }
    @Override
    public void changeChannel() {
        System.out.println("change channel on smart TV");
    }
    public void browse(){
        System.out.println("Browse channel on Smart TV");
    }
    public void switchOff(){
        System.out.println("Switch off the smart TV");
    }
}
public class Assignment19 {
    public static void main(String[] args) {
        TVs t=new SmartTvs();
        t.switchOn();
        t.changeChannel();
        ((SmartTvs) t).browse();
        t.switchOff();
    }
}
