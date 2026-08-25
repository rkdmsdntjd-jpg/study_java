package ex7_generic;

public class GenMain {
    public static void main(String[] args) {
        GenTest<String> generic = new GenTest<String>();
        generic.setValue("T를 내가 String으로 정의했으니까 넌 String 객체를 받아");
        String s = generic.getValue();
        System.out.println(s);

        GenTest<Integer> generic2 = new GenTest<>();//참조변수 선언에서 T 타입을 정했으면 객체생성에서 타입을 생략할 수 있다.
        generic2.setValue(123456);
        int num = generic2.getValue();
        System.out.println("Integer만 받기도 가능" + num);
        
    }
}
