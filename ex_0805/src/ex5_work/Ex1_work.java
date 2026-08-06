package ex5_work;

public class Ex1_work {
    public static void main(String[] args) {
        /*
         * 과수원에서 배, 사과, 오렌지 키우고 있음.
         * 하루에 생산되는 양은 각각 5, 7, 5.
         * 
         * 1과수원에서 하루에 생상되는 과일의 총 갯수 출력
         * 시간당 전체 과일의 평균 생산 갯수
         * 단, 과일의 갯수를 담는 변수 int, 평균을 계산할 수 있는 변수는 float
         */
        int pear = 5, apple = 7, orange = 5, sum = 0;
        float avg, t = 24f;

        sum = pear + apple + orange;
        System.out.println("1. 과수원에서 하루에 생산되는 과일의 총 갯수 : " + sum);
        avg = (float) sum / 24;// 의도가 명확, 참고로 리터럴 상수는 메소드 영역에 적재
        System.out.println("2. 시간당 전체 과일의 평균 생산 개수 : " + avg);
        System.out.printf("2. 시간당 전체 과일의 평균 생산 갯수(소수점 3자리까지만 출력) : %.3f", avg);
        System.out.println();

        avg = sum / 24f;// 한번만 사용 되는 경우 가장 적합
        System.out.println(avg);

        avg = sum / t;// 일반 변수로 실행 중 값이 바뀌는 것
        System.out.println(avg);
        // 유지보수 관점에서 고정된 값이라면 final float HOURS_PER_DAY = 24;처럼 상수로 정의하는 것이 더 좋다

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
        int am = 35, lt = 20, jc = 15, sumSale = 0, sumMoney = 0;
        int mAm = 3000, mLt = 4500, mJc = 4000;
        float avgPerHour;

        sumSale = am + lt + jc;
        System.out.println("1. 하루 총 판매 잔 수 출력 : " + sumSale);

        sumMoney = am * mAm + lt * mLt + jc * mJc;
        System.out.println("2. 하루 매출 출력 : " + sumMoney);

        avgPerHour = sumMoney/24f;
        System.out.println("3. 시간당 평균 판매량 출력 : " + avgPerHour);        
    }

}
