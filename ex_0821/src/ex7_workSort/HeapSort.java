package ex7_workSort;

public class HeapSort {

    public void heapSort(int[] arr){
        int n = arr.length;

        for(int i = n / 2 - 1; i >= 0; i--){ //n / 2 - 1 ->마지막 부모의 위치
            heapifly(arr, n, i);
        }

        for(int i = n - 1; i > 0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapifly(arr, i, 0);
        }
    }

    public void heapifly(int[] arr, int heapSize, int parent){
        int largest = parent;

        int left = parent * 2 + 1;
        int right = parent * 2 + 2;

        if(left < heapSize && arr[left] > arr[largest]){
            largest = left;
        }
        if(right < heapSize && arr[right] > arr[largest]){
            largest = right;
        }
        if(largest != parent){
            int temp = arr[parent];
            arr[parent] = arr[largest];
            arr[largest] = temp;

            heapifly(arr, heapSize, largest);
        }
    }
}
