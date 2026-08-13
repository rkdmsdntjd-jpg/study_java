package ex_work;

public class Ex04_work {
    public static void main(String[] args) {
        final int ARR_LENGTH = 4;
        //0 1 2 3
        //1 2 3 4
        //2 3 4 5
        //3 4 5 6
        int[][] arr = new int[10][ARR_LENGTH];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = i + j;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-".repeat(ARR_LENGTH * 2));
        //0 1 2 3
        //1 2 3 0
        //2 3 0 1
        //3 0 1 2
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                int sum = i + j;
                if(sum >= ARR_LENGTH) sum %= ARR_LENGTH;
                arr[i][j] = sum;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-".repeat(ARR_LENGTH * 2));
        //  0 1 2 3
        //----------
        //0|0 1 2 3
        //1|3 0 1 2
        //2|2 3 0 1
        //3|1 2 3 0
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (j - i + ARR_LENGTH) % ARR_LENGTH;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
