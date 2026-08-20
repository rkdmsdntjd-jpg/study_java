package ex02_work;

import java.util.Scanner;

public class Ex_EncodeMain {
    public static void main(String[] args) {
        //암호화

        //입력 : abc123
        //결과 : `~!wer
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        String str = sc.next();        

        Ex_EncodeSub es = new Ex_EncodeSub();
        System.out.println("결과 : " + es.encoding(str));

        sc.close();
    }
}
