package ex11_workWordQuiz;

public class WorkMain {
    public static void main(String[] args) {        
        WorkWord ww = new WorkWord();
        String str = ww.getRandStr();
        ww.playQuiz(str);       
    }
}
/*
ex)
Quiz : plpea
>> eppla
eppla오답!
>> apple
apple정답!
 */