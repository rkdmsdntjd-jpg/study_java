package ui;//박승오,권현영

import javax.swing.*;

public class FrameMain implements Form{//바뀌지 않을 프레임
    private JFrame frame;

    public FrameMain(){
        frame = new JFrame("Diary");
        frame.setSize(W, H);//프레임크기설정
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창을 닫으면 프로그램 종료
        frame.setResizable(false);//프레임 크기 조정 불가능
    }
    
    public void start(){
        PanelMain main = new PanelMain(this);

        frame.setContentPane(main);
        frame.setVisible(true);
    }

    public void changePanel(JPanel panel) {//패널 교체
        frame.setContentPane(panel);
        frame.revalidate();
        frame.repaint();
    }

    public static void main(String[] args) {
        FrameMain fm = new FrameMain();
        fm.start();
    }
}