package ex_workString;

import java.util.Scanner;

public class Ex07_work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //키보드에서 값을 입력받고 숫자인지 아닌지 판단하기
        System.out.print("값 : ");
        String str1 = sc.next();

        boolean b = true;
        
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if(c < '0' || c > '9'){
                b = false;
                break;
            }
        }
        if(b){
            System.out.println(str1 + " = true");
        }
        else{
            System.out.println(str1 + " = false");
        }
        sc.close();
    }
}
