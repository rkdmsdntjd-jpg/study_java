package ex5_threadWork2;

public class ThreadMain {
    public static void main(String[] args) {
        int[] arr = {3, 5, 11, 6, 4};
        //A스레드 : 합
        //B스레드 : 곱

        ThreadA a = new ThreadA(arr);
        Thread ta = new Thread(a);

        ThreadB b = new ThreadB(arr);
        Thread tb = new Thread(b);

        ta.start();
        tb.start();
    }
}
