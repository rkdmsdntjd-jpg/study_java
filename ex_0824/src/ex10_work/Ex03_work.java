package ex10_work;

import java.util.Scanner;

public class Ex03_work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력 : ");
        String num = "";
        try {
            num = String.valueOf(sc.nextInt());
            int sum = 0;

            for (int i = 0; i < num.length(); i++) {
                sum += num.charAt(i) - '0';
            }
            System.out.println("결과 : " + sum);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("입력한 값은 정수가 아닙니다.");
        }
        sc.close();
    }
}
