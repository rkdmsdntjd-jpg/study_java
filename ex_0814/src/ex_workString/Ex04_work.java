package ex_workString;

import java.util.Scanner;

public class Ex04_work {
    public static void main(String[] args) {
        //키보드에서 입력받은 ox출력 : o는 ++, x는 0으로 초기화, x다음 o를 만나면 다시 1~
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        String str = sc.next();

        String[] strArr = str.split("x");
        int res1 = 0;
        //방법1
        for (int i = 0; i < strArr.length; i++) {
            int cnt = 1;
            for (int j = 0; j < strArr[i].length(); j++) {
                res1 += cnt;
                cnt++;
            }
        }
        System.out.println("결과 : " + res1);

        int res2 = 0;
        //방법2
        for (String string : strArr) {
            int leng = string.length();
            res2 += leng * (leng + 1) / 2; //'1 ~ n까지 합을 구하는 수학 공식'을 배열에 적용시킨 것
        }
        System.out.println("결과 : " + res2);
        sc.close();
    }
}
