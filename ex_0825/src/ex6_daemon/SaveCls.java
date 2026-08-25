package ex6_daemon;

public class SaveCls extends Thread{

    @Override
    public void run() {
        
        while (true) {
            try {
                Thread.sleep(3000);
                System.out.println("Game state Save");
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

    }
}
