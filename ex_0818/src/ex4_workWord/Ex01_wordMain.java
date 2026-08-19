package ex4_workWord;

import java.util.Scanner;

public class Ex01_wordMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력 : ");

        String str = sc.next();

        //StringBuffer sb = new StringBuffer(str);
        //String rev = sb.reverse().toString();

        Ex01_wordCheck wc = new Ex01_wordCheck();
        String rev = wc.checkWord(str);

        if(str.equals(rev)){
            System.out.println("회문");
        }
        else{
            System.out.println("회문아님");
        }
    }
}
