package ex4_operator;

public class Ex2_oper {
    public static void main(String[] args) {
        //대입 연산자: 특정 값을 변수에 전달하여 기억시킬 때 사용하는 연산자
        int n1 = 10;
        int n2 = 7;
        n2 += n1; // n2 = n2 + n1
        System.out.println("n2 : " + n2);
        //System.out.println("n2 += n1 : " + (n2 += n1)); 결과 n2 += n1 : 27
        n2 -= 2; //15
        System.out.println("n2 : " + n2);

        n1 *= n1; // n1 = 100(n1 = 10 * 10)
        System.out.println("n1 : " + n1);

        System.out.println("n1 : " + (n1 /= 5));
        System.out.println("n1 : " + (n1 %= 3));

        double d1 =3.375;
        System.out.printf("n2 + d1 = %.2f", n2 + d1);
        System.out.println();

        //비교 연산자: 변수나 상수의 값을 비교하여 결과를 만드는 연산자
        int i1 = 10, i2 = 20;
        boolean res = i1 <= i2;
        //lt A < B : A가 B보다 작다
        //gt A > B : A가 B보다 크다
        System.out.println("res : " + res);
        res = i1 == i2;//같으면 true, 다르면 false
        System.out.println("res : " + res);
        res = i1 != i2;//같지 않으면 true, 같으면 false
        System.out.println("res : " + res);
    }
    
}
