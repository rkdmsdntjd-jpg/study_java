package ex7_fileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex3_FileBufferReader {
    public static void main(String[] args) {
        String path = "C:/java/ex_0827/myFile/work3.txt";
        File f = new File(path);
        
        //try-with-resources : Java가 try 블록이 끝나면 자동으로 close()를 호출.(역순)
        try (
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr)
        ) {
            String msg;
            while ((msg = br.readLine()) != null) {
                System.out.println(msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}