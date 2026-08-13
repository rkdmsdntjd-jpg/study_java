package ex_work;

import java.util.Random;

public class Ex08_work {
    public static void main(String[] args) {
        int[] coin = { 500, 100, 50, 10 };
        //최소한의 동전으로 거스르기.
        
        Random rd = new Random();//Random 객체 생성
        int money = rd.nextInt(500)+ 1;//1~500까지 생성(1의 자리는 출력하지 않기 위해서)
        money *= 10;//10~ 5000까지로 확장
        System.out.println("금액 : " + money);//랜덤으로 만든 money(10~5000) 출력
        for(int i = 0; i < coin.length; i++){//단, coin배열에 500~10까지 내림차순으로 정렬되어 있어야 제대로 계산됨
            int cnt = money / coin[i];//coin[i]로 money를 나눈 정수값은 몇 개인지 저장함
            money %= coin[i];//나머지를 money에 대입 -> 다음(i+1)번째는 coin[i]*cnt(i번째)를 뺀 값을 사용함
            if(cnt != 0)//출력, coin의 개수가 0이면 출력 생략
                System.out.println(coin[i] + "원짜리 동전 " + cnt + "개");
        }

    }
}
