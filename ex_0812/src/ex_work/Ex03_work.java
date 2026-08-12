package ex_work;

import java.util.Random;
import java.util.Scanner;

public class Ex03_work {
    public static void main(String[] args) {
        //int[] arr = { 6, 54, 22, 17, 86, 2 };
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요 : ");
        int n = sc.nextInt();//배열의 길이를 입력받는 문장
        int[] arr = new int[n];
        
        Random rd = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = rd.nextInt(100);//arr[i] 값을 랜덤으로 저장 
            System.out.print("[" + i + "]" + arr[i]);
        }
        System.out.println();
        //가장 큰값을 찾아내기
        int bigNum = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(bigNum < arr[i]){
                bigNum = arr[i];
            }
        }
        System.out.println("가장 큰 값: " + bigNum);
        
        sc.close();
        /*
        //참고: Arrays.stream(arr).max(); //자바에서 제공하는 최대값 찾는 간단한 방법        
        Arrays(클래스) : 배열을 다루는 여러 기능을 모아놓은 도구 상자
        stream() : Arrays의 static Method, arr는 매개변수로 전달
        stream() : 반환값이 Stream 객체-> 이 Stream 객체가 max()를 호출
        //즉 something.getA().getB().doSomething() 이런 형태
        //예시)char c = sc.nextLine().charAt(0);
         */
    }
}
