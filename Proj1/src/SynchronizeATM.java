class ATM{
    synchronized public void checkBal(String name){
        System.out.println(name+" is checking the balance");
    }
    synchronized public void withdrawBal(String name,int amount){
        System.out.println(name+" is withdrawing "+amount+" rs");
    }
}
class Customer extends Thread{
    String name;
    int amount;
    ATM atm;
    Customer(String name, ATM atm, int amount){
        this.name=name;
        this.amount=amount;
        this.atm= atm;
    }
    void runATM(){
        atm.checkBal(name);
        atm.withdrawBal(name,amount);
    }
    public void run(){
        runATM();
    }
}
public class SynchronizeATM {
    public static void main(String[] args) {
        ATM atm=new ATM();
        Customer c1= new CustomerBuilder().setName("Ankur").setAtm(atm).setAmount(10000).createCustomer();
        Customer c2= new CustomerBuilder().setName("Koustubh").setAtm(atm).setAmount(50000).createCustomer();
        Customer c3= new CustomerBuilder().setName("Adinath").setAtm(atm).setAmount(70000).createCustomer();
        Customer c4= new CustomerBuilder().setName("Deepa").setAtm(atm).setAmount(30000).createCustomer();
        Customer c5= new CustomerBuilder().setName("Pranali").setAtm(atm).setAmount(60000).createCustomer();
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
    }
}
