package ex5_work;

import java.util.Scanner;

public class Ex01_CalcuSub {
    
    private String strRes = "결과 : ";
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자1 : ");
        int num1 = sc.nextInt();
        System.out.println("숫자2 : ");
        int num2 = sc.nextInt();
        System.out.println("연산자 : ");
        char oper = sc.next().charAt(0);

        calcu(num1, num2, oper);

        sc.close();
    }
    private void calcu(int num1, int num2, char oper){
        if(num1 < num2){
            int n = num1;
            num1 = num2;
            num2 = n;
        }
        if((oper == '/' || oper == '%')&& num2 == 0){
            System.out.println("나눌 수 없는 수를 입력했습니다.");
            return;
        }
        switch (oper) {
            case '+':
                System.out.println(strRes + sum(num1, num2));
                break;
            case '-':
                System.out.println(strRes + sub(num1, num2));
                break;
            case '*':
                System.out.println(strRes + mul(num1, num2));
                break;
            case '/':
                System.out.println(strRes + div(num1, num2));
                break;
            case '%':
                System.out.println(strRes + rem(num1, num2));
                break;        
            default:
                System.out.println("잘못된 연산자 입니다.");
                break;
        }
    }
    private int sum(int num1, int num2){
        return num1 + num2;
    }
    private int sub(int num1, int num2){
        return num1 - num2;
    }
    private int mul(int num1, int num2){
        return num1 * num2;
    }
    private float div(float num1, int num2){
        return num1 / num2;
    }
    private int rem(int num1, int num2){
        return num1 % num2;
    }
}
