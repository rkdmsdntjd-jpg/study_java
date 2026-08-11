package ex4_continue;

public class Ex3_continue {
    public static void main(String[] args) {
        /*실행 결과:
        1
        3
        5
        7
        9
        */
        int n = 0;
        while (n < 10) {//조건: n이 10보다 작을 때 while문 안의 내용을 실행한다.
            n++;//n의 값을 하나 증가시킨다.
            if(n % 2 == 0)//만약 n이 2로 나눠서 나머지가 0이면. 즉 짝수이면 continue를 실행
                continue;//while문에서 continue는 조건식으로 바로 이동
            System.out.println(n);//n이 짝수일 경우는 continue;에 의해 실행이 되지 않음
        }
    }
}
