package ex_work;
import java.util.Scanner;

public class Ex02_work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //달이 몇 일까지 있는지 출력
        System.out.print("월 : ");
        int month = sc.nextInt();
        int day;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            case 2:
                day = 28;
                break;        
            default:
                day = 0;
                break;
        }
        if(day != 0)
            System.out.println(month + "월은 " + day + "까지 있습니다.");
        else
            System.out.println(month + "월은 없습니다.");
        sc.close();
    }
}
