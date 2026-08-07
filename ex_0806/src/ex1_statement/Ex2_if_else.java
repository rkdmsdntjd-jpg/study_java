package ex1_statement;

public class Ex2_if_else {
    public static void main(String[] args) {
        
        //if-else: 하나의 조건식에 대해 참일 경우와 거짓일 경우를 모두 판단할 수 있는 제어문
        int n = 48;
        String str = "";

        if(++n >= 50) str = "n은 50 이상의 수";//만약 조건식이 참이면 실행

        else if(n < 50 && n > 0) str = "n은 자연수면서 50 미만의 수";//위의 조건이 아니면 새로운 조건을 확인하여 참이면 실행

        else str = "n은 자연수가 아닙니다.";//위 조건식에 참이 되는 경우가 모두 없는 경우 실행

        System.out.println("n : " + n);//if문에서 조건을 확인하는 과정에서 먼저 증감을 진행했기 때문에 숫자가 증가

        System.out.println(str);

        int age = 60;
        if(age >= 30) System.out.println("쉿...");
        else System.out.println("떡국 몇그릇 더 먹어도...");

        //삼항 연산자
        str = age >= 20? "성인" : "미성년자";
        System.out.println(str);

    }
    
}
