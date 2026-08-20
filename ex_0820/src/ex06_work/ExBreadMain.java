package ex06_work;

public class ExBreadMain {
    public static void main(String[] args) {
        //빵을 만들었습니다. <-1번 메소드 호출
        //---------------
        //빵을 만들었습니다. <-2번 메소드 호출
        //빵을 만들었습니다.
        //요청하신 2개의 빵을 만들었습니다.
        //---------------
        //크림빵을 만들었습니다. <-3번 메소드 호출
        //크림빵을 만들었습니다. 
        //요청하신 2개의 크림빵을 만들었습니다.
        //---------------

        int cnt = 2;
        String name = "신나는 구름";

        ExMakeBread mb = new ExMakeBread();

        System.err.println("----------------------");
        mb.bakeBread();

        System.err.println("----------------------");
        mb.bakeBread(cnt);

        System.err.println("----------------------");
        mb.bakeBread(cnt, name);

        System.err.println("----------------------");
    }
}
