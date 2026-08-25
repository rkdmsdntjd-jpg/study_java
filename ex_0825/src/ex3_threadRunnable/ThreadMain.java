package ex3_threadRunnable;

public class ThreadMain {
    public static void main(String[] args) {
        ThreadSub ts = new ThreadSub();//Runnable 인터페이스는 run만 담겨있음
        Thread t = new Thread(ts);//Thread에게 ts참조변수를 넘기면서 객체 생성
        
        //Thread를 상속받지않고(구현만으로) 실행하는 방법
        t.start();
    }
}
