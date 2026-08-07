package ex_work;
import java.util.Scanner;

public class Ex_switch01 {

    //switch문, month를 받아서 마지막 날짜를 분류해주는 메소드
    public static void setMonth(int month){//staic으로 구현한 이유는 간단한 코드
        int lastDay;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastDay = 31;
                break;
            case 2:
                lastDay = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                lastDay = 30;
                break;       
            default:
                lastDay = 0;
                break;
        }
        getLastDay(month, lastDay);
    }

    //month와 lastDay를 받아서 문장을 출력해주는 메소드
    public static void getLastDay(int month, int lastDay){
        if(lastDay == 0){
            System.out.println(month + "는 잘못 입력된 월입니다.");
            return;
        }
        System.out.println(month + "월은 " + lastDay + "까지 있습니다.");
    }

    public static void main(String[] args) {
        //비교값으로 1~12월 사이의 값을 준비
        //준비된 값에 해당하는 달이 몇 일까지 있는지 출력
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력 :");
        int setNum = sc.nextInt();

        setMonth(setNum);
        
        setMonth(3);
        setMonth(2);
        setMonth(9);
        setMonth(44);

        sc.close();
    }
}
