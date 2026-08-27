package ex2_fileInput;

import java.io.File;
import java.io.FileInputStream;

public class Ex4_FileInput {
    public static void main(String[] args) {
        //숫자들의 합 출력하기
        String path = "C:/java/ex_0827/myFile/work1.txt";
        File f = new File(path);
        byte[] byteArr = new byte[(int)f.length()];//파일의 크기만큼 바이트(파일을 바이트 단위로 읽음) 배열 선언
        FileInputStream fis = null;

        if(f.exists()){
            try {
                fis = new FileInputStream(f);//파일 객체를 줘서 읽을 수 있는 객체를 생성
                fis.read(byteArr);//바이트배열 안에 파일의 내용이 담김

                int sum = 0;

                for (byte b : byteArr) {
                    if(b >= '0' && b <= '9'){
                        sum += (b - '0');
                    }
                }
                System.out.println("결과 : " + sum);
                
            }
            catch (Exception e) {
                
            }
            finally {
                try {
                    if(fis != null)
                        fis.close();
                } catch (Exception e) {

                }
            }
        }
    }
}