package ex_work;

import java.util.Random;

public class Ex09_work {
    public static void main(String[] args) {
        //1~45 중복없는 난수 6개 만들기
        int[] lotto = new int[6];
        Random rd = new Random();

        for(int i = 0; i < lotto.length; i++){
            boolean b = false;
            lotto[i] = rd.nextInt(45) + 1;
            for(int j = 0; j < i; j++){
                if(lotto[i] == lotto[j]){
                    b = true;
                    i--;
                    break;
                }
            }
            if(!b)
                System.out.print(lotto[i] + " ");
        }
    }
}
