package ex00_workCafe;

import java.util.Random;

public class CafeManager {
    private final float HOUR = 24f;

        public void runCafe() {//main에 호출받을 메소드
            Drink[] drinks = {
                new Drink("아메리카노", 3000),
                new Drink("라떼", 4500),
                new Drink("주스", 4000),  
            };
            openCafe(drinks);
            closeCafe(drinks);
        }
        private void openCafe(Drink[] drinks){
            Random rd = new Random();
            int orderCount = 100;
            while (orderCount > 0) {
                int menuIndex = rd.nextInt(drinks.length);
                drinks[menuIndex].orderDrink();
                //System.out.println(drinks[menuIndex].getName());
                orderCount--;
            }

        }
        
        private void closeCafe(Drink[] drinks) {
            int dayCnt = 0, daySales = 0;

            for (Drink drink : drinks) {
                drink.printMenu();
                dayCnt += drink.getCnt();
                daySales += drink.getSales();
            }
            printDay(dayCnt, daySales);
        }

        private void printDay(int dayCnt, int daySales){
            System.out.println("하루 총 판매량 : " + dayCnt);
            System.out.println("하루 총 매출 : " + daySales);

            System.out.println("시간당 평균 판매량 : " + getAvg(dayCnt));
            System.out.println("시간당 평균 매출 : " + getAvg(daySales));
        }

        private float getAvg(int n) {
            return n / HOUR;
        } 
}
