package ex7_fileReader;

import java.io.File;
import java.io.FileReader;

public class Ex1_FileReader {
    public static void main(String[] args) {
        //char based stream : reader class + write class
        String path = "C:/java/ex_0827/myFile/test.txt";
        File file = new File(path);

        //최대 2byte까지 읽어올 수 있는 char based stream
        FileReader fr = null;

        try {
            fr = new FileReader(file);

            int code = 0;

            while ((code = fr.read()) != -1) {
                System.out.print((char)code);
                //한글은 유니코드 구조로 가져온다.
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(fr != null)
                    fr.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
