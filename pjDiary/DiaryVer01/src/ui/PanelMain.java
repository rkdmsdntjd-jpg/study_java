package ui;

import java.util.Arrays;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import mod.ManagerDiary;
import data.Diary;

public class PanelMain extends JPanel implements Form{
    //Main = 목록(해당 리스트를 누르면 일기가 보여지는 방식->PanelView로 교체) & 생성 & 삭제
    public PanelMain(FrameMain mainFrame){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        Dimension size = new Dimension(SCL_W, 50);
        
        JLabel lb = new JLabel("< Diary List >");
        lb.setAlignmentX(Component.CENTER_ALIGNMENT);
        lb.setPreferredSize(size);//희망크기
        lb.setMinimumSize(size);//최소크기
        add(lb);
        
        JPanel list = new JPanel();
        list.setLayout(new BoxLayout(list, BoxLayout.Y_AXIS));//list를 정렬, Y축 방향으로

        for (Diary d : new ManagerDiary().getDiaries()) {
            JButton bt = new JButton("[" + d.getDate() + "] " + d.getTitle());

            bt.setPreferredSize(size);
            bt.setMaximumSize(size);
            bt.setAlignmentX(Component.CENTER_ALIGNMENT);

            bt.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    mainFrame.changePanel(new PanelView(mainFrame, d));
                }
            });
            list.add(bt);
        }

        JScrollPane scroll = new JScrollPane(list);
        Dimension scrollSize = new Dimension(SCL_W, SCL_H);
        scroll.setAlignmentX(Component.CENTER_ALIGNMENT);
        scroll.setPreferredSize(scrollSize);
        scroll.setMinimumSize(scrollSize);
        scroll.setMaximumSize(scrollSize);
        add(scroll);

        createDiary(mainFrame);
    }

    private void createDiary(FrameMain mainFrame){
        String[] str = {"새로 쓰기"};
        JButton bt[] = Form.buttons(this, str);

        //이벤트 처리
        bt[Arrays.asList(str).indexOf("새로 쓰기")].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.changePanel(new PanelView(mainFrame));
            }
        });
    }
}