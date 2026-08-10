package ex1_multiFor;

public class Ex5_multiFor {
    public static void main(String[] args) {
        //01 02 03 04 05 
        //02 04 06 08 10 
        //03 06 09 12 15 
        //04 08 12 16 20 
        //05 10 15 20 25 
        for(int i = 1; i < 6; i++){
            for(int j = 1; j < 6; j++){
                System.out.printf("%02d ", i*j);
            }
            System.out.println();
        }
    }
}
