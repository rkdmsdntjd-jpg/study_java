package ex_work;

import java.util.Scanner;
import java.util.Arrays;

public class Ex06_work {
    public static void main(String[] args) {
        //등록할 인원 수 : 2
        //-------------------------
        //이름 : 홍길동
        //수학: 99
        //영어: 100
        //국어: 75
        //-------------------------
        //이름 : 김길순
        //수학: 70
        //영어: 78
        //국어: 99
        //=========================
        //총 2명의 학생 정보가 등록됨
        //[학생 정보]
        //홍길동    99    100    75
        //김길순    70    89     99
        
        Scanner sc = new Scanner(System.in);
        System.out.println("============================");
        System.out.print("등록할 학생 인원 수 : ");
        int stdt = sc.nextInt();
        System.out.println("============================");

        String[] info = { "이름", "수학", "영어", "국어" };
        String[][] str = new String[stdt][info.length];
        

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                System.out.printf("%s : ", info[j]);                
                if(j == 0){
                    str[i][j] = sc.next();
                    continue;
                }
                str[i][j] = String.valueOf(sc.nextInt());
                //valueOf() : 다른 타입의 값을 String으로 변환해주는 String 클래스의 메소드
            }
            System.out.println("----------------------------");
        }

        System.out.printf("총 %d명의 학생 정보가 등록됨\n", stdt);
        System.out.println("[학생 정보]");
        /*
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                System.out.print(str[i][j] + "\t");
            }
            System.out.println();
        } 
         */
        for (String[] strings : str) {
            System.out.println(Arrays.toString(strings));        
        }
        sc.close();
    }
}
