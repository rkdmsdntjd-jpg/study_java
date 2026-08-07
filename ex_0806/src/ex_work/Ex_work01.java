package ex_work;
import java.util.Scanner;

public class Ex_work01 {
    
    //입력받는 메소드
    public static void inputData(Scanner sc){        
        System.out.print("피연산자1(정수) : ");
        int num1 = sc.nextInt();
        System.out.print("피연산자2(정수) : ");
        int num2 = sc.nextInt();
        System.out.print("연산자(+, -, *, /, %) : ");
        char oper = sc.next().charAt(0);

        //연산자 구분 메소드 호출
        calculate(num1, num2, oper);
    }

    //연산자로 구분하는 메소드
    public static void calculate(int num1, int num2, char oper){
        switch (oper) {
            case '+':
                getValue(num1 + num2);
                break;
            case '-':
                getValue(num1 - num2);
                break;
            case '*':
                getValue(num1 * num2);
                break;
            case '/':
                if(checkZero(num2))
                    break;
                //num1 /= num2;
                //몫을 정수가 아닌 소수로 출력하는 결과물
                getValue((float)num1 / num2);
                System.out.println();
                break;
            case '%':
                if(checkZero(num2))
                    break;
                getValue(num1 % num2);
                break;
        
            default:
                System.out.println("연산자 입력이 잘못되어 계산을 진행할 수 없습니다.");
                break;
        }
    }

    //출력해주는 메소드
    public static void getValue(int num){
        System.out.println(num);
    }

    //실수로 출력해주는 메소드(오버로딩)
    public static void getValue(float num){
        System.out.println(num);
    }

    //두 번째 피연산자 '0'체크 메소드
    public static boolean checkZero(int num){
        if(num == 0){
            System.out.println(num + "로는 나눌 수 없습니다.");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        inputData(sc);
        sc.close();
    }
}