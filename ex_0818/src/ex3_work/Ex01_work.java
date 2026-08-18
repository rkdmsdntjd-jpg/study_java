package ex3_work;

import java.util.Scanner;

public class Ex01_work {
    public static void main(String[] args) {
        //키보드에서 입력받은 값이 회문인지 판단
         
        Scanner sc = new Scanner(System.in);
        Ex01_workA a = new Ex01_workA();
        a.input(sc);
        sc.close();
        /*
        문자열 입력: 
        스위스
        회문입니다.

        문자열 입력: 
        스웨덴
        회문이 아닙니다.
         */
    }
}
