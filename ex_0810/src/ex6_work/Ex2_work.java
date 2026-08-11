package ex6_work;

import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {
        //1부터 입력한 숫자까지 3의 배수의 갯수, 5의 배수의 갯수 출력
        //실행 결과 예상:
        //정수 : 70
        //3의 배수 : 23
        //5의 배수 : 14
        Scanner sc = new Scanner(System.in);
        //방법1
        System.out.println("-----------------");
        System.out.print("1. 정수 : ");
        int num = sc.nextInt();//정수 입력 받기
        int cnt1 = 0, cnt2 = 0;//cnt1 = 3의 배수 카운팅, cnt2 = 5의 배수 카운팅, 초기값은 둘 다 0
        for(int i = num; i > 0; i--){//num값에서 시작해서 감소시키면서 카운팅 진행
            if(i % 3 == 0) cnt1++;//3의 배수가 나올 때마다 cnt1값 하나씩 증가
            if(i % 5 == 0) cnt2++;//5의 배수가 나올 때마다 cnt2값 하나씩 증가
        }
        //출력
        System.out.println("3의 배수 :" + cnt1);
        System.out.println("5의 배수 :" + cnt2);
        System.out.println("-----------------");
        
        //방법2
        System.out.println("-----------------");
        System.out.print("2. 정수 : ");
        int number = sc.nextInt();//정수 입력 받기
        int count1 = 0, count2 = 0;//count1 = 3의 배수 카운팅, count2 = 5의 배수 카운팅, 초기값은 둘 다 0
        for(int i = 1; i <= number; i++){//1에서 시작해서 number까지 증가시키면서 카운팅 진행
            if(i % 3 == 0) count1++;//3의 배수가 나올 때마다 cnt1값 하나씩 증가
            if(i % 5 == 0) count2++;//5의 배수가 나올 때마다 cnt2값 하나씩 증가
        }
        //출력
        System.out.println("3의 배수 :" + count1);
        System.out.println("5의 배수 :" + count2);
        System.out.println("-----------------");
        
        sc.close();
    }
}
