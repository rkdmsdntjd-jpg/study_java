package ex1_socket;

import java.net.Socket;

public class ClientMain {
    public static void main(String[] args) {
        //192.168.0.26(ip, cmd -> ipconfig)
        try {
            Socket s = new Socket("192.168.0.46",3000);

            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
