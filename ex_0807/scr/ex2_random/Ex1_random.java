package scr.ex2_random;

import java.util.Random;

public class Ex1_random {
    public static void main(String[] args) {
        //2~5사이의 난수
        //int num = new Random().nextInt(난수의 범위:첫번째는 0부터 카운트) + 시작수;
        int num = new Random().nextInt(4) + 2;
        int sum = new Random().nextInt(7) + 7;//7에서 13끼지
        int mum = new Random().nextInt(1378 - 216 + 1) + 126;//126에서 1378끼지
        
        System.out.println(num);
        System.out.println(sum);
        System.out.println(mum);

        //예제1. 난수2~9사이의 값으로 구구단을 출력
        int a = new Random().nextInt(8) + 2;
        for(int i = 1; i <= 9; i++)
            System.out.println(a + " * " + i + " = " + (a * i));
    }
}
