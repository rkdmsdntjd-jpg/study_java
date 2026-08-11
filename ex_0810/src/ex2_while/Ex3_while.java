package ex2_while;
import java.util.Random;
import java.util.Scanner;

public class Ex3_while {
    public static void main(String[] args) {
        //1~100사이의 난수를 생성한 뒤, 입력받은 값이 정답일 때 게임을 종료
        /* 실행결과:
        ----------------------
        숫자를 입력하세요 : 50
        UP
        ----------------------
        ----------------------
        숫자를 입력하세요 : 75
        UP
        ----------------------
        ----------------------
        숫자를 입력하세요 : 87
        DOWN
        ----------------------
        ----------------------
        숫자를 입력하세요 : 83
        정답!
        ----------------------
        */

        Random rd = new Random();//난수 객체 생성
        Scanner sc = new Scanner(System.in);//입력 객체 생성

        int num = rd.nextInt(100) + 1;//난수는 while문 안에 있으면 매번 수가 바뀌기 때문에 밖에서 선언
        boolean t = true;//while 실행 조건
        while (t) {
            System.out.println("----------------------");
            System.out.print("숫자를 입력하세요 : ");
            int n = sc.nextInt();
            if(n > 0 && n < 100){//입력값이 0~100사이의 숫자일 때 실행되는 영역
                if(n > num)//입력값이 정해진 난수num보다 클 경우
                    System.out.println("DOWN");
                else if(n == num){//정답일 경우
                    System.out.println("정답!");
                    //break;
                    //return;을 쓰면 메소드를 종료
                    t = false;//조건이 false가 되면서 다음 조건 검사시 while문 탈출
                }
                else//입력값이 정해진 난수num보다 작을 경우
                    System.out.println("UP");
            }
            else{//입력값이 0~100사이의 숫자가 아닐 때 실행되는 영역
                System.out.println("잘못된 입력입니다.");
                continue;
            }
            System.out.println("----------------------");         
        }
        sc.close();
    }
}
