package ex10_work;

import java.util.Scanner;

public class Ex01_work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("정수 >> ");
        try {
            int num = sc.nextInt();
            System.out.println("입력 받은 수 >> " + num);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("정수만 입력할 수 있습니다.");               
        }
        sc.close();
    }
}
