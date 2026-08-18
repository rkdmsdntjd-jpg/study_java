package ex01_String;

import java.util.Random;
import java.util.Scanner;

public class Ex4_StringBaseballB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
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
            int num = sc.nextInt();
            int[] a = { (num / 100), ((num % 100) / 10), (num % 10) };
            
            int ball = 0, strike = 0;
            
            for (int i = 0; i < number.length; i++) {
                if(number[i] == a[i]){
                    strike++;
                }
                else{
                    for (int j = 0; j < a.length; j++) {
                        if(i != j && a[i] == number[j])
                            ball++;
                    }
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
