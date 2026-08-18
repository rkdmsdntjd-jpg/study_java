package ex_workString;

import java.util.Random;
import java.util.Scanner;

public class Ex01_baseball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//스캐너 객체 생성
        //Random rd = new Random();

        int[] arr = new int[3];//랜덤 배열
        int[] inputArr = new int[3];//입력 배열

        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = rd.nextInt(9) + 1;
        //     for (int j = 0; j < i; j++) {
        //         if(arr[i] == arr[j]){
        //             i--;
        //             break;
        //         }
        //     }
        // }
        
        outerLoop:
        for(int i = 0; i < arr.length;){//배열만큼 반복
            arr[i] = new Random().nextInt(9) + 1;//1~9까지 수를 arr[i]에 저장

            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){//중복이 발생하면
                    continue outerLoop;//outerLoop Lable로 돌아가서 반복문 마저 실행(증감식이 없으니까 조건문으로 바로 이동)
                }
            }
            i++;//for문을 무사히 빠져나오면 중복이 없으니까 i값을 증가시킴
        }
        
        System.out.println("결과 : " + arr[0] + arr[1] + arr[2]);

        int cnt = 0;//카운터
        while (true) {
            System.out.print("입력(예|123) : ");
            int number = sc.nextInt();
            cnt++;
            inputArr[0] = number / 100;
            inputArr[1] = number / 10 % 10;
            inputArr[2] = number % 10;

            int strike = 0, ball = 0;
            for (int i = 0; i < inputArr.length; i++) {
                for (int j = 0; j < inputArr.length; j++) {
                    if( i == j ){
                        if(arr[i] == inputArr[j])
                            strike++;
                    }
                    else{
                        if(arr[i] == inputArr[j])
                            ball++;
                    }
                }
            }
            
            if(strike == 3){
                System.out.println("정답!" + arr[0] + arr[1] + arr[2]);
                System.out.println("cnt = " + cnt);
                break;
            }
            else{
                if(strike > 0 || ball > 0){
                    System.out.println("스트라이크 : " + strike + "|볼 : " + ball);
                }
                else{
                    System.out.println("out!");
                }
            }
        }
        sc.close();
    }
}
