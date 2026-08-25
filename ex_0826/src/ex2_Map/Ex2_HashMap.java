package ex2_Map;

import java.util.HashMap;
import java.util.Map;

public class Ex2_HashMap {
    public static void main(String[] args) {
        Map<Character, String> hash = new HashMap<>();

        hash.put('a', "application");
        hash.put('b', "boolean");
        hash.put('c', "character");
        
        System.out.println(hash);

        System.out.println(hash.get('c'));
    }
}
