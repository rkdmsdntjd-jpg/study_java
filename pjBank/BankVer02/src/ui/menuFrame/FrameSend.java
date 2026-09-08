package src.ui.menuFrame;

import javax.swing.*;
import java.awt.event.*;

import src.mod.Send;
import src.ui.form.Form;
import src.ui.form.FormField;
import src.db.User;

public class FrameSend implements Form{
    public void start(User user, JFrame prevFrame) {
        JFrame f = Form.setFrame("송금");
        FormField ff = new FormField("계좌 입력");
        ff.setBounds(F, FF_H * 5, FF_W, FF_H);
        f.add(ff);

        JButton bt = new JButton("확인");
        Form.setButton(bt);
        bt.setBounds(BT_X, BT_Y * 6, BT_W, BT_H);
        f.add(bt);
        
        //cleare
        JButton back = Form.clearButton("뒤로가기 >", BACK);
        Form.backAction(back, f, prevFrame);
        f.add(back);

        ff.onlyNumber();

        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int account;
                try {
                    account = Integer.parseInt(ff.getText());
                } catch (NumberFormatException exc) {
                    JOptionPane.showMessageDialog(f, "계좌번호를 입력해주세요.");
                    return;
                }
                Send send = new Send(user);
                if(send.findReceiver(account)){
                    JOptionPane.showMessageDialog(f, send.nameReceiver() + "님에게 송금을 진행합니다");
                    new FrameSending().start(user, prevFrame, send);
                    f.dispose();
                }
            }
        });
        f.setVisible(true);
    }
}
