package ex1_constructor;

public class ConMain {
    public static void main(String[] args) {
        ConSub cs = new ConSub();
        /*
        생성자 : 객체가 생성될 때 메모리 할당을 위해 딱 한번 반드시 호출되는 것
        ConSub cs = new ConSub();
        cs.ConSub();
         */
        System.out.println(cs.getT());
        ConSub[] cs2 = new ConSub[2];

        cs2[0] = new ConSub();
        cs2[1] = new ConSub();
    }
}
