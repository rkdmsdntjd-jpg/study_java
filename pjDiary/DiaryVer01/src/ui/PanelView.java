package ui;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

import javax.swing.*;

import data.Diary;
import mod.ManagerDiary;

public class PanelView extends JPanel implements Form{
    //생성자를 오버로드하여 초기값이 있는 판넬(보기), 초기값이 없는 판넬 생성(초기값이 없음)
    private String[] str = {"날짜", "제목", "내용"};
    private JLabel[] lb;
    private JTextField[] tf;
    private JTextArea ta;

    private Dimension size = new Dimension(W, 50);//가로·세로 크기 한 세트를 담는 객체
    private Dimension areaSize = new Dimension(W, 350);//text영역 크기
    

    private ManagerDiary md = new ManagerDiary();

    public PanelView(FrameMain mainFrame){
        setForm();
        save(mainFrame, true);
    }

    public PanelView(FrameMain mainFrame, Diary diary){
        setForm();        
        setEditDiary(diary, false);//편집 금지

        String[] str = {"수정", "삭제", "뒤로가기"};
        JButton[] bt = Form.buttons(this, str);

        bt[Arrays.asList(str).indexOf("수정")].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //수정
                setEditDiary(diary, true);
                for (int i = 0; i < bt.length; i++)
                    bt[i].getParent().remove(bt[i]);
                save(mainFrame, false);
                //화면 갱신
                revalidate();
                repaint();
            }
        });
        bt[Arrays.asList(str).indexOf("삭제")].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //삭제
                md.delete(diary.getDate());
                PanelMain main = new PanelMain(mainFrame);
                mainFrame.changePanel(main);
            }
        });
        bt[Arrays.asList(str).indexOf("뒤로가기")].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelMain main = new PanelMain(mainFrame);
                mainFrame.changePanel(main);
            }
        });
    }

    private void setEditDiary(Diary diary, boolean edit){
        tf[0].setText(diary.getDate());
        tf[1].setText(diary.getTitle());
        ta.setText(diary.getContent());

        tf[0].setEditable(false);
        tf[1].setEditable(edit);
        ta.setEditable(edit);
    }

    private void setForm(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        lb = new JLabel[str.length];
        tf = new JTextField[str.length - 1];
        ta = new JTextArea();

        for (int i = 0; i < str.length; i++) {
            lb[i] = new JLabel(str[i]);
            lb[i].setAlignmentX(Component.CENTER_ALIGNMENT);//가운데 정렬
            add(lb[i]);
            if(i < tf.length){
                tf[i] = new JTextField();
                
                tf[i].setAlignmentX(Component.CENTER_ALIGNMENT);
                
                tf[i].setPreferredSize(size);//희망크기
                tf[i].setMaximumSize(size);//최대크기
                //setMinimumSize()최소크기
                
                add(tf[i]);
            }
        }
        JScrollPane scroll = new JScrollPane(ta);
        
        scroll.setAlignmentX(Component.CENTER_ALIGNMENT);

        scroll.setPreferredSize(areaSize);
        scroll.setMaximumSize(areaSize);

        add(scroll);
    }

    private void save(FrameMain mainFrame, boolean create){
        String[] str = {"저장", "뒤로가기"};
        JButton[] bt = Form.buttons(this, str);
        
        bt[Arrays.asList(str).indexOf("저장")].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String date = tf[0].getText();
                String title = tf[1].getText();
                String content = ta.getText();
                if(create)
                    md.create(date, title, content);
                else
                    md.edit(date, title, content);

                PanelMain main = new PanelMain(mainFrame);
                mainFrame.changePanel(main);
            }
        });
        bt[Arrays.asList(str).indexOf("뒤로가기")].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelMain main = new PanelMain(mainFrame);
                mainFrame.changePanel(main);
            }
        });
    }
}