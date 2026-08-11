package ex5_lable;

public class Ex3_lable {
    public static void main(String[] args) {
        //실행결과:
        //1 1 1
        outerLoop:
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 5; j++){
                if(j % 2 == 0)
                    continue outerLoop;
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
