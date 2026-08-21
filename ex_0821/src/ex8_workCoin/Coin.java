package ex8_workCoin;

import java.util.Random;

public class Coin {
    private int[] coin = { 500, 100, 50, 10 };

    public void runCoin(){
        int money = randMoney();
        System.out.printf("금액 : %d\n", money);
        printCoin(money);
    }

    //난수 만들기 메소드
    private int randMoney(){
        int money = new Random().nextInt(500) + 1;
        return money * 10;
    }
    
    //코인으로 나누기
    private void printCoin(int money){
        for (int i = 0; i < coin.length; i++) {
            int cnt = money / coin[i];
            if(cnt != 0){
                money %= coin[i];
                System.out.printf("%d원 : %d\n", coin[i], cnt);
            }
        }
    }
}
