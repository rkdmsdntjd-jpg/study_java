package ex2_valueType;

public class Ex1_valueType {
    public static void main(String[] args) {
        /*주석 영역: 컴파일시 컴파일러가 인식하지 않는 영역으로, 슬래쉬+별은 여러줄 주석을 의미*/
        /*
        자바의 기본 자료형
        논리형: boolean 1bit
        문자형: char 2byte
        정수형: byte 1byte, short 2byte(-32768 ~ 32767), int 4byte(-21억 ~ 2,1억), long 8byte (-900경 ~ 900경)
        실수형: float 4byte, double 8byte
        1byte = 8bit(-128 ~ 127)

        변수: 데이터를 저장하는 공간
        변수 선언 규칙:
        자료형 변수명(선언) =(대입) 값(초기화);
         */

        // 변수명을 작성할 때 자주 사용되는 표기법
        // 1. 카멜 표기법(Camel Case) : 변수명 첫 글자는 소문자, 그 다음 단어 첫 글자는 대문자로 작성
        //    예시: myVariableName, studentAge
        //
        // 2. 파스칼 표기법(Pascal Case) : 모든 단어의 첫 글자를 대문자로 작성 (주로 클래스명에 사용)
        //    예시: MyVariableName, StudentAge
        //
        // 3. 헝가리안 표기법(Hungarian Notation) : 변수명 앞에 자료형이나 목적을 의미하는 접두사를 붙임
        //    예시: strName (string type), iCount (int type), btnSubmit (Button 객체)
        //
        // 4. 스네이크 표기법(Snake Case) : 단어 사이를 언더바(_)로 구분, 주로 상수 또는 일부 언어에서 사용
        //    예시: my_variable_name, student_age

        //논리형: boolean, 참과 거짓(true, false)만 저장할 수 있다.
        boolean b1; //b1이라는 변수명을 boolean 타입으로 선언, 똑같은 변수명의 변수를 선언할 수 없다.
        b1 = true; //대입
        System.out.println("b1: " + b1);
        b1 = false;
        System.out.println("bl: " + b1);
        //b1 = 10; //오류: 10은 boolean 타입이 아니라서 대입할 수 없다.

        //정수형: 소수점이 엇는 정수값만 저장하는 자료형
        byte b2 = 127; // byte b1 = 130;은 오류를 발생(이미 b1의 변수명이 사용되고 있으며 값이 130이기 때문)
        short s1 = 32767;
        int i1 = 2147483647;
        long l1 = 2200000000L;//int형이 기본 자료형이기 때문에 long의 자료형은 값 뒤에 'L'을 입력해줘야 long type으로 인식

        System.out.println("b2 : " + b2);
        System.out.println("s1 : " + s1);
        System.out.println("i1 : " + i1);
        System.out.println("l1 : " + l1);
    }
}
