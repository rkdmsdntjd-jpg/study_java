package ex_work;

import java.util.Scanner;

public class Ex05_work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 수를 입력하세요: ");
        int n = sc.nextInt();
        int[] score = new int[n];
        float sum = 0;
        //정수 리터럴 0은 더 작은 정수형이나 float 등에 대입할 경우 허용하기 때문에 f가 필요 없음.
        //float b = 0.0f;->소수점이 있는 실수 리터럴은 기본적으로 double이기 때문에 f가 필요.

        for(int i = 0; i < score.length; i++){
            System.out.printf("학생 %d의 성적: ", i + 1);
            score[i] = sc.nextInt();
            sum += score[i];
        }
        float avg = sum / n;
        System.out.println("-".repeat(24));
        // . :멤버 접근 연산자(member access operator) or 점 연산자(dot operator)
        //ex)"-".repeat(24)
        
        //메소드 체이닝(method chaining) : 메소드의 반환값에 다시 .으로 메소드를 이어서 호출하는 것
        //ex) sc.nextLine().charAt(0)

        System.out.printf("평균 성적: %.2f\n", avg);
        System.out.println("---평균 이상인 학생들---");

        int cnt = 0;

        for(int i = 0; i < score.length; i++){
            if(score[i] >= avg){
                System.out.printf("=> 학생%d: %d\n", i + 1, score[i]);
                cnt++;
            }
        }
        System.out.println("평균 이상인 학생 수: " + cnt);
        sc.close();
    }
}
