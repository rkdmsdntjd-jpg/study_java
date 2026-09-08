package ex3_socket;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient extends Frame implements Runnable{
    
    private TextArea ta;
    private TextField tf;
    private Button bt;

    private Socket s;
    private BufferedReader br;
    private PrintWriter pw;
    private Thread t;

    public ChatClient(){
        setBounds(500, 200, 400, 500);

        ta = new TextArea();
        ta.setBounds(10, 30, 380, 350);

        tf = new TextField();
        tf.setBounds(10, 400, 300, 40);

        bt = new Button("->");
        bt.setBounds(320, 400, 70, 40);

        add(tf);
        add(bt);
        add(ta);

        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendData();//서버로 메세지 전달
            }
        });

        setVisible(true);
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                //System.exit(0);
                //접속해제을 서버에게 요청
                pw.println(Util.END_TOKEN);
            }
        });

        //서버 접속
        connected();

        //전달될 메세지를 감지하기 위한 스레드 실행
        t = new Thread(this);
        t.start();
    }

    private void connected(){
        try {
            //192.168.0.26
            s = new Socket("192.168.0.46",3500);

            br = new BufferedReader(new InputStreamReader(s.getInputStream()));

            pw = new PrintWriter(s.getOutputStream(), true);
            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendData(){
        String msg = tf.getText().trim();
        if(msg.length() > 0){
            pw.println(msg);
        }
        tf.setText("");
    }

    @Override
    public void run() {
        while (true) {
            try {
                String msg = br.readLine();

                if(msg.equals(Util.END_TOKEN)){
                    break;
                }

                if(msg != null){
                    ta.append(msg + "\n");
                }
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {

            if(pw != null) pw.close();
            if(br != null) br.close();
            if(s != null) s.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.exit(0);
    }
}