package ui;

import javax.swing.*;

public class FrameMain implements Form {

    private JFrame frame;

    public FrameMain() {
        frame = new JFrame("Diary");

        frame.setSize(W, H);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

    public void start() {
        PanelMain main = new PanelMain(this);
        frame.setContentPane(main);
        frame.setVisible(true);
    }

    // 패널 교체
    public void changePanel(JPanel panel) {
        frame.setContentPane(panel);
        frame.revalidate();
        frame.repaint();
    }

    // 실제 JFrame 가져오기
    public JFrame getFrame() {
        return frame;
    }

    public static void main(String[] args) {
        FrameMain fm = new FrameMain();
        fm.start();
    }
}