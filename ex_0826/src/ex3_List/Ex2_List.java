package ex3_List;

import java.util.ArrayList;
import java.util.List;


public class Ex2_List {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("가");
        str.add("나");
        str.add("다");
        str.add("라");
        str.add("마");
        System.out.println(str);

        str.remove(1);
        str.remove(1);
        str.set(2,"바");
        str.add("아");
        System.out.println(str);
    }
}
