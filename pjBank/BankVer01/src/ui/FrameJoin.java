
package src.ui;

import javax.swing.*;

import java.awt.event.*;

import src.ex2.Login;


public class FrameJoin implements Form {
    
    public static void main(String[] args) {

        Login login = new Login();

        JFrame f = new JFrame("회원가입");
        f.setBounds(START_X, START_Y, FRAME_W, FRAME_H);
        f.setLayout(null);

        JLabel id = new JLabel("ID",SwingConstants.CENTER);
        id.setBounds(0, TF_START_Y - (TF_BLANK * 2), 120, TF_H);

        JTextField tf1 = new JTextField(); // id
        tf1.setBounds(TF_START_X, TF_START_Y - (TF_BLANK * 2), TF_W, TF_H);
        
        JButton check = new JButton("중복 확인");
        check.setBounds(TF_START_X, CHECK_ID_Y, CHECK_ID_W, BACK_H);

        JLabel lb = new JLabel("사용 불가", SwingConstants.CENTER);
        lb.setBounds(TF_START_X + CHECK_ID_W, CHECK_ID_Y, TF_W - CHECK_ID_W, BACK_H);

        JLabel pw = new JLabel( "PW", SwingConstants.CENTER);
        pw.setBounds(0, TF_START_Y - TF_BLANK + BACK_H, 120, TF_H);

        JPasswordField pf =new JPasswordField(); // pw
        pf.setBounds(TF_START_X, TF_START_Y - TF_BLANK + BACK_H, TF_W, TF_H);

        JLabel name = new JLabel( "name", SwingConstants.CENTER);
        name.setBounds(0, TF_START_Y + BACK_H, 120, TF_H);

        JTextField tf2 = new JTextField(); // name
        tf2.setBounds(TF_START_X, TF_START_Y + BACK_H, TF_W, TF_H);

        JLabel balance = new JLabel("balance", SwingConstants.CENTER);
        balance.setBounds(0, TF_START_Y + TF_BLANK + BACK_H, 120, TF_H);

        JTextField tf3 = new JTextField(); // balance
        tf3.setBounds(TF_START_X, TF_START_Y + TF_BLANK + BACK_H, TF_W, TF_H);

        JButton bt = new JButton("회원가입");
        bt.setBounds(BUTTON_CENTER_X, BUTTON_SUBMIT, BUTTON_W, BUTTON_H);

        JButton back = new JButton("뒤로가기 >");
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.setFocusPainted(false);
        back.setBounds(BUTTON_CENTER_X, BACK_Y, BUTTON_W, BACK_H);

        f.add(id);
        f.add(tf1);
        f.add(check);
        f.add(lb);
        f.add(pw);
        f.add(pf);
        f.add(name);
        f.add(tf2);
        f.add(balance);
        f.add(tf3);
        f.add(bt);
        f.add(back);
    

        // ID 중복 확인
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = tf1.getText();                       
                // ID를 입력하지 않았으면 사용 불가 상태 유지
                if (id.length() == 0) {
                    lb.setText("사용 불가");
                    return;
                }

                if (login.checkId(id)) {
                    lb.setText("사용 불가");
                } else {
                    lb.setText("사용 가능");
                }
            }
        });

        // 회원가입 버튼 상호작용
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String id = tf1.getText();
                String pw = new String(pf.getPassword());
                String name = tf2.getText();
                long bal;
                try {
                    bal = Long.parseLong(tf3.getText());
                } catch (NullPointerException exc) {
                        JOptionPane.showMessageDialog(f, "숫자로 입력해주세요.");
                        return;
                }

                if (id.isEmpty() || pw.isEmpty() || name.isEmpty()) {
                    JOptionPane.showMessageDialog(f, "모든 항목을 입력해주세요.");
                    return;
                }
                            
                login.writeUser(id, pw, name, bal);//Login 클래스에서 회원가입처리 
                    JOptionPane.showMessageDialog( f, "회원가입 완료!");
                    f.dispose();
                    FrameLongin.main(null);
                } 
        });

        // 뒤로가기
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
    
