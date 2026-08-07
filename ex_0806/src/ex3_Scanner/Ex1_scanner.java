package ex3_Scanner;
//Scanner는 자바에서 제공하는 API로 java패키지, util패키지 안에 있으며 이 클래스에서 사용한다(import)는 의미
import java.util.Scanner;
//Alt + up or down = 해당 문장의 줄을 올리거나 내리기
//Alt + Shift + up or down = 해당 문장을 위 또는 아래로 복붙

public class Ex1_scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//키보드에서 입력받기 위해 sc로 스캐너 객체를 생성
        // type name = new(객체 생성 명령어) 생성자(매개변수); 객체 생성하는 문법
        //System.in : 대충 키보드에서 입력받겠다는 의미

        System.out.println("정수를 입력하시오.");
        int n = sc.nextInt();//정수를 입력받는 메소드 호출
        System.out.println("입력받은 정수는 " + n + "입니다.");

        System.out.println("공백없는 문자열을 입력하시오.");
        String str1 = sc.next();//공백 단위로 읽음
        System.out.println("입력받은 문자열은 " + str1 + "입니다.");

        System.out.println("공백을 포함한 문자열을 입력하시오.");
        String str2 = sc.nextLine();//공백은 포함하여 Enter(줄바꿈)까지 읽는다.
        System.out.println("입력받은 문자열은 " + str2 + "입니다.");
        /*
        숫자 입력 후 nextLine() 사용할 때, nextInt()의 입력버퍼에 '20\n'에서 숫자만 읽고 \n(Enter)는 남겨둠
        다음 nextLine()은 남아있던 \n(Enter)를 만나서 빈 문자열을 반환하기 때문에 문제가 발생할 수 있다.

        해결 방법 예시:
        int n = sc.nextInt();
        sc.nextLine();//남은 \n(Enter) 제거

        String s = sc.nextLine();
        nextXXX()는 값을 읽고 구분자(공백/엔터)를 남긴다.
        next()는 남은 구분자를 무시하지만, nextLine()은 현재 위치부터 줄 끝까지 그대로 읽는다.

        그래서 nextLine()은 모든 next숫자타입() 뒤에서 주의해야 합니다.
         */

        /*
        Scanner클래스를 구성하는 주요 메소드
        *public boolean nextBoolean()
        *public byte nextByte()
        *public Short nextShort()
        *public int nextInt()
        *public long nextLong()
        *public float nextFloat()
        *public double nextDouble()

        *public String next()
        *public String nextLine()

        char는 존재하지 않음, 이유: Scanner의 기본단위가 token(String)이기 때문
        char c = sc.next().charAt(0);//char 입력을 처리하는 문장
        //참고로 charAt()메소드는 문자열(String)에서 매개변수로 전달한 위치(index)에 있는 문자 하나를 반환하는 String의 메소드
        */

        sc.close();
    }    
}
