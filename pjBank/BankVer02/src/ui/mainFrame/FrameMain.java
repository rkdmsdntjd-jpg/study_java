package src.ui.mainFrame;

import javax.swing.*;
import java.awt.event.*;

import src.mod.CheckUser;
import src.ui.form.Form;

public class FrameMain implements Form{

    CheckUser cu;

    public FrameMain(){
        cu = new CheckUser();
    }
    
    public void start(){
        JFrame f = Form.setFrame("4조 은행");

        String[] str = {"로그인", "회원가입", "종료"};
        
        JButton[] bt = new JButton[str.length];
        for (int i = 0; i < bt.length; i++) {
            bt[i] = new JButton(str[i]);
            Form.setButton(bt[i]);
            bt[i].setBounds(BT_X, BT_Y * (i + 4), BT_W, BT_H);
            f.add(bt[i]);
        }

        bt[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // 로그인 창으로 인동
                new FrameLogin().start(cu, f);
                // 메인 창 닫기
                f.setVisible(false);
            }
        });

        bt[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // 회원가입 창으로 이동
                new FrameJoin().start(cu, f);

                // 메인 창 닫기
                f.setVisible(false);
            }
        });

        bt[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });
        
        f.setVisible(true);
    }
}
