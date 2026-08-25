package ex1_Set;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex2_TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        Random rd = new Random();
        
        while (tree.size() < 6) {
            int n = rd.nextInt(45) + 1;
            tree.add(n);
        }
        System.out.println(tree);
        //treeSet은 오름차순으로 정렬
        System.out.println(tree.subSet(10, 30));//10이상 30이하만 추리는 treeSet메소드

        Set<String> name = new TreeSet<>();
        name.add("Q");
        name.add("G");
        name.add("A");
        name.add("다");
        name.add("가");
        name.add("나");

        System.out.println(name);
    }
}
