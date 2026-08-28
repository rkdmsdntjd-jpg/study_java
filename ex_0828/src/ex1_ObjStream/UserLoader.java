package ex1_ObjStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class UserLoader {
    private User user;//null

    public User loadInfo(String tel) throws NullPointerException{

        String path = "C:/java/ex_0828/myFile/User/" + tel + "/save.txt";
        File f = new File(path);

        if(f.exists()){
            try (
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis)
            ) {
                user = (User)ois.readObject();//객체를 읽어온다.    

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return user;
    }
}
