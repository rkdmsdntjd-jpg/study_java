package ex1_file;

import java.io.File;

public class Ex3_File {
    public static void main(String[] args) {
        String path = "c:/java/test";//폴더
        File f = new File(path);

        if(f.isDirectory()){
            //f경로의 하위목록을 file구조로 받기
            File[] files = f.listFiles();

            for (File file : files) {
                if(file.isFile()){
                    System.out.println(file.getName() + " / " + file.length() + "byte");
                }
            }
        }
    }
}