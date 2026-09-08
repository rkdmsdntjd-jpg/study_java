package src.ui;

import javax.swing.*;
import java.awt.event.*;;

public class FrameJoin implements Form {
    public static void main(String[] args) {
        JFrame f = new JFrame("회원가입");
        f.setBounds(START_X, START_Y, FRAME_W, FRAME_H);
        f.setLayout(null);

        JLabel id = new JLabel("ID", SwingConstants.CENTER);
        id.setBounds(0, TF_START_Y - (TF_BLANK * 2), 120, TF_H);

        JTextField tf1 = new JTextField();//id
        tf1.setBounds(TF_START_X, TF_START_Y - (TF_BLANK * 2), TF_W, TF_H);

        JButton check = new JButton("중복 확인");
        check.setBounds(TF_START_X, CHECK_ID_Y, CHECK_ID_W, BACK_H);

        //결과 반영 좌표값 : TF_START_X + CHECK_ID_W, CKECK_ID_Y, TF_W - CHECK_ID_W, BACK_H
        JLabel lb = new JLabel("사용 불가", SwingConstants.CENTER);
        lb.setBounds(TF_START_X + CHECK_ID_W, CHECK_ID_Y, TF_W - CHECK_ID_W, BACK_H);

        JLabel pw = new JLabel("PW", SwingConstants.CENTER);
        pw.setBounds(0, TF_START_Y - TF_BLANK + BACK_H, 120, TF_H);
               
        JPasswordField pf = new JPasswordField();//pw
        pf.setBounds(TF_START_X, TF_START_Y - TF_BLANK + BACK_H, TF_W, TF_H);

        JLabel name = new JLabel("name", SwingConstants.CENTER);
        name.setBounds(0,TF_START_Y + BACK_H, 120, TF_H);
        
        JTextField tf2 = new JTextField();//name
        tf2.setBounds(TF_START_X, TF_START_Y + BACK_H, TF_W, TF_H);

        JLabel balance = new JLabel("balance", SwingConstants.CENTER);
        balance.setBounds(0, TF_START_Y + TF_BLANK + BACK_H, 120, TF_H);
        
        JTextField tf3 = new JTextField();//balance
        tf3.setBounds(TF_START_X, TF_START_Y + TF_BLANK + BACK_H, TF_W, TF_H);
        
        JButton bt = new JButton();
        bt.setBounds(BUTTON_CENTER_X, BUTTON_SUBMIT, BUTTON_W, BUTTON_H);

        JButton back = new JButton("뒤로가기 >");
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.setFocusPainted(false);
        back.setBounds(BUTTON_CENTER_X, BACK_Y , BUTTON_W, BACK_H);
        

        f.add(id);
        f.add(tf1);
        f.add(check);
        f.add(lb);
        f.add(pw);
        f.add(pf);
        f.add(name);
        f.add(tf2);
        f.add(balance);
        f.add(tf3);
        f.add(bt);
        f.add(back);


        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
