package ui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import data.Diary;
import mod.ManagerDiary;

public class PanelView extends JPanel {

    private FrameMain frame;
    private ManagerDiary managerDiary;
    private Diary diary;
    private int diaryNum = -1;

    private JTextField dateField, titleField;
    private JTextArea contentArea;

    private JButton saveButton, editButton, backButton;

    // 새 일기 작성
    public PanelView(FrameMain frame, ManagerDiary managerDiary) {

        this.frame = frame;
        this.managerDiary = managerDiary;

        createPanel();
        editDiary();
    }

    // 기존 일기 보기
    public PanelView(FrameMain frame, ManagerDiary managerDiary, Diary diary, int diaryNum) {

        this.frame = frame;
        this.managerDiary = managerDiary;
        this.diary = diary;
        this.diaryNum = diaryNum;

        createPanel();

        dateField.setText(diary.getDate());
        titleField.setText(diary.getTitle());
        contentArea.setText(diary.getContent());

        setEdit(false);
    }

    // 패널 구성
    private void createPanel() {

        setLayout(new BorderLayout());

        // 날짜 / 제목
        JPanel topPanel = new JPanel(new GridLayout(4, 1));

        JLabel[] labels = {
                new JLabel("날짜"),
                new JLabel("제목")
        };

        JTextField[] fields = {
                dateField = new JTextField(),
                titleField = new JTextField()
        };

        for (int i = 0; i < labels.length; i++) {

            topPanel.add(labels[i]);
            topPanel.add(fields[i]);
        }

        add(topPanel, BorderLayout.NORTH);

        // 내용
        contentArea = new JTextArea();

        add(new JScrollPane(contentArea), BorderLayout.CENTER);

        // 버튼
        JPanel buttonPanel = new JPanel(new FlowLayout());

        JButton[] buttons = {
                saveButton = new JButton("저장"),
                editButton = new JButton("수정"),
                backButton = new JButton("뒤로가기")
        };

        for (JButton button : buttons) {
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.SOUTH);

        // 저장
        saveButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                saveDiary();
            }
        });

        // 수정
        editButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                editDiary();
            }
        });

        // 뒤로가기
        backButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                goMain();
            }
        });
    }

    // 일기 저장
    private void saveDiary() {

        if (dateField.getText().isEmpty() || titleField.getText().isEmpty() || contentArea.getText().isEmpty()) {

            JOptionPane.showMessageDialog(frame, "모든 내용을 입력하세요.");

            return;
        }

        // 새 일기
        if (diaryNum == -1) {

            managerDiary.create(dateField.getText(), titleField.getText(), contentArea.getText());
        }

        // 기존 일기 수정
        else {

            managerDiary.edit(diaryNum, titleField.getText(), contentArea.getText());
        }

        goMain();
    }

    // 일기 수정
    private void editDiary() {
        setEdit(true);
    }

    // 메인 화면으로 이동
    private void goMain() {

        frame.changePanel(new PanelMain(frame, managerDiary));
    }

    // 수정 가능 여부
    private void setEdit(boolean enabled) {

        dateField.setEditable(enabled);
        titleField.setEditable(enabled);
        contentArea.setEditable(enabled);
    }
}
