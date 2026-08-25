package ex5_threadWork2;

public class ThreadB implements Runnable{
    private int[] arr;

    public ThreadB(int[] arr){
        this.arr = arr;
    }
    @Override
    public void run() {
        int res = 1;
       for (int i = 0; i < arr.length; i++) {
            res *= arr[i];
       }
       System.out.println("곱 : " + res);
    }
}
