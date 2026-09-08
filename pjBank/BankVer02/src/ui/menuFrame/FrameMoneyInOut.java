package src.ui.menuFrame;

import javax.swing.*;
import java.awt.event.*;

import src.db.User;
import src.mod.Banking;
import src.mod.MoneyIn;
import src.mod.MoneyOut;
import src.ui.form.Form;
import src.ui.form.FormField;

public class FrameMoneyInOut implements Form{

    private Banking bk;
    private String title;

    public FrameMoneyInOut(User user, boolean inTOutF){
        if(inTOutF){
            bk = new MoneyIn(user);
            title = "입금";
        }
        else{
            bk = new MoneyOut(user);
            title = "출금";
        }
    }

    public void start(JFrame prevFrame) {
        JFrame f = Form.setFrame(title);
        FormField ff = new FormField(title + " 금액");
        ff.setBounds(F, FF_H * 5, FF_W, FF_H);
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
                if(bk.execute(money)){
                    //입금 완료
                    bk.commit();
                    JOptionPane.showMessageDialog(f, title + " 완료!");
                    prevFrame.setVisible(true);
                    f.dispose();
                }
                else bk.rollback();
            }
        });

        f.setVisible(true);
    }
}
