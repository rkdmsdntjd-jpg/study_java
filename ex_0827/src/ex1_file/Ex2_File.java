package ex1_file;

import java.io.File;

public class Ex2_File {
    public static void main(String[] args) {
        String path = "c:/java";//폴더
        File f = new File(path);

        if(f.isFile()){//false

        }
        if(f.isDirectory()){//true
             //f가 폴더(디렉토리)일 때, 그 안에 있는 파일/폴더의 이름을 가져오는 메소드
        }

        String[] names = f.list();

        for (String str : names) {
            System.out.println(str);
        }
    }
}