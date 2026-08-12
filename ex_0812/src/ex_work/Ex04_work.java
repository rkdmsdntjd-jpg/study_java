package ex_work;

import java.util.Scanner;

public class Ex04_work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요 : ");
        int lengthArrNum = sc.nextInt();

        int[] arr = new int[lengthArrNum];//배열 객체 생성
        int oddCount = 0, evenCount = 0;//홀수 카운트, 짝수 카운트 변수 선언하고 0으로 초기화

        for(int i = 0; i < arr.length; i++){
            System.out.print("정수" + (i + 1) + " : ");
            arr[i] = sc.nextInt();//배열에 값을 저장하는 작업
            if(arr[i]%2 != 0)//홀수일 경우
                oddCount++;
            else//짝수일 경우
                evenCount++;
        }
        System.out.println("---------------");
        System.out.println("홀수 개수 : " + oddCount);
        System.out.println("짝수 개수 : " + evenCount);
        
        /*for문을 사용할 경우
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0)//홀수일 경우
                oddCount++;           
            else//짝수일 경우
                evenCount++;
        }
         
        //for each문 사용할 경우       
        for (int i : arr) {
            if(i%2 != 0)//홀수일 경우
                oddCount++;
            else//짝수일 경우
                evenCount++;
        }
         */
        sc.close();
    }
}