package ex10_work;

import java.util.Scanner;

public class Ex02_work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");

        String str = "";

        try {
            //int num = sc.nextInt();
            str = sc.next();
            int num = Integer.parseInt(str);
            System.out.println("결과 : " + num);
           
        } catch (Exception e) {
            // TODO: handle exception
            //System.out.println(sc.next() + "은(는) 정수가 아닙니다.");
            //nextInt()가 실패하고, abc가 입력 스트림에 남아 있어서 sc.next()로 다시 읽을 수 있다.
            System.out.println(str + "은(는) 정수가 아닙니다.");
        }
        sc.close();
    }
}
