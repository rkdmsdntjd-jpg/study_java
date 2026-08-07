package ex1_statement;

public class Ex1_if {
    public static void main(String[] args) {
        
        //System.out.println("hello, java world!");
        //제어문: 프로그램의 흐름을 제어하는 문장
        //조건문과 반복문
        //조건문:if(else if, else), switch
        //반복문:for, while, do-while

        //if문: if(조건식) { 조건식이 참일 경우, 이 영역을 실행한다. 한 문장일 경우 중괄호 생략 가능 }
    
        int n = 49;
        //String str = "hello, java world!"; String 문자열을 저장하는 상수형태의 인스턴스
        //String 객체는 한 번 만들어지면 수정 불가
        //String Pool에서는 같은 문자열 리터럴은 객체를 하나만 만들고, 여러 변수가 그 하나의 객체를 함께 참조한다.
        String str = "";//String str = null과 다름.

        if( n == 50 ){
            str = "n은 50입니다.";//hello, java world!는 그대로 존재하지만 참조대상이 바뀐 것
        }

        if( n != 50 ) str = "n은 50이 아닙니다.";//if문 안에 문장이 하나일 경우 중괄호 생략 가능

        System.out.println(str);
    }
    
}
