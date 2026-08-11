package ex3_break;

import java.util.Scanner;

public class Ex4_break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("-------------");
            System.out.print("입력 : ");
            int num = sc.nextInt();//num에 입력받은 값을 저장
            System.out.println("출력 : " + num);
            System.out.println("-------------");
            
            if(num == 3){
                System.out.println("종료.");
                break;
            }
        }

        sc.close();
    }
}
