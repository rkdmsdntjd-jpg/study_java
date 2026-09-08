package ui;

import java.awt.*;
import javax.swing.*;

public interface Form {
    //Frame보조도구
    int W = 400;
    int H = 600;

    int SCL_W = 360;
    int SCL_H = 400;

    public static JButton[] buttons(JPanel panel, String[] str){//배열을 주면 자동으로 버튼리스트를 반들어서 생성하고 반환하는 메소드
        Dimension btSize = new Dimension(120, 40);//버튼 크기

        JButton[] bt = new JButton[str.length];
        JPanel button = new JPanel();
        button.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));//정렬방식, 가로간격, 세로간격
        panel.add(button);

        for (int i = 0; i < str.length; i++) {
            bt[i] = new JButton(str[i]);

            bt[i].setPreferredSize(btSize);
            bt[i].setMaximumSize(btSize);

            button.add(bt[i]);
        }
        return bt;
    }
}