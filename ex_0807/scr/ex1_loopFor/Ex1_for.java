package scr.ex1_loopFor;

public class Ex1_for {
    public static void main(String[] args) {
        //for문: 특정 코드를 원하는 만큼 반복하고자 할 때 사용하는 반복문(loop)
        //for(초기 설정 ; 조건식(false일 경우 loop를 탈출); 증감(실행문 실행한 뒤에 실행됨)){ 실행문 영역 }
        for(int i = 0; i < 3; i++){
            System.out.println(i);
        }
        //변수 스코프(variable scope): 변수가 존재할 수 있는 영역
        //지역 변수(local variable): 영역(중괄호) 내에서 선언된 변수는 영역을 벗어나서 사용할 수 없다.
        //예를 들어 for문 안에 생성된 i같은 경우, for문이 종료되면 메모리 공간에서 소멸하기 때문에 for문 밖에서 사용 불가.
        for(int i = 0, j = 10; j >= 0; i++, j--)
            System.out.println("i = " + i + ", j = " + j);
        //for-each문 배열이나 컬렉션 요소를 하나씩 꺼내서 처리하는 반복문
        //for(자료형(반드시 선언이 필요) 임시변수명: 배열이나 컬랙션){ 실행문 }

        //예제1. 1부터 100까지 수 중에서 5의 배수만 출력
        for(int i = 1; i <= 100; i++)//for문에 문장하나면 {}생략 가능
            if(i%5 == 0)//for문 기준에서 실행문이 if문 하나기때문에 생략 가능
                System.out.print(i + " ");
        System.out.println();
        
        //예제2. 1~ 10 중에서 홀수의 합만 계산하여 출력
        int sum = 0;
        for(int i = 1; i <= 10; i++)
            if(i%2 != 0) sum += i;
        System.out.println(sum);
                
    }
}
