package ex4_IMG;

import java.awt.*;
import java.awt.event.WindowAdapter;
import javax.swing.*;
//java : 핵심기능
//javax : 확장/응용 기능 계열(GUI)
/*swing
JFrame
JButton
JTextField
JTextArea
JScrollPane
 */

public class ImgMain {   
    public static void main(String[] args) {
        Frame f = new Frame();

        f.setBounds(500, 100, 700, 1300);

        //img참조_1
        ImageIcon img = new ImageIcon("src/images/배경화면.jpg");

        JLabel jl = new JLabel(img);
        jl.setBounds(10, 10, 700, 1300);

        //img Button
        ImageIcon img2 = new ImageIcon("src/images/cp.png");
        JButton jb = new JButton(img2);
        jb.setBounds(50, 50, 175, 157);

        jb.setBorderPainted(false);//버튼 외곽선 제거

        jb.setContentAreaFilled(false);//버튼 배경 제거

        f.repaint();//이미지 갱신

        f.add(jb);//레이어 상위
        f.add(jl);//레이어 하위

        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
