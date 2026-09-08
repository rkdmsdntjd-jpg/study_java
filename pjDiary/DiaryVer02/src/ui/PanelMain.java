package ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.List;

import data.Diary;
import mod.ManagerDiary;

public class PanelMain extends JPanel {

    private FrameMain frame;
    private ManagerDiary managerDiary;

    private DefaultListModel<String> listModel;
    private JList<String> diaryList;

    private JButton createButton, deleteButton;

    // 메인 패널
    public PanelMain(FrameMain frame, ManagerDiary managerDiary) {

        this.frame = frame;
        this.managerDiary = managerDiary;

        showMain();
    }

    // 메인 화면
    public void showMain() {

        setLayout(new BorderLayout());

        // 제목
        add(new JLabel("===== 나의 일기장 ====="), BorderLayout.NORTH);

        // 일기 목록
        listModel = new DefaultListModel<String>();
        diaryList = new JList<String>(listModel);

        add(new JScrollPane(diaryList), BorderLayout.CENTER);

        // 목록 불러오기
        refreshList();

        // 버튼
        JPanel buttonPanel = new JPanel(new FlowLayout());

        JButton[] buttons = {
                createButton = new JButton("일기 작성"),
                deleteButton = new JButton("일기 삭제")
        };

        for (JButton button : buttons) {
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.SOUTH);

        // 일기 작성
        createButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                frame.changePanel(new PanelView(frame, managerDiary));
            }
        });

        // 일기 삭제
        deleteButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                deleteDiary();
            }
        });

        // 일기 선택
        diaryList.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {

                if (!e.getValueIsAdjusting()) {
                    openDiary();
                }
            }
        });
    }

    // 일기 삭제
    private void deleteDiary() {

        int index = diaryList.getSelectedIndex();

        if (index == -1) {

            JOptionPane.showMessageDialog(frame, "삭제할 일기를 선택하세요.");

            return;
        }

        managerDiary.delete(index);
        refreshList();
    }

    // 일기 열기
    private void openDiary() {

        int index = diaryList.getSelectedIndex();

        if (index == -1) {
            return;
        }

        Diary diary = managerDiary.getDiaries().get(index);

        frame.changePanel(new PanelView(frame, managerDiary, diary, index));
    }

    // 일기 목록 새로고침
    private void refreshList() {
        listModel.clear();
        for (Diary diary : managerDiary.getDiaries()) {
            listModel.addElement(diary.getDate() + " / " + diary.getTitle());
        }
    }
}
