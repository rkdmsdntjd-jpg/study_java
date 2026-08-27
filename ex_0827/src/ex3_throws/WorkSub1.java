package ex3_throws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WorkSub1 {
    private File f = new File(MyPath.PATH + "test.txt");
    private byte[] console = new byte[(int)f.length()];
    FileInputStream fis = null;

    public void result() throws FileNotFoundException, IOException {
        //예외가 발생할 수도 있는 메소드
        //이 메소드를 실행하다가 예외가 발생하면 호출한 곳에서 처리하라는 뜻
        fis = new FileInputStream(f);
        fis.read(console);

        System.out.println( new String(console));

        fis.close();
    }
}