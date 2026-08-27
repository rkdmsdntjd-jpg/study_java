package ex_chatting.javaServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;
import java.net.*;

public class ChatServer {
    static Vector<ClientHandler> cr = new Vector<>();
    static int i = 0;//count

    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(3005);
        Socket socket;

        while (true) {
            System.out.println("Chat server is waiting...");

            socket = ss.accept();//크라이언트 접속 완료

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            String name = dis.readUTF();//접속할 클라이언트 읽어오기

            System.out.println("client name : " + name);

            ClientHandler handler = new ClientHandler(socket, name, dis, dos);
            Thread thread = new Thread(handler);
            cr.add(handler);

            System.out.println(name + " client is added to list");
            thread.start();
            i++;
        }
    }
}
