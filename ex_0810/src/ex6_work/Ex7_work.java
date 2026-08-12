package ex6_work;

import java.util.Scanner;

public class Ex7_work {
    public static void main(String[] args) {
        /*
        1부터 입력받은 숫자(n)까지 값을 순차적으로 출력하되, 5의 배수 or 1의자리가 3인 경우는 출력에서 제외
        실행 예시:
        입력 : 15
        결과: 1 2 4 6 7 8 9 11 12 14
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int n = sc.nextInt();

        System.out.print("결과 : ");
        for(int i = 1; i <= n; i++){
            if(i % 5 == 0 || i % 10 == 3)
                continue;
            System.out.print(i + " ");
        }
        System.out.println("\n종료.");

        sc.close();
    }
}
