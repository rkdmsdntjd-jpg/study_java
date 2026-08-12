package ex_work;

public class Ex02_work {
    public static void main(String[] args) {
        int[] arr = { 10, 11, 37, 61, 2};
        //배열 arr에 담긴 값의 총 합 출력
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("결과 : " + sum);

        //오름차순 정렬
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
        System.out.println("\n-------------------");

        //오름차순으로 정렬된 arr를 내림차순으로 arr2에 입력
        int[] arr2 = new int[arr.length];
        
        for(int i = 0, j = (arr.length - 1); i < arr.length; i++, j--){
            arr2[i] = arr[j];
            System.out.print(arr2[i] + " ");
        }
        
    }
}
