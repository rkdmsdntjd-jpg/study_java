package ex_workRandNum;

public class RandNumWork extends Thread{
    private int cntSec = 0;//시간(초)세기 위한 변수
    private boolean b = true;//while문 종료 조건

    @Override
    public void run() {
        while (b) {
            try {
                //1초당 cntSec가 1씩 증가
                Thread.sleep(1000);
                cntSec++;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

    public int getSec(){
        b = false;//이 메소드가 호출되면 while문 종료를 위해 b를 false로 바꾸고
        return cntSec;//여태 카운팅했던 시간을 반환한다.
    }
}
