package scr.ex_work;
import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {
        /*
        1부터 입력받은n까지의 합을 출력
        입력: 5
        결과: 15
        */
       Scanner sc = new Scanner(System.in);

       //System.out.printf("입력 : %d", sc.nextInt());
       //입력받은 정수를 바로 반환하는 중, 따라서 재사용 불가(변수선언 안했기 때문)

       System.out.print("입력 : ");
       int inputNum = sc.nextInt();
       int sum = 0;
       for(int i = 1; i <= inputNum; i++){
        sum += i;
       }
       System.out.printf("결과 : %d\n", sum);

       System.out.println("재귀함수를 이용한 결과: " + sumInputNum(inputNum));

       sc.close();
    }
    //재귀함수: 자기 자신을 불러오는 함수
    public static int sumInputNum(int n){
        if(n == 1)
            return 1;
        return n + sumInputNum(n - 1);
    }
}
