package ex4_work;

import java.util.Scanner;

public class Ex01_GuguMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단 : ");
        int num = sc.nextInt();

        Ex01_Gugudan gu = new Ex01_Gugudan();
        gu.gugodan(num);
        
        sc.close();
    }
}
