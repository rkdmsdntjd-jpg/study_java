package ex6_workPrime;

import java.util.Scanner;

public class WorkPrime {

    public void runPrime(){//메인에게 호출되는 메소드
        Scanner sc = new Scanner(System.in);

        int num = inNum(sc);
        printPrime(num, prime(num));

        for (int i = 1; i < 50; i++)
            printPrime(i, prime(i));

        sc.close();
    }

    private boolean prime(int num){//소수인지 아닌지 판별하는 메소드
        for (int i = 2; i * i <= num; i++)
            if(num % i == 0)
                return false;
        return true;
    }

    private int inNum(Scanner sc){//입력 메소드
        System.out.print("정수입력>> ");
        int num = sc.nextInt();
        return num;
    }

    private void printPrime(int num, boolean t){//출력메소드
        if(t)
            System.out.println(num + "소수가 맞음");
        else
            System.out.println(num + "소수가 아님");
    }
}