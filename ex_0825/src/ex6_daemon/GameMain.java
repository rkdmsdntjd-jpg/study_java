package ex6_daemon;

public class GameMain {
    public static void main(String[] args) {

        SaveCls cls = new SaveCls();
        cls.setDaemon(true);
        //메인스레드가 종료되면 setDaemon(true)을 통해서 연결된 보조스레드도 같이 종료

        //데몬 스레드 : 다른(주) 스레드의 작업을 돕는 보조 스레드를 의미
        //메인스레드가 종료되면 데몬스레드도 함께 종료됨
        cls.start();//3s 간격으로 게임 저장

        //main은 20초동안 게임을 진행
        for(int i = 0; i < 20; i++){
            try {
                Thread.sleep(1000);
                System.out.println("play game");
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
