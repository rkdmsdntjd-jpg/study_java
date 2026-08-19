package ex6_work;

import java.util.Scanner;

public class Ex01_GradeMain {
    public static void main(String[] args) {
        //구매금액, 등급 입력 -> 적립 포인트 계산

        /*
        등급 : vip 10%, gold 5%, silver 3%, 
        결과 : 
        구매금액 : 10000
        등급 : vip
        적립포인트 : 1000
        */
       
        Scanner sc = new Scanner(System.in);

        System.out.print("구매금액 : ");
        int num = sc.nextInt();

        System.out.print("등급 : ");
        String grade = sc.next();

       Ex01_GradeSub g = new Ex01_GradeSub();
       int p = g.gradePer(grade.toLowerCase());
       //toLowerCase() : 입력한 문자열을 소문자로 변환
       g.res(num, p);

       sc.close();
    }
}
