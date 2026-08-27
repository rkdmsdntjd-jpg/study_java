package ex3_throws;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class WorkSub2 {
    private File f = new File(MyPath.PATH + "test.txt");
    private byte[] console = new byte[(int)f.length()];
    FileInputStream fis = null;

    public void result() throws IOException {
        //public void result() throws FileNotFoundException, IOException 
        //이 메소드를 실행하다가 FileNotFoundException이 발생하면 호출한 곳에서 처리하라는 뜻
        fis = new FileInputStream(f);
        fis.read(console);

        System.out.println( new String(console));

        fis.close();
    }
}