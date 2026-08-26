package ex8_listWork02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {
        String[] data = {"apple", "banana", "pine", "melon"};
        //N초간격으로 List에 data를 랜덤으로 추가
        //해당 단어를 입력하면 해당 단어는 list에 지워짐
        //List에 값이 없으면 clear를 출력하고 종료
        Random rd =new Random();
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        CounterThread ct = new CounterThread();
        ct.setDaemon(true);
        int cnt = 1;

        //여기서 카운트 시작
        ct.start();

        while (true) {
            for(int i = 0; i < cnt; i++){//list길이를 주고 추가할 값을 받는다.
                list.add(data[rd.nextInt(data.length)]);
            }

            System.out.println(list);//list출력

            
            System.out.print(">> ");
            String str = sc.next();//입력을 받는다.
                      
            if (list.contains(str)) {//입력한 문자열이 list에 있으면 제거한다.
                list.remove(list.indexOf(str));
            }

            cnt = ct.getCount();//3초가 몇번지났는지 가져온다.

            if(cnt == 0 && list.isEmpty()){//list가 비어있으면 while문 종료
                System.out.println("clear!");
                break;
            }
        }
        sc.close();
    }
}
/* 실행 결과
[pine]
>> pine
[pine, banana]
>> pine
[banana, apple]
>> banana
[apple]
>> apple
[pine]
>> pine
[pine]
>> pine
clear!
*/