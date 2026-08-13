package ex1_multiArray;

public class Ex3_multiArr {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2},
            {3, 4, 5},
            {6, 7, 8,  9}
        };
        for(int i = 0; i < arr.length; i++){//arr.length는 3
            for(int j = 0; j < arr[i].length; j++)//arr[i].length는 i = 0일 때 2, i = 1일 때 3, i = 2일 때 4
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
