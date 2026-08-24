package ex9_exception;

import java.util.Scanner;

public class Ex1_TryCatch {
    public static void main(String[] args) {
        //예외처리(Exception Handing) : 프로그램의 논리에 맞지 않는 상황이 발생할 때 사용
        //try{ 일반적으로 실행할 영역 }
        //catch(AAA e){ try문에서 발생한 AAA에 대한 예외 상황을 처리하는 영역 }
        
        /*실행의 흐름
        1. 자바 가상 머신(JVM)이 예외 상황을 인식
        2. 예외 상황 클래스의 인스턴스 생성
        3. catch영역에 참조값e를 전달
        4. catch영역 실행 후 try~catch문의 다음 문장 실행
        --try~catch문에서 예외 상황이 발생하면 예외가 발생한 시점부터 try문을 건너뛰기 때문에 영역 구성이 적절해야 함--

        e.getMessage(): 참조 변수e를 통해서 예외 상황이 발생한 이유를 담은 문자열 반환 메소드
        예외 클래스들이 상속하는 부모클래스Throwable 클래스의 메소드.

        대표적인 예외 클래스
        -배열 접근이 잘못된 클래스 : ArrayIndexOutOfBoundsException
        -허용할 수 없는 형변환 연산 : ClassCaseException
        -배열 선언 과정에서 배열크기를 음수로 지정 : NegativeArraySizeException
        -참조 변수가 null로 초기화된 상황 : NullPointerException
        -연산이 불가능 : ArithmeticException
        
        -하나의 try문에 대해 둘 이상의 catch문 작성 가능

        finally : 예외가 발생하더라도 반드시 실행되는 문장
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자1 입력 >> ");
        int num1 = sc.nextInt();
        System.out.print("숫자2 입력 >> ");
        int num2 = sc.nextInt();
        
        int result = 0;

        try{
            result = num1 / num2;  
        }catch(ArithmeticException e){
            System.out.println("정수는 0으로 나눌 수 없습니다.");
        }
        
        System.out.println("결과: " + result);
         
        int[] arr = { 1, 2, 3 };

        try {
            int[] arr2 = new int[-7];
            //이 아래 try문은 실행되지 않는다.
            System.out.println(arr2[0]);
            System.out.println("예외가 발생하면 발생한 시점 아래의 try문은 실행하지 않는다.");
            arr[3] = 10;

        } catch (NegativeArraySizeException e) {
            System.out.println("배열 선언이 잘못되었습니다.");
        } catch (ArrayIndexOutOfBoundsException e) {        
            System.out.println("잘못된 배열 접근입니다.");
        }

        finally{
            System.out.println("여기는 예외가 발생해도 반드시 실행할 영역입니다.");
        }

        sc.close();
    }
}
