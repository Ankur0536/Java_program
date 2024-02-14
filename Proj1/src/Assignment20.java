abstract  class Phone{
     abstract public void call();
    abstract public void sms();
}

interface Icamera{
    public void record();
    public void click();
}
interface Imusic{
    public void play();
    public void stop();
}
class SmartPhone extends Phone implements Icamera,Imusic{

    @Override
    public void call() {
        System.out.println("Calling");
    }

    @Override
    public void sms() {
        System.out.println("Send sms");
    }

    @Override
    public void record() {
        System.out.println("Record");
    }

    @Override
    public void click() {
        System.out.println("Click button");
    }

    @Override
    public void play() {
        System.out.println("Play music");
    }

    @Override
    public void stop() {
        System.out.println("Stop music");
    }
}

public class Assignment20 {
    public static void main(String[] args) {
        SmartPhone sp=new SmartPhone();
        sp.call();
        sp.sms();
        sp.record();
        sp.click();
        sp.play();
        sp.stop();
    }

}
