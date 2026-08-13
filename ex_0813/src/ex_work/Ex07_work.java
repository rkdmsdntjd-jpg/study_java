package ex_work;

import java.util.Scanner;

public class Ex07_work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //홀수 입력
        System.out.print("홀수 입력 : ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        int startX = n / 2, startY = 0, cntValue = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[startY][startX] = cntValue++;
                int nextY = (startY - 1 + n)% n;
                int nextX = (startX + 1 )% n;
                if(arr[nextY][nextX] == 0){
                    startX = nextX;
                    startY = nextY;
                }
                else{
                    startY++;
                }                             
            }
        }
        for (int[] i : arr) {
            for (int j : i) {
                System.out.printf("%02d ", j);
            }
            System.out.println();
        }

        sc.close();
    }
}
