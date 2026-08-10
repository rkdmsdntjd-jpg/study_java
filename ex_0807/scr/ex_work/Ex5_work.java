package scr.ex_work;
import java.util.Scanner;

public class Ex5_work {
    
    //n1은 작은 수, n2는 큰 수. 합을 구하는 메소드
    public static int sum(int n1, int n2){
        int num = 0;//결과 합산해줄 변수
        for(int i = n1; i <= n2; i++)
            num += i;
        return num;
    }
    
    public static void printFunction(Scanner sc){//입출력을 담당하는 메소드
        System.out.print("수1 : ");
        int n1 = sc.nextInt();
        System.out.print("수2 : ");
        int n2 = sc.nextInt();
        System.out.println("결과 : " + sumBetween(n1, n2));
        // System.out.println("결과 : " + sum(Math.min(n1, n2), Math.max(n1, n2)));//간단한 방법
        //Math클래스: 수학관련 기능을 제공하는 클래스로 모든 멤버가 static으로 선언되어 있음(인스턴스 생성 필요 없음)
        //Math는 java.lang패키지에 있고, java.lang은 자바가 자동으로 import하기 때문에 선언할 필요 없음
        //java.lang패키지에 포함된 클래스:
        //String, System, Math, Integer, Double, Boolean, Character, Long, Float
        //Object(모든 클래스의 최상위), Class(클래스 자체 정보), Exception(예외 클래스), RuntimeExeption(실행 중 발생하는 예외 클래스), Thread(쓰레드)
    }

    public static int sumBetween(int n1, int n2){//큰 수를 분류하는 메소드
        if(n1 < n2)
            return sum(n1, n2);
        else
            return sum(n2, n1);
        /*n1과 n2의 값을 교환하고 싶을 때
        if(n1 > n2){
        int n3 = n1;
        n1 = n2;
        n2 = n3;
        }
        */
    }

    public static void main(String[] args) {
        //정수 n1, n2를 입력 받고 n1~n2사이의 합을 출력
        /*
        실행 결과:
        수1 : 2
        수2 : 5
        결과 : 14

        실행 결과2:
        수1 : 5
        수2 : 2
        결과 : 14
        */
        Scanner sc = new Scanner(System.in);
        printFunction(sc);
        sc.close();
    }
}
