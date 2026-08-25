package ex4_ThreadWork;

public class ThreadSub extends Thread {

    private int cnt;

    public ThreadSub(int cnt){
        this.cnt = cnt;
    }

    @Override
    public void run() {

        for (int i = cnt; i >= 0; i--) {
            try {
                System.out.println(i);
                Thread.sleep(1000);

            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
