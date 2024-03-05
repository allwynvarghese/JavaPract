package Multithreading;

class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }

    @Override
    public void run(){
        int i = 1;
        while(true){
            System.out.println(i);
            i++;
            try{
                Thread.sleep(1000);
            }catch(Exception e) {
                System.out.println(e);
            }
        }
    }

}

public class ThreadMethodsDemo {

    public static void main(String[] args) {

        MyThread t = new MyThread("Allwyn1");
        t.start();
        System.out.printf("\nId: %s", t.getId());
        System.out.printf("\nName: %s\n",t.getName());
    }
}
