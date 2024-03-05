package Multithreading;

public class ThreadDemo extends Thread{

    @Override
    public void run(){
        int i = 0;
        while(true){
            System.out.println(i+"Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
        td.start();
        int i=0;
        while(true){
            System.out.println(i+"World");
            i++;
        }
    }
}
