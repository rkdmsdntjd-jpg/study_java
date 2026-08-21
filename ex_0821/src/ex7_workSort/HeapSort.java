package ex7_workSort;

public class HeapSort {

    

    public void heapify(int[] arr, int lastPoint){
        //최대힙 정렬.
        for (int i = 0; i <= lastPoint; i++) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if(left <= lastPoint && arr[i] < arr[left]){
                int swap = arr[i];
                arr[i] = arr[left];
                arr[left] = swap;
            }
            if(right <= lastPoint && arr[i] < arr[right]){
                int swap = arr[i];
                arr[i] = arr[right];
                arr[right] = swap;
            }   
        }
        //시작과 끝 교환
        int temp = arr[0];
        arr[0] = arr[lastPoint];
        arr[lastPoint] = temp;

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
