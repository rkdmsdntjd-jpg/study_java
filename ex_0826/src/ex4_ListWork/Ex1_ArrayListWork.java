package ex4_ListWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1_ArrayListWork {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        outerLoop:
        while (true) {
            System.out.print("id : ");
            String s = sc.next();

            if(s.equals("out")){
                break;
            }

            // if(list.contains(s)){ //방법1
            //     System.out.println(s + "회원은 이미 존재함");
            //     continue;
            // }
            //list.contains("비교값") //true false 반환
            //list.indexOf("찾을 인덱스와 같은 값") //인덱스 반환

            for (int i = 0; i < list.size(); i++) {//방법2
                if(s.equals(list.get(i))){
                    System.out.println(s + "회원은 이미 존재함");
                    continue outerLoop;
                }
            }

            list.add(s);

            for (String string : list) {
                System.out.println(string + "회원");
            }
        }
        sc.close();
    }
}
