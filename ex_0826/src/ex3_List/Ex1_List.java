package ex3_List;

import java.util.ArrayList;
import java.util.List;

public class Ex1_List {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(100);
        list.add(50);

        System.out.println("size : " + list.size());
        System.out.println(list);
        /*
        Java List 주요 메소드
        메소드	                 설명	                예시
        add(E e)	            요소 추가	            list.add("A")
        add(int index, E e)	    특정 위치에 추가	     list.add(1, "B")
        get(int index)	        특정 위치의 요소 조회    list.get(0)
        set(int index, E e)	    특정 위치의 요소 변경	 list.set(0, "C")
        remove(int index)	    인덱스로 삭제	        list.remove(0)
        remove(Object o)	    객체로 삭제	            list.remove("A")
        contains(Object o)    	요소 포함 여부	        list.contains("A")
        size()	                요소 개수	           list.size()
        isEmpty()	            비어 있는지 확인	    list.isEmpty()
        clear()	                전체 삭제	           list.clear()
        indexOf(Object o)	    처음 발견되는 인덱스	 list.indexOf("A")
        lastIndexOf(Object o)	마지막 인덱스	        list.lastIndexOf("A")
        subList(from, to)	    일부 구간 추출	        list.subList(0, 3)

        remove(1)                   → index 1 삭제
        remove(Integer.valueOf(1))  → 값 1 삭제
         */
    }
}
