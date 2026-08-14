package ex_work;
public class Ex01_work {
    public static void main(String[] args) {
        /*
         * 한 카페에서 하루 동안 판매하는 음료 개수
         *
         * 아메리카노 : 35잔
         * 라떼 : 20잔
         * 주스 : 15잔
         *
         * 1. 하루 총 판매 잔 수 출력
         * 2. 하루 매출 출력
         *
         * 가격:
         * 아메리카노 3000원
         * 라떼 4500원
         * 주스 4000원
         *
         * 3. 시간당 평균 판매량 출력 (float)
         *
         * 조건:
         * - 판매량은 int
         * - 평균 판매량은 float
         */
        int americano = 35, latte = 20, juice = 15;
        int americanoPrice = 3000, lattePrice = 4500, juicePrice = 4000;

        int daySum = americano + latte + juice;
        System.out.println("하루 총 판매 잔 수 : " + daySum);

        int daySales = americano * americanoPrice + latte * lattePrice + juice + juicePrice;
        System.out.println("하루 총 매출 : " + daySales);

        float avgSum = daySum / 24f;
        System.out.println("시간당 평균 판매량(잔) : " + avgSum);

        float avgPerHourSales = daySales / 24f;
        System.out.println("시간당 평균 판매량(매출) : " + avgPerHourSales);
        
    }
}
