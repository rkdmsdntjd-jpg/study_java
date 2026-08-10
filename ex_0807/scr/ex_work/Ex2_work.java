package scr.ex_work;
import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {
        //예제4. 구구단
        Scanner sc = new Scanner(System.in);
        System.out.print("시작할 숫자를 입력(2~9) : ");
        int i = sc.nextInt();

        if(i > 1 && i < 10){
            for(; i < 10; i++){
                for(int j = 1; j < 10; j++){
                    System.out.printf("%d * %d = %d\n", i, j, i*j);
                }
            }
        }
        else System.out.println("잘못된 숫자를 입력하셨습니다.");
        sc.close();
    }
}
