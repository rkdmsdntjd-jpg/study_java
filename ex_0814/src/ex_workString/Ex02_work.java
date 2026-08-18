package ex_workString;

import java.util.Scanner;

public class Ex02_work {
    public static void main(String[] args) {
        //e-mail : abc@java.com
        //이메일 형식 오류

        //e-mail : aabbcc@java.com
        //aabbcc님 환영합니다.

        Scanner sc = new Scanner(System.in);
        System.out.print("e-mail : ");
        String email = sc.next();

        String[] mail = email.split("@");
        //String.split() : 특정 문자 하나를 기준으로 끊고 싶을 때 사용(반환값이 배열)
        String name = mail[0];
        if( name.length() < 4 || name.length() > 8){
            System.out.println("형식이 올바르지 않음.");
        }
        else{
            System.out.println(name + "님 환영합니다.");
        }
        sc.close();
    }
}
