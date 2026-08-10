package ex1_multiFor;

public class Ex3_multiFor {
    public static void main(String[] args) {
        //A B C D
        //E F G H
        //I J K L
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.printf("%c ", ((4*i)+j+'A'));
                //System.out.printf("%c ", ((4*i)+j+65));
            }
            System.out.println();
        }
    }
}
