package ex3_threadRunnable;

public class ThreadSub implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            // TODO Auto-generated method stub

            try {
                Thread.sleep(1000);//1초 강제 대기

                System.out.println(i);
            } catch (Exception e) {
                // TODO: handle exception
            }      
        }
    }
}
