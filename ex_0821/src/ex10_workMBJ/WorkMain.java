package ex10_workMBJ;

import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {
        // 홀수 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("홀수 입력 : ");
        int n = sc.nextInt();
        // n열과 n행으로 배열 객체 생성
        int[][] arr = new int[n][n];
        //마방진 만들어주는 매소드 호출
        Mabangjin.makeMBJ(n, arr);
        //출력
        for (int[] i : arr) {//출력
            for (int j : i) {
                System.out.printf("%02d ", j);
            }
            System.out.println();
        }
        sc.close();
    }
}
