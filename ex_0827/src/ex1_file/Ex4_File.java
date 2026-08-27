package ex1_file;

import java.io.File;

public class Ex4_File {
    public static void main(String[] args) {
        String path = "c:/java/myFile";//폴더
        File f = new File(path);

        if(!f.exists()){//f가 참조하고 있는 경로가 물리적으로 존재하지 않는다면
            System.out.println("new folder");
            f.mkdir();//새로 만들기
        }
    }
}