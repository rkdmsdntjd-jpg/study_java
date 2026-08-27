package ex8_listWork02A;

import java.util.List;
import java.util.Random;

public class WorkSub extends Thread{
    private List<String> arr;
    private String[] data;
    private Random rd;
    private final int TIMER = 3000;

    public WorkSub(List<String> arr, String[] data){
        rd = new Random();
        this.arr = arr;
        this.data = data;
    }



    @Override
    public void run() {
        while (true) {
            int rand = rd.nextInt(data.length);
            arr.add(data[rand]);
            try {
                Thread.sleep(TIMER);//3초 간격
                
            } catch (Exception e) {
                
            }
        }
    }
}
