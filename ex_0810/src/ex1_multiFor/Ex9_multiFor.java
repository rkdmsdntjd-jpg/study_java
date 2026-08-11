package ex1_multiFor;

public class Ex9_multiFor {
    public static void main(String[] args) {
        //    *
        //   ***
        //  *****
        // *******
        //*********

        //방법1
        for(int i = 4; i >= 0; i--){
            for(int j = 1; j < 10; j++){
                if(j > i && j + i < 10)
                    System.out.print("*");                          
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("---------");
        
        //방법2
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5 + i; j++){
                if(i + j > 3)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
