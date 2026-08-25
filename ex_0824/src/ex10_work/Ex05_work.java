package ex10_work;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex05_work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("피연산자1 : ");
            int num1 = sc.nextInt();
            
            System.out.print("피연산자2 : ");
            int num2 = sc.nextInt();

            int res = num1 / num2;
            System.out.println("결과 : " + res);

        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println("숫자가 아닙니다.");
        } catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
        }
        sc.close();
    }
}
