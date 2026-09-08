package ex2_choice;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;

public class Ex2_ChoiceMain {

    public static void main(String[] args) {
        Frame f = new Frame();
        f.setBounds(500, 200, 500, 400);
        f.setLayout(null);

        Choice region = new Choice();

        region.add("지역 선택");
        region.add("서울");
        region.add("경기");
        region.add("인천");

        region.setBounds(50, 100, 100, 0);

        Label label = new Label("");
        label.setBounds(200, 200, 100, 30);

        region.addItemListener(new Ex2_ChoiceSensor(label));

        f.add(label);
        f.add(region);


        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
