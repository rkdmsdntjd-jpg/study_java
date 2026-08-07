package scr.ex_work;

public class ExPersonalWork01 {
    public static void main(String[] args) {
        //개인 예제1. 2~50까지 수 중에서 소수만 출력
        for(int i = 2; i <= 50; i++){
            boolean b = true;           
            for(int j = 2; j*j <= i; j++){                               
                if(i%j == 0){
                    b = false;
                    break;
                }                
            }
            if(b) System.out.println(i);
        }

        //개인 예제2. 2~15까지의 수 중에서 소수가 아닌 수를 찾고, 그 수의 약수 개수를 구하기
        for(int i = 2; i <= 15; i++){
            int divisorCnt = 0;//중간 약수 개수
            for(int j = 2; j < i; j++){                
                if(i%j == 0){
                    divisorCnt++;
                }           
            }
            if(divisorCnt == 0) continue;//divisorCnt가 0이면 소수.

            System.out.println(i + "는 소수가 아니고, 약수의 개수는 " + (divisorCnt + 2) + "입니다.");
        }
    }
}
