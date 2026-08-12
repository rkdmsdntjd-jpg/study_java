package ex_work;

import java.util.Random;

public class Ex08_work {
    public static void main(String[] args) {
        int[] coin = { 500, 100, 50, 10 };
        //최소한의 동전으로 거스르기.
        Random rd = new Random();
        int money = rd.nextInt(500)+ 1;
        money *= 10;
        System.out.println("금액 : " + money);
        for(int i = 0; i < coin.length; i++){
            int cnt = money / coin[i];
            money %= coin[i];
            if(cnt != 0)
                System.out.println(coin[i] + "원짜리 동전 " + cnt + "개");
        }

    }
}
