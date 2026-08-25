package ex1_thread;

public class ThreadMain {
    public static void main(String[] args) {
        ThreadSub ts = new ThreadSub();
        ts.start();//run()을 백그라운드에서 동작하는 방법
        try {
            Thread.sleep(1500);//1.5초 휴식
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("메인스레드 종료");
    }
}
