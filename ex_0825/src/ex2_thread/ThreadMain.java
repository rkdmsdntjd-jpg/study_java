package ex2_thread;

public class ThreadMain {
    public static void main(String[] args) {
        ThreadSub01 t1 = new ThreadSub01();
        ThreadSun02 t2 = new ThreadSun02();

        t1.start();
        t2.start();
    }
}
