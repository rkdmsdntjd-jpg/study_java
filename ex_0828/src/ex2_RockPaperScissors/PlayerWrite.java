package ex2_RockPaperScissors;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class PlayerWrite {
    public void inPlayerData(Player player){
        //User instance write method
        String path = "C:/java/ex_0828/myFile/player/" + player.getName() + "/save.txt";

        File dir = new File("C:/java/ex_0828/myFile/player", player.getName());

        if(!dir.exists()){//물리적으로 경로를 존재하는지 확인하는 메소드
            dir.mkdirs();//필요한 부모 폴더까지 전부 만든다
        }
        try (
            FileOutputStream fos = new FileOutputStream(path);//디폴트 : 기존 파일의 내용을 덮어씀
            ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            oos.writeObject(player);
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("user 저장 실패");
        }
    }
}
