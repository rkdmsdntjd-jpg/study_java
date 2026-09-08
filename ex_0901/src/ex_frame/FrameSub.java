package ex_frame;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

public class FrameSub extends Frame {
    
    public FrameSub(Frame f) {
        setBounds(f.getX() + 100, f.getY() + 100, 300, 200);
        setLayout(null);//자동배치끄기
        setVisible(true);

        Font font = new Font("", Font.BOLD, 30);
        Label label = new Label("종료할까요");
        label.setFont(font);
        label.setBounds(50, 50, 200, 30);

        Button yb = new Button("yes");
        Button nb = new Button("no");

        yb.setBounds(30, 100, 105, 40);
        nb.setBounds(165, 100, 105, 40);

        //버튼감지자 등록
        yb.addActionListener(act);
        nb.addActionListener(act);

        //현재프레임에 컴포넌트 추가
        add(label);
        add(yb);
        add(nb);

        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                f.dispose();
            };
        });
    }

    ActionListener act = new ActionListener() {//클릭시 실행(감지할 이벤트 리스너)
        public void actionPerformed(java.awt.event.ActionEvent e) {
            switch (e.getActionCommand()) {
                case "yes":
                    System.exit(0);
                    break;
                case "no":
                    dispose();
                    break;
            
                default:
                    break;
            }
        };
    };
}
