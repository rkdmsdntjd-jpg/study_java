package ex11_workWordQuiz;

import java.util.Random;
import java.util.Scanner;

public class WorkWord {
    private String[] strArr = { "apple", "orenge", "pear", "banana", "mango", "cherry" };
    private Random rd = new Random();

    //strArr에서 임의의 단어 반환하는 메소드.
    public String getRandStr(){
        return new String(strArr[rd.nextInt(strArr.length)]);
    }

    //문자열을 캐릭터 타입으로 바꿔서 임의 배치 메소드.
    private String shuffleChar(char[] c){

        for (int i = 0; i < c.length; i++) {
            int randIndex = rd.nextInt(c.length);
            
            char temp = c[i];
            c[i] = c[randIndex];
            c[randIndex] = temp;            
        }
        return new String(c);
    }

    //플레이 메소드.
    public void playQuiz(String str){
        String randstr =shuffleChar(str.toCharArray());
        System.out.println("Quiz : " + randstr);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print(">> ");
            String s = sc.next();

            if(s.equalsIgnoreCase(str)){
                System.out.println(s + " 정답!");
                sc.close();
                return;
            }
            else
                System.out.println(s + "오답!");
        }        
    }
}