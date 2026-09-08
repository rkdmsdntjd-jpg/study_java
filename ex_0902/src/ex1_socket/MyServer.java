package ex1_socket;

import java.io.IOException;
import java.net.ServerSocket;//클라이언트의 접속을 받는 역할
import java.net.Socket;//접속한 특정 클라이언트와 통신하는 역할

public class MyServer extends Thread{
    private ServerSocket ss;

    public MyServer(){
        try {
            //클라이언트가 접속할 경로 준비
            //서버소켓을 생성할 때 서비스를 위한 포트번호를 지정
            ss = new ServerSocket(3000);
            System.out.println("Server Wating...");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            //사용자 접속 대기
            try {
                //연결이 들어오면 그 클라이언트와 통신할 수 있는 Socket을 반환하는 메소드
                Socket s = ss.accept();

                //접속한 클라이언트의 ip정보를 가져오기
                String ip = s.getInetAddress().getHostAddress();
                System.out.println(ip + "의 접속");

            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
