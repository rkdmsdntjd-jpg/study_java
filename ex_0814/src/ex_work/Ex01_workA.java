package ex_work;
public class Ex01_workA {
    /*
     * 한 카페에서 하루 동안 판매하는 음료 개수
     * 
     * 아메리카노 : 35잔 3000원
     * 라떼 : 20잔 4500원
     * 주스 : 15잔 4000원
     *
     * 1. 하루 총 판매 잔 수 출력
     * 2. 하루 매출 출력
     * 3. 시간당 평균 판매량 출력 (float)
     */
    public class Drink {
        private String name;
        private int cnt = 0;
        private int price;

        Drink(String name, int cnt, int price) {
            this.name = name;
            this.cnt = cnt;
            this.price = price;
        }

        public void printMenu() {
            System.out.printf("%s : %d원\n", name, price);
            System.out.println("=".repeat(30));
        }
        public void addDrink(){
            cnt++;
        }

        public int getSales() {
            return cnt * price;
        }

        public int getCnt() {
            return cnt;
        }
    }

    public class CafeManager {
        private final float HOUR = 24f;

        public void runCafe() {//main에 호출받을 메소드
            Drink[] drinks = {
                    new Drink("아메리카노", 35, 3000),
                    new Drink("라떼", 20, 4500),
                    new Drink("주스", 15, 4000),
            };
            day(drinks);
        }

        private void day(Drink[] drinks) {
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

    public static void main(String[] args) {
        Ex01_workA workA = new Ex01_workA();
        CafeManager cafe = workA.new CafeManager();
        cafe.runCafe();
    }
}
