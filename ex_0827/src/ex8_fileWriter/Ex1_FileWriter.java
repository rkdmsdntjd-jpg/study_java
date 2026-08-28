package ex8_fileWriter;

import java.io.File;
import java.io.FileWriter;

public class Ex1_FileWriter {
    public static void main(String[] args) {
        String path = "C:/java/ex_0827/myFile/work7.txt";
        File file = new File(path);

        try (
            FileWriter fw = new FileWriter(file)
        ) {
            String msg = "FileWriter : 2byte씩 output도 가능하기 때문에 byte단위로 쪼개지 않아도 됨.";
            fw.write(msg);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}