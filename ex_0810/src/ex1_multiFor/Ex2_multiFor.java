package ex1_multiFor;

public class Ex2_multiFor {
    public static void main(String[] args) {
        //01 02 03 04
        //05 06 07 08
        //09 10 11 12
        for(int i = 0; i < 3; i++){
            for(int j = 1; j < 5; j++){
                System.out.printf("%02d ", ((4*i)+j));
            }
            System.out.println();
        }
    }
}
