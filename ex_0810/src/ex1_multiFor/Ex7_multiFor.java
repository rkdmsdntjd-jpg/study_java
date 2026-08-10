package ex1_multiFor;

public class Ex7_multiFor {
    public static void main(String[] args) {
        // 2 x 1 = 2    3 x 1 = 3   4 x 1 = 4   ... 9 x 1 = 9
        // ...
        // 2 x 9 = 18   3 x 9 = 27  4 x 9 = 36  ... 9 x 9 = 81
        for(int i = 1; i < 10; i++){
            for(int j = 2; j < 10; j++){
                System.out.printf("%d x %d = %d\t", j, i, j*i);
            }
            System.out.println();
        }
    }
}
