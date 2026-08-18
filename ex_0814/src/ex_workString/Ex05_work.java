package ex_workString;

import java.util.Scanner;

public class Ex05_work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String res ="";
        //입력받은 값에서 홀수 위치에 있는 문자를 추출
        for (int i = 0; i < str.length(); i += 2) {
            res += str.charAt(i);
        }
        System.out.println(res);
        sc.close();
    }
}
