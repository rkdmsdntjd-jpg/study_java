package ex3_form;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class FormMain {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setBounds(500, 200, 400, 600);
        f.setLayout(null);
        //프레임셋팅

        f.setBackground(Color.CYAN);//프레임 백그라운드컬러
        Font font = new Font("", Font.PLAIN, 28);//폰트 설정
        
        //상단
        TextField tf = new TextField();//입력(텍스트필드)
        tf.setFont(font);
        tf.setBounds(20, 50, 275, 40);

        Button btn = new Button("INPUT");//버튼
        btn.setEnabled(false);//버튼 비활성화(나중에 true로 바꿔서 활성화할 예정)
        btn.setBounds(305, 50, 75, 40);

        //중앙
        TextArea ta = new TextArea();//넓은 면적의 텍스트 상자
        ta.setFont(font);
        ta.setBounds(20, 100, 360, 420);

        ta.setEditable(false);//값을 직접 입력 불가능(false일 경우)

        //하단
        Button btnSave = new Button("SAVE");
        btnSave.setBounds(20, 530, 175, 50);
        Button btnClose = new Button("CLOSE");
        btnClose.setBounds(205, 530, 175, 50);

        //텍스트 필드 입력 감지
        tf.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(TextEvent e) {
                if(tf.getText().trim().equals("")){
                    btn.setEnabled(false);//현재 한글자도 없으면 비활성화
                }
                else{    
                    btn.setEnabled(true);//값이 있으면 활성화
                }
            }
        });

        //입력 버튼 클릭 감지
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.append(tf.getText() + "\n");
                tf.setText("");
            }
        });

        tf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if(e.getKeyChar() == KeyEvent.VK_ENTER){//엔터키 이벤트가 발생하면
                    ta.append(tf.getText() + "\n");
                    tf.setText("");
                    tf.requestFocus();
                }
            }
        });

        //close click event 처리
        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        //Save click event 처리
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String msg = ta.getText();

                FileDialog fd = new FileDialog(f, "SAVE", FileDialog.SAVE);
                fd.setVisible(true);

                String path = fd.getDirectory() + fd.getFile();
                
                try(
                    FileWriter fw = new FileWriter(path);
                    BufferedWriter bw = new BufferedWriter(fw);
                ) {

                    bw.write(msg);

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        
        f.add(tf);
        f.add(btn);
        f.add(ta);
        f.add(btnSave);
        f.add(btnClose);

        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
