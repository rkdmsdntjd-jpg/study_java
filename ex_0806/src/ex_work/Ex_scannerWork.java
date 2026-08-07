package ex_work;
import java.util.Scanner;

public class Ex_scannerWork {
    public static void main(String[] args) {
        //나이 14, 키 140
        //키보드에서 나이와 키를 입력받는다.
        //(조건)15세 이상이거나 150이상이면 탑승가능 아니면 탑승불가를 출력
        Scanner sc = new Scanner(System.in);

        System.out.println("나이 입력 : ");
        int age = sc.nextInt();
        System.out.println("키 입력 : ");
        int cm = sc.nextInt();

        if(age >= 15 || cm >= 150)
            System.out.println("탑승가능");
        else
            System.out.println("탑승불가");

        sc.close();
    }
    
}
