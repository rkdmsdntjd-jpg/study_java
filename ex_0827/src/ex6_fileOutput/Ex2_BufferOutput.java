package ex6_fileOutput;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Ex2_BufferOutput {

    public static void main(String[] args) {
        File f = new File("C:/java/ex_0827/myFile/work5.txt");
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;

        try {
            fos = new FileOutputStream(f);
            bos = new BufferedOutputStream(fos);
            // BufferedOutputStream은 데이터를 버퍼에 임시로 저장한 후 파일에 기록한다.
            // 따라서 close()를 호출해야 버퍼에 남아 있는 데이터까지 파일에 정상적으로 기록된다.

            String msg = "바로 파일에 기록되는 것이 아니라 버퍼에 잠시 저장될 수 있다.\nclose()를 호출하면 버퍼에 남아있던 데이터까지 밀어내고(flush), 스트림도 닫는다.";

            bos.write(msg.getBytes());

            bos.flush();//안전장치, 물리적으로 output stream이 가진 값을 저장하는 메소드

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(bos != null)
                    bos.close();//버퍼에 남은 데이터도 처리되고 자원도 안전하게 해제
                if(fos != null)
                    fos.close();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}