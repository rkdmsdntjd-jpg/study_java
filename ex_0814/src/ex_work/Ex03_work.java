package ex_work;
import java.util.Scanner;

public class Ex03_work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("수1 : ");
        int alpha = sc.nextInt();
        System.out.print("수2 : ");
        int beta = sc.nextInt();
        System.out.print("연산자 : ");
        char oper = sc.next().charAt(0);
        int result = 0;

        if((oper == '/' || oper == '%') && beta == 0){
            System.out.println(beta + "로는 나눌 수 없습니다.");
            sc.close();
            return;
        }

        switch (oper) {
            case '+':
                result = alpha + beta;
                break;
            case '-':
                result = alpha - beta;
                break;
            case '*':
                result = alpha * beta;
                break;
            case '/':
                System.out.printf("%d %c %d = %.3f", alpha, oper, beta, (float)alpha / beta);
                sc.close();              
                return;
            case '%':
                result = alpha % beta;
                break;       
            default:
                System.out.println("잘못된 연산자 입력입니다.");
                break;
        }
        System.out.printf("%d %c %d = %d", alpha, oper, beta, result);
        sc.close();
    }
}
