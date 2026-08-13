package ex_work;

import java.util.Scanner;

public class Ex03_work {
    public static void fstNum(int[][] arr, int num){
        for (int[] i : arr) {
            for (int j : i) {
                if(j > num){     
                    System.out.println("결과 : " + j);              
                    return;
                }
            }
        }
        System.out.println("입력받은 수보다 큰 값이 없습니다.");
        
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1, 3, 4, 7},
            {10, 2, 9, 3, 8},
            {7, 4, 1}
        };
        //입력받는 값보다 큰 첫번째(먼저 만나는) 요소를 출력하고 종료.
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int num = sc.nextInt();
        /*
        outerLoop:
        for (int[] i : arr) {
            for (int j : i) {
                if(j > num){
                    System.out.println("결과 : " + j);
                    break outerLoop;
                    //break;만 쓰면 outer for문은 나가지 못함
                }
            }
        }
         */
        fstNum(arr, num);
        sc.close();
    }
}
