class TV{
    public void switchOn(){
        System.out.println("Switch on TV");
    }
    public void changeChannel(){
        System.out.println("change channel on TV");
    }
}
class SmartTv extends TV {
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
}
public class Assignment18 {
    public static void main(String[] args) {
        TV t=new SmartTv();
        t.changeChannel();
        t.switchOn();
        ((SmartTv) t).browse();
    }
}
