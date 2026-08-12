package ex6_work;

import java.util.Scanner;

public class Ex6_work {
    public static void main(String[] args) {
        /*
        피보나치 수열 : 앞의 두수를 더해서 다음 수를 만드는 수열
        예: (0 + 1) = 1, (1 + 1) = 2, (1 + 2) = 3, (2 + 3) = 5, (3 + 5) = 8...
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("몇번째까지 출력할까? ");
        int n = sc.nextInt();//입력받기
        
        int s1 = 0, s2 = 1;//n-1번째 값과, n번째 값의 초기화
        for(int i = 1; i <= n; i++){
            int s3 = s1 + s2;//n-1번째 값과 n번째 값의 합을 s3에 저장
            System.out.println(i + "번째 수 : " + s3);//출력
            s1 = s2;//현재 n번째 값을 n-1번째로 저장
            s2 = s3;//현재 s3의 값을 n번째에 저장
        }

        sc.close();
    }
}
