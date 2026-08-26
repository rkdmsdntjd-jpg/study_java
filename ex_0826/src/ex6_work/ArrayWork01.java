package ex6_work;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class ArrayWork01 {
    public static void main(String[] args) {
        Random rd = new Random();
        List<Integer> arr = new ArrayList<>();
        final int CYCLE_COUNT = 5;

        for (int i = 0; i < CYCLE_COUNT; i++) {
            arr.add(rd.nextInt(30) + 1);
        }
        
        System.out.println(arr);

        //방법1
        System.out.println("가장 큰 값 : " + Collections.max(arr));

        //방법2
        // int max = 0;
        // for (int i = 0; i < arr.size(); i++) {
        //     if(max < arr.get(i)){
        //         max = arr.get(i);
        //     }
        // }
        // System.out.println("가장 큰 값 : " + max);        
    }
}