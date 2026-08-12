package ex_work;

public class Ex07_work {
    public static void main(String[] args) {
        int[] arr = { 11, 7, 9, 20, 15, 3 };

        System.out.print("기존 배열 : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //오름차순
        System.out.print("오름차순  : ");
        for(int i = 0; i < arr.length; i++){
            for(int j = (i + 1); j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int n = arr[i];
                    arr[i] = arr[j];
                    arr[j] = n;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
