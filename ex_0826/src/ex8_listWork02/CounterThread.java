package ex8_listWork02;

public class CounterThread extends Thread{
    private int count = 0;
    private final int TIMER = 5000;

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (true) {
            try {
                Thread.sleep(TIMER);
                count++;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

    public int getCount() {
        int lengthIndex = count;
        count = 0;
        return lengthIndex;
    }
}
