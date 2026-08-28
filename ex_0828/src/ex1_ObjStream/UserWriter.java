package ex1_ObjStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;//실제 직렬화해주는 클래스
                                  //ObjectInputStream = 역직렬화

public class UserWriter {

    public void writeInfo(User user){
        //User instance write method
        String path = "C:/java/ex_0828/myFile/User/" + user.getTel() + "/save.txt";
        //File dirRoot = new File("C:/java/ex_0828/myFile/User/");
        // if(!dirRoot.exists()){
        //     dirRoot.mkdirs();
        // }
        File dirTel = new File("C:/java/ex_0828/myFile/User", user.getTel());

        if(!dirTel.exists()){//물리적으로 경로를 존재하는지 확인하는 메소드
            dirTel.mkdirs();//필요한 부모 폴더까지 전부 만든다
        }
        try (
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            oos.writeObject(user);
            //문자열로 저장하는 게 아니라 객체의 구조와 데이터를 바이너리 형태로 직렬화해서 저장
            //Java가 나중에 객체를 다시 복원하기 위해 저장해 놓은 데이터. 즉, 프로그램이 읽는 파일
            // 일반 텍스트 파일이 아니라 직렬화된 객체 데이터 파일
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("user 저장 실패");
        }
    }
}
