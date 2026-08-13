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
    }       
}

