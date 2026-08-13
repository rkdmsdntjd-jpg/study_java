package ex_work;

import java.util.Random;

public class Ex07_work {
    final static int HYPER_COUNT = 30;
    public static void main(String[] args) {
        //int[] arr = { 11, 7, 9, 20, 15, 3 };
        Random rd = new Random();
        int[] arr = new int[6];

        for(int i = 0; i < arr.length; i++){//arr에 중복없이 랜덤으로 1~100까지 대입
            arr[i] = rd.nextInt(100) + 1;
            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    i--;
                    break;
                }
            }
        }

        System.out.println("\n" + "-".repeat(HYPER_COUNT));

        //기존 배열 출력
        System.out.print("기존 배열 : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n" + "-".repeat(HYPER_COUNT));

        //오름차순
        System.out.print("오름차순  : ");
        for(int i = 0; i < arr.length; i++){
            //선택 정렬과 비슷하지만 선택정렬은 값의 위치를 먼저 찾고 마지막에 교환
            //현재 코드는 발견할 때마다 교환
            for(int j = (i + 1); j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int n = arr[i];
                    arr[i] = arr[j];
                    arr[j] = n;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + "-".repeat(HYPER_COUNT));

        //오름차순으로 정렬된 arr를 내림차순으로 arr2에 입력
        System.out.print("내림차순  : ");
        int[] arr2 = new int[arr.length];
        
        for(int i = 0, j = (arr.length - 1); i < arr.length; i++, j--){
            arr2[i] = arr[j];
            System.out.print(arr2[i] + " ");
        }
        System.out.println("\n" + "-".repeat(HYPER_COUNT));
    }
}
