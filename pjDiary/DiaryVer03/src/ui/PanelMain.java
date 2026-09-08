package ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import mod.ManagerDiary;
import data.Diary;

public class PanelMain extends JPanel implements Form {
    // 메인 화면
    public PanelMain(FrameMain mainFrame) {

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        Dimension size = new Dimension(SCL_W, 50);

        // 제목
        JLabel lb = new JLabel("< Diary List >");

        lb.setAlignmentX(Component.CENTER_ALIGNMENT);

        lb.setPreferredSize(size);
        lb.setMinimumSize(size);

        add(lb);

        // 일기 목록
        JPanel list = new JPanel();
        list.setLayout(new BoxLayout(list, BoxLayout.Y_AXIS));

        // 일기 가져오기
        ManagerDiary managerDiary = new ManagerDiary();

        for (int i = 0; i < managerDiary.getDiaries().size(); i++) {
            Diary d = managerDiary.getDiaries().get(i);
            JButton bt = new JButton("[" + d.getDate() + "] " + d.getTitle());

            bt.setPreferredSize(size);
            bt.setMaximumSize(size);
            bt.setAlignmentX(Component.CENTER_ALIGNMENT);

            final int diaryNum = i;

            bt.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    mainFrame.changePanel(new PanelView(mainFrame, diaryNum));
                }
            });
            list.add(bt);
        }

        // 스크롤
        JScrollPane scroll = new JScrollPane(list);

        Dimension scrollSize = new Dimension(SCL_W, SCL_H);
        scroll.setAlignmentX(Component.CENTER_ALIGNMENT);

        scroll.setPreferredSize(scrollSize);
        scroll.setMinimumSize(scrollSize);
        scroll.setMaximumSize(scrollSize);

        add(scroll);

        // 새 일기
        createDiary(mainFrame);
    }

    // 새 일기
    private void createDiary(FrameMain mainFrame) {
        String[] str = { "새로 쓰기" };
        JButton[] bt = Form.buttons(this, str);

        bt[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.changePanel(new PanelView(mainFrame));
            }
        });
    }
}