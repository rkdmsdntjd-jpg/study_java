package ex1_array;

public class Ex2_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
        //다차원 배열
        int[][] apt = {//아파트가 있다면 [층][호] 라고 생각해보자
            {100 , 101, 102},//1층에는 100, 101, 102 호가 있고,
            {200 , 201, 202},//2층에는 200, 201, 202 호가 있고,
            {300 , 301, 302},//3층에는 300, 301, 302 호가 있고,
            {400 , 401, 402} //4층에는 400, 401, 402 호가 있다고 비유를 할 수 있다.
        };
        for (int[] i : apt) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();           
        }
    }
}
