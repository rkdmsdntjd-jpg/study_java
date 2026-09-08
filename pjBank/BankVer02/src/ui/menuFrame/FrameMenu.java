package src.ui.menuFrame;

import javax.swing.*;
import java.awt.event.*;

import src.db.User;
import src.ui.form.Form;
import src.ui.mainFrame.FrameMain;

public class FrameMenu implements Form {
    public void start(User user) {
        JFrame f = Form.setFrame(user.getName() + "님");

        String[] str = {"입금", "출금", "송금", "조회", "로그아웃"};
        JButton[] bt = new JButton[str.length];
        for (int i = 0; i < bt.length; i++) {
            bt[i] = new JButton(str[i]);
            Form.setButton(bt[i]);
            bt[i].setBounds(BT_X, BT_Y * (i + 2), BT_W, BT_H);
            f.add(bt[i]);
        }

        bt[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new FrameMoneyInOut(user, true).start(f);
                f.setVisible(false);
            }
        });
        bt[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new FrameMoneyInOut(user, false).start(f);
                f.setVisible(false);
            }
        });
        bt[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new FrameSend().start(user, f);
                f.setVisible(false);
            }
        });
        bt[3].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new FrameView().start(user, f);
                f.setVisible(false);
            }
        });
        bt[4].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new FrameMain().start();
            }
        });

        f.setVisible(true);
    }
}