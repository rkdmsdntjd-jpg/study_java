package src.ui.mainFrame;

import javax.swing.*;
import java.awt.event.*;

import src.mod.CheckUser;
import src.ui.form.Form;
import src.ui.form.FormField;
import src.ui.menuFrame.FrameMenu;

public class FrameLogin implements Form {

    public void start(CheckUser cu, JFrame prevFrame) {
        JFrame f = Form.setFrame("로그인");

        String[] str = { "아이디", "비밀번호" };
        FormField[] ff = new FormField[str.length];

        for (int i = 0; i < ff.length; i++) {
            if (str[i].equals("비밀번호"))
                ff[i] = new FormField(str[i], true);
            else
                ff[i] = new FormField(str[i]);
            ff[i].setBounds(F, FF_H * (i + 5), FF_W, FF_H);
            f.add(ff[i]);
        }

        JButton bt = new JButton("확인");
        bt.setBounds(BT_X, BT_Y * 6, BT_W, BT_H);
        Form.setButton(bt);
        f.add(bt);

        // cleare
        JButton back = Form.clearButton("뒤로가기 >", BACK);
        Form.backAction(back, f, prevFrame);
        f.add(back);

        // enter버튼 활성화
        f.getRootPane().setDefaultButton(bt);

        // 로그인 버튼 이벤트
        bt.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String inputId = ff[0].getText();
                String inputPw = ff[1].getPassword();

                if (cu.checkLogin(inputId, inputPw)) {
                    // 로그인 성공
                    JOptionPane.showMessageDialog(f, "로그인 성공");
                    f.dispose();
                     new FrameMenu().start(cu.getUser());

                } else {
                    // 로그인 실패
                    JOptionPane.showMessageDialog(f, "ID/PW 일치하지 않습니다.", "로그인 실패", JOptionPane.WARNING_MESSAGE);
                    ff[0].getJTF().setText("");
                    ff[1].getJTF().setText("");
                    ff[0].requestFocus();// GUI 컴포넌트(입력창, 버튼, 패널 등)에 포커스를 강제로 맞춰주는 메소드
                }

            }
        });
        f.setVisible(true);
    }
}
