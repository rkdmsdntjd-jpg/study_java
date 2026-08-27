package ex2_fileInput;

import java.io.File;
import java.io.FileInputStream;

public class Ex1_FileInput {
    public static void main(String[] args) {
        String path = "C:/java/ex_0827/myFile/test.txt";
        File f = new File(path);
        FileInputStream fis = null;
        //외부의 데이터를 가져오는 것이기 때문에 input

        if(f.exists()){//물리적으로 존재할 때 true값 반환
            //파일과 연결된 입력 스트림 생성
            try {
                fis = new FileInputStream(f);

                int code = 0;

                while ((code = fis.read()) != -1 ) {
                    System.out.print((char)code);
                }
                
            }
            catch (Exception e) {
                //FileNotFoundException
                //IOException
            }
            finally {
                try {
                    fis.close();//사용을 마친 스트림은 반드시 닫아야 함
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        }       
    }
}
/*
read()	                            1바이트 읽기, 반환형이 int이며, 파일 끝에 도달하면 -1을 반환.
read(byte[] b)	                    배열 크기만큼 데이터를 읽기
read(byte[] b, int off, int len)	지정한 위치부터 지정한 길이만큼 읽기
available()	                        읽을 수 있는 바이트 수 확인
skip(long n)	                    n바이트 건너뛰기
close()	                            트림 닫기
*/