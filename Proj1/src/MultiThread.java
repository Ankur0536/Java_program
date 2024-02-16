public class MultiThread extends Thread {
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+"  Run method");
            i++;
        }
    }
    public static void main(String[] args) {
        MultiThread mt=new MultiThread();
        mt.start();
        int i=1;
        while(true){
            System.out.println(i+"   Main method");
            i++;
        }

    }
}
