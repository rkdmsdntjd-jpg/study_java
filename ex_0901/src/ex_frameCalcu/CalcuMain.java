package ex_frameCalcu;

import java.awt.*;
import java.awt.event.WindowAdapter;

public class CalcuMain {
    public static void main(String[] args) {
        Frame f = new Frame("계산기");
        f.setBounds(500, 200, 260, 300);
        f.setLayout(null);

        

        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
