package ex_chatting.javaServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;//여러 데이터를 저장할 수 있는 자료구조
import java.net.*;

public class ChatServer {
    static Vector<ClientHandler> cr = new Vector<>();

    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket = new ServerSocket(3005);
        Socket socket;

        while (true) {
            System.out.println("Chat server is waiting...");

            socket = serverSocket.accept();//크라이언트 접속 완료

            DataInputStream dis = new DataInputStream(socket.getInputStream());//클라이언트가 서버로 보내는 데이터를 읽는 통로
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());//서버 → 클라이언트 방향

            String name = dis.readUTF();//접속할 클라이언트 읽어오기

            System.out.println("client name : " + name);

            ClientHandler handler = new ClientHandler(socket, name, dis, dos);
            Thread thread = new Thread(handler);
            cr.add(handler);

            System.out.println(name + " client is added to list");
            thread.start();
        }
    }
}
