package ex01_String;

public class Ex1_String {
    public static void main(String[] args) {
        //String 클래스
        //1) 객체 생성 방법: 암시적(String만) or 명시적
        //2)한 번 생성된 문자열의 내용은 변하지 않는다

        String s1 = "abc";//객체 생성, 암시적
        String s2 = "abc";//s1과 같은 주소값을 참조한다. s1과 s2는 같은 String 객체를 참조해.
        String s3 = new String("abc");//명시적 객체 생성
        String s4 = new String("abc");//새로운 String 객체를 각각 생성
        //new : heap memory에 공간을 할당 받는다.
        //equals()는 문자열 내용
        //==는 참조값(같은 객체인지)을 비교한다

        if(s1 == s2)
            System.out.println("s1과 s2는 주소가 같다.");   
        if(s1 == s3)
            System.out.println("s1과 s3는 주소는 같다.");
        if(s1 == s4)
            System.out.println("s1과 s4는 주소는 같다.");
        if(s3 == s4)
            System.out.println("s3과 s4는 주소는 같다.");
        
        String op = "+";

        if(op.equals("+")){
            System.out.println("+ 연산하러 감");
        }
        //String a = "hi";
        //a += " java";
        //출력 결과: hi java
        // a->'hi' => 'hi', a->'hi java'
    }
}
