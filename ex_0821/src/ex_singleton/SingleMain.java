package ex_singleton;

public class SingleMain {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);
        //결과 : true
        //s1과 s2가 똑같은 객체 하나를 가리키기 때문이다.
    }
}
