package ex4_operator;

public class Ex3_oper {
    public static void main(String[] args) {
        //논리 연산자: 비교연산자를 통한 연산 2개를 연결해주는 연산자
        int num = 30, sum = 35;
        boolean res = (sum - num) >= 5 && num > 30;//AND연산자는 A && B 에서 모두 참일 경우 참이다.
        System.out.println("[(sum - num) >= 5 && num > 30] AND연산자 res : " + res);
        
        res = (sum - num) >= 5 || num > 30;//OR연산자는 하나만 참이면 참이다.
        System.out.println("[(sum - num) >= 5 || num > 30] OR연산자 res : " + res); 
        
        //논리 연산자 우선 순위 ! > && > ||
        res = num == sum;
        System.out.println("num == sum : " + res);
        res = num <= 35;
        System.out.println("num <= 35 : " + res);
        res = num == 32;
        System.out.println("num == 32 : " + res);

        res = num == 32 || num <= 35 && num == sum;
        System.out.println("num == 32 || num <= 35 && num == sum : " + res);
        //!은 단항 연산자
    }
    
}