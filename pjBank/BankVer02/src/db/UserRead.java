package src.db;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Set;
import java.util.HashSet;

public class UserRead {
    private Set<User> set;

    public UserRead(){
        set = new HashSet<>();
        File dir = new File(PathFile.PATH);
        File[] userDirs = dir.listFiles();

        if (userDirs == null)//널포인터 예외
            return;

        for (File file : userDirs) {
            if(!file.isDirectory() || !file.exists()){//file이 폴더가 아니거나 해당 폴더가 존재하지 않으면
                continue;
            }
            File userFile = new File(file, "file.txt");

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
    }

    public User findByAccount(int account){//계좌로 user찾기
        for (User u : set) {
            if(u.getAccountNumber() == account){
                return u;
            }
        }
        return null;
    }

    public Set<User> findAll() {//모든 User객체를 담은 파일
        return set;
    }
}