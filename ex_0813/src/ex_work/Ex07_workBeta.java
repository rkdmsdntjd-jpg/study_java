package ex_work;
import java.util.*;

public class Ex07_workBeta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 홀수 입력
        System.out.print("홀수 입력 : ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];// n열과 n행으로 배열 객체 생성
        int startX = n / 2, startY = 0;// 시작 위치x, 시작 위치y 선언과 초기화
        int num = 1;

        while (num <= n * n) {
            arr[startY][startX] = num;

            if(num % n == 0)//n * n의 마방진은 n의 배수에서 무조건 오른쪽 대각선 위에 자리가 있다는 조건
                startY++;
            else{
                startY--;
                startX++;
            }
            if( startY < 0 )
                startY = n - 1;
            if( startX >= n)
                startX = 0;

            num++;
        }
        for (int[] i : arr) {//출력
            for (int j : i) {
                System.out.printf("%02d ", j);
            }
            System.out.println();
        }
        sc.close();
    }
}
