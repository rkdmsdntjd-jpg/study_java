package ex11_work;

import java.util.Random;

public class WorkMain {
    public static void main(String[] args) {        
        String[] strArr = { "apple", "orenge", "pear", "banana", "mango", "cherry" };
        WorkWord ww = new WorkWord();
        ww.playQuiz(strArr[new Random().nextInt(strArr.length)]);       
    }
}
/*
랜덤 인덱스 지정 -> String 인덱스를 랜덤으로 지정(퀴즈)
ex)
Quiz : plpea
>> eppla
eppla오답!
>> apple
apple정답!
 */