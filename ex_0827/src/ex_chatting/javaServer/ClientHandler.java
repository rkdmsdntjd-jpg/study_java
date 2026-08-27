package ex_chatting.javaServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ClientHandler implements Runnable{
    Socket socket;
    String name;
    DataInputStream dis;
    DataOutputStream dos;

    public ClientHandler(Socket socket, String name, DataInputStream dis, DataOutputStream dos){
        this.socket = socket;
        this.name = name;
        this.dis = dis;
        this.dos = dos;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String msg = dis.readUTF();
    
                System.out.println(name + " : " + msg);
    
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
