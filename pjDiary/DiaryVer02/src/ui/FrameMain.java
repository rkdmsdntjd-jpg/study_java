
package ui;

import java.awt.*;
import javax.swing.*;

import mod.ManagerDiary;

public class FrameMain extends JFrame {

    private ManagerDiary managerDiary;

    // 메인 프레임
    public FrameMain() {

        setTitle("나의 일기장");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ManagerDiary
        managerDiary = new ManagerDiary();

        // 메인 화면
        add(new PanelMain(this, managerDiary), BorderLayout.CENTER);

        setVisible(true);
    }

    // 화면 변경
    public void changePanel(JPanel panel) {

        getContentPane().removeAll();
        add(panel, BorderLayout.CENTER);

        revalidate();
        repaint();
    }

    // ManagerDiary 가져오기
    public ManagerDiary getManagerDiary() {
        return managerDiary;
    }

    // 실행
    public static void main(String[] args) {
        new FrameMain();
    }
}

