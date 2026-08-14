package ex_work;

import java.util.Scanner;

public class Ex07_work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 홀수 입력
        System.out.print("홀수 입력 : ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];// n열과 n행으로 배열 객체 생성
        int startX = n / 2, startY = 0;// 시작 위치x, 시작 위치y 선언과 초기화

        for (int i = 0; i < n * n; i++) {//n * n번을 수행

            arr[startY][startX] = i + 1;//배열 arr[시작 위치y][시작 위치x]에 (i + 1)을 저장

            int nextY = (startY - 1 + n) % n;//다음 y 위치 계산
            int nextX = (startX + 1) % n;//다음 x 위치 계산

            if (arr[nextY][nextX] == 0) {//다음 위치의 값이 0이면
                startX = nextX;//시작 위치x에 다음 위치x를 저장
                startY = nextY;//시작 위치y에 다음 위치y를 저장
            }
            else {//다음 위치의 값이 0이 아니면
                startY++;//시작 위치y의 값은 아래로 한칸 이동(++)
                //startY = (startY + 1) % n;
            }
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
