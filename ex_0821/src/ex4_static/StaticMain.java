package ex4_static;

public class StaticMain {
    int n;
    static String str;

    public void test1(){
        n = 10;
        str = "안녕";
    }
    public static void test2(){
        //n = 10; <-static 메소드에서는 일반 전역 변수의 참조가 불가능
        str = "안녕";
        int num = 100;
        //static ber = 200; static메소드안에서 static변수 정의가 불가능
        System.out.println(num);
    }
}
