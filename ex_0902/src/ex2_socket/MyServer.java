package ex2_socket;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyServer extends Thread{

    ServerSocket ss;

    public MyServer(){
        try {
            ss = new ServerSocket(3000);
            System.out.println("서버 대기중...");
        } catch (IOException e) {
            
        }
    }
    @Override
    public void run() {
        while (true) {
            try {
                Socket s = ss.accept();
                String ip = s.getInetAddress().getHostAddress();

                //client가 보낸 문자열 서버가 읽어오기
                try (
                    InputStreamReader isr = new InputStreamReader(s.getInputStream());
                    BufferedReader br = new BufferedReader(isr);
                ) {
                    String msg = br.readLine();
    
                    System.out.println(ip + " : " + msg);
                } catch (Exception e) {
                }
                
            } catch (Exception e) {
            }
        }
    }
}
