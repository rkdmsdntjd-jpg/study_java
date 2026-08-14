package ex_work;
import java.util.Scanner;

public class Ex05_work {
    public static void main(String[] args) {
        //n1 ~ n2까지의 합을 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("num1 : ");
        int num1 = sc.nextInt();
        System.out.print("num2 : ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            int a = num1;
            num1 = num2;
            num2 = a;
        }

        int result = 0;
        for(int i = num1; i <= num2; i++){
            result += i;
        }
        System.out.println("결과 : " + result);
        sc.close();
    }
}
