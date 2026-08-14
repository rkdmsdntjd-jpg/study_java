package ex01_String;

import java.util.Random;
import java.util.Scanner;

public class Ex4_StringA {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        //숫자만들기
        int[] number = new int[3];
        //System.out.print("정답 : ");
        for (int i = 0; i < number.length; i++) {
            number[i] = rd.nextInt(9) + 1;
            for (int j = 0; j < i; j++) {
                if(number[i] == number[j]){
                    i--;
                    break;
                }
            }
            //System.out.print(number[i]);
        }
        System.out.println();


        while (true) {
            System.out.println("================");
            System.out.print("입력 : ");
            String a = String.valueOf(sc.nextInt());
            //contains() = "이 문자열 안에 이 값이 있니?"
            int ball = 0, strike = 0;
            
            for (int i = 0; i < number.length; i++){

                if(a.indexOf(String.valueOf(number[i])) == i){
                    strike++;
                }
                else if(a.contains(String.valueOf(number[i]))){
                    ball++;
                }
            }

            System.out.println("----------------");
            System.out.println(strike + "strike, " + ball + "ball");
            if(strike == 3)
                break;
        }
        sc.close();
    }
}
