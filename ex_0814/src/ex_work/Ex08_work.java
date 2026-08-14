package ex_work;

import java.util.Random;

public class Ex08_work {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++) {
            boolean t = true;
            lotto[i] = rd.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if(lotto[i] == lotto[j]){
                    i--;
                    t =false;
                    break;
                }
            }
            if(t)
                System.out.print(lotto[i] + " ");
        }
        System.out.println();
    }
}
