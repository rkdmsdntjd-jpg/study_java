package ex_workString;

import java.util.Scanner;

public class Ex03_work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //입력받은 문자열에 소문자 a의 개수 출력
        System.out.print("문자열 입력 : ");
        String str = sc.next();
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a'){//charAt()반환형이 char이기때문에 equals()를 사용하지 않는다.
                cnt++;
            }
        }
        System.out.println("a의 갯수 : " + cnt);
        
        cnt = 0;
        //2
        for (char c : str.toCharArray()) {//문자열을 char배열로 변환하는 메소드를 char타입의 c에 임시저장하여 꺼내쓴다.
            if(c == 'a') cnt++;
        }
        System.out.println("a의 갯수 : " + cnt);
        
        cnt = str.length() - str.replace("a", "").length();
        System.out.println("a의 갯수 : " + cnt);
        //replace() : String에서 특정 문자나 문자열을 다른 것으로 바꾸는 메소드
        //예) replace("target", "replacement"); target을 replacement로 교체해줘(이때 기존 String의 원본은 변하지 않음)
        //따라서) str.replace("a","").length() : str에서 "a"를 찾아 ""로 바꾸고 길이를 출력해줘
        //str길이에서 str에 "a"개수를 뺀 값을 빼면 a의 개수가 나옴

        /*실행결과 : 
        문자열 입력 : bananaBananananBanananananaaPotetoNaaaa
        a의 갯수 : 18
        a의 갯수 : 18
        a의 갯수 : 18
         */
        
        sc.close();
    }
}
