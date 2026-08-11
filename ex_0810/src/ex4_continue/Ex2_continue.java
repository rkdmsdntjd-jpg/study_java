package ex4_continue;

public class Ex2_continue {
    public static void main(String[] args) {
        /*
        case 1
        결과 : 1
        case 2 //continue를 만났기 때문
        case 3
        결과 : 3
        case 4
        결과 : 4
        case 5
        결과 : 5
        */
        for(int i = 1; i <= 5; i++){
            switch (i) {
                case 1:
                    System.out.println("case 1");
                    break;//switch의 break는 switch문만 탈출
                case 2:
                    System.out.println("case 2");
                    continue;//for문에 적용되어 for증감식으로 이동, continue는 switch에 영향을 주지 않는다.
                case 3:
                    System.out.println("case 3");
                    break;           
                case 4:
                    System.out.println("case 4");
                    break;           
                case 5:
                    System.out.println("case 5");
                    break;           
            }
            System.out.println("결과 : " + i);
        }
    }
}
