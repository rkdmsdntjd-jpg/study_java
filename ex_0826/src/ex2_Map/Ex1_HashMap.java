package ex2_Map;

import java.util.HashMap;
import java.util.Map;

public class Ex1_HashMap {
    public static void main(String[] args) {
        Map<Integer, Character> hash = new HashMap<>();

        //값 추가
        hash.put(1, 'a');
        hash.put(2, 'a');//value는 중복이 가능하다.
        System.out.printf("key1 %c, key3 %c\n", hash.get(1), hash.get(2));
        
        hash.put(3, 'c');
        char c = hash.get(3);
        System.out.println("key3 : " + c);

        hash.put(4, 'b');
        System.out.println("key4 변경전 : " + hash.get(4));
        hash.put(4, 'd');//기존 4인 key값이 'a'에서 'd'로 변경된다
        System.out.println("key4 : " + hash.get(4));

        System.out.println("hash Map size: " + hash.size());

        System.out.println("map : " + hash);
        
        if(hash.containsKey(1)){//만약 hash map에 해당되는 key가 존재한다면 참
            System.out.println("키가 있는지 확인되어 참인지 거짓인지 반환함");
        }
        if(hash.containsValue('a')){
            System.out.println("같은 방식으로, 이번에는 키값이 아닌 value의 유무로 true false를 반환");
        }
    }
}
