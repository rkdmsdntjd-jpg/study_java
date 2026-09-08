package ex1_choice;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;

public class Ex1_ChoiceMain {
    public static void main(String[] args) {
        Frame f = new Frame();

        f.setBounds(500, 100, 400, 300);
        f.setLayout(null);

        Choice day = new Choice();

        day.add("monday");
        day.add("tuesday");
        day.add("wednesday");
        day.add("thursday");
        day.add("friday");
        day.add("saturday");
        day.add("sunday");
        day.setBounds(50, 50, 120, 0);

        day.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println(day.getSelectedItem());
            }
        });

        f.add(day);

        f.setVisible(true);
        f.addWindowListener( new WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e){
                System.exit(0);
            }
        });
    }
}
