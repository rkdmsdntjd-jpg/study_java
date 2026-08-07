package scr.ex_work;
import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {
        //예제4. 구구단
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if(i > 1 && i < 10){
            for(; i < 10; i++){
                for(int j = 1; j < 10; j++){
                    System.out.println(i + " * " + j + " = " + (i*j));
                }
            }
        }
        sc.close();
    }
}
