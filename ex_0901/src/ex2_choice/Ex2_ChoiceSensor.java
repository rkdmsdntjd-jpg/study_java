package ex2_choice;

import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Ex2_ChoiceSensor implements ItemListener{

    Label label;

    public Ex2_ChoiceSensor(Label label){
        this.label = label;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String str = (String)e.getItem();

        if(!str.equals("지역 선택")){
            label.setText(str + "을(를) 선택");
        }
        else{
            label.setText("");
        }
    }
}
