package ex3_break;

public class Ex1_break {
    public static void main(String[] args) {
        /*
        *break : 가장 가까운 loop문 탈출
        *break outerLoop : 모든 loop문 탈출
        */
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 10 ; j++){
                if(j > i * 3) break;//inner_for문 강제 탈출
                if(j%3 == 0){
                    System.out.print("짝! ");
                    continue;//아래의 실행문을 실행하지 않음
                }
                System.out.print(j + " ");
            }
            System.out.println();//줄바꿈
       }
       
       outerLoop://label
       for(int i = 1; i <= 3; i++){
        for(int j = 1; j <= 10 ; j++){
            if(j > i * 3) break outerLoop;//바깥쪽for문 강제 탈출
            if(j%3 == 0){
                System.out.print("짝! ");
                continue;//아래의 실행문을 실행하지 않음
            }
            System.out.print(j + " ");
        }
        System.out.println();//줄바꿈
   }
    }
}
