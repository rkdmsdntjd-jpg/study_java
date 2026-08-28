package ex5_bufferInput;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class Ex1_BufferInput {
    public static void main(String[] args) {
        //Buffered Stream : 파일을 읽거나 쓸 때 버퍼링 작업을 수행하여 입출력 속도 향상에 도움을 주는 스트림
        //단독으로 사용은 불가능하고 일반 스트림과 연결해야 함
        String path = "C:/java/ex_0827/myFile/work3.txt";
        File f = new File(path);
        byte[] result = new byte[(int)f.length()];

        FileInputStream fis = null;
        BufferedInputStream bis = null;//단독 동작은 불가능
        try {
            fis = new FileInputStream(f);
            bis = new BufferedInputStream(fis);//file input Stream을 보조하기 때문에 매개변수로 fis를 보냄
            //fis이 먼저 close하면 bis가 close할 통로를 잃어서 문제가 생길 수도 있다.
            //stream은 생성된 역순(즉 스택구조처럼)으로 닫는 것이 원칙
            bis.read(result);

            String res = new String(result);
            System.out.println(res);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(bis != null)
                    bis.close();
                if(fis != null)        
                    fis.close();               
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    } 
}