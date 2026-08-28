package ex2_RockPaperScissors;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class PlayerLoad {

    private Player player;//null

    public Player loadInfo(String name) throws NullPointerException{

        String path = "C:/java/ex_0828/myFile/player/" + name + "/save.txt";
        File f = new File(path);

        if(f.exists()){
            try (
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);
                /*
                try (리소스1; 리소스2; 리소스3) { //resource specification의 특별한 문법
                } =>따라서 마지막 리소스 뒤의 ;는 선택사항
                 */
            ) {
                player = (Player)ois.readObject();//객체를 읽어온다.    
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if(player == null){
            PlayerWrite pn = new PlayerWrite();
            player = new Player();
            player.setAll(name, 0, 0, 0);
            pn.inPlayerData(player);
            System.out.println("새로운 플레이어");
        }
        else{
            System.out.println(player.getName() + "로드 성공");
            player.printRecord();
        }
        return player;
    }
}

