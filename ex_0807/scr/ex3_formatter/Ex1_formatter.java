package scr.ex3_formatter;

public class Ex1_formatter {
    public static void main(String[] args) {
        int age = 20;
        /*
        출력
        System.out.println("출력 후 줄바꿈");
        System.out.print("줄바꿈 없이 출력만");
        System.out.printf("문자열 조합 출력", 변수);
        */
        
        /*서식 지정자
        %d는 정수, %f는 실수, %c는 문자, %s 문자열, %%는 '%'출력

        * %mnd : %d는 10진수형 정수, m은 빈자리를 채울 숫자, n은 최소 n자리 수로 출력
        * %.nf : .n은 n자리수만큼 소수점 자리를 출력해달라는 의미
        ex) %.3f는 소수점 3자리까지 출력해달라는 의미
        */

        System.out.printf("저의 나이는 %d 살 입니다.", age);//formatter의 줄임말
        System.out.println();//줄바꿈

        System.out.printf("나는 %C형. \n", 'a');//문자를 대문자로 변환해서 출력
        System.out.printf("나는 %c형. \n", 'B');//문자를 그대로 출력
        System.out.printf("원주율 : %.2f \n", 3.141592);//소수점 2자리까지만 출력
        System.out.printf("이름 : %s \n", "name");
        
        int floor = 3;
        System.out.printf("저는 %d 살이고 %d 층에 살아요. \n", age, floor);

        System.out.printf("%s\t %d\t %d \n", "name", 100, 95);
        System.out.printf("%s\t %d\t %d \n", "mane", 40, 35);
        /*
        이스케이프 시퀸스(Escape Sequence)
        *\n : 개행(줄바꿈)
        *\t : tab
        *\" : 큰따옴표(Quatation Mark) 출력("는 명령어로 인식하기 때문에 출력용으로는 \필요)
        *\\ : 역슬래쉬(Back slash) 출력(위와 마찬가지로 \ 하나는 명령어로 인식하기때문)
         */
        System.out.printf("오늘 강수량 %d %%입니다.\n", 15);
    }
}
