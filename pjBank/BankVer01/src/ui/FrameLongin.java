package src.ui;

import javax.swing.*;

import src.ex2.BankHandler;
import src.ex2.Login;

import java.awt.Color;
import java.awt.Font;

import java.awt.event.*;


public class FrameLongin implements Form {

    // 로그인 성공정보 저장
    private static BankHandler hd;

    public static BankHandler getBankHandler() {
        return hd;
    }

    public static void main(String[] args) {

        JFrame f = new JFrame("로그인");

        f.setBounds(START_X, START_Y, FRAME_W, FRAME_H);
        f.setLayout(null);
        // ---------------------------
        Color mainBlue = new Color(0, 72, 153);
        Color lightgray = new Color(243, 247, 252);

        f.getContentPane().setBackground(lightgray);

        // new 가운데 제목
        JLabel title = new JLabel("로그인", SwingConstants.CENTER);
        title.setBounds(0, 100, FRAME_W, 25);
        title.setForeground(mainBlue);

        Font font = new Font("", Font.BOLD, 25);
        title.setFont(font);

        // ----------------------------

        JLabel id = new JLabel("ID", SwingConstants.CENTER);
        id.setBounds(START_X, TF_START_Y, 120, TF_H);

        JTextField tf = new JTextField();
        tf.setBounds(TF_START_X, TF_START_Y, TF_W, TF_H);

        JLabel pw = new JLabel("PW", SwingConstants.CENTER);
        pw.setBounds(START_X, TF_START_Y + TF_BLANK, 120, TF_H);

        JPasswordField pf = new JPasswordField();
        pf.setBounds(TF_START_X, TF_START_Y + TF_BLANK, TF_W, TF_H);

        JButton bt = new JButton("로그인");
        bt.setBounds(BUTTON_CENTER_X, BUTTON_SUBMIT, BUTTON_W, BUTTON_H);

        JButton back = new JButton("뒤로가기 >");
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.setFocusPainted(false);
        back.setBounds(BUTTON_CENTER_X, BACK_Y, BUTTON_W, BACK_H);

        f.add(id);
        f.add(tf);
        f.add(pw);
        f.add(pf);
        f.add(bt);
        f.add(back);
        f.add(title);

        // enter버튼 활성화 (new)
        f.getRootPane().setDefaultButton(bt);

        // new 로그인 버튼 이벤트(new)--------------------
        bt.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String inputId = tf.getText();

                String inputPw = new String(pf.getPassword());

                Login lg = new Login();
                if (lg.checkLogin(inputId, inputPw)) {
                    // 로그인 성공

                   BankHandler hd = new BankHandler(lg.getUser());
                    hd.getUser();

                    JOptionPane.showMessageDialog(f, "로그인 성공");

                    f.dispose();

                    FrameMenu.main(null);

                } else {
                    // 로그인 실패

                    JOptionPane.showMessageDialog(f, "ID PW 일치하지 않습니다.", "로그인 실패", JOptionPane.WARNING_MESSAGE);
                    tf.setText("");
                    pf.setText("");

                    tf.requestFocus();

                }

            }
        });

        // (new)back버튼 이벤트 ---------------------
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                f.dispose();
                FrameMain.main(null);

            }
        });

        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
