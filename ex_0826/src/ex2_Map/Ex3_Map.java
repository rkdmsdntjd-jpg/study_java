package ex2_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex3_Map {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        
        map.put("kim", 1111);
        map.put("lee", 2222);

        Scanner sc = new Scanner(System.in);
        System.out.print("ID : ");
        String id = sc.next();
        System.out.print("PW : ");
        int password = sc.nextInt();

        if(map.containsKey(id)){
            if(map.get(id).equals(password)){
                System.out.println("로그인 성공");
            }
            else{
                System.out.println("비밀번호 불일치");
            }
        }
        else{
            System.out.println("존재하지 않은 User입니다.");
        }
        sc.close();
    }
}
