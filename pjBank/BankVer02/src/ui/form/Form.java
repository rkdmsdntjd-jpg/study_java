package src.ui.form;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public interface Form {

    //프레임
    int F = 0;
    int W = 360;
    int H = 600;

    //버튼
    int BT_X = 100;
    int BT_Y = 70;

    int BT_W = 140;
    int BT_H = 60;

    //글자만 있는 버튼 사이즈
    int BACK = 480;

    //FormField
    int FF_W = 330;
    int FF_H = 50;

    //색상
    Color BG       = new Color(245, 248, 252);//밝은 색
    Color TEXT     = new Color(30, 40, 60);//어두운색
    Color BLUE     = new Color(54, 116, 181);//블루
    Color DEEPBLUE = new Color(0, 72, 153);//딥블루

    //글자만 있는 버튼
    static JButton clearButton(String text, int y) {
        JButton bt = new JButton(text);
        bt.setBorderPainted(false);
        bt.setContentAreaFilled(false);
        bt.setFocusPainted(false);

        bt.setFont(new Font("나눔고딕", Font.PLAIN, 14));
        bt.setForeground(TEXT);

        bt.setBounds(BT_X, y, BT_W, FF_H);
        return bt;
    }

    //뒤로가기 액션
    static void backAction(JButton back, JFrame f, JFrame prevFrame){
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prevFrame.setVisible(true);
                f.dispose();
            }
        });
    }

    static JFrame setFrame(String text){
        JFrame frame = new JFrame(text);
        frame.getContentPane().setBackground(BG);
        frame.setBounds(F, F, W, H);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);//프레임 셋팅

        ImageIcon img = new ImageIcon("src/img/ground.png");
        JLabel background = new JLabel(img);
        background.setLayout(null);
        frame.setContentPane(background);//배경 셋팅

        ImageIcon logoImg = new ImageIcon("src/img/logoBlue.png");
        JLabel logo = new JLabel(logoImg);
        logo.setBounds(30, 25, 120, 120);
        background.add(logo);//로고 셋팅

        JLabel lb = new JLabel(text, SwingConstants.RIGHT);
        lb.setBounds(100, 60, 200, 100);
        lb.setFont(new Font("맑은 고딕", Font.BOLD, 30));
        lb.setForeground(Form.DEEPBLUE);
        background.add(lb);

        return frame;
    }

    static void setButton(JButton bt) {//버튼 셋팅
        bt.setBackground(BLUE);  // 배경색
        bt.setForeground(BG);    // 글자색
        bt.setFont(new Font("나눔고딕", Font.BOLD, 17));
        bt.setFocusPainted(false);
    }
}