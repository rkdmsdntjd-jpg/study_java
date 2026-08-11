package ex4_continue;

public class Ex1_continue {
    public static void main(String[] args) {
        //continue : 반복문 내에서 특정 코드를 건너뛰고자 할 때 사용
        for(int i = 1; i <= 2; i++){
            for(int j = 1; j <= 5; j++){               
                if(j % 2 == 0) {
                    System.out.print("짝 ");
                    //for문 안에서 가까운 증감식으로 넘어가지만, 증감식이 없다면 조건식으로 이동
                    continue;
                }
                System.out.print(j + " ");
            }
            System.out.println();//줄바꿈
        }
    }
}
