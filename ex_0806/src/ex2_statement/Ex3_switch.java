package ex2_statement;

public class Ex3_switch {
    public static void main(String[] args) {
        char name = '이';

        switch (name) {
            case '김':
                System.out.println("가장 많은 성, 1000만");
                break;
            case '이':
                System.out.println("두 번째로 많은 성, 730만");
                break;
            case '박':
                System.out.println("세 번째로 많은 성, 419만");
                break;

            default:
                System.out.println("해당하는 성이 없습니다.");
                break;
        }
    }  
}
