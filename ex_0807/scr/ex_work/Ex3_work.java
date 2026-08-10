package scr.ex_work;

import java.util.Random;

public class Ex3_work {
    public static void main(String[] args) {
        //A~Z사이 값중 하나를 랜덤으로 출력
        int a = new Random().nextInt(90 - 65 + 1) + 65;
        System.out.println((char)a);

        //ASCII code모를 때
        int b = new Random().nextInt('Z' - 'A' + 1) + 'A';
        System.out.println((char)b);
    }
    
}
