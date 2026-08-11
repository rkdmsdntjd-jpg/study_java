package ex2_while;
import java.util.Scanner;

public class Ex1_while {
    public static void main(String[] args) {
        int num = 1;
        //while (조건식이 참일 때) { //실행문 영역 } ->while문은 0번 이상 실행되는 문장
        while (num <= 4) {
            System.out.println(num);
            num++;
        }
        //do { //실행문 영역 } while(조건문 영역) ->do~while문은 반드시 한 번 이상 실행되는 문장
        /*
        *continue : 실행했던 문장을 끝내고, 조건 검사로 이동
        *break : loop문 탈출
        *break outerLoop : 모든 loop문 탈출
        */
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("홀수를 입력 : \n(0을 입력하면 종료)");
            int n = sc.nextInt();
            if(n == 0){
                System.out.println("종료");
                break;
            }
            System.out.println("입력한 홀수 : " + n);
            
        }
        sc.close();
    }
}
