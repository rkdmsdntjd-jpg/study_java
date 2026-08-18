package ex1_method;

public class MethodMain {
    public static void main(String[] args) {
        MethodTest mt = new MethodTest();
        mt.test1();

        int num = 100;
        mt.test2(num);

        num = mt.test3(num);
    }
}
