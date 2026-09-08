package ex2_choice;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;

public class Ex1_ChoiceLable {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setBounds(500, 200, 500, 400);
        f.setLayout(null);
        
        Choice local = new Choice();

        local.add("서울");
        local.add("경기");
        local.add("인천");
        local.add("광주");
        local.add("대구");
        local.add("대전");
        local.add("부산");
        local.setBounds(50, 50, 120, 0);

        Font font = new Font("", Font.BOLD, 30);
        Label label = new Label("");
        
        label.setFont(font);
        label.setBounds(200, 50, 200, 30);
        
        local.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setText(local.getSelectedItem() + "을(를) 선택");
            }
        });

        f.add(label);
        f.add(local);

        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
    }
}