package ex4_operator;

public class Ex1_oper {
    public static void main(String[] args) {
        //Operator연산자
        /*
        1최고: . , ()
        2증감: ++ --
        3산술: + - * / %
        4시프트: >> << >>>
        5비교: > < == >= <= !=
        6비트: & | ^ ~
        7논리: && || !
        8삼항: 조건?true:false; 피연산자가 3개이며 간단한 if문을 대체할 때 사용
        9대입: =, += -= *= /= %=
        */

        //산술 연산자
        int n1 = 20, n2 = 7;
        int n3 = n1 + n2;
        System.out.println("+연산 : " + n3);

        n3 = n1 / n2;//나누기 연산자, 몫을 구하여 값을 대입
        System.out.println("/연산 : " + n3);

        n3 = n1 % n2;//나머지 연산자
        System.out.println("%연산 : " + n3);
    }
    
}
