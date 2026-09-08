package ex3_socket;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFrameMain {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setBounds(500, 200, 400, 500);
        f.setVisible(true);

        TextArea ta = new TextArea();
        ta.setBounds(10, 30, 380, 350);

        TextField tf = new TextField();
        tf.setBounds(10, 450, 300, 40);

        Button bt = new Button("->");
        bt.setBounds(320, 450, 70, 40);

        f.add(ta);
        f.add(tf);
        f.add(bt);

        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
