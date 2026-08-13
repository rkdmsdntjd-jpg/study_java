package ex_work;

import java.util.Arrays;

public class Ex01_work {
    public static void main(String[] args) {
        //arr에 담긴 모든 값의 합과 평균 구하기
        int[][] arr = {
            { 7, 8, 11, 6 },
            { 20, 13, 9, 2, 5 },
            { 7, 7, 10 },
            { 2, 3, 4, 5 },
        };
        int lengthAllArr = 0;
        float sum = 0, avg;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
                lengthAllArr++;
            }
        }
        avg = sum / lengthAllArr;
        System.out.printf("총합 : %d\n평균 : %.2f\n", (int)sum, avg);

        //api_Arrays.stream()이용하기
        int sumArrays = 0, count = 0;
        float average;
        /*
        for(int i = 0; i < arr.length; i++){
            sumArrays += Arrays.stream(arr[i]).sum();
            count += arr[i].length;
        }
         */
        for (int[] row : arr) {
            //int[] row가 arr[][] 각 요소를 가져오는 것.
            //만약 3차원 배열이면 int[][] row: arr를 써서 각 원소를 가져올 수 있다.
            sumArrays += Arrays.stream(row).sum();
            count += row.length;
        }

        average = (float)sumArrays / count;
        System.out.printf("총합 : %d\n평균 : %.2f\n", sumArrays, average);
    }
}
