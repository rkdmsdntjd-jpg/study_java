package ex2_constructor;

public class PenMain {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        Pen p2 = new Pen("몽블랑 작가 에디션", "black", 2620000, true);

        p1.info();
        p2.info();
    }
}
