package Networks;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//client
public class DatagramClient {

    public static void main(String[] args) {

        try(
                DatagramSocket ds = new DatagramSocket(2001)
                ){
            //sending message
            String msg = "Hello from the client!";
            DatagramPacket dp = new DatagramPacket(msg.getBytes(),msg.length(), InetAddress.getByName("localhost"),2000);
            ds.send(dp);
            //receiving message and print
            byte[] b = new byte[1024];
            dp = new DatagramPacket(b,b.length);
            ds.receive(dp);
            msg = new String(dp.getData()).trim();
            System.out.println("From server: "+msg);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

//server
class DatagramServer{
    public static void main(String[] args) {
        try(
                DatagramSocket ds = new DatagramSocket(2000)
                ){
            //receive data
            byte [] b = new byte[1024];
            DatagramPacket dp = new DatagramPacket(b, b.length);
            ds.receive(dp);
            String msg = new String(dp.getData()).trim();
            System.out.println("From client: "+ msg);
            StringBuilder sb = new StringBuilder(msg);
            msg=sb.reverse().toString();
            //send back data
            b=msg.getBytes();
            dp=new DatagramPacket(b,b.length,InetAddress.getByName("localhost"),2001);
            ds.send(dp);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
