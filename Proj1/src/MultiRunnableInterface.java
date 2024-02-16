public class MultiRunnableInterface implements Runnable {
    @Override
    public void run() {
        int i=1;
        while(true){
            System.out.println(i+" Run method");
            i++;
        }
    }

    public static void main(String[] args) {
        MultiRunnableInterface mti=new MultiRunnableInterface();
        Thread td=new Thread(mti);
        td.start();
        int i=1;
        while(true){
            System.out.println(i+" Main method");
            i++;
        }
    }
}
