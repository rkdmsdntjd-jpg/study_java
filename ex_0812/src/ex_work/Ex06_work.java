package ex_work;

import java.util.Scanner;

public class Ex06_work {
    public static void main(String[] args) {
        //정수 10개를 입력받아, 가장많이 등장하는 숫자와 등장횟수 출력

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("---정수 10개를 입력하시오.---");
        for(int i = 0; i < arr.length; i++){

            System.out.print((i + 1) + "번째 정수 입력 : ");
            arr[i] = sc.nextInt();         
        }
        int max = 0, count = 0;
        for(int i = 0; i < arr.length; i++){
            int cnt = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    cnt++;
                }
            }
            if(cnt > count){
                count = cnt;
                max = arr[i];
            }
        }
        System.out.println("가장 많이 등장한 숫자 : " + max);
        System.out.println("등장 횟수 : " + count);
        sc.close();
    }
}
