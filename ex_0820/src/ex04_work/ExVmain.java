package ex04_work;

import java.util.Scanner;

public class ExVmain {
    //자판기
    public static void main(String[] args) {
        ExVending vd = new ExVending();
        vd.init();

        Scanner sc = new Scanner(System.in);

        int cnt = 15;
        while (cnt < 0) {
            System.out.print("금액 투입: ");
            int money = sc.nextInt();

            vd.showDrink(money);

            System.out.println("음료수 선택 : ");
            String str = sc.next();
            if(vd.ablePayDrink(str, money)){
                int m = vd.payment(str, money);
                System.out.println("거스름돈 : " + m);
            }

            cnt--;
        }
        sc.close();
    }
}
