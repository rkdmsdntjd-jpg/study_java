package src.ex2;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Set;
import java.util.HashSet;

public class UserRead {
    private User user;//null

    public User loadInfo(String id) throws NullPointerException{//하나의 객체를 반환할 때

        String path = PathFile.PATH + id + "/file.txt";//주소 + id + file.txt
        File f = new File(path);

        if(f.exists()){//해당 디렉터리가 존재하면
            try (
                FileInputStream fis = new FileInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(fis)
            ) {
                user = (User)ois.readObject();//객체를 읽어온다.    

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return user;
    }

    public Set<User> loadAll() {//모든 User객체를 담은 파일

        Set<User> set = new HashSet<>();
    
        File dir = new File(PathFile.PATH);
    
        File[] userDirs = dir.listFiles();
    
        if (userDirs == null) {
            return set;
        }
    
        for (File userDir : userDirs) {
    
            // 사용자 ID 폴더인지 확인
            if (!userDir.isDirectory()) {
                continue;
            }
    
            // 폴더 안의 file.txt
            File userFile = new File(userDir, "file.txt");
    
            if (!userFile.exists()) {
                continue;
            }
    
            try (
                FileInputStream fis = new FileInputStream(userFile);
                ObjectInputStream ois = new ObjectInputStream(fis)
            ) {
    
                User user = (User) ois.readObject();
                set.add(user);
    
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    
        return set;
    }
}