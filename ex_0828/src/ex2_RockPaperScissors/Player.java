package ex2_RockPaperScissors;

import java.io.Serializable;

public class Player implements Serializable{
    private String name;
    private int win, draw, defeat;

    public void setAll(String name, int win, int draw, int defeat) {
        this.name = name;
        this.win = win;
        this.draw = draw;
        this.defeat = defeat;
    }

    public void upWin(){
        win++;
    }
    public void upDraw(){
        draw++;
    }
    public void upDefeat(){
        defeat++;
    }
  
    public String getName() {
        return name;
    }
    public void printRecord() {
        System.out.printf("승: %d, 무: %d, 패: %d\n", win, draw, defeat);
    }
}
