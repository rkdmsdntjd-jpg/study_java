package ex_singleton;

public class Singleton {
    // ① 자기 자신의 객체를 static으로 저장
    private static Singleton instance;

    // ② 외부에서 new 못 하게 생성자를 private으로 막음
    private Singleton() {

    }

    // ③ 객체를 getInstance()로 하나만 만들어서 반환
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
