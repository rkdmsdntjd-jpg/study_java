package ex_chatting.javaClient;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatClient {
    final static int PORT= 3005;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        InetAddress ip;

        try {
            ip = InetAddress.getByName("localhost");//client ip address
            Socket s = new Socket(ip, PORT);

            System.out.println("Client is connected");

            //data송수신 스트림 생성
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            //client이름입력
            System.out.print("name : ");
            String name = in.nextLine();
            dos.writeUTF(name);//현재 접속 클라이언트 이름 전송

            //발신
            Thread sendMsg = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        String msg = in.nextLine();

                        try {
                            dos.writeUTF(msg);

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });

            //수신
            Thread writeMsg = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        String msg;
                        try {
                            msg = dis.readUTF();
                            System.out.println(msg);

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
            
            sendMsg.start();
            writeMsg.start();

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
