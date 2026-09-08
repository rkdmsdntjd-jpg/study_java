package src.ui;

import javax.swing.*;
import java.awt.event.*;;

public class FrameLongin implements Form {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(START_X, START_Y, FRAME_W, FRAME_H);
        f.setLayout(null);

        JLabel id = new JLabel("ID", SwingConstants.CENTER);
        id.setBounds(START_X, TF_START_Y, 120, TF_H);

        JTextField tf = new JTextField();
        tf.setBounds(TF_START_X, TF_START_Y, TF_W, TF_H);

        JLabel pw = new JLabel("PW", SwingConstants.CENTER);
        pw.setBounds(START_X, TF_START_Y + TF_BLANK, 120, TF_H);

        JPasswordField pf = new JPasswordField();
        pf.setBounds(TF_START_X, TF_START_Y + TF_BLANK , TF_W, TF_H);
        
        
        JButton bt = new JButton();
        bt.setBounds(BUTTON_CENTER_X, BUTTON_SUBMIT, BUTTON_W, BUTTON_H);

        JButton back = new JButton("뒤로가기 >");
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.setFocusPainted(false);
        back.setBounds(BUTTON_CENTER_X, BACK_Y , BUTTON_W, BACK_H);
        

        f.add(id);
        f.add(tf);
        f.add(pw);
        f.add(pf);
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
