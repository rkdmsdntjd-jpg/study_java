package ex5_lable;

public class Ex2_lable {
    public static void main(String[] args) {
        outerLoop:
        for(int i = 1; i <= 5; i++){
            switch (i) {
                case 1:
                    System.out.println("case 1");
                    break;
                case 3:
                    System.out.println("case 3");
                    break outerLoop;//outerLoop라는 lable을 가진 loop문을 빠져나간다.
                case 5:
                    System.out.println("case 5");
                    break;
            }
            System.out.println("hello!" + i);
        }
    }
}
