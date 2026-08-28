package ex3_HangMan;

public class TimerThread extends Thread{
    int timer = 0;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                timer++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public int getTimer() {
        return timer;
    }
}
