package src.ui_pp;

import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.*;;

public class NumberPad extends JPanel{

    private JButton[] bt;

    public NumberPad(){
        bt = new JButton[12];

        setLayout(new GridLayout(4,3,5,5));
        
        for (int i = 0; i < 12; i++) {
            if(i == 9){
                bt[i] = new JButton("back"); 
            }
            else if(i == 10){
                bt[i] = new JButton(String.valueOf(0));
            }
            else if(i == 11){
                bt[i] = new JButton("submit");
            }
            else{
                bt[i] = new JButton(String.valueOf(i + 1));
            }
            add(bt[i]);
        }
    }

    public int getValues(int index){
        if(index == 10){
            return -1;//-1 이반환되면 입력값지우기
        }
        if(index == 11){
            return 10;// 10이 반환되면 입력 종료
        }
        return Integer.parseInt(bt[index].getText());
    }
}