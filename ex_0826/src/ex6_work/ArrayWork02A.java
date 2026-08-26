package ex6_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayWork02A {
    public static void main(String[] args) {
        //5개의 문장을 입력받아 ArrayList에 저장하고 가장 긴 문자열을 찾아 출력2
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        final int LIST_LENGTH = 5;

        for(int i = 0; i < LIST_LENGTH; i++){
            System.out.print("입력 : ");
            list.add(sc.next());        
        }

        String longer = "";

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);

            if(str.length() > longer.length()){
                longer = str;
            }
        }
        System.out.println("가장 긴 문자열 : " + longer);
        sc.close();
    }
}
