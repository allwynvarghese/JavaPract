package Networks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadServerDemo extends Thread{

    Socket skt;

    public MultiThreadServerDemo(Socket skt){
        this.skt = skt;
    }

    @Override
    public void run(){
        try(
                BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
                PrintStream ps = new PrintStream(skt.getOutputStream());
                ){
            String msg;
            StringBuilder sb;
            do{
                msg = br.readLine();
                sb = new StringBuilder(msg);
                msg = sb.reverse().toString();
                ps.println(msg);
            }while(!msg.equals("dne"));

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        try(
                ServerSocket ss = new ServerSocket(2000);

                ){
            //int count = 1;

            do{
                Socket skt = ss.accept();
                //System.out.println("Connected to the server: "+ count++);
                MultiThreadServerDemo msd = new MultiThreadServerDemo(skt);
                msd.start();
            }while(true);

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class MultiClientDemo{

    public static void main(String[] args) {
        try(
                Socket skt = new Socket("localhost", 2000);
                BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
                BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
                PrintStream ps = new PrintStream(skt.getOutputStream());
        ){
            String msg;
            do{
                msg = keyb.readLine();
                ps.println(msg);
                msg = br.readLine();
                System.out.println("From server: "+ msg);
            }while(!msg.equals("dne"));

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
