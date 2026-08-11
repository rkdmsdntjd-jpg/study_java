package ex2_while;

public class Ex4_doWhile {//f2누르면 이름 변경가능
    public static void main(String[] args) {
        int i = 0;
        do{//실행문이 먼저 실행된 뒤 조건 검사를 진행
            --i;//i = -1
            System.out.println(i);

        }while(i > 0);//반드시 한 번이상 실행이 되는 반복문
    }
}
