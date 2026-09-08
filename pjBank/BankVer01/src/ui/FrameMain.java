package src.ui;

import javax.swing.*;
import java.awt.event.*;;

public class FrameMain implements Form {
    public static void main(String[] args) {
        JFrame f = new JFrame("은행 시스템");  // 은행 시스템 명 추가
        f.setBounds(START_X, START_Y, FRAME_W, FRAME_H);
        f.setLayout(null);

        JButton bt1 = new JButton("로그인");
        bt1.setBounds(BUTTON_CENTER_X, BUTTON_CENTER_Y, BUTTON_W, BUTTON_H);

        // 메인화면에서 로그인을 클릭하면 로그인하면으로 이동
        bt1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // 로그인 창으로 인동
                FrameLongin.main(null);

                // 메인 창 닫기
                f.dispose();
            }
        });

        JButton bt2 = new JButton("회원가입");
        bt2.setBounds(BUTTON_CENTER_X, BUTTON_CENTER_Y + BUTTON_BLANK, BUTTON_W, BUTTON_H);

        bt2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // 회원가입 창으로 이동
                FrameJoin.main(null);

                // 메인 창 닫기
                f.dispose();
            }
        });

        f.add(bt1);
        f.add(bt2);

        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
