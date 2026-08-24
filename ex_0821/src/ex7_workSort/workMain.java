package ex7_workSort;

import java.util.Arrays;

public class workMain {
    public static void main(String[] args) {
        //가장 큰값을 찾아 출력하기
        int[] arr1 = { 1, 22, 7, 20, 15 };
        System.out.println(Arrays.stream(arr1).max().getAsInt());
        
        //힙 정렬 해보기
        int[] arr = {8, 3, 5, 1, 7, 2, 6, 4};
        
        HeapSort hs = new HeapSort();
        hs.heapSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
