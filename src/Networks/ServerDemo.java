package Networks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

    public static void main(String[] args) {

        try(
                ServerSocket ss = new ServerSocket(2000);
                Socket stk = ss.accept();

                BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
                PrintStream ps = new PrintStream(stk.getOutputStream())
                ){

            String msg;
            StringBuilder sb;
            System.out.println("Server connected!");
            do{

                msg = br.readLine();
                sb = new StringBuilder(msg);
                msg = sb.reverse().toString();
                ps.println(msg);
            }while(!msg.equals("dne"));

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

class ClientDemo {

    public static void main(String[] args) {

        try(
                Socket stk = new Socket("localhost",2000);
                BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
                BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
                PrintStream ps = new PrintStream(stk.getOutputStream())
        ){
            String msg;
            do{
                msg = keyb.readLine();
                ps.println(msg);
                msg = br.readLine();
                System.out.println(msg);
            }while(!msg.equals("dne"));

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
