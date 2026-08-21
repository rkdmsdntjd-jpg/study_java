package ex10_workMBJ;

public class Mabangjin {
    public static void makeMBJ(int n, int[][] arr){
        int startX = n / 2, startY = 0;// 시작 위치x, 시작 위치y 선언과 초기화
        int cntValue = 1;
        while (cntValue <= n * n) {//while문 종료 조건
            
            arr[startY][startX] = cntValue++;//현재 위치에 값을 저장

            int nextY = (startY - 1 + n) % n;//다음 y위치를 지정(위, -1)
            int nextX = (startX + 1) % n;//다음 x위치를 지정(오른쪽, +1)

            if(arr[nextY][nextX] == 0){//다음 위치가 빈공간(초기화 값이 '0'이면)
                startX = nextX;//다음 x위치를 시작 x위치에 저장
                startY = nextY;//다음 y위치를 시작 y위치에 저장
            }
            else{//아니면 시작위치 값을 1증가
                startY++;
                //startY = (startY + 1) % n;
            }
        }
    }  
}