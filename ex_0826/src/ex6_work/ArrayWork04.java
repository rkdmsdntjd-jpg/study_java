package ex6_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArrayWork04 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<Integer> index = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        //양심없는 문장-> <Map<String, List<Integer>> 가능은 함...

        String[] color = { "red", "green", "yellow", "blue" };
        final int LIST_LAST = 10;

        for (int i = 0; i < LIST_LAST; i++) {
            list.add(color[rd.nextInt(color.length)]);
        }
        System.out.println(list);

        System.out.println("-----------------------------------------------------------------");
        System.out.print("find color : ");
        
        String find = sc.next();

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equalsIgnoreCase(find)){
                index.add(i);
            }
        }
        System.out.println(find.toLowerCase() + "의 모든 index : " + index);      
        sc.close(); 
    }
}