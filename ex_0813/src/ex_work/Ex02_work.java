package ex_work;

public class Ex02_work {
    public static void main(String[] args) {
        int[][] arr = {
            { 9, 5, 11 },
            { 12, 20, 21, 22 },
            { 7, 8, 9 }
        };
        //배열 arr에서 3의 배수 제외하고 출력
        for (int[] row : arr) {//row는 배열
            for(int i : row) {
                if(i % 3 != 0)
                    System.out.printf("%02d ", i);
            }
            System.out.println();
        }
    }
}
