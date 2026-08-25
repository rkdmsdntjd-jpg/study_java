package ex1_Set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex1_HashSet {
    public static void main(String[] args) {
        //Collection interface : 여러 개의 데이터를 한꺼번에 저장하고 관리하기 위한 자료구조
        /*
        1. Set<E> : 저장 순서를 유지하지 않고, 중복 저장을 허용하지 않는다.
        -HashSet<E> : 매우 빠른 검색, 자장순서를 보장하지 않는다.
        -TreeSet<E> : 트리 자료구조를 기반으로 구현(오름차순으로 정렬)
        ex)Set<Integer> set = new HashSet<Integer>();
        ex2)TreeSet<String> set = new TreeSet<String>();

        2. Map<E> : key-value의 저장 방식(Key는 데이터를 구분하는 기준)
        -HashMap<K, V> : 빠른 검색 속도
        -TreeMap<K, V> : 트리 기반의 구현이므로 역시 정렬되어 저장

        3. List<E> : 중복 저장이 가능하며, 저장 순서를 유지한다.
        -ArrayList<E> : 빠른 참조, 저장공간의 변화가 없을 경우 용이
        -LinkedList<E> : 용량이 쉽게 늘어나고 삭제가 간단하나 참조가 느림
         */

        Set<Integer> set = new HashSet<>();
        set.add(150);
        set.add(70);
        set.add(10);
        set.add(200);
        set.add(200);//중복이기때문에 담기지 않는다
        set.clear();//셋초기화

        System.out.println("set Size : " + set.size());

        System.out.println(set);

        System.out.println("-------------------");

        Set<Integer> set2 = new HashSet<>();
        Random rd = new Random();

        while (true) {
            if(set2.size() == 6){
                break;
            }
            int r = rd.nextInt(45) + 1;
            set2.add(r);
        }
        System.out.println(set2);

        Integer[] arr = set2.toArray(new Integer[0]);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] array = new int[set2.size()];
        int i = 0;
        for (Integer num : set2) {
            array[i] = num;
            System.out.print(array[i++] + " ");
        }
    }
}
