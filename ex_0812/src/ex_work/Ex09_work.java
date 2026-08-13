package ex_work;

import java.util.Random;

public class Ex09_work {
    public static void main(String[] args) {
        //1~45 중복없는 난수 6개 만들기
        int[] lotto = new int[6];
        Random rd = new Random();

        for(int i = 0; i < lotto.length; i++){
            boolean b = false;//중복이 발생했을 때 출력되는 것을 막기 위해 boolean type의 변수를 생성
            lotto[i] = rd.nextInt(45) + 1;
            for(int j = 0; j < i; j++){//lotto배열 0~i번째까지 중복이 있는지 검사
                if(lotto[i] == lotto[j]){//중복 발생할 경우
                    b = true;//중복 발생했다는 의미의 true
                    i--;//i단계를 재실행하기 위해 감소
                    break;//inner for(j)문 탈출
                }
            }
            if(!b)//만약에 b가 false일 때 출력
                System.out.print(lotto[i] + " ");
        }
    }
}
