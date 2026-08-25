package ex_workRandNum;

import java.util.Random;
import java.util.Scanner;

public class RandNumWorkMain {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        //1~100까지의 난수 덧셈의 정답을 맞추는 문제 5번 맞추면 몇초가 걸렸는지 출력

        RandNumWork sec = new RandNumWork();//알아서 초를 계산해줄 스레드
        sec.start();
        for(int i = 0; i < 5; i++){//5문제를 맞출동안
            int n1 = rd.nextInt(100) + 1;//첫번째 피연산자 랜덤 생성
            int n2 = rd.nextInt(100) + 1;//두번째 피연산자 랜덤 생성
            int res = n1 + n2;//정답
            while (true) {//정답을 맞출 때까지 반복 = 무한 반복
                System.out.print(n1 + " + " + n2 + " = ");//문제 출력
                try {//입력값이 문자일 경우를 위한 예외처리
                    int inNum = sc.nextInt();//입력
                    if(res == inNum){//입력한 값과 정답이 일치하면
                        System.out.println("정답입니다.");
                        break;//while을 종료
                    }
                    else{//정답이 아니면
                        System.out.println("오답입니다.");//출력하고 계속 무한 반복
                    }
                } catch (Exception e) {//입력값에 오류가 발생하면 이 문장으로 바로 이동
                    System.out.println("정답은 자연수로 입력하세요");//출력
                    sc.nextLine();//잘못 입력한 값을 처리하기 위한 문장
                }
            }
        }//5문제를 다 맞추면 for문 탈출
        System.out.printf("결과 : %d초\n", sec.getSec());//시간을 출력
        sc.close();
    }
}
/* 실행 결과 : 

27 + 97 = a
정답은 자연수로 입력하세요
27 + 97 = 104
오답입니다.
27 + 97 = 124
정답입니다.
89 + 28 = 117
정답입니다.
61 + 13 = 74
정답입니다.
84 + 64 = 148
정답입니다.
58 + 19 = 77
정답입니다.
결과 : 57초

*/