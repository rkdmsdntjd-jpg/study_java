package ex4_ThreadWork;

import java.util.Scanner;

public class ThreadMain {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("입력 : ");
        int cnt = sc.nextInt();

        ThreadSub ts = new ThreadSub(cnt);
        ts.start();

        sc.close();
    }
}
