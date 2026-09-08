package ex3_socket;

import java.util.ArrayList;
import java.util.List;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer extends Thread{
    
    private ServerSocket ss;
    List<CopyClient> list;

    public ChatServer(){
        try {
            list = new ArrayList<>();

            ss = new ServerSocket(3500);
            System.out.println("wating...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                //client 접속 대기
                Socket s = ss.accept();
                String ip = s.getInetAddress().getHostAddress();
                System.out.println(ip + " 접속");

                CopyClient cc = new CopyClient(s, this);
                list.add(cc);
                cc.start();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void sendMessage(String msg){
        try {
            for (CopyClient copyClient : list) {
                copyClient.pw.println("msg");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    //다른사용자에게 종료를 알리고 리스트에서 클라이언트 제거
    public void removeClient(CopyClient cc){
        list.remove(cc);
        sendMessage(cc.ip + "퇴장");
    }
}
