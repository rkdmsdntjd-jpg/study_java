package ex11_work;

import java.util.Random;
import java.util.Scanner;

public class WorkWord {

    //문자열을 캐릭터 타입으로 바꿔서 임의 배치.
    private String shuffleChar(char[] c){
        Random rd = new Random();

        for (int i = 0; i < c.length; i++) {
            int randIndex = rd.nextInt(c.length);
            
            char temp = c[i];
            c[i] = c[randIndex];
            c[randIndex] = temp;            
        }
        return new String(c);
    }

    //플레이
    public void playQuiz(String str){
        String randstr =shuffleChar(str.toCharArray());
        System.out.println("Quiz : " + randstr);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print(">> ");
            String s = sc.next();

            if(s.equals(str)){
                System.out.println(s + " 정답!");
                sc.close();
                return;
            }
            else
                System.out.println(s + "오답!");
        }        
    }
}