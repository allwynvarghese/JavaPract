package Multithreading;

class ATM{
    synchronized void checkBalance(String name){
        System.out.printf("%s is checking the balance.", name);
    }

    synchronized void withdrawal(String name, int amt){
        System.out.printf("%s is withdrawing %d amount", name, amt);
    }
}

class Customer extends Thread{
    int amt;
    String name;
    ATM atm;

    public Customer(String name, int amt, ATM atm){
        this.name=name;
        this.amt=amt;
        this.atm = atm;
    }

    public void useAtm(){
        atm.checkBalance(name);
        atm.withdrawal(name,amt);
    }

    @Override
    public void run() {
        useAtm();
    }
}

public class Challenge {

    public static void main(String[] args) {

        ATM atm = new ATM();
        Customer c1 = new Customer("Allwyn", 1000, atm);
        c1.start();

    }

}
