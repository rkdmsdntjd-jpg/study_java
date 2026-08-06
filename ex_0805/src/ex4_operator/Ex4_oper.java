package ex4_operator;

public class Ex4_oper {
    public static void main(String[] args) {
        //Alt + Shift + F는 라인 정렬
        //증감 연산자: 1씩 증가시키거나 감소시키는 연산자

        //전위 증감 연산자prefix, 후위 증감 연산자postfix
        int i = 10;
        System.out.println(++i);//증감이 선행 된 뒤에 문장이 진행
        System.out.println(i++);//후위 증감 연산자는 문장이 끝나고 연산이 진행된다. i의 값 11을 출력한 뒤 i의 값을 1증가시킴
        System.out.println(i);//따라서 여기서 i의 값은 12가 출력된다.

        //조건 연산자(삼항 연산자): (조건)?true:false;
        int j = 5;
        System.out.println(j == 5 ? j : "false");
        //삼항 연산자에서 void method는 사용할 수 없다. ex)System.out.println() 사용불가
        int num = ++j >= 5 ? 10 : 20;
        System.out.println("num : " + num);

        boolean res = true;
        System.out.println("res : " + res);

        System.out.println("!은 단항 연산자이며 참을 거짓으로, 거짓을 참으로 변경 :" + !res);
        System.out.println("그러나 res에 저장된 값이 바뀌는 것은 아니다." + res);

        res = !res;
        System.out.println("res에 저장된 값을 바꿀 때는 res = !res : " + res);

        //예제
        int a = 10, b = 12;
        char c = ++a >= b || (a - 8) + 7 <= b && 12 - b >= 0 && (a += b) - (a%b) > 10 ? 'O' : 'X';
        /*
        괄호가 최우선, 그 다음 &&가 ||보다 우선 순위가 높은 것도 맞음.
        그래서 최종 구조가 'A조건 || (B조건 && C조건 && D조건)' 이 됨
        그리고 ||의 왼쪽부터 평가하기 때문에 ++a가 먼저 실행됨
        A조건이 true면, ||이후 조건을 실행하지 않아도 true.
        A 확인 → 결과 결정 가능하면 종료 → 아니면 B 확인 → C 확인
         */
        System.out.println(c);
    }
}
