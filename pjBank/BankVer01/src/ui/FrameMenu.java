package src.ui;

import javax.swing.*;
import java.awt.event.*;;

public class FrameMenu implements Form {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(START_X, START_Y, FRAME_W, FRAME_H);
        f.setLayout(null);

        JButton bt1 = new JButton();
        bt1.setBounds(BUTTON_CENTER_X, BUTTON_START_Y, BUTTON_W, BUTTON_H);
        
        JButton bt2 = new JButton();
        bt2.setBounds(BUTTON_CENTER_X, BUTTON_START_Y + BUTTON_BLANK , BUTTON_W, BUTTON_H);
        
        JButton bt3 = new JButton();
        bt3.setBounds(BUTTON_CENTER_X, BUTTON_START_Y + (BUTTON_BLANK * 2) , BUTTON_W, BUTTON_H);
        
        JButton bt4 = new JButton();
        bt4.setBounds(BUTTON_CENTER_X, BUTTON_START_Y + (BUTTON_BLANK * 3) , BUTTON_W, BUTTON_H);


        f.add(bt1);
        f.add(bt2);
        f.add(bt3);
        f.add(bt4);


        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}