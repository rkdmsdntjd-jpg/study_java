package ex01_work;

import java.util.Scanner;

public class Ex01_NumberMain {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);//스캐너 객체 생성, 입력 담당 메소드가 여러번 호출될 가능성
        Ex01_NumberSub nSub = new Ex01_NumberSub();//객체 생성

        String str = nSub.inputStr(sc);//입력 담당 메소드 호출, 입력값 str에 저장
        nSub.printTorF(str, nSub.discriminator(str));//출력 담당 메소드 호출
        //(매개 변수 str과 boolean으로 반환해주는 숫자 판별 담당 메소드 호출)

        sc.close();//스캐너 종료
    }
}
