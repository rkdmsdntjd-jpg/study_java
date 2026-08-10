package ex1_multiFor;

public class Ex4_multiFor {
    public static void main(String[] args) {
        //* * * * * 
        //1 2 3 4 5 
        //* * * * * 
        //1 2 3 4 5 
        //* * * * * 
        for(int i = 1; i < 6; i++){
            for(int j = 1; j < 6; j++){
                if(i%2 == 0)//짝수
                    System.out.print(j + " ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
