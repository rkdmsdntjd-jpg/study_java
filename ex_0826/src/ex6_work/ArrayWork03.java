package ex6_work;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ArrayWork03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("--정수 입력(종료 조건 : 0)--");
        while (true) {
            try {
                System.out.print(">> ");
                int num = sc.nextInt();
                
                if(num == 0)
                    break;
                
                list.add(num);
                
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력하세요.");
                sc.nextLine();
            }
        }

        System.out.println("------숫자 범위 입력------");
        System.out.print("시작\t: ");
        int start = sc.nextInt();
        System.out.print("끝\t: ");
        int end = sc.nextInt();

        for (int n : list) {
            if(n >= start && n <= end)
                System.out.println(n);            
        }
        sc.close();
    }
}
