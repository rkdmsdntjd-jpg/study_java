package src.ui;

import javax.swing.*;
import java.awt.event.*;
import src.ex2.*;

public class FrameMenu implements Form {

    private User user;
    private Transaction tran;

    public FrameMenu(User user){//생성자
        this.user = user;
    }

    public void menu() {//호출당할 메소드

        JFrame f = new JFrame();
        f.setBounds(START_X, START_Y, FRAME_W, FRAME_H);
        f.setLayout(null);

        JButton[] bt = new JButton[4];

        bt[0] = new JButton("입금");
        bt[1] = new JButton("출금");
        bt[2] = new JButton("송금");     
        bt[3] = new JButton("조회"); 

        for (int i = 0; i < bt.length; i++) {
            bt[i].setBounds(BUTTON_CENTER_X, BUTTON_START_Y + (BUTTON_BLANK * i), BUTTON_W, BUTTON_H);
            f.add(bt[i]);
        }

        bt[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //입금 프레임 열기
                tran = new Deposit(user);
                new FrameInMoney().open(tran, f);
                f.setVisible(false);
            }
        });
        bt[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //출금 프레임 열기
                tran = new Deposit(user);
                new FrameOutMoney().open(tran, f);
                f.setVisible(false);
            }
        });
        bt[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //송금프레임 열기
                tran = new Deposit(user);
                new FrameSendMoney().open(tran, f);
                f.setVisible(false);
            }
        });
        bt[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //조회 _ 현재 보류
                //FrameView fv = new FrameView();
                //fv.show(user, f);
                f.setVisible(false);
            }
        });

        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }


}
