package ex6_fileOutput;

import java.io.File;
import java.io.FileOutputStream;

public class Ex1_output {
    public static void main(String[] args) {
        File f = new File("C:/java/ex_0827/myFile/work4.txt");
        FileOutputStream fos = null;
        try {
            //fos = new FileOutputStream(f); 기존 내용을 지우고 완전히 갱신할 때
            //String msg = "file output stream 연습";
            fos = new FileOutputStream(f, true);//기존 내용을 유지하고 내용을 추가할 때
            String msg = "\nStream IN OUT";

            fos.write(msg.getBytes());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(fos != null)
                    fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
