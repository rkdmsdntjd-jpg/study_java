package scr.ex1_loopFor;
import java.util.Scanner;

public class Ex2_for {
    public static void inputData(Scanner sc){
        System.out.print("원금 : ");
        int money = sc.nextInt();
        System.out.print("예치일 : ");
        int day = sc.nextInt();

        printBank(money, day);

    }

    public static int bank(int m, int d){
        int interest = 1;
        for(int i = 1; i <= d; i++) m += interest;
        return m;
    }

    public static void printBank(int money, int day){
        System.out.println(money + "일 후 잔액은 " + bank(money, day) + "입니다.");
    }

    public static void main(String[] args) {
        //예제3. 은행 이자가 하루에 1원씩 추가, 원금과 예치일수를 입력받고, 예치기한이 끝났을 때 나의 원금이 인지 출력
        /*
        결과 예상
        원금 : 1000(입력)
        예치일 : 5(입력)
        5일 후의 잔액은 1005원 입니다.
         */
        Scanner sc = new Scanner(System.in);
        inputData(sc);
        sc.close();
    }
    
}
