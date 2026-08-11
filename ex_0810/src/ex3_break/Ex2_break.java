package ex3_break;

public class Ex2_break {
    public static void main(String[] args) {
        
        outerLoop:
        for(int i = 1; i <= 3; i++){
            switch (i) {//switch의 break는 반복문을 빠져나가는 것이 아닌 현재 switch문을 빠져나가는데 사용
                case 1:
                    System.out.println("case 1");
                    break;
                case 2:
                    System.out.println("case 2");
                    break outerLoop;
                case 3:
                    System.out.println("case 3");
                    break;           
                default:
                    break;
            }
            System.out.println("i의 값: " + i);
        }
    }
}
