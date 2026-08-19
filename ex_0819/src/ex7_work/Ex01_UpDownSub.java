package ex7_work;

import java.util.Random;
import java.util.Scanner;

public class Ex01_UpDownSub {

    public int ranNum(int startNum, int lastNum){
        Random rd = new Random();
        return rd.nextInt(lastNum) + startNum;
    }//ranNum Method

    public void playUpDown(int rand){
        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        while (true) {
            cnt++;
            System.out.print("정수");
            int n = sc.nextInt();
            if(n == rand){
                System.out.printf("%d회 만에 정답", cnt);
                sc.close();
                return;
            }
            else if(n > rand)
                System.out.println("DOWN");
            else
                System.out.println("UP");        
        }//while
    }//playUpDown Method

}//class
