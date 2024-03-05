package Multithreading;

public class RunnableDemo implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while(true){
            System.out.println(i+"Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        RunnableDemo rd = new RunnableDemo();
        Thread t = new Thread(rd);
        t.start();
        int i=0;
        while(true){
            System.out.println(i+"World");
            i++;
        }
    }
}
