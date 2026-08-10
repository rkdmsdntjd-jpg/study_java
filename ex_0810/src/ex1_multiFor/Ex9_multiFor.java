package ex1_multiFor;

public class Ex9_multiFor {
    public static void main(String[] args) {
        //    *
        //   ***
        //  *****
        // *******
        //*********
        for(int i = 4; i >= 0; i--){
            for(int j = 1; j < 10; j++){
                if(j > i && j + i < 10)
                    System.out.print("*");                          
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
