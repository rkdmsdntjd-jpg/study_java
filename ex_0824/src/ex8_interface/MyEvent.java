package ex8_interface;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyEvent {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Button button = new Button("BT");

        frame.setSize(300, 300);
        frame.add(button);
        frame.setVisible(true);

        button.addActionListener(new ActionListener() {//익명 내부 클래스
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {//버튼을 누르면 발생하는 이벤트 처리를 정의할 추상메소드
                // TODO Auto-generated method stub
                System.out.println("bye java interface.");
                System.exit(0);//종료
            }
        });
    }
}
