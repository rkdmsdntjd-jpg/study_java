package ex3_work;

import java.util.Scanner;

public class Ex01_workA {

    
    public void input(Scanner sc){//메인 호출, 입력담당
        System.out.println("문자열 입력: ");
        String str = sc.next();

        printString(strStack(str));
    }

    //계산 메소드
    private boolean strStack(String str){
        for (int i = 0, j = str.length() - 1; i < str.length(); i++, j--) {
            if(str.charAt(i) != str.charAt(j))
                return false;   
        }
        return true;
    }

    //반환 메소드
    private void printString(boolean t){
        if(t)
            System.out.println("회문입니다.");
        else
            System.out.println("회문이 아닙니다.");
    }
}
