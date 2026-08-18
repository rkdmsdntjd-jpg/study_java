package ex_workString;

import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;

public class Ex06_work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문장 : ");        
        String str1 = sc.next();

        //String indexOf() : 찾는 값이 없으면 -1을 반환
        String str2 = "";
        for (int i = 0; i < str1.length(); i++)
            if(str2.indexOf(str1.charAt(i)) == -1)
                str2 += str1.charAt(i);
        System.out.println("String 결과 : " + str2);

        //StringBuilder로 만들기
        StringBuilder str3 = new StringBuilder();
        for (int i = 0; i < str1.length(); i++)
            if(str3.indexOf(String.valueOf(str1.charAt(i))) == -1)
                //StringBuilder의 indexOf()sms String을 인자로 받기 때문에 String.valueOf으로 char의 타입을 String으로 변환해야함
                str3.append(str1.charAt(i));
        System.out.println("StringBuilder 결과 : " + str3);

        //Set은 중복을 허용하지 않는 자료구조
        Set<Character> set = new LinkedHashSet<>();
        //Set은 인터페이스, LinkedHashSet은 인터페이스를 구현하는 클래스
        //객체를 생성할 때 Character를 저장하는 Set을 만들건데 실제 구현은 LinkedHashSet으로 할게
        for (int i = 0; i < str1.length(); i++)
            set.add(str1.charAt(i));//set은 중복을 허용하지 않기 때문에 add()를 할 때 이미 존재하는 값이면 추가하지 않는다.
        System.out.println("Set interface 결과 : " + set);

        sc.close();
    }
}
