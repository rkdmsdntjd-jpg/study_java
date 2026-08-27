package ex8_listWork02A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkMain {

     public static void main(String[] args) {
        String[] data = {"apple", "banana", "fish", "melon", "ice", "cook" };
        List<String> arr = new ArrayList<>();
        
        WorkSub ws = new WorkSub(arr, data);
        ws.setDaemon(true);
        ws.start();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println(arr);
            String str = sc.next();

            //사용자가 입력한 단어와 arr에 담긴 값을 비교
            for (int i = 0; i < arr.size(); i++) {
                if(str.equals(arr.get(i))){
                    arr.remove(i);
                    break;
                }
            }

            if(arr.size() == 0){
                System.out.println("Clear!");
                break;
            }
        }
        sc.close();
     }
}