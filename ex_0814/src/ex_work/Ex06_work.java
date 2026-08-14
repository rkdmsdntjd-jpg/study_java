package ex_work;
import java.util.Scanner;

public class Ex06_work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();

        for(int i = 1; i*i < num;){
            i++;
            if(num%i == 0){
                System.out.println(num + "은(는) 소수가 아닙니다.");
                break;
            }
            System.out.println(num + "은(는) 소수 입니다.");
        }
        sc.close();
    }
}
