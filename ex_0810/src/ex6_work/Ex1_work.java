package ex6_work;

import java.util.Scanner;

public class Ex1_work {
    public static void main(String[] args) {
        //1~100숫자 중에서 입력받은 수보다 큰 첫번째 3의 배수를 찾아 출력
        /*예상 실행 결과:
        ------------------------------
        입력 : 20
        20보다 큰 첫번째 3의 배수 : 21
        ------------------------------
        */
        Scanner sc = new Scanner(System.in);//스캐너 객체 생성
        //while문
        int num;//while문 밖에 생성해야 입력을 받은 뒤 while문을 나와서도 사용가능, 초기값은 설정하지 않음
        while (true) {//잘못입력하는 경우 재입력을 위해 while문 안에서 입력을 받음
            System.out.println("------------------------------");
            System.out.print("1. 입력 : ");       
            num = sc.nextInt();//num을 입력받음, null값이던 num에 입력받은 수가 저장
            if(num > 0 && num <= 100)//num이 1~100인지 검사하고 조건이 참이면
                break;//반복문 탈출
            System.out.println("잘못 입력하셨습니다.\n다시 입력하세요.");//if문에 걸리지 않으면 실행(무한 반복)
        }       
        int num1 = num;//시작값을 저장(나중에 출력할 때 써서...생성해둠)
        while (true) {
            num++;//num값을 1씩 증가
            if(num % 3 == 0){//3의 배수를 구하는 간단한 조건식 true일경우 아래의 중괄호 영역을 실행
                System.out.println(num1 + "보다 큰 첫번째 3의 배수 : "+ num);
                break;
            }//안걸리면 계속 반복
        }
        System.out.println("------------------------------");
        
        //for문
        int num2;      
        System.out.println("------------------------------");
        System.out.print("2. 입력 : ");
        num2 = sc.nextInt();      
        for(int i = num2 + 1; i <= num2 + 3; i++){
            if(i % 3 == 0){
                System.out.println(num2 + "보다 큰 첫번째 3의 배수: " + i);
                break;
            }
        }
        System.out.println("------------------------------");
        
        System.out.println("------------------------------");
        System.out.print("3. 입력 : ");
        int num3 = sc.nextInt();
        for(int i = num3+1; i <= 100; i++){
            if(i % 3 == 0){
                System.out.println(num3 + "보다 큰 첫번째 3의 배수: " + i);
                break;
            }
        }
        System.out.println("------------------------------");
        sc.close();
    }
}
/*실제 실행 결과:
------------------------------//while문
1. 입력 : 1001
잘못 입력하셨습니다.
다시 입력하세요.
------------------------------
1. 입력 : 100
100보다 큰 첫번째 3의 배수 : 102
------------------------------
------------------------------//for문
2. 입력 : -27
잘못 입력하셨습니다.
다시 입력하세요.
------------------------------
2. 입력 : 1
1보다 큰 첫번째 3의 배수: 3
------------------------------
*/
