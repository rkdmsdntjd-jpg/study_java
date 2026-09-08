package src.db;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class UserWrite {
    public void writeInfo(User user){
        //User instance write method
        String path = PathFile.PATH + user.getId() + "/file.txt";

        File dir = new File(PathFile.PATH+ user.getId());

        if(!dir.exists()){
            dir.mkdirs();
        }
        try (
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            oos.writeObject(user);
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("user 저장 실패");
        }
    }
}