package src.ui.form;

import javax.swing.*;
import java.awt.Font;

public class FormLabel extends JPanel{

    JLabel[] lb;
    
    public FormLabel(String str, String text){
        setLayout(null);
        setOpaque(false);

        lb = new JLabel[2];

        lb[0] = new JLabel(str, SwingConstants.CENTER);
        lb[1] = new JLabel(text, SwingConstants.CENTER);

        lb[0].setBounds(0, 0, 300, 20);
        lb[1].setBounds(0, 20, 300, 20);

        lb[0].setFont(new Font("나눔고딕", Font.BOLD, 15));
        lb[0].setForeground(Form.DEEPBLUE); 
        
        lb[1].setFont(new Font("나눔고딕", Font.PLAIN, 17));
        lb[1].setForeground(Form.TEXT); 

        for (JLabel l : lb) {
            add(l);
        }
    }
}
