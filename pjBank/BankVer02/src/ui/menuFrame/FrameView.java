package src.ui.menuFrame;

import javax.swing.*;

import src.db.User;
import src.ui.form.Form;
import src.ui.form.FormLabel;

public class FrameView implements Form{
    public void start(User user, JFrame prevFrame){
        JFrame f = Form.setFrame("조회");

        FormLabel[] lb = new FormLabel[3];
        lb[0] = new FormLabel("이름", user.getName());
        lb[1] = new FormLabel("계좌번호", String.valueOf(user.getAccountNumber()));
        lb[2] = new FormLabel("잔액", String.valueOf(user.getBalance()));

        for (int i = 0; i < lb.length; i++) {
            lb[i].setBounds(20, 65 * (i + 3), 300, 50);
            f.add(lb[i]);
        }

        JButton back = Form.clearButton("뒤로가기 >", BACK);
        Form.backAction(back, f, prevFrame);
        f.add(back);

        f.setVisible(true);
    }
}
