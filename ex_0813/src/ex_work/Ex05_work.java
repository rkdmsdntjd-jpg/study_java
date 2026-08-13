package ex_work;

import java.util.Scanner;

public class Ex05_work {
    public static void main(String[] args) {
        /*
        찾을 값 : 6
        6보다 큰 첫번째 요소 : 7
        해당 행의 모든 요소
        5 6 7 8
         */
        int[][] arr = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 }
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("찾을 값 : ");
        int n = sc.nextInt();
        int dataColumn = -1;

        outerLoop:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(n < arr[i][j]){
                    System.out.println(n + "보다 큰 첫번째 요소 : " + arr[i][j]);
                    dataColumn = i;
                    break outerLoop;
                }
            }
        }
        
        if(dataColumn >= 0){
            for(int i = 0; i < arr[dataColumn].length; i++)
                System.out.print(arr[dataColumn][i] + " ");
            System.out.println();
        }
        else{
            System.out.println("입력받은 값보다 큰 요소가 없습니다.");
        }
        sc.close();
    }
}
