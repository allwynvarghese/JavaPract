package Multithreading;

class MyThread2 extends Thread{

    public MyThread2(String name){
        super(name);
    }

    @Override
    public void run(){
        int count = 1;
        while(true){
            System.out.println(count++ + "\tMyThread2");
        }
    }
}

public class ThreadMethodDemo2 {

    public static void main(String[] args) {

        MyThread2 myThread2 = new MyThread2("Allwyn 2");
        //myThread2.setDaemon(true);
        myThread2.start();
        Thread mainThread = Thread.currentThread();

//        try{
//            mainThread.join();
//        }catch (InterruptedException e){
//            System.out.println(e);
//        }

        int count = 1;
        while(true){
            System.out.println(count++ + "\tMain thread");
            Thread.yield();
        }

        //System.out.println("Main thread exits here");
    }
}
