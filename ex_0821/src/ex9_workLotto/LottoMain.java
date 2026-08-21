package ex9_workLotto;

import java.util.Random;

public class LottoMain {

    public static boolean uniqueNum(int[] lotto, int i){
        for(int j = 0; j < i; j++){//lotto배열 0~i번째까지 중복이 있는지 검사
            if(lotto[i] == lotto[j]){//중복 발생할 경우
                return false;
            }
        }
        return true;
    }
    public static void myLotto(int[] lotto){//생성 및 출력
        for(int i = 0; i < lotto.length; i++){
            lotto[i] = new Random().nextInt(6) + 1;
            if(!uniqueNum(lotto, i))
                i--;
        }
    }
   
    public static void main(String[] args) {
        //1~45 중복없는 난수 6개 만들기
        int[] lotto = new int[6];
        myLotto(lotto); 
        for (int i : lotto) {
            System.out.print(i + " ");
        }    
    }
}