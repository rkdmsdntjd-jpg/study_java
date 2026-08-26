package ex7_listWork01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Intersection {
    public static void main(String[] args) {
        /*ArrayList 두개 1~5사이의 난수 5개 추가 두개의 리시트 값을 비교하여 교집합 출력 */
        Random rd = new Random();
        List<Integer> list1 = new ArrayList<>();//1집합
        List<Integer> list2 = new ArrayList<>();//2집합
        List<Integer> res = new ArrayList<>();
        final int LANGTH_NUM = 5;

        for (int i = 0; i < LANGTH_NUM; i++) {//값 대입
            list1.add(rd.nextInt(5) + 1);
            list2.add(rd.nextInt(5) + 1);
        }
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);

        for (int i = 0; i < list1.size(); i++) {//교집합을 결과리스트에 저장
            if(list2.contains(list1.get(i))){
                res.add(list1.get(i));
            }
        }
        System.out.println("결과 : " + res);//결과 출력
    }
}
