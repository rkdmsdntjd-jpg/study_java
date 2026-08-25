package ex10_work;

import java.util.Scanner;

public class Ex04_work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = "";
        System.out.print("입력 >> ");
        str = sc.next();

        try {
            //예외처리부분
            int num = Integer.parseInt(str);

            //정상 처리 부분
            if(num%2 == 0){
                System.out.printf("%d은(는) %d자리의 짝수입니다.\n", num, str.length());
            }
            else{
                System.out.printf("%d은(는) %d자리의 홀수입니다.\n", num, str.length());
            }                
        }
        catch (Exception e) {
            System.out.printf("%s은(는) 정수가 아닙니다.\n", str);
        }
        finally{
            sc.close();
        }
    }
}
