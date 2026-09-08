package ex_frame;

import java.awt.*;
import java.awt.event.WindowAdapter;

public class FrameMain {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setBounds(500, 200, 500, 400);
        
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                //System.exit(0);바로 종료
                
                new FrameSub(f);//종료 프레임 호출.
            }
        });
    }
}
