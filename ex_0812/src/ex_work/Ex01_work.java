package ex_work;

import java.util.Scanner;

public class Ex01_work {
    public static void main(String[] args) {
        //입력(n)한 길이 만큼 배열을 생성해서 A~값을 대입하고 결과를 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int n = sc.nextInt();
        char[] c = new char[n];
        for(int i = 0; i < c.length; i++){            
            c[i] = (char)('A' + (i % 26));//26순환 구조 : Z 이후에 다시 A를 출력
            System.out.print("[" + i + "]" + c[i] + " ");
        }
        /*A~Z,a~z순환하는 구조
        for(int i = 0; i < c.length; i++){
            int num = i % 52;
            
            if(n < 26)
                c[i] = (char)('A' + n);
            eles
                c[i] = (char)('a' + (n - 26));
            System.out.print("[" + i + "]" + c[i] + " ");
        }
         */
        
        /*
        for (char ch : c) {
            System.out.print(ch + " ");
        }
         */

        char[] cArr = new char[n];
        char ch = 'A';
        for(int i = 0; i < cArr.length; i++){
            System.out.print(cArr[i] = ch++);
        }
        sc.close();
    }
}
