package ex3_throws;

import java.io.IOException;

public class WorkMain {
    public static void main(String[] args) {
        WorkSub1 w1 = new WorkSub1();
        WorkSub2 w2 = new WorkSub2();

        try {//비슷한 오류를 처리할 수 있도록 호출하는 영역에서 예외를 처리
            w1.result();
            w2.result();
        } catch (IOException e) {
            
        }
    }
}