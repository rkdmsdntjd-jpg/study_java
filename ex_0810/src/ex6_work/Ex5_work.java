package ex6_work;

import java.util.Scanner;

public class Ex5_work {
    public static void main(String[] args) {
        /*
        입력받은 두 수의 최소공배수
        수1 : 6
        수2 : 10
        최소공배수 : 30
         */
        Scanner sc = new Scanner(System.in);
        int max = 1;//최대공약수 저장할 변수(for문을 다 돌아도 못찾으면 결국 두 수의 공약수는 1이니까 초기값을 1로 셋팅)
        System.out.print("수1 : ");
        int bigNum = sc.nextInt();//첫번째 수 입력
        System.out.print("수2 : ");
        int smallNum = sc.nextInt();//두번째 수 입력

        //bigNum이 smallNum보다 작을 경우
        if(bigNum < smallNum){
            int i = bigNum;//임시로 i에 작은값을 저장하고
            bigNum = smallNum;//bigNum에 큰값을 저장함
            smallNum = i;//임시로 저장해둔 작은 값을 smallNum에 저장
        }

        //최대공약수 구하기
        for(int i = 2; i <= smallNum; i++){//max에 이미 1이 저장되어 있기에 2부터 시작, 하나씩 증가시켜서 smallNum까지 검사
            if(smallNum%i == 0){//n의 약수i 하나를 발견 했을 때
                if(bigNum%i == 0) max = i;//그 i가 smallNum의 약수일 때 max에 i를 저장
            }
        }//찾을 때까지 반복하다가 끝까지돌고도 못찾으면 max = 1로 변하지 않음
        int min = (bigNum * smallNum) / max;//최소공배수 = 두 수의 곱 / 최대공약수
        System.out.println("최소공배수 : " + min);//출력

        //최대공약수를 구하지 않고 최소공배수를 구하기
        int minNum = bigNum;//최소공배수 변수값에 큰 수를 저장
        while (minNum % smallNum != 0) {//minNum이 작은 수로 나눠 나머지가 없을 때까지 반복
            minNum += bigNum;//minNum에 큰 수를 더하는 방식
        }//조건식에서 나눠떨어지면 그 수가 최소공배수
        System.out.println("최소공배수 : " + minNum);//출력

        //방법3
        for(int i = 1; i <= bigNum * smallNum; i++){
            if(i % bigNum == 0 && i % smallNum == 0){
                System.out.println("최소공배수 : " + i);
                break;
            }
        }

        sc.close();
    }
}
