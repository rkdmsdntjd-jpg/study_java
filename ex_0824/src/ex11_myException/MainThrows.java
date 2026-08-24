package ex11_myException;

import java.util.Scanner;

public class MainThrows {

    public static void result(String str){//각 자리 숫자의 합을 계산해 출력하는 메소드
        //try문, catch(MyException e)문에서 중복이 발생하므로 메소드로 분리
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }
        System.out.println("결과 : " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력 >> ");

        try {
            String str = String.valueOf(sc.nextInt());

            MyException.checkNegative(str);
            
            //예외없이 정상 작동할 코드
            result(str);

        } catch (MyException e) {//내가 정의한 예외 상황
            System.out.println("양수가 아닙니다.\n-입력을 무시하고 연산을 수행합니다.");

            //여기서 예외를 처리 해줄 수 있음
            result(e.getVelues());

        } catch (Exception e) {//얘가 부모여야 함
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}
