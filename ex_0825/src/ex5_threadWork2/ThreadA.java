package ex5_threadWork2;

public class ThreadA implements Runnable{
    private int[] arr;

    public ThreadA(int[] arr){
        this.arr = arr;
    }
    @Override
    public void run() {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
        }
        System.out.println("합 : " + res);
    }
}
