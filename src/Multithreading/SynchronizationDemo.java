package Multithreading;

class MyData{

    synchronized void display(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
    }
}

class T1 extends Thread{
    MyData d;
    public T1(MyData d){
        this.d = d;
    }

    @Override
    public void run(){
        d.display("Hello World!");
    }
}

class T2 extends Thread{

    MyData d;
    public T2(MyData d){
        this.d = d;
    }

    @Override
    public void run(){
        d.display("What's up!");
    }
}
public class SynchronizationDemo {
    public static void main(String[] args) {

        MyData data = new MyData();
        T1 t1 = new T1(data);
        T2 t2 = new T2(data);

        t1.start();
        t2.start();
    }
}
