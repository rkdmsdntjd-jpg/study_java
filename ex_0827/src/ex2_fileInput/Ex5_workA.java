package ex2_fileInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex5_workA {
    public static void main(String[] args) {
        String path = "C:/java/ex_0827/myFile/work2.txt";
        File f = new File(path);
        byte[] console = new byte[(int)f.length()];
        FileInputStream fis = null;

        String ori = "";

        try {//시간복잡도O(n), 추가 메모리 공간O(n), 코드 직관성 좋음
            fis = new FileInputStream(f);
            fis.read(console);
            ori = new String(console).trim();

            StringBuilder rev = new StringBuilder(ori);

            if(ori.equals(rev.reverse().toString())){
                System.out.println(ori + "회문입니다.");
            }
            else{
                System.out.println(ori + "회문이 아닙니다.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fis != null){
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}