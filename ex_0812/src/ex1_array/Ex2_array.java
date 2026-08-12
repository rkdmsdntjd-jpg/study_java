package ex1_array;

public class Ex2_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

        int[][] apt = {
            {100 , 101, 102},
            {200 , 201, 202},
            {300 , 301, 302},
            {400 , 401, 402}
        };
        for (int[] i : apt) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();           
        }
    }
}
