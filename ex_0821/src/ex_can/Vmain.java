package ex_can;

import java.util.Scanner;

public class Vmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("투입 금액 : ");
        int n = sc.nextInt();

        Vending v = new Vending();

        v.showDrink(n);

        System.out.print("음료 이름 입력>> ");
        String s = sc.next();
        v.dispense(s);

        sc.close();
    }
}
