package ex_work;
import java.util.Scanner;

public class Ex07_workAlpha {
    public static void main(String[] args) {

        //홀수 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.print("홀수 입력 : ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];//입력받은 수로 배열 생성
        int startX = n / 2, startY = 0, cntValue = 1;//x시작위치, y시작위치,대입할 값 선언 및 초기화
        int cnt = n * n;//while문 제어용

        while (true) {
            if(cnt == 0) break;//count가 0이면 while문 종료
            
            arr[startY][startX] = cntValue++;//현재 위치에 값을 저장

            int nextY = (startY - 1 + n) % n;//다음 y위치를 지정(위, -1)
            int nextX = (startX + 1) % n;//다음 x위치를 지정(오른쪽, +1)

            if(arr[nextY][nextX] == 0){//다음 위치가 빈공간(초기화 값이 '0'이면)
                startX = nextX;//다음 x위치를 시작 x위치에 저장
                startY = nextY;//다음 y위치를 시작 y위치에 저장
            }
            else{//아니면 시작위치 값을 1증가
                startY++;
            }
            cnt--;
        }

        for (int[] i : arr) {//결과 출력
            for (int j : i) {
                System.out.printf("%02d ", j);
            }
            System.out.println();
        }
        sc.close();       
    }
}
