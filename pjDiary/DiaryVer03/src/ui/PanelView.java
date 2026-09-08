
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
    private JButton saveButton, editButton, deleteButton, backButton;

    // 새 일기 작성
    public PanelView(FrameMain frame) {

        this.frame = frame;
        managerDiary = new ManagerDiary();

        createPanel();
        // 새 일기는 모두 입력 가능
        setEdit(true);
        // 새 일기에서는 삭제 버튼 숨기기
        deleteButton.setVisible(false);
    }

    // 기존 일기 보기
    public PanelView(FrameMain frame, int diaryNum) {
        this.frame = frame;
        this.diaryNum = diaryNum;

        managerDiary = new ManagerDiary();
        diary = managerDiary.getDiaries().get(diaryNum);

        createPanel();

        // 기존 일기 내용 표시
        dateField.setText(diary.getDate());
        titleField.setText(diary.getTitle());
        contentArea.setText(diary.getContent());

        // 처음에는 수정 불가능
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

        // 라벨과 입력창 추가
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
                deleteButton = new JButton("삭제"),
                backButton = new JButton("뒤로가기")
        };

        // 버튼 추가
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

        // 삭제
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteDiary();
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
        // 제목과 내용 확인
        if (titleField.getText().isEmpty() || contentArea.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frame.getFrame(),"제목과 내용을 입력하세요.");
            return;
        }
        // 새 일기
        if (diaryNum == -1) {
            // 날짜 확인
            if (dateField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(frame.getFrame(),"날짜를 입력하세요.");
                return;
            }
            // 일기 생성
            managerDiary.create(
                    dateField.getText(),
                    titleField.getText(),
                    contentArea.getText());
        }
        // 기존 일기 수정
        else {
            managerDiary.edit(
                    diary.getDate(),
                    titleField.getText(),
                    contentArea.getText());
        }
        // 메인으로 이동
        goMain();
    }

    // 일기 수정
    private void editDiary() {
        setEdit(true);
    }

    // 일기 삭제
    private void deleteDiary() {
        int result = JOptionPane.showConfirmDialog(
                frame.getFrame(),
                "정말 삭제하시겠습니까?",
                "삭제 확인",
                JOptionPane.YES_NO_OPTION);

        // 예를 눌렀을 경우
        if (result == JOptionPane.YES_OPTION) {
            managerDiary.delete(diary.getDate());

            JOptionPane.showMessageDialog(
                    frame.getFrame(),
                    "일기가 삭제되었습니다.");
            goMain();
        }
    }

    // 메인 화면으로 이동
    private void goMain() {
        frame.changePanel(
                new PanelMain(frame));
    }
    // 수정 가능 여부
    private void setEdit(boolean enabled) {
        // 제목 / 내용
        titleField.setEditable(enabled);
        contentArea.setEditable(enabled);
        // 기존 일기는 날짜 수정 불가능
        if (diaryNum != -1) {
            dateField.setEditable(false);
        }
        // 새 일기는 날짜 입력 가능
        else {
            dateField.setEditable(enabled);
        }
    }
}