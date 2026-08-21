package ex7_workSort;

import java.util.Arrays;

public class workMain {
    //int[] arr = { 1, 22, 7, 20, 15 } ->가장 큰값을 찾아내자
    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 1, 7, 2, 6, 4};
        //System.out.println(Arrays.stream(arr).max().getAsInt());

        HeapSort hs = new HeapSort();
        for (int i = arr.length - 1; i > 0 ; i--) {
            hs.heapify(arr, i);
            System.out.println();           
        }
    }
}
