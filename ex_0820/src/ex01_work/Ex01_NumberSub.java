package ex01_work;

import java.util.Scanner;

public class Ex01_NumberSub {

    public String inputStr(Scanner sc){//입력 담당
        System.out.print("input Data : ");
        String str = sc.next();
        return str;
    }

    public boolean discriminator(String str){//숫자 판별 담당
        boolean t = true;
        for (char c : str.toCharArray()) {//toCharArray(): String을 char[]로 변환하는 메소든
            if(c < '0' || c > '9'){
                t = false;
                break;//숫자가 아닌 것을 발견하면 t를 false로 바꾸고 반복문 종료
            }
        }
        return t;
    }

    public void printTorF(String str, boolean t){//출력 담당
        System.out.printf("%s is number? %b", str, t);
    }
}
