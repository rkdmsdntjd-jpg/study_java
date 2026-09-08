package src.ui;

import javax.swing.*;
import java.awt.event.*;
import src.ex2.*;

public class FrameInMoney implements Form{
    public void open(Transaction tran, JFrame menuFrame) {

        JFrame f = new JFrame();
        f.setBounds(START_X, START_Y, FRAME_W, FRAME_H);
        f.setLayout(null);

        JLabel lb = new JLabel(tran.getTransName(), SwingConstants.CENTER);
        lb.setBounds(START_X, TF_START_Y + TF_BLANK, 120, TF_H);

        JTextField tf = new JTextField();
        tf.setBounds(TF_START_X, TF_START_Y + TF_BLANK , TF_W, TF_H);
        
        
        JButton bt = new JButton();
        bt.setBounds(BUTTON_CENTER_X, BUTTON_SUBMIT, BUTTON_W, BUTTON_H);

        JButton back = new JButton("뒤로가기 >");
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.setFocusPainted(false);
        back.setBounds(BUTTON_CENTER_X, BACK_Y , BUTTON_W, BACK_H);
        

        f.add(lb);
        f.add(tf);
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
