package ex12_catch;

import java.util.Scanner;

public class InputNum {
    public static void check(int num) throws Exception {//throws → 메서드 입구에서 "나 예외 던질 수 있음"이라고 선언
        if (num < 1 || num > 50)  
            throw new Exception("범위를 벗어났습니다.");            
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {//같은 종류의 입력을 성공할 때까지 반복
            System.out.print("정수(1 ~ 50) >> ");
            try {
                int num = sc.nextInt();

                check(num);//메소드로 예외검사하기

                //메소드 검사없이 예외클래스를 따로 정의하지 않고 예외상황 만들기
                if(num < 1 || num > 50){
                    throw new IllegalArgumentException("1 ~ 50사이의 숫자를 입력하지 않았습니다.");
                    //throw new Exception을 해도 문법상 문제는 없지만 범위가 너무 포괄적.
                }

                //정상 결과 출력
                System.out.println("입력 받은 수 >> " + num);
                break;

            } catch (IllegalArgumentException e) {//내가 만든 예외를 처리해주는 문장

                System.out.println(e.getMessage());

            } catch (Exception e) {
                //그 외 일반적으로 발생할 예외
                System.out.println("1 ~ 50까지의 정수만 입력할 수 있습니다.");     
                sc.nextLine();          
            }
        }
        sc.close();
    }
    /*
    InputMismatchException : Scanner에 자료형이 안 맞는 입력
    ArithmeticException : 0으로 나누기
    ArrayIndexOutOfBoundsException : 배열 범위 밖 접근
    NullPointerException : null객체 사용
    NumberFormatException : 문자열을 숫자로 변환 실패
    IllegalArgumentException : 메소드에 잘못된 인자 전달
    IOException : 입출력 과정의 문제
     */
}
