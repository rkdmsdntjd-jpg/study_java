package ex1_thread;

public class ThreadSub extends Thread{
    //반드시 run이라는 메소드를 오버라이딩해야 한다.
    @Override
    public void run() {
        //이 안에 작성된 것들만 독립적으로 수행
        for (int i = 0; i < 10; i++) {

            try {
                Thread.sleep(500);//0.5초 쉬고 출력(강제 휴식), 예외 처리 필수
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
            System.out.println("스레드 실행 중");
        }
    }
}
