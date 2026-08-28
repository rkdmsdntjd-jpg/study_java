package ex7_fileReader;

import java.io.File;
import java.io.FileReader;

public class Ex2_FileReader {
    public static void main(String[] args) {
        //C:/java/ex_0827/myFile/work6.txt 대문자와 소문자의 개수를 판별
        File file = new File("C:/java/ex_0827/myFile/work6.txt");
        
        try(
            FileReader fr = new FileReader(file)
        ) {
            int upCnt = 0, lowCnt = 0;
            int code = 0;
            while ((code = fr.read()) != -1) {
                if(code >= 'A' && code <= 'Z'){
                    upCnt++;
                }
                if(code >= 'a' && code <= 'z'){
                    lowCnt++;
                }
            }
            System.out.printf("대문자 : %d\n소문자 : %d\n", upCnt, lowCnt);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
