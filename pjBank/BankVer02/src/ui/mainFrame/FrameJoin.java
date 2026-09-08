package src.ui.mainFrame;

import javax.swing.*;

import java.awt.Font;
import java.awt.event.*;

import src.mod.CheckUser;
import src.ui.form.Form;
import src.ui.form.FormField;

public class FrameJoin implements Form{
    public void start(CheckUser cu, JFrame prevFrame) {
        JFrame f = Form.setFrame("회원가입");

        String[] str = {"아이디", "비밀번호", "이름", "예치금"};
        FormField[] ff = new FormField[str.length];

        for (int i = 0; i < ff.length; i++) {
            if(str[i].equals("비밀번호"))
                ff[i] = new FormField(str[i], true);
            else 
                ff[i] = new FormField(str[i]);

            if(str[i].equals("아이디"))
                ff[i].setBounds(F, FF_H * (i + 3), FF_W, FF_H);//y = 150
            else
                ff[i].setBounds(F, FF_H * (i + 4), FF_W, FF_H);//y = 250
            f.add(ff[i]);
        }//라벨 + 텍스트 필드 생성

        //중복검사
        JButton check = Form.clearButton("중복 검사 >", 190);
        f.add(check);

        JLabel lb = new JLabel("사용 불가");
        lb.setBounds(220, 190, BT_W, FF_H);
        lb.setFont(new Font("나눔고딕", Font.ITALIC, 14));
        lb.setForeground(Form.TEXT);
        f.add(lb);
        //중복검사

        //확인
        JButton bt = new JButton("확인");
        bt.setBounds(BT_X, BT_Y * 6, BT_W, BT_H);
        Form.setButton(bt);
        f.add(bt);
        
        //cleare
        JButton back = Form.clearButton("뒤로가기 >", BACK);
        Form.backAction(back, f, prevFrame);
        f.add(back);
        
        //ID 중복 검사
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = ff[0].getText();
                if(!id.isEmpty() && !cu.checkId(id))
                    lb.setText("사용 가능");
                else
                    lb.setText("사용 불가");
            }
        });

        ff[3].onlyNumber();//숫자만 입력받기

        bt.addActionListener(new ActionListener() {//회원가입 확인 버튼 처리
            @Override
            public void actionPerformed(ActionEvent e) {
        
                if (!lb.getText().equals("사용 가능")) {
                    JOptionPane.showMessageDialog(f, "아이디 중복 검사를 해주세요.");
                    return;
                }
                String id = ff[0].getText();
                String pw = new String(ff[1].getPassword());
                String name = ff[2].getText();
                long bal;
        
                try {
                    bal = Long.parseLong(ff[3].getText());
        
                } catch (NumberFormatException exc) {
                    JOptionPane.showMessageDialog(f, "숫자로 입력해주세요.");
                    return;//재실행
                }
        
                if (id.isEmpty() || pw.isEmpty() || name.isEmpty()) {
                    JOptionPane.showMessageDialog(f, "모든 항목을 입력해주세요.");
                    return;//빈칸있으면 재실행
                }
        
                cu.writeUser(id, pw, name, bal);
        
                JOptionPane.showMessageDialog(f, "회원가입 완료!");
                f.dispose();
                new FrameMain().start();
            }
        });

        f.setVisible(true);
    }
}