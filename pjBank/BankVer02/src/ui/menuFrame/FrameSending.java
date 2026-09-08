package src.ui.menuFrame;

import javax.swing.*;
import java.awt.event.*;

import src.mod.Send;
import src.ui.form.Form;
import src.ui.form.FormField;
import src.db.User;


public class FrameSending implements Form{
    public void start(User user, JFrame prevFrame, Send send) {
        JFrame f = Form.setFrame("송금");

        JLabel lb = new JLabel(send.nameReceiver() + "님에게 얼마를 보내시겠습니까?");
        lb.setBounds(F, FF_H * 5, FF_W, FF_H);
        f.add(lb);
        
        FormField ff = new FormField("송금 금액");
        ff.setBounds(F, FF_H * 6, FF_W, FF_H);
        f.add(ff);

        JButton bt = new JButton("확인");
        bt.setBounds(BT_X, BT_Y * 6, BT_W, BT_H);
        Form.setButton(bt);
        f.add(bt);
        
        //cleare
        JButton back = Form.clearButton("뒤로가기 >", BACK);
        Form.backAction(back, f, prevFrame);
        f.add(back);

        ff.onlyNumber();

        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int money;
                try {
                    money = Integer.parseInt(ff.getText());
                } catch (NumberFormatException exc) {//숫자 변환 예외처리
                    JOptionPane.showMessageDialog(f, "숫자로 입력해주세요.");
                    return;//재실행
                }
                if(send.sendMoney(money)){
                    //송금 완료
                    JOptionPane.showMessageDialog(f, "송금 완료!");
                    prevFrame.setVisible(true);
                    f.dispose();
                }
                //송금 실패
                else JOptionPane.showMessageDialog(f, "송금 실패!");
            }
        });

        f.setVisible(true);
    }
}
