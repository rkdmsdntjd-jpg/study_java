package src.ui_pp;

import javax.swing.*;

import src.ui.Form;

import java.awt.event.*;;

public class FrameTest implements Form{
    public void startTest() {
        JFrame f = new JFrame();
        f.setBounds(START_X, START_Y, FRAME_W, FRAME_H);
        f.setLayout(null);

        JTextField tf = new JTextField();
        tf.setBounds(20, 140, 300, TF_H);

        NumberPad pad = new NumberPad();
        pad.setBounds(20, 200, 300, 300);       

        f.add(tf);
        f.add(pad);

        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
