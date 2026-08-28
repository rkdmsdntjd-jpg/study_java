package ex8_fileWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ex2_BufferedWriter {
    public static void main(String[] args) {
        String path = "C:/java/ex_0827/myFile/work8.txt";
        File f = new File(path);
        
        try (
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw)
            //BufferedWriter.close() : 내부적으로 남아 있는 버퍼를 flush한 다음 스트림을 닫는다.
        ) {
            for (int i = 0; i < 3; i++) {
                bw.write(i + "번째 Line\n");
                bw.newLine();//알아서 한줄 아래로 이동하는 메소드
            }
           //flush() : 아직 스트림을 닫지 않았는데, 지금까지 버퍼에 있는 내용을 파일에 반영하고 싶을 때 사용
        } catch (Exception e) {
            e.printStackTrace();
        }
        /* try-with-resources : 
        try (자원 생성) {
            작업
        } catch (Exception e) {
            예외 처리
        }
         */
    }
}
