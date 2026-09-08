package ex3_socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class CopyClient extends Thread{
    Socket s;
    PrintWriter pw;
    BufferedReader br;
    ChatServer server;
    String ip;

    public CopyClient(Socket s, ChatServer server){
        this.s = s;
        this.server = server;       
    }


    @Override
    public void run() {
        while (true) {
            try {
                pw = new PrintWriter(s.getOutputStream());
                br = new BufferedReader(new InputStreamReader(s.getInputStream()));
    
                String msg = br.readLine();
    
                if(msg.equals(Util.END_TOKEN)){
                    pw.println(Util.END_TOKEN);

                    server.removeClient(this);
                    
                    break;
                }
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
