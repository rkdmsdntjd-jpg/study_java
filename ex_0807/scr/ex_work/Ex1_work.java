package scr.ex_work;
import java.util.Scanner;

public class Ex1_work {
    public static void main(String[] args) {
        //윤년 구하기
        /*
        4로 나눠떨어지지만 100으로 나눠떨어지지 않는 연도가 윤년
        100으로 나눠 떨어지는 해는 평년
        단, 4년주기에 포함되어 잇더라도 100으로 나눠떨어지면 평년, 100으로 나눠떨어지더라도 400으로 나눠지면 윤년
         */

        //년도를 입력받아서 윤년인지 평년인지 판단하기(참고 2024년도 윤년)
        Scanner sc = new Scanner(System.in);
        boolean b = true;

        System.out.print("연도 입력 : ");
        int year = sc.nextInt();

        if(year%4 == 0){
            b = false;
            if(year%100 == 0 && year%400 != 0){
                b = true;
            }            
        }
        if(b) System.out.println(year + "년은 평년입니다.");
        else System.out.println(year + "년은 윤년입니다.");

        sc.close();
        /*
        결과 예상:
        연도 : 2020
        2020년은 윤년입니다.

        연도 : 2021
        2021년은 평년입니다.
         */
    }
    
}
